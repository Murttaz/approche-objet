package fr.diginamic.maison;

public class Maison {

	private Piece[] pieces;

	// constructeur

	public Maison() {

		this.pieces = new Piece[0];
	}

	/*
	 * méthode pour rajout de piece le principe = prendre premier tableau et mettre
	 * ses valeurs dans le deuxième puis écraser premier tableau par deuxième
	 */
	public void ajouterpiece(Piece nvlpiece) {
		Piece[] pluspieces = new Piece[pieces.length + 1];
		for (int i = 0; i < pieces.length; i++) {
			pluspieces[i] = pieces[i];
		}
		pluspieces[pluspieces.length - 1] = nvlpiece;
		this.pieces = pluspieces;
	}

	/*
	 * méthode pour calculer la superficie d'un étage si étage choisi correspond à
	 * un étage précis alors superficie de la pièce est ajouter à la superficie de
	 * l'étage choisi
	 */

	public double superficieEtage(int qletage) {
		double superficieEtage = 0.00;
		for (int i = 0; i < pieces.length; i++) {
			if (qletage == this.pieces[i].getNbetage()) {
				superficieEtage = superficieEtage + this.pieces[i].getSuperficie();
			}
		}

		return superficieEtage;

	}

	/* methode pour calculer la supericie
	 * en fontion du type de pièce;
	 */
	public double superficieTypePiece(String typePiece) {
		double superficie = 0.00;
		for (int i = 0; i < pieces.length; i++) {
			if (typePiece != null && typePiece.equals(this.pieces[i].getType())) {
				superficie = superficie + this.pieces[i].getSuperficie();
			}
		}
		return superficie;
	}

	public double surftotale() {
		double surperficietotale = 0.00;
		for (int i = 0; i < pieces.length; i++) {
			surperficietotale = surperficietotale + this.pieces[i].getSuperficie();
		}
		return surperficietotale;
	}
}

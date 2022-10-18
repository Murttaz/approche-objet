package fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class LectureFichier {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String chemin="C:\\Users\\v.fournier\\OneDrive\\Documents\\Mydiginamic\\recensement.csv\"";
		Path path = Paths.get("C:\\Users\\v.fournier\\OneDrive\\Documents\\Mydiginamic\\recensement.csv");
		List<String> lines=Files.readAllLines(path,StandardCharsets.UTF_8);
		for (String ligne : lines ) {
			System.out.println(ligne);
		}
		// fin exo lire fichier
		
		
		/*ArrayList<Ville> listeVille=new ArrayList<Ville>();
		for (int i=1;i<lines.size();i++) {
			String city=lines.get(i);
			String[] tokens= city.split(";");
			Ville v= new Ville(tokens[6],tokens[2],tokens[1],Integer.parseInt(tokens[9].replaceAll(" ",""))); 
			listeVille.add(v);
			System.out.println(v);
		}
		//fin exo  LireFichierAvecInstanciation
			*/	
		
		ArrayList<Ville> listeVille=new ArrayList<Ville>();
		
		for (int i=1;i<lines.size();i++) {
			String city=lines.get(i);
			String[] tokens= city.split(";");
			Ville v= new Ville(tokens[6],tokens[2],tokens[1],Integer.parseInt(tokens[9].replaceAll(" ",""))); 
			if (Integer.parseInt(tokens[9].replaceAll(" ",""))>25000) {
				listeVille.add(v);
			}
		}
						Path pathCible = Paths.get("C:\\Users\\v.fournier\\OneDrive\\Documents\\Mydiginamic\\recensement3.csv");
			ArrayList<String> finalLine=new ArrayList<String>();
			finalLine.add("Nom de la ville;numéro de département;nom de la région;population totale");
			
			for(int i=0;i<listeVille.size();i++) {
				Ville v = listeVille.get(i);
				finalLine.add(v.toString2());
			}
			Files.write(pathCible,finalLine);
		
	}

}

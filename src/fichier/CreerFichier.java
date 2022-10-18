package fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CreerFichier {

	public static void main(String[] args) throws IOException {
		
		Path path = Paths.get("C:\\Users\\v.fournier\\OneDrive\\Documents\\Mydiginamic\\recensement.csv");
		List<String> lines=Files.readAllLines(path,StandardCharsets.UTF_8);
		
		List<String> ligne = new ArrayList<>();
		// TODO Auto-generated method stub
	for (int i=0;i<102;i++) {
		ligne.add(lines.get(i));
	}
		
		
		Path pathCible = Paths.get("C:\\Users\\v.fournier\\OneDrive\\Documents\\Mydiginamic\\recensement2.csv");
		Files.write(pathCible,ligne);
		
		
	}

}

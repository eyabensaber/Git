import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import Collection.collection;

public class main {
	public static void main(String[] args) {
		
		collection liste = new collection();
		Scanner sc = new Scanner (System.in);
  	  DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy");
  	  
  	  
  	System.out.println("Donner la date d employe : \n");
  	String tempp = sc.next();
  	  LocalDate  date = LocalDate.parse(tempp, df);
		liste.ajouterEmploye("mehyar", "mlaweh", date, 17);
		
	  	
			liste.ajouterEmploye("arij", "zabour", date, 21);
			
		  
				liste.ajouterEmploye("med", "azae", date, 20);
				
				
				liste.ListeEmploye();
				liste.calculeSalaires();
		System.out.println("Salaire moyen des employes" + liste.SalaireMoyen());
		
	}
}

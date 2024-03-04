package Collection;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

import Data.employe;
import Data.manutenteurSousRisque;
import Data.manutention;
import Data.producteur;
import Data.producteurSousRisque;
import Data.representant;
import Data.vendeur;

public class collection {

	private ArrayList <employe> employes = new ArrayList <employe>();
	
	
	
	 public void ajouterEmploye(String nom, String prenom, LocalDate datentree, int age) {
		 int choix;
		 int choix1;
		 int choix2;
		 
		 Scanner sc = new Scanner(System.in);
		System.out.println("Quel type d employe ? \n");
		do{System.out.println("1.vendeur\n");
		System.out.println("2.producteur\n");
		System.out.println("3.representant\n");
		System.out.println("4.manutenteur\n");
		choix=sc.nextInt();
		}while(choix!=1 && choix!=2 && choix!=3 && choix!= 4);
		
		switch (choix) {
			case 1 : {
				System.out.println("Donner votre chiffre d affaire ");
				employes.add(new vendeur(nom,prenom,datentree,age,sc.nextDouble()));
				break;
			}
			case 2 : {
				System.out.println("Travaillez vous avec des produits dangeureux?");
				do{System.out.println("1.Oui\n2.Non\n");
				 choix1=sc.nextInt();}while (choix1!= 1 && choix1!=2);
				if (choix1==2) {
				System.out.println("Donner le nombre de produits vendus ");
				employes.add(new producteur(nom,prenom,datentree,age,sc.nextInt()));
				}
				else {
					System.out.println("Donner le nombre de produits vendus ");
					employes.add(new producteurSousRisque(nom,prenom,datentree,age,sc.nextInt()));
				}
				break;
			}
			case 3 : {
				System.out.println("Donner votre chiffre d affaire ");
				employes.add(new representant(nom,prenom,datentree,age,sc.nextDouble()));
				break;
			}
			case 4 : {
				System.out.println("Travaillez vous avec des produits dangeureux?");
				do{System.out.println("1.Oui\n2.Non\n");
				 choix2=sc.nextInt();}while (choix2!= 1 && choix2!=2);
				if(choix2==2) {
				System.out.println("Donner le nombre d heures travailles ");
				employes.add(new manutention(nom,prenom,datentree,age,sc.nextInt()));
				}
				else {
					System.out.println("Donner le nombre d heures travailles ");
					employes.add(new manutenteurSousRisque(nom,prenom,datentree,age,sc.nextInt()));
				}
				break;
			}
			default : System.out.println("Verfifier votre choix!");
		}
	 }
		
		public void calculeSalaires(){
for(int i = 0 ; i <employes.size();i++) {
	System.out.println(employes.get(i).getNom() + " ait comme salaire : "+ employes.get(i).calculerSalaire());
}
		}
		
public void ListeEmploye() {
	String tmp;
	for(int i = 0 ; i <employes.size();i++) {
		for(int j = i ; j <employes.size();j++) {
		if (employes.get(i).getPrenom().compareTo(employes.get(j).getPrenom()) > 0) 
        {
          System.out.println(employes.get(i).getPrenom());
        }
		
		}
		
	}
}
		
		
		
			
		public double SalaireMoyen() {
			double somme=0;
			for(int i = 0 ; i <employes.size();i++) {
				somme = somme + employes.get(i).calculerSalaire();
			}
			return (somme/employes.size());
		 
		 
	 }

		public collection() {
		}
	 
	 
	 

}

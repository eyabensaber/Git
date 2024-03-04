package Data;

import java.time.LocalDate;

public class producteur extends employe {

	protected int nbproduits; 
	
	public void setNbproduits(int nbproduits) {
		this.nbproduits = nbproduits;
	}

	public producteur(String nom, String prenom, LocalDate datentree, int age, int nb) {
		super(nom, prenom, datentree, age);
		this.nbproduits=nb;	}

	@Override
	public double calculerSalaire() {
		return nbproduits*5;
	}
	
	@Override
	 public String getNom() {
		return "le producteur : " + this.nom+" "+ this.prenom;
	}
}

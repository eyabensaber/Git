package Data;

import java.time.LocalDate;

public class manutention extends employe {

	protected int nbheures;
	public void setNbheures(int nbheures) {
		this.nbheures = nbheures;
	}

	public manutention(String nom, String prenom, LocalDate datentree, int age,int nbheures) {
		super(nom, prenom, datentree, age);
this.nbheures = nbheures;
}

	@Override
	public double calculerSalaire() {
		return nbheures*10;
	}
	@Override
	 public String getNom() {
		return "le manutenteur : " + this.nom+" "+ this.prenom;
	}
}

package Data;

import java.time.LocalDate;

public class representant extends employe {
	private double chiffredaff;

	public representant(String nom, String prenom, LocalDate datentree, int age,double ca) {
		super(nom, prenom, datentree, age);
		this.chiffredaff = ca;
	}



	public void setChiffredaff(double chiffredaff) {
		this.chiffredaff = chiffredaff;
	}
	
	@Override
	public double calculerSalaire() {
		
		return 0.2*chiffredaff + 750 ;
	}
	 
	@Override
	 public String getNom() {
		return "le representant : " + this.nom+" "+ this.prenom;
	}
}

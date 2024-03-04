package Data;

import java.time.LocalDate;

public abstract class employe {
 public String getPrenom() {
		return prenom;
	}
protected String nom;
protected String prenom;
 protected LocalDate datentree;
 protected int age;

 public String getNom() {
	return "l employe : " + this.nom+" "+ this.prenom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public void setPrenom(String prenom) {
	this.prenom = prenom;
}

public employe(String nom, String prenom, LocalDate datentree, int age) {
	super();
	this.nom = nom;
	this.prenom = prenom;
	this.datentree = datentree;
	this.age = age;
}

public employe() {
	super();
}
public abstract double calculerSalaire();



  

}


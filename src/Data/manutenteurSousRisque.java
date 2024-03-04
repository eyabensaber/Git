package Data;

import java.time.LocalDate;

public class manutenteurSousRisque extends manutention  implements Prime{

	public manutenteurSousRisque(String nom, String prenom, LocalDate datentree, int age, int nbheures) {
		super(nom, prenom, datentree, age, nbheures);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double calculerSalaire() {
		return nbheures*10 +Prime.primedang()  ;
	}


}

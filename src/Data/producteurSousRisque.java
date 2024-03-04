package Data;

import java.time.LocalDate;

public class producteurSousRisque extends producteur  implements Prime {

	public producteurSousRisque(String nom, String prenom, LocalDate datentree, int age, int nb) {
		super(nom, prenom, datentree, age, nb);
		// TODO Auto-generated constructor stub
	}
	@Override
	public double calculerSalaire() {
		return nbproduits*5 +Prime.primedang()  ;
	}


}

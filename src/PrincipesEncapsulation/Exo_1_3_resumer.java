package PrincipesEncapsulation;

import utilitaire.Input;

public class Exo_1_3_resumer {

	public static void main(String[] args) {
	

			Exo_1_3_Adresse adresse1 = new Exo_1_3_Adresse(2, "rue Victor Hugo", "Paris", 75088);
			Exo_1_3_Adresse adresse2 = new Exo_1_3_Adresse(17, "rue de la republique", "Nantes", 44000);
			Exo_1_3_Adresse adresse3 = new Exo_1_3_Adresse(55, "Bld de la libération", "Lille", 59000);
			Exo_1_3_Adresse adresse4 = new Exo_1_3_Adresse(44, "Rue des Docks", "Bordeaux", 33000);
			
			adresse1.afficher();
			
			Exo_1_3_Personne2 personne1= new Exo_1_3_Personne2("Jean", "Dupond", 30, adresse3);
			Exo_1_3_Personne2 personne2= new Exo_1_3_Personne2("Bernard", "Morin", 45, adresse1);
			Exo_1_3_Personne2 personne3= new Exo_1_3_Personne2("Nathalie", "Durand", 35, adresse2);

		Input.message(personne1.toString());
		Input.message(personne2.toString());
		Input.message(personne3.toString());
		
		personne1.setAdresse(adresse4);
		
		Input.message(personne1.toString());
		
		personne3.setAdresse(adresse1);
		Input.message(personne3.toString());
		Input.message(personne2.toString());
		
		
	}


}

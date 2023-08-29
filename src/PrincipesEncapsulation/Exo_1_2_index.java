package PrincipesEncapsulation;

import java.util.Scanner;

import utilitaire.Input;

public class Exo_1_2_index {

	public static void start(String[] args) {
	
		
		Exo_1_2_Personne personne1 = new Exo_1_2_Personne("Gerard", "Axa");
		Exo_1_2_Personne personne2 = new Exo_1_2_Personne("Voldemort", "Poudlard");
		Exo_1_2_Personne personne3 = new Exo_1_2_Personne("Homer", "Sprigfield");
		Exo_1_2_Personne personne4 = new Exo_1_2_Personne("Asterix", "afpa");
		
		personne1.afficher();
	}	

}
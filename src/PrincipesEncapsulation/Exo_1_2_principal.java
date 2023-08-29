package PrincipesEncapsulation;

public class Exo_1_2_principal {

	public static void main(String[] args) {
	
		System.out.println("Passage dans main");
		
		Exo_1_2_Personne personne1 = new Exo_1_2_Personne("Gerard", "Axa");
		Exo_1_2_Personne personne2 = new Exo_1_2_Personne("Voldemort", "Poudlard");
		Exo_1_2_Personne personne3 = new Exo_1_2_Personne("Homer", "Sprigfield");
		Exo_1_2_Personne personne4 = new Exo_1_2_Personne("Asterix", "Je ne suis pas employé");
		
		
		personne1.afficher();
		personne1.quitterSociete();
		personne1.setSociete("afpa");
		personne1.afficher();
		
		
	}

}

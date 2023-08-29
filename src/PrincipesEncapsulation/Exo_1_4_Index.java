package PrincipesEncapsulation;

import utilitaire.Input;

public class Exo_1_4_Index {

	public static void main(String[] args) {
	

		
		
		Exo_1_4_Utilisateur Personne1 = new Exo_1_4_Utilisateur("Jean", "Dupont", Exo_1_4_CateorieUtilisateur.MODERATEUR);
		Exo_1_4_Utilisateur Personne2 = new Exo_1_4_Utilisateur("Bernard", "Morin", Exo_1_4_CateorieUtilisateur.STANDARD);
		Exo_1_4_Utilisateur Personne3 = new Exo_1_4_Utilisateur("Nathalie", "Morin", Exo_1_4_CateorieUtilisateur.STANDARD);
		
		
		
		Input.message(Personne1.toString());
		Input.message(Personne2.toString());
		Input.message(Personne3.toString());
		
		Exo_1_4_Message message1 = new Exo_1_4_Message("Java SE","L'encapsulation est une propriété fondamentale", Personne2);
		Exo_1_4_Message message2 = new Exo_1_4_Message("Java SE","Les annotation sont pratique en java", Personne3);
		Exo_1_4_Message message3 = new Exo_1_4_Message("Java SE","Le java c'st compliqué", Personne1);

		Exo_1_4_MessageUtilisateur msg = new Exo_1_4_MessageUtilisateur(message3, Personne2);
		
		msg.ajouter();
		
			
		Input.message(message1.toString());
		Input.message(message2.toString());
		Input.message(message3.toString());
	
	}

}

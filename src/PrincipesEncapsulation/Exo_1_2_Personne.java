package PrincipesEncapsulation;

import utilitaire.Input;

public class Exo_1_2_Personne {

	private  String Nom;
	private  String Societe;
	private static final String PAS_DE_SOCIETE = "Je n'est pas de societe";
	
	
	public Exo_1_2_Personne(String nom) {
		super();
			this.Nom = nom;
	}
	public Exo_1_2_Personne(String nom, String societe) {
		super();
		this.Nom = nom; // variable d'instance
		this.Societe = societe;
	}
	
	public  String getNom() {
		return this.Nom; 
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	public  String getSociete() {
		return this.Societe;
	}
	public void setSociete(String societe) {
		Societe = societe.toUpperCase();
	}
	public static String getPasDeSociete() {
		return PAS_DE_SOCIETE;
	}
	
	public void quitterSociete() {	
		Input.message("je m'appel "+ this.Nom);
		Input.message("Je n'est pas de societe");
	}
	
	public void afficher() {
		Input.message("je m'appel "+ this.Nom);
		Input.message("Je travaille chez " + this.getSociete());
	}
	
	
	

	}
	


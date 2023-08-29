package PrincipesEncapsulation;

import utilitaire.Input;

public class Exo_1_3_Adresse {

	private  int Numero_rue;
	private  String nom_rue;
	private  String Ville;
	private  int codePostal;
	
	public int getNumero_rue() {
		return Numero_rue;
	}
	public void setNumero_rue(int numero_rue) {
		Numero_rue = numero_rue;
	}
	public String getNom_rue() {
		return nom_rue;
	}
	public void setNom_rue(String nom_rue) {
		this.nom_rue = nom_rue;
	}
	public String getVille() {
		return Ville;
	}
	public void setVille(String ville) {
		Ville = ville;
	}
	public int getCodePostal() {
		return codePostal;
	}
	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}
	public Exo_1_3_Adresse(int numero_rue, String nom_rue, String ville, int codePostal) {
		super();
		Numero_rue = numero_rue;
		this.nom_rue = nom_rue;
		Ville = ville;
		this.codePostal = codePostal;
	}
	
	public String afficher() {
		return ("adresse : " + " " +Numero_rue +" " + this.nom_rue +" " + Ville +" " + this.codePostal);
	}
	
}

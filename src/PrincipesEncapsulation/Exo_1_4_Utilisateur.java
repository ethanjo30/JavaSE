package PrincipesEncapsulation;

public class Exo_1_4_Utilisateur {

	private String Nom;
	private String Prenom;
	private Exo_1_4_CateorieUtilisateur Statut;
	
	public Exo_1_4_Utilisateur(String nom, String prenom, Exo_1_4_CateorieUtilisateur statut) {
		super();
		this.Nom = nom;
		this.Prenom = prenom;
		this.Statut = statut;
	}
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		this.Nom = nom;
	}
	public String getPrenom() {
		return Prenom;
	}
	
	
	public void setPrenom(String prenom) {
		this.Prenom = prenom;
	}
	public Exo_1_4_CateorieUtilisateur getStatut() {
		return Statut;
	}
	public void setStatut(Exo_1_4_CateorieUtilisateur statut) {
		this.Statut = statut;
	}
	public String toString(){
		return "Utilisateur :" +Prenom + "," +Nom+ "," +Statut;
		}
	
	
}

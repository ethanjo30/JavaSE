package PrincipesEncapsulation;

public class Exo_1_4_MessageUtilisateur {

	
	private Exo_1_4_Message Message;
	private Exo_1_4_Utilisateur Utilisateur;
	private Exo_1_4_Forum forum = new  Exo_1_4_Forum();
	
	public Exo_1_4_Utilisateur getUtilisateur() {
		return Utilisateur;
	}
	public void setUtilisateur(Exo_1_4_Utilisateur utilisateur) {
		this.Utilisateur = utilisateur;
	}
	public Exo_1_4_Message getMessage() {
		return Message;
	}
	public void setMessage(Exo_1_4_Message message) {
		this.Message = message;
	}
	public Exo_1_4_MessageUtilisateur(Exo_1_4_Message message, Exo_1_4_Utilisateur utilisateur) {
		super();
		this.Message = message;
		this.Utilisateur = utilisateur;
	}
	
	public void ajouter() {
		forum.getAjouterUtilisateurMessage(this);
	}
	
}

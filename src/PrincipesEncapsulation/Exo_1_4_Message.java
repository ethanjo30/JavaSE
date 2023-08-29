package PrincipesEncapsulation;

import java.text.DateFormat;
import java.util.Date;

public class Exo_1_4_Message {

	private String titre;
	private String texte;
	private Date DateCreation;
	private Exo_1_4_Utilisateur Utilisateur;
	
	public static final Exo_1_4_Forum forum = new Exo_1_4_Forum();
	

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getTexte() {
		return texte;
	}

	public void setTexte(String texte) {
		this.texte = texte;
	}

	public String getDateCreation() {
		DateFormat df = DateFormat.getDateTimeInstance(DateFormat.MEDIUM,DateFormat.MEDIUM);
		return df.format(DateCreation);
	}

	public String getUtilisateur() {
		return Utilisateur.getPrenom() + " " + Utilisateur.getNom() + " " + Utilisateur.getStatut();
	}

	public Exo_1_4_Message(String titre, String texte, Exo_1_4_Utilisateur auteur) {
		super();
		this.titre = titre;
		this.texte = texte;
		Utilisateur = auteur;
		this.DateCreation = new Date();
	}

	public String toString () {
		return titre + " " + texte + " " + "\nDateCreation : " + getDateCreation() + "\n" + Utilisateur.toString();
		}

	
	
}

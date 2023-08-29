package PrincipesEncapsulation;

import java.util.ArrayList;

public class Exo_1_4_Forum {


	private String ajouterUtilisateurMessage;

	private ArrayList<Exo_1_4_MessageUtilisateur>listMessageUtilisateur= new ArrayList<Exo_1_4_MessageUtilisateur>();
	
	int NBR_MESSAGE=0;

	public String getAjouterUtilisateurMessage(Exo_1_4_MessageUtilisateur msg) {
		listMessageUtilisateur.add(msg);
		System.out.println(listMessageUtilisateur.get(listMessageUtilisateur.size()-1).getMessage().toString());
		return "message ajouter";
	}
	
//	for(int i= 0; i<listMessageUtilisateur.size()-1; i++) {
//	}	

	public void setAjouterUtilisateurMessage(String ajouterUtilisateurMessage) {
		this.ajouterUtilisateurMessage = ajouterUtilisateurMessage;
	}

	
	
}



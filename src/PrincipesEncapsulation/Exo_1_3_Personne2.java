package PrincipesEncapsulation;

public class Exo_1_3_Personne2 {

private String prenom;
private String nom;
private int age;
private Exo_1_3_Adresse adresse;

public String getPrenom() {
	return prenom;
}
public void setPrenom(String prenom) {
	this.prenom = prenom;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public Exo_1_3_Adresse getAdresse() {
	return adresse;
}
public void setAdresse(Exo_1_3_Adresse adresse) {
	this.adresse = adresse;
}
public Exo_1_3_Personne2(String prenom, String nom, int age, Exo_1_3_Adresse adresse) {
	super();
	this.prenom = prenom;
	this.nom = nom;
	this.age = age;
	this.adresse = adresse;
}
 public String toString() {
		return prenom + " " + nom + " " + age + " "+ "ans"+ " " + "habite au" + " " + adresse.afficher();
	}


}

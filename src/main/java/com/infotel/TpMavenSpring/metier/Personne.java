package com.infotel.TpMavenSpring.metier;

/**
 * @author IN-MP-023
 *
 */
public class Personne {
 private String nom;
 private String prenom;
 private int age;
 private int idPersonne;
 private Adresse adresse;//on parle pas ici de onetoone
 /**
  * Cette methode permet de retourner l'Id de la personne
  * @return l'Id de la personne
  */
 public int getIdPersonne() {
		return idPersonne;
	}
/**
 * cette methode permet de setter l'Id de la personne
 * @param id de la personne
 */
 public void setIdPersonne(int idPersonne) {
		this.idPersonne = idPersonne;
	}

/**
 * cette methode permet de retourner le nom de la personne
 * @return renvoie le nom
 */
public String getNom() {
	return nom;
}


/**
 * cette personne permet de setter le nom de la personne
 * @param nom le nom de la personne 
 */
public void setNom(String nom) {
	this.nom = nom;
}
/**
 * cette methode permet de retourner le prenom de la personne
 * @return renvoie le prenom de la personne
 */
public String getPrenom() {
	return prenom;
}
/**
 * cette methode permet de setter le prenom de la personne
 * @param prenom le prenom de la personne
 */
public void setPrenom(String prenom) {
	this.prenom = prenom;
}
/**
 * cette methode permet de retourner l'age de la personne
 * @return renvoie l'age de la personne
 */
public int getAge() {
	return age;
}
/**
 * cette methode permet de setter l'age de la personne
 * @param age l'age de la personne
 */      
/**
 * @param age
 */
public void setAge(int age) {
	this.age = age;
} 

/**
 * cette methode permet de retourner l'adresse de l'Adresse
 * @return renvoie l'adresse
 */
public Adresse getAdresse() {
	return adresse;
}

/**
 * cette methode permet de setter l'Adresse
 * @param adresse l'adresse de l'Adresse
 */
public void setAdresse(Adresse adresse) {
	this.adresse = adresse;
}
@Override
public String toString() {
	return "Personne [nom=" + nom + ", prenom=" + prenom + ", age=" + age + ", idPersonne=" + idPersonne + ", adresse="
			+ adresse + "]";
}



 
}

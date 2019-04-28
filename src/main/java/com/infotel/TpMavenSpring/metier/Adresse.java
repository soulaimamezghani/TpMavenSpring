package com.infotel.TpMavenSpring.metier;


import java.util.List;
/**
 * cette classe represente les adresses de mon systéme
 *@author IN-MP-023
 *
 */

public class Adresse {
	private int idAdresse;
	private String numRue;
	private String nomRue;
	private String cp;
	private String ville;
	private List<Personne> personnes;// =new ArrayList<Personne>();
	public int getIdAdresse() {
		return idAdresse;
	}
	/**
	 * cette methode permet de setter une adresse
	 * @param idAdresse id de l'adresse
	 * @version =0
	 */
	public void setIdAdresse(int idAdresse) {
		this.idAdresse = idAdresse;
	}
	/**
	 * cette methode permet de retourner le numero de la rue
	 * @return renvoie le num de rue
	 */
	public String getNumRue() {
		return numRue;
	}
	/**
	 * cette methode permet des setter un numero de rue
	 * @param numRue 
	 */
	public void setNumRue(String numRue) {
		this.numRue = numRue;
	}
	/**
	 * Cette methode permet de retourner le nom de la rue
	 * @return renvoie le nom de la rue
	 */
	public String getNomRue() {
		return nomRue;
	}
	/**
	 * cette adresse permet de setter le nom de la rue 
	 * @param nomRue
	 */
	public void setNomRue(String nomRue) {
		this.nomRue = nomRue;
	}
	/**
	 * Cette adresse permet de retourner le cp
	 * @return renvoie le cp
	 */
	public String getCp() {
		return cp;
	}
	/**
	 * Cette adresse permet de setter le cp
	 * @param cp
	 */
	public void setCp(String cp) {
		this.cp = cp;
	}
	/**
	 * cette methode permet de retourner la ville
	 * @return renvoie la ville
	 */
	public String getVille() {
		return ville;
	}
	/**
	 * cette methode permet de setter la ville
	 * @param ville
	 */
	public void setVille(String ville) {
		this.ville = ville;
	}
	/**
	 * cette methode permet de lister les personnes 
	 * @return renvoie la liste des personnes
	 */
	public List<Personne> getPersonnes() {
		return personnes;
	}
	/**
	 * cette methode permet de setter les personnes 
	 * @param personnes
	 */
	public void setPersonnes(List<Personne> personnes) {
		this.personnes = personnes;
	}
	@Override
	public String toString() {
		return "Adresse [idAdresse=" + idAdresse + ", numRue=" + numRue + ", nomRue=" + nomRue + ", cp=" + cp
				+ ", ville=" + ville + ", personnes=" + personnes + "]";
	}
	

}

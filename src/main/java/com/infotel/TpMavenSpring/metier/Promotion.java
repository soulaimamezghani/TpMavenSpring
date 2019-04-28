package com.infotel.TpMavenSpring.metier;

public class Promotion {
private int idPromotion;
private String nomPromotion;
private Formation formation;

public Formation getFormation() {
	return formation;
}
public void setFormation(Formation formation) {
	this.formation = formation;
}
public int getIdPromotion() {
	return idPromotion;
}
public void setIdPromotion(int idPromotion) {
	this.idPromotion = idPromotion;
}
public String getNomPromotion() {
	return nomPromotion;
}
public void setNomPromotion(String nomPromotion) {
	this.nomPromotion = nomPromotion;
}
@Override
public String toString() {
	return "Promotion [idPromotion=" + idPromotion + ", nomPromotion=" + nomPromotion + ", formation=" + formation
			+ "]";
}


}

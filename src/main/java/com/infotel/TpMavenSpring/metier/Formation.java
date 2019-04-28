package com.infotel.TpMavenSpring.metier;

import java.util.List;

public class Formation {
private int idFormation;
private String nomFormation;
private List<Promotion>promotion;
public List<Promotion> getPromtion() {
	return promotion;
}
public void setPromtion(List<Promotion> promtion) {
	this.promotion = promtion;
}
public int getIdformation() {
	return idFormation;
}
public void setIdformation(int idformation) {
	this.idFormation = idformation;
}
public String getNomformation() {
	return nomFormation;
}
public void setNomformation(String nomformation) {
	this.nomFormation = nomformation;
}
@Override
public String toString() {
	return "Formation [idFormation=" + idFormation + ", nomFormation=" + nomFormation + ", promotion=" + promotion
			+ "]";
}

}

package com.infotel.TpMavenSpring.dao;

import com.infotel.TpMavenSpring.metier.Personne;

public class DaoImpl implements Idao{

	@Override
	public int ajouterPersonne(Personne p) {
		// TODO Auto-generated method stub
		System.out.println("la personne"+" "+"a été ajoutée");
		return p.getIdPersonne();
	}

}


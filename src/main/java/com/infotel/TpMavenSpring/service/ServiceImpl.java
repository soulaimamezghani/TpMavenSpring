package com.infotel.TpMavenSpring.service;

import com.infotel.TpMavenSpring.dao.Idao;
import com.infotel.TpMavenSpring.metier.Personne;

public class ServiceImpl implements Iservice{
private Idao dao;//puisque pas new il faut mettre setters getters car spring ve setter
	@Override
	public int ajouterPersonne(Personne p) {
		// TODO Auto-generated method stub
		return dao.ajouterPersonne(p);   
	}
	public Idao getDao() {
		return dao;
	}
	public void setDao(Idao dao) {
		this.dao = dao;
	}

}

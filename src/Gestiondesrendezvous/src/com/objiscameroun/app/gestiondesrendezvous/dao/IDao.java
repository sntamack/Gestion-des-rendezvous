package com.objiscameroun.app.gestiondesrendezvous.dao;

import java.util.List;

import com.objiscameroun.app.gestiondesrendezvous.domaine.Rendezvous;

/**
 * @author fernandez
 *ici on a l'interface qui contient les declarations des methodes
 */
public interface IDao {
	
	public List<Rendezvous> lectureDAORendezvous();
	
	public void enregistrerDAORendezvous(Rendezvous rv);

}

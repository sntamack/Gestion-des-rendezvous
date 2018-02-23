package com.objiscameroun.app.gestiondesrendezvous.service;

import java.util.List;

import com.objiscameroun.app.gestiondesrendezvous.domaine.Rendezvous;

/**
 * @author fernandez
 *
 */
public interface ITraitement {
	
	public void afficheTraitement(Traitement tr);
	public void afficherRendezvous(Rendezvous rv);
	
	public List<Rendezvous> lectureServiceRendezvous();
	
	public void enregistrerServiceRendezvous(Rendezvous rv);
	

} 

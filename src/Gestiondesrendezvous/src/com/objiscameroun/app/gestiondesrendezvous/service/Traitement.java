package com.objiscameroun.app.gestiondesrendezvous.service;

import java.util.List;

import com.objiscameroun.app.gestiondesrendezvous.dao.Dao;
import com.objiscameroun.app.gestiondesrendezvous.domaine.Rendezvous;

	
/**
 * @author fernandez
 *cette classe implemente toutes les methodes declarées dans la classe ITraitement
 */
public class Traitement implements ITraitement{

	
// les differentes signatures de la classe traitement
	@Override
	public void afficherRendezvous(Rendezvous rv){
	
		System.out.println("client à un nom: "  + rv.getNom());//affiche le nom du client
	
		System.out.println("l'heure du rendezvous est de ...a : " + rv.getHeure());//affiche lheure du rendez vous du client
		
		System.out.println("le rendezvous aura lieu de .. a: " + rv.getDate());//affiche la date du rendez vous
		
		System.out.println("le telephone du client du client est: " + rv.getTelephone());//affiche le telephone du client
		
		System.out.println("le type de soin du client: "+ rv.getSoins()); //affiche le type de soin du client
		// TODO Auto-generated method stub

		
	}

@Override
public void afficheTraitement(Traitement tr) {
	// TODO Auto-generated method stub
	
}

/* (non-Javadoc)
 * @see com.objiscameroun.app.gestiondesrendezvous.service.ITraitement#lectureServiceRendezvous()
 * cette methode permet de retourner la methode lecture serviceRendezvous de la classe  Dao
 
 */
@Override
public List<Rendezvous> lectureServiceRendezvous() {
	
Dao dao = new Dao();


	
	
	
	return dao.lectureDAORendezvous();
}

/* (non-Javadoc)
 * @see com.objiscameroun.app.gestiondesrendezvous.service.ITraitement#enregistrerServiceRendezvous(com.objiscameroun.app.gestiondesrendezvous.domaine.Rendezvous)
 * cette methode permet de retourner la methode enregistrerServiceRendezvousde la classe Dao
 */
@Override
public void enregistrerServiceRendezvous(Rendezvous rv) {
	// TODO Auto-generated method stub
	
	Dao dao = new Dao();
	
	dao.enregistrerDAORendezvous(rv);
}
}



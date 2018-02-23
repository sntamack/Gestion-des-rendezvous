package com.objiscameroun.app.gestiondesrendezvous.presentation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.objiscameroun.app.gestiondesrendezvous.domaine.Rendezvous;
import com.objiscameroun.app.gestiondesrendezvous.service.Traitement;

/**
 * @author fernandez
 *cette classe sert d'interface final entre l'utilisateur et l'ordinateur
 */
public class Gestiondesrendezvous {
public static void main(String args[]){
	System.out.println("bienvenue dans mon application de Gestion des rendez vous");
	
   Rendezvous  rv= new Rendezvous();
	Scanner sc = new Scanner(System.in);
	Scanner entier = new Scanner(System.in);
	
	System.out.println("entrer le nom du client SVP");//introduction du nom du client
	String client =sc.nextLine();
	rv.setNom(client);
	
	System.out.println("entrer la date du rendez vous du client: "); //introduire la date du rendez vous du client
	String date = sc.nextLine();
	rv.setDate(date);
	
	System.out.println("entrer l'heure du rendez vous: "); //introduire l'heure du rendez vous
	String heure = sc.nextLine();
	rv.setHeure(heure);
	
	System.out.println("dite quel type de soin le client fait : ");//indiquer le type de soin admintre au client
	String soin =sc.nextLine();
	rv.setSoins(soin);
	
	
	System.out.println("entre le telephone du client : ");//introduire le numero de telephone du client
	int telephone =sc.nextInt();
	rv.setTelephone(telephone);
	
	
	Traitement traitement =new Traitement();
	traitement.enregistrerServiceRendezvous(rv);
	
   /// traitement.afficherRendezvous(rv);// on fait appel au savoir faire afficher rendez vous de la classe traitement du package service
    
    
    
	System.out.println("affichage de tous les rendezvous afficher en base de données");
	List<Rendezvous> maListeRendezvous = new ArrayList <Rendezvous>();
	
	Traitement tr =  new Traitement();
	maListeRendezvous = tr.lectureServiceRendezvous();
	for(Rendezvous rendezvous: maListeRendezvous){
	System.out.println("********************************");	
	tr.afficherRendezvous(rendezvous);	
	
	}
	
	
	
	
	
	
	
    
}			
			
}
     


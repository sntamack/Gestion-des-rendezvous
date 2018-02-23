package com.objiscameroun.app.gestiondesrendezvous.domaine;

public class Employe extends Personne {
	
// ici se trouve l'heritage	
	private boolean statutE;
	
	
// ici on a un constructeur qui n'affiche rien 
	
	public Employe() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param nom
	 * @param prenom
	 * @param telephone
	 * @param adresse
	 * @param statutE
	 */
	public Employe(String nom, String prenom, String telephone, String adresse, boolean statutE) {
		super(nom, prenom, telephone, adresse);
		// TODO Auto-generated constructor stub
		this.statutE = statutE;
	}

	//GETTER AND SETTER
	public boolean isStatutE() {
		return statutE;
	}

	public void setStatutE(boolean statutE) {
		this.statutE = statutE;
	}
	

}

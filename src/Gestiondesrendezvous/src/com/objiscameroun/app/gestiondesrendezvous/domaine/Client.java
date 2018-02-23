package com.objiscameroun.app.gestiondesrendezvous.domaine;

/**
 * @author fernandez
 *
 */
public class Client extends Personne {
	// ici on a l'heritage

	private char sexe;

	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}
//ici c'est la section des constructeurs
	/**
	 * @param nom
	 * @param prenom
	 * @param telephone
	 * @param adresse
	 * @param sexe
	 */
	public Client(String nom, String prenom, String telephone, String adresse, char sexe) {
		super(nom, prenom, telephone, adresse);
		// TODO Auto-generated constructor stub
		this.sexe = sexe;
	}	 
	
	//GETTER AND SETTER
	public char getSexe() {
		return sexe;
	}

	public void setSexe(char sexe) {
		this.sexe = sexe;
	}
	

}

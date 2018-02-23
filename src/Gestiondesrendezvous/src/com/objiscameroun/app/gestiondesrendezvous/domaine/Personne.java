package com.objiscameroun.app.gestiondesrendezvous.domaine;

/**
 * @author fernandez
 *cette classe Rendezvous fournit un ensemble d'information d'une personne
 */
public class Personne {
	
	// ici je fais la declaration de mes attributs
	private String nom;
	private String prenom;
	private String telephone;
	private String adresse;

	public Personne() {
		super();

	}

	/**
	 * @param nom
	 * @param prenom
	 * @param telephone
	 * @param adresse
	 * cette methode permet de recuperer  les parametres du constructeur
	 */
	
	public Personne(String nom, String prenom, String telephone, String adresse) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.telephone = telephone;
		this.adresse = adresse;
	}

	// ici se trouve les getter et les setter

	 

	public String getNom() {// ici on un getter nom
		return nom;
	}

	public void setNom(String nom) { // ici on a un setter nom
		this.nom = nom;
	}

	public String getPrenom() { // ici on a un getter prenom
		return prenom;
	}

	public void setPrenom(String prenom) {// ici on a un setter prenom
		this.prenom = prenom;
	}

	public String getTelephone() { //ici on a un getter telephone
		return telephone;
	}

	public void setTelephone(String telephone) { // ici on a un setter telephone
		this.telephone = telephone;
	}

	public String getAdresse() { // ici on a un getter adresse
		return adresse;
	}

	public void setAdresse(String adresse) { //ici on a un setter adresse
		this.adresse = adresse;
	}

}

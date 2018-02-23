package domaine;

public class Rendezvous {
	// Ici je vais la déclaration de mes attributs
	private String date;
	private String heure;
	private String nom;
	private String soins;
	private int telephone;
	// Fin de la déclaration de mes attributs

	// Ici se trouve le constructeur de la classe Rendezvous avec paramètres
	/**
	 * @param date
	 * @param heure
	 * @param nom
	 * @param soins
	 */
	public Rendezvous(String nom, String date, String heure, String soins, int telephone) {
		super();
		this.nom = nom;
		this.date = date;
		this.heure = heure;
		this.soins = soins;
		this.telephone=telephone;
	}

	// Constructeurs sans paramètres

	public Rendezvous() {
		super();
	}

	// ACCESSEURS ET MUTATEUR DE MA CLASSE

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getHeure() {
		return heure;
	}

	public void setHeure(String heure) {
		this.heure = heure;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getSoins() {
		return soins;
	}

	public void setSoins(String soins) {
		this.soins = soins;
	}

	public int getTelephone() {
		return telephone;
	}

	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}
}

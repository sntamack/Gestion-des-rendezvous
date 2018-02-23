package com.objiscameroun.app.gestiondesrendezvous.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.objiscameroun.app.gestiondesrendezvous.domaine.Rendezvous;

public class Dao implements IDao {

	public Dao() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	//cette methode permet d'aller lire en base de données tout les commentaires

	@Override
	public List<Rendezvous> lectureDAORendezvous() {
		
		//CREATION D'UNE COLLECTION DE RENDEZVOUS
		
		List<Rendezvous> maListeRendezvous =new ArrayList<Rendezvous>();
		
		// Information d'accès à la base de données
					String url = "jdbc:mysql://localhost/rendezvous";
					String login = "root";
					String passwd = "rootroot";
					
					try {

						// Etape 1 : récupération de la connexion
						Connection cn = DriverManager.getConnection(url, login, passwd);

						// Etape 2 : préparation requête
						Statement st = cn.createStatement();

						String sql = "SELECT * FROM rendezvous";

						// Etape 3 : exécution requête
						ResultSet rs = st.executeQuery(sql);

						// Etape 4 :parcours Resultset (optionnel)
						while (rs.next()) {
							Rendezvous rv = new Rendezvous();
							rv.setDate(rs.getString("heure"));
							rv.setHeure(rs.getString("heure"));
							rv.setNom(rs.getString("nom"));
							rv.setSoins(rs.getString("soin"));
							rv.setTelephone(Integer.valueOf(rs.getString("telephone")).intValue());
							
							maListeRendezvous.add(rv);
							
							///System.out.println(rs.getString("nom")+" "+rs.getString("prenom")+" "+rs.getString("telephone"));
						}
						
						// Etape 5 : gestion des exceptions et libération 'automatique' des ressources
					} catch (SQLException e) {
						e.printStackTrace();
					} 
		
		
		// TODO Auto-generated method stub
		return maListeRendezvous;
	}

	@Override
	public void enregistrerDAORendezvous(Rendezvous rv) {
		// TODO Auto-generated method stub
		// Information d'accès à la base de données
		String url = "jdbc:mysql://localhost/rendezvous";
		String login = "root";
		String passwd = "rootroot";

		try {

			// Etape 1 : récupération de la connexion
			Connection cn = DriverManager.getConnection(url, login, passwd);

			// Etape 2 : Création d'un statement
			

			String sql = "insert  into `rendezvous`(`nom`,`telephone`,`heure`,`soin`)"
					+ "values (?,?,?,?)";
			
			 PreparedStatement ps = cn.prepareStatement(sql);
			 
			 ps.setString(1,rv.getNom() );
			 ps.setString(2,String.valueOf(rv.getTelephone()));
			 ps.setString(3,rv.getHeure());
			 ps.setString(4,rv.getSoins());
			 

			// Etape 3 : exécution requête
			ps.executeUpdate();
					
			

			// Etape 4 : gestion des exceptions et libération 'automatique' des ressources
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		
		
		
	}
	


}

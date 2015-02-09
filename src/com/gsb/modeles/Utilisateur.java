package com.gsb.modeles;

import com.gsb.modeles.util.ParametresBD;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by ipi on 09/02/2015.
 */
public class Utilisateur {
    private String login;
    private String motDePasse;
    private String nom;
    private String prenom;
    private String adresse;
    private String codePostal;
    private String ville;
    private String typeUtilisateur;

    public Utilisateur(String login, String motDePasse, String nom, String prenom, String adresse, String codePostal, String ville, String typeUtilisateur) {
        this.login = login;
        this.motDePasse = motDePasse;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.codePostal = codePostal;
        this.ville = ville;
        this.typeUtilisateur = typeUtilisateur;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getTypeUtilisateur() {
        return typeUtilisateur;
    }

    public void setTypeUtilisateur(String typeUtilisateur) {
        this.typeUtilisateur = typeUtilisateur;
    }

    public boolean verifier() {
        String requeteSelect =
                "SELECT * FROM utilisateurs WHERE login='" + getLogin() + "' AND motDePasse='" + getMotDePasse() + "';" ;
        ResultSet result = null;
        boolean b = false;
        String libelleRegion;

        try {
            result = ParametresBD.executeRequeteSQL(requeteSelect);
            if (result != null && result.next()) {
                b = true;
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Impossible de supprimer dans la table " + this.getClass().getName());
        } catch (SQLException e) {
            System.out.println("Impossible d'effectuer le traitement sur le résultat de la requete");
        }

        return b;
    }
}

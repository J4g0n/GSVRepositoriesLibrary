package com.gsb.modeles;

import com.gsb.modeles.util.EtatSQL;
import com.gsb.modeles.util.ParametresBD;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;


public class Region {
    private int id;
    private String libelle;


    public Region(int id, String libelle) {
        this.id = id;
        this.libelle = libelle;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }


    public EtatSQL creer() {
        String requeteCreer =
                "INSERT INTO regions (id, libelle) VALUES (" + getId() + ",'" + getLibelle() + "');";
        EtatSQL etatSQL = null;

        try {
            etatSQL = ParametresBD.executeUpdateSQL(requeteCreer);
        } catch (ClassNotFoundException e) {
            etatSQL = new EtatSQL("-100", this.getClass().getName(), "Impossible de faire le requete");
            System.out.println("Impossible d'insérer dans la table " + this.getClass().getName());
        }

        return etatSQL;
    }

    public EtatSQL modifier() {
        String requeteModifier =
                "UPDATE regions SET libelle='" + getLibelle() + "' WHERE id=" + getId() + ";";
        EtatSQL etatSQL = null;

        try {
            etatSQL = ParametresBD.executeUpdateSQL(requeteModifier);
        } catch (ClassNotFoundException e) {
            etatSQL = new EtatSQL("-100", this.getClass().getName(), "Impossible de faire le requete");
            System.out.println("Impossible de modifier dans la table " + this.getClass().getName());
        }

        return etatSQL;
    }

    public EtatSQL supprimer() {
        String requeteSupprimer =
                "DELETE FROM regions WHERE id=" + getId() + ";" ;
        EtatSQL etatSQL = null;

        try {
            etatSQL = ParametresBD.executeUpdateSQL(requeteSupprimer);
        } catch (ClassNotFoundException e) {
            etatSQL = new EtatSQL("-100", this.getClass().getName(), "Impossible de faire le requete");
            System.out.println("Impossible de supprimer dans la table " + this.getClass().getName());
        }

        return etatSQL;
    }

    public Region lire() {
        String requeteSelect =
                "SELECT * FROM regions WHERE id=" + getId() + ";" ;
        ResultSet result = null;
        Region region = null;
        String libelleRegion;
        int idRegion;

        try {
            result = ParametresBD.executeRequeteSQL(requeteSelect);
            if (result.next()) {
                idRegion = result.getInt("id");
                libelleRegion = result.getString("libelle");
                region = new Region(idRegion, libelleRegion);
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Impossible de supprimer dans la table " + this.getClass().getName());
        } catch (SQLException e) {
            System.out.println("Impossible d'effectuer le traitement sur le résultat de la requete");
        }

        return region;
    }

    public static Vector<Region> lst() {
        String requeteSelect =
                "SELECT * FROM regions;" ;
        ResultSet result = null;
        Vector<Region> regions = new Vector<Region>();
        String libelleRegion;
        int idRegion;

        try {
            result = ParametresBD.executeRequeteSQL(requeteSelect);
            while (result.next()) {
                idRegion = result.getInt("id");
                libelleRegion = result.getString("libelle");
                regions.add(new Region(idRegion, libelleRegion));
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Impossible de supprimer dans la table Region");
        } catch (SQLException e) {
            System.out.println("Impossible d'effectuer le traitement sur le résultat de la requete");
        }

        return regions;
    }
}

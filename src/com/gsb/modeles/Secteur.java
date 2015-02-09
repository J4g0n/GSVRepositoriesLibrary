package com.gsb.modeles;

/**
 * Created by ipi on 09/02/2015.
 */
public class Secteur {
    private int id;
    private String libelle;
    private int idRegion;

    public Secteur(int id, String libelle, int idRegion) {
        this.id = id;
        this.libelle = libelle;
        this.idRegion = idRegion;
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

    public int getIdRegion() {
        return idRegion;
    }

    public void setIdRegion(int idRegion) {
        this.idRegion = idRegion;
    }
}

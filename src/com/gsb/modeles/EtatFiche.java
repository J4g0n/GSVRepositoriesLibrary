package com.gsb.modeles;


public class EtatFiche {
    private int codeEtatFiche;
    private String libelle;

    public EtatFiche(int codeEtatFiche, String libelle) {
        this.codeEtatFiche = codeEtatFiche;
        this.libelle = libelle;
    }

    public int getCodeEtatFiche() {
        return codeEtatFiche;
    }

    public void setCodeEtatFiche(int codeEtatFiche) {
        this.codeEtatFiche = codeEtatFiche;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
}

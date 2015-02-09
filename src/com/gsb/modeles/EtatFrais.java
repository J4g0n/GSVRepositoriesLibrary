package com.gsb.modeles;


public class EtatFrais {
    private int codeFrais;
    private String libelle;

    public EtatFrais(String libelle, int codeFrais) {
        this.libelle = libelle;
        this.codeFrais = codeFrais;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public int getCodeFrais() {
        return codeFrais;
    }

    public void setCodeFrais(int codeFrais) {
        this.codeFrais = codeFrais;
    }
}

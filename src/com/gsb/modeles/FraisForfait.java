package com.gsb.modeles;

/**
 * Created by ipi on 09/02/2015.
 */
public class FraisForfait {
    private int codeFrais;
    private String libelle;
    private double montant;

    public FraisForfait(int codeFrais, String libelle, double montant) {
        this.codeFrais = codeFrais;
        this.libelle = libelle;
        this.montant = montant;
    }

    public int getCodeFrais() {
        return codeFrais;
    }

    public void setCodeFrais(int codeFrais) {
        this.codeFrais = codeFrais;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }
}

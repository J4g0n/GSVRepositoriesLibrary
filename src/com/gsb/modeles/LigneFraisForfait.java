package com.gsb.modeles;

/**
 * Created by ipi on 09/02/2015.
 */
public class LigneFraisForfait {
    private int idVisiteur;
    private String annee;
    private String mois;
    private int codeFraisForfait;
    private int etatFrais;
    private int quantite;

    public LigneFraisForfait(int idVisiteur, String annee, String mois, int codeFraisForfait, int etatFrais, int quantite) {
        this.idVisiteur = idVisiteur;
        this.annee = annee;
        this.mois = mois;
        this.codeFraisForfait = codeFraisForfait;
        this.etatFrais = etatFrais;
        this.quantite = quantite;
    }

    public int getIdVisiteur() {
        return idVisiteur;
    }

    public void setIdVisiteur(int idVisiteur) {
        this.idVisiteur = idVisiteur;
    }

    public String getAnnee() {
        return annee;
    }

    public void setAnnee(String annee) {
        this.annee = annee;
    }

    public String getMois() {
        return mois;
    }

    public void setMois(String mois) {
        this.mois = mois;
    }

    public int getCodeFraisForfait() {
        return codeFraisForfait;
    }

    public void setCodeFraisForfait(int codeFraisForfait) {
        this.codeFraisForfait = codeFraisForfait;
    }

    public int getEtatFrais() {
        return etatFrais;
    }

    public void setEtatFrais(int etatFrais) {
        this.etatFrais = etatFrais;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }
}

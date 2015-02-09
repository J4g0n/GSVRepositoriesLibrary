package com.gsb.modeles;


public class LigneFraisHorsForfait {
    private int idVisiteur;
    private String annee;
    private String mois;
    private int numOrdre;
    private String libelle;
    private double montant;
    private int etatFiche;

    public LigneFraisHorsForfait(int idVisiteur, String annee, String mois, int numOrdre, String libelle, double montant, int etatFiche) {
        this.idVisiteur = idVisiteur;
        this.annee = annee;
        this.mois = mois;
        this.numOrdre = numOrdre;
        this.libelle = libelle;
        this.montant = montant;
        this.etatFiche = etatFiche;
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

    public int getNumOrdre() {
        return numOrdre;
    }

    public void setNumOrdre(int numOrdre) {
        this.numOrdre = numOrdre;
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

    public int getEtatFiche() {
        return etatFiche;
    }

    public void setEtatFiche(int etatFiche) {
        this.etatFiche = etatFiche;
    }
}

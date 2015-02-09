package com.gsb.modeles;

/**
 * Created by ipi on 09/02/2015.
 */
public class FicheFrais {
    private int idVisiteur;
    private String annee;
    private String mois;
    private int nbJustificatifs;
    private double montantValide;
    private String dateModif;
    private int etatFiche;

    public FicheFrais(int idVisiteur, String annee, String mois, double montantValide, int nbJustificatifs, String dateModif, int etatFiche) {
        this.idVisiteur = idVisiteur;
        this.annee = annee;
        this.mois = mois;
        this.montantValide = montantValide;
        this.nbJustificatifs = nbJustificatifs;
        this.dateModif = dateModif;
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

    public int getNbJustificatifs() {
        return nbJustificatifs;
    }

    public void setNbJustificatifs(int nbJustificatifs) {
        this.nbJustificatifs = nbJustificatifs;
    }

    public double getMontantValide() {
        return montantValide;
    }

    public void setMontantValide(double montantValide) {
        this.montantValide = montantValide;
    }

    public String getDateModif() {
        return dateModif;
    }

    public void setDateModif(String dateModif) {
        this.dateModif = dateModif;
    }

    public int getEtatFiche() {
        return etatFiche;
    }

    public void setEtatFiche(int etatFiche) {
        this.etatFiche = etatFiche;
    }
}

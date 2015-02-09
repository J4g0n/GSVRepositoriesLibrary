package com.gsb.modeles;


public class Visiteur {
    private int id;
    private String login;
    private String motDePasse;
    private String nom;
    private String prenom;
    private String adresse;
    private String ville;
    private String codePostal;
    private String dateEmbauche;
    private String photo;
    private int departement;
    private int idDelegue;

    public Visiteur(int id, String login, String motDePasse, String nom, String adresse, String prenom, String ville, String codePostal, String dateEmbauche, String photo, int departement, int idDelegue) {
        this.id = id;
        this.login = login;
        this.motDePasse = motDePasse;
        this.nom = nom;
        this.adresse = adresse;
        this.prenom = prenom;
        this.ville = ville;
        this.codePostal = codePostal;
        this.dateEmbauche = dateEmbauche;
        this.photo = photo;
        this.departement = departement;
        this.idDelegue = idDelegue;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public String getDateEmbauche() {
        return dateEmbauche;
    }

    public void setDateEmbauche(String dateEmbauche) {
        this.dateEmbauche = dateEmbauche;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public int getDepartement() {
        return departement;
    }

    public void setDepartement(int departement) {
        this.departement = departement;
    }

    public int getIdDelegue() {
        return idDelegue;
    }

    public void setIdDelegue(int idDelegue) {
        this.idDelegue = idDelegue;
    }
}

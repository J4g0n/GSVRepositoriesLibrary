package com.gsb.modeles;


public class Departement {
    private int id;
    private String libelle;
    private int idSecteur;

    public Departement(int id, String libelle, int idSecteur) {
        this.id = id;
        this.libelle = libelle;
        this.idSecteur = idSecteur;
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

    public int getIdSecteur() {
        return idSecteur;
    }

    public void setIdSecteur(int idSecteur) {
        this.idSecteur = idSecteur;
    }
}

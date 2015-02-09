package com.gsb.modeles;


public class Test {
    public static void main (String [] args) {
        Region reg = new Region(119,"Fantasia");
        //reg.creer();
        //reg.supprimer();
        reg.setLibelle("FantasiaLandBis");
        reg.modifier();

        System.out.println(reg.lire().getLibelle());
    }
}

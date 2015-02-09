package com.gsb.modeles;


import java.util.Vector;

public class Test {
    public static void main (String [] args) {
        Region reg = new Region(119,"Fantasia");
        //reg.creer();
        //reg.supprimer();
        reg.setLibelle("FantasiaLandTrès");
        reg.modifier();

        System.out.println(reg.lire().getLibelle());
        Vector<Region> vRegion = Region.lst();
        for (Region region: vRegion) {
            System.out.println(region.getId() + " " + region.getLibelle());
        }
    }
}

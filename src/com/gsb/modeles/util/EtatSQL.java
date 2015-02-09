package com.gsb.modeles.util;


public class EtatSQL {
    private String codeEtat;
    private String tableSql;
    private String libelleEtat;

    public EtatSQL(String codeEtat, String tableSql, String libelleEtat) {
        this.setCodeEtat(codeEtat);
        this.setTableSql(tableSql);
        this.setLibelleEtat(libelleEtat);
    }

    public String getCodeEtat() {
        return codeEtat;
    }

    public void setCodeEtat(String codeEtat) {
        this.codeEtat = codeEtat;
    }

    public String getTableSql() {
        return tableSql;
    }

    public void setTableSql(String tableSql) {
        this.tableSql = tableSql;
    }

    public String getLibelleEtat() {
        return libelleEtat;
    }

    public void setLibelleEtat(String libelleEtat) {
        this.libelleEtat = libelleEtat;
    }
}

package com.company.model;

public class Produkt {
    Long id;
    String name;
    double preis;
    String SKU;
    int initialeAnzahl;

    public Produkt(Long id,String name, double preis, String SKU, int initialeAnzahl) {
        this.id=id;
        this.name = name;
        this.preis = preis;
        this.SKU = SKU;
        this.initialeAnzahl = initialeAnzahl;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    public String getSKU() {
        return SKU;
    }

    public void setSKU(String SKU) {
        this.SKU = SKU;
    }

    public int getInitialeAnzahl() {
        return initialeAnzahl;
    }

    public void setInitialeAnzahl(int initialeAnzahl) {
        this.initialeAnzahl = initialeAnzahl;
    }
}

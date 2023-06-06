package org.lessons.java.shop;

import java.math.BigDecimal;

public class Smartphone extends Prodotto {

    private int imei;
    private int memoria;

    // CONSTRUCTOR
    public Smartphone(String nome, BigDecimal prezzo, BigDecimal iva, String descrizione, int imei, int memoria) {
        super(nome, prezzo, iva, descrizione);
        this.imei = imei;
        this.memoria = memoria;
    }

    // GETTERS & SETTERS

    public int getImei() {
        return imei;
    }

    public void setImei(int imei) {
        this.imei = imei;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "imei=" + imei +
                ", memoria=" + memoria +
                "} " + super.toString();
    }
}

package org.lessons.java.shop;

import java.math.BigDecimal;

public class Televisore extends Prodotto {

    private int larghezza;
    private int altezza;
    private int profondita;
    private boolean smart;

    public Televisore(String nome, BigDecimal prezzo, BigDecimal iva, String descrizione, int larghezza, int altezza, int profondita, boolean smart) {
        super(nome, prezzo, iva, descrizione);
        this.larghezza = larghezza;
        this.altezza = altezza;
        this.profondita = profondita;
        this.smart = smart;
    }

    public int getLarghezza() {
        return larghezza;
    }

    public void setLarghezza(int larghezza) {
        this.larghezza = larghezza;
    }

    public int getAltezza() {
        return altezza;
    }

    public void setAltezza(int altezza) {
        this.altezza = altezza;
    }

    public int getProfondita() {
        return profondita;
    }

    public void setProfondita(int profondita) {
        this.profondita = profondita;
    }

    public boolean isSmart() {
        return smart;
    }

    public void setSmart(boolean smart) {
        this.smart = smart;
    }

    @Override
    public String toString() {
        return "Televisore{" +
                "larghezza=" + larghezza +
                ", altezza=" + altezza +
                ", profondita=" + profondita +
                ", smart=" + smart +
                "} " + super.toString();
    }
}


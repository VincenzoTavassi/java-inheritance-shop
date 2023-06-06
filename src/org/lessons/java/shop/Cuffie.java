package org.lessons.java.shop;

import java.math.BigDecimal;

public class Cuffie extends Prodotto {

    private String colore;
    private boolean cable;

    public Cuffie(String nome, BigDecimal prezzo, BigDecimal iva, String descrizione, String colore, boolean cable) {
        super(nome, prezzo, iva, descrizione);
        this.colore = colore;
        this.cable = cable;
    }

    public String getColore() {
        return colore;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }

    public boolean isCable() {
        return cable;
    }

    public void setCable(boolean cable) {
        this.cable = cable;
    }

    @Override
    public String toString() {
        return "Cuffie{" +
                "colore='" + colore + '\'' +
                ", cable=" + cable +
                "} " + super.toString();
    }
}

package org.lessons.java.shop;

import java.math.BigDecimal;
import java.util.Random;

public class Prodotto {
    private int codice;
    private String nome;
    private BigDecimal prezzo;
    private BigDecimal iva;
    private String descrizione;

    // Constructor
    public Prodotto(String nome, BigDecimal prezzo, BigDecimal iva, String descrizione) {
        Random rand = new Random();
        this.codice = rand.nextInt(1000, 10000);
        this.nome = nome;
        this.prezzo = prezzo;
        this.iva = iva;
        this.descrizione = descrizione;
    }

    // SETTERS

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPrezzo(BigDecimal prezzo) {
        this.prezzo = prezzo;
    }

    public void setIva(BigDecimal iva) {
        this.iva = iva;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    // GETTERS

    public int getCodice() {
        return this.codice;
    }

    public String getNome() {
        return this.nome;
    }

    public String getDescrizione() {
        return this.descrizione;
    }

    public BigDecimal getPrezzo() {
        return this.prezzo;
    }

    public BigDecimal getIva() {
        return this.iva;
    }

    public BigDecimal getPrezzoIva() {
        return this.prezzo.multiply(this.iva).divide(BigDecimal.valueOf(100));
    }

    public String getNomeCompleto() {
        return this.codice + "-" + this.nome;
    }

    @Override
    public String toString() {
        return "Prodotto{" +
                "codice=" + codice +
                ", nome='" + nome + '\'' +
                ", prezzo=" + prezzo +
                ", iva=" + iva +
                ", descrizione='" + descrizione + '\'' +
                '}';
    }
}

package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {
    private int codice;
    private String nome;
    private double prezzo;
    private int iva;
    private String descrizione;

    // Constructor
    public Prodotto(String nome, double prezzo, int iva, String descrizione) {
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

    public void setPrezzo(int prezzo) {
        this.prezzo = prezzo;
    }

    public void setIva(int iva) {
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

    public double getPrezzo() {
        return this.prezzo;
    }

    public int getIva() {
        return this.iva;
    }

    public double getPrezzoIva() {
        return this.prezzo * this.iva / 100;
    }

    public String getNomeCompleto() {
        return this.codice + "-" + this.nome;
    }
}

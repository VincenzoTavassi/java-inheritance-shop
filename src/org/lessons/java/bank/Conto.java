package org.lessons.java.bank;

import java.util.Random;

public class Conto {
    private final int numeroConto;
    private String proprietario;
    private double saldo;

    public Conto(String proprietario) {
        this.saldo = 0.0;
        this.proprietario = proprietario;
        Random rand = new Random();
        this.numeroConto = rand.nextInt(1, 1000);
    }

    public int getNumeroConto() {
        return this.numeroConto;
    }
    public String getProprietario() {
        return this.proprietario;
    }
    public double getSaldo() {
        return this.saldo;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public String getSaldoFormattato() {
        return "€ " + this.saldo;
    }

    public void versaDenaro(double importo) {
        if (importo > 0) this.saldo += importo;
    }

    public void prelevaDenaro(double importo) {
        if (this.saldo - importo > 0) this.saldo -= importo;
        else System.out.println("Il conto non ha disponibilità sufficiente");
    }
}

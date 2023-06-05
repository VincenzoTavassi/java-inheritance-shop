package org.lessons.java.bank;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual è il tuo nome?");
        String utente = scanner.nextLine();
        Conto contoUtente = new Conto(utente);

        boolean menuOpen = true;

        while(menuOpen) {
            System.out.println("Ciao " + contoUtente.getProprietario() + ", numero conto: " + contoUtente.getNumeroConto() + ". Cosa vuoi fare?");
            System.out.println("Prelevare: 1");
            System.out.println("Versare: 2");
            System.out.println("Uscire: 3");
            int sceltaUtente = scanner.nextInt();
            if (sceltaUtente == 1) {
                System.out.println("Inserisci l'importo da prelevare. Al momento hai a disposizione " + contoUtente.getSaldoFormattato());
                double importo = scanner.nextDouble();
                contoUtente.prelevaDenaro(importo);
                System.out.println("Il tuo saldo ora è di " + contoUtente.getSaldoFormattato());
            }
            if (sceltaUtente == 2) {
                System.out.println("Inserisci l'importo da versare. Al momento hai a disposizione " + contoUtente.getSaldoFormattato());
                double importo = scanner.nextDouble();
                contoUtente.versaDenaro(importo);
                System.out.println("Il tuo saldo ora è di " + contoUtente.getSaldoFormattato());
            }
            if (sceltaUtente == 3) {
                System.out.println("Grazie. Il tuo conto ha un saldo di " + contoUtente.getSaldoFormattato() + ". Arrivederci.");
                menuOpen = false;
            }

        }

    }
}

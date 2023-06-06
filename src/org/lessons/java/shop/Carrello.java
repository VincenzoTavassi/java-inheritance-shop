package org.lessons.java.shop;

import java.math.BigDecimal;
import java.util.Scanner;

public class Carrello {
    public static void main(String[] args) {

        System.out.println("Che prodotto intendi inserire?");
        System.out.println("1 - Smartphone, 2 - Televisore, 3 - Cuffie");
        Scanner scanner = new Scanner(System.in);
        String sceltaUtente = scanner.nextLine();
        System.out.println("Inserisci il nome del prodotto");
        String nomeProdotto = scanner.nextLine();
        System.out.println("Inserisci il prezzo");
        BigDecimal prezzoProdotto = new BigDecimal(scanner.nextLine());
        System.out.println("Inserisci l'iva da applicare");
        BigDecimal ivaProdotto = new BigDecimal(scanner.nextLine());
        System.out.println("Inserisci la descrizione");
        String descrizioneProdotto = scanner.nextLine();
        switch (sceltaUtente) {
            case "1":
                System.out.println("Inserisci l'imei");
                int imeiProdotto = scanner.nextInt();
                System.out.println("Inserisci la memoria");
                int memoriaProdotto = scanner.nextInt();
                Smartphone cellulare = new Smartphone(nomeProdotto, prezzoProdotto, ivaProdotto, descrizioneProdotto, imeiProdotto, memoriaProdotto);
                System.out.println(cellulare.toString());
                break;
            case "2":
                System.out.println("Inserisci la larghezza");
                int larghezza = scanner.nextInt();
                System.out.println("Inserisci l'altezza");
                int altezza = scanner.nextInt();
                System.out.println("Inserisci la profondità");
                int profondita = scanner.nextInt();
                System.out.println("E' uno smart TV? S/N");
                boolean smart = scanner.nextLine().equals("s");
                Televisore tv = new Televisore(nomeProdotto, prezzoProdotto, ivaProdotto, descrizioneProdotto, larghezza, altezza, profondita, smart);
                System.out.println(tv.toString());
                break;
            case "3":
                System.out.println("Inserisci il colore");
                String coloreProdotto = scanner.nextLine();
                System.out.println("Sono cuffie con fili? S/N");
                boolean cable = scanner.nextLine().equals("s");
                Cuffie cuffie = new Cuffie(nomeProdotto, prezzoProdotto, ivaProdotto, descrizioneProdotto, coloreProdotto, cable);
                System.out.println(cuffie.toString());
                break;
            default:
                System.out.println("Scelta non valida");
        }

    }
}

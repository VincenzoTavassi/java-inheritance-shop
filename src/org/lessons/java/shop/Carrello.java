package org.lessons.java.shop;

import java.math.BigDecimal;
import java.util.Scanner;

public class Carrello {
    public static void main(String[] args) {

        System.out.println("Quanti prodotti vuoi inserire?");
        int i = 0;
        Scanner scanner = new Scanner(System.in);
        int numeroProdotti = Integer.parseInt(scanner.nextLine());
        Prodotto[] carrelloProdotti = new Prodotto[numeroProdotti];
        while (i < numeroProdotti) {
            System.out.println("Che prodotto intendi inserire?");
            System.out.println("1 - Smartphone, 2 - Televisore, 3 - Cuffie");
            int sceltaUtente = scanner.nextInt();
            System.out.println("Inserisci il nome del prodotto");
            String nomeProdotto = scanner.next();
            System.out.println("Inserisci il prezzo");
            BigDecimal prezzoProdotto = new BigDecimal(scanner.next());
            System.out.println("Inserisci l'iva da applicare");
            BigDecimal ivaProdotto = new BigDecimal(scanner.next());
            System.out.println("Inserisci la descrizione");
            String descrizioneProdotto = scanner.next();
            switch (sceltaUtente) {
                case 1:
                    System.out.println("Inserisci l'imei");
                    int imeiProdotto = scanner.nextInt();
                    System.out.println("Inserisci la memoria");
                    int memoriaProdotto = scanner.nextInt();
                    Smartphone cellulare = new Smartphone(nomeProdotto, prezzoProdotto, ivaProdotto, descrizioneProdotto, imeiProdotto, memoriaProdotto);
                    System.out.println(cellulare.toString());
                    carrelloProdotti[i] = cellulare;
                    i++;
                    break;
                case 2:
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
                    carrelloProdotti[i] = tv;
                    i++;
                    break;
                case 3:
                    System.out.println("Inserisci il colore");
                    String coloreProdotto = scanner.next();
                    System.out.println("Sono cuffie con fili? S/N");
                    boolean cable = scanner.next().equals("s");
                    Cuffie cuffie = new Cuffie(nomeProdotto, prezzoProdotto, ivaProdotto, descrizioneProdotto, coloreProdotto, cable);
                    System.out.println(cuffie.toString());
                    carrelloProdotti[i] = cuffie;
                    i++;
                    break;
            }
        }

        System.out.println("I tuoi prodotti: ");
        for (int y = 0; y < carrelloProdotti.length; y++) {
            Prodotto prodotto = carrelloProdotti[y];
            System.out.println(prodotto.toString());
        }

    }
}

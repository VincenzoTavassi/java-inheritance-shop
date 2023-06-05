package org.lessons.java.shop;

public class Main {
    public static void main(String[] args) {
        Prodotto product = new Prodotto("Felpa", 10.00, 22, "Una bella felpa");
        System.out.println(product.getPrezzoIva());
        System.out.println(product.getNomeCompleto());
    }
}

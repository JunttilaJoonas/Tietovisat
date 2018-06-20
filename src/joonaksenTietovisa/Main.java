package joonaksenTietovisa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Kayttoliittyma kayttis = new Kayttoliittyma();
        Scanner lukija = new Scanner(System.in);

        Kysymystietokanta helpot = new Kysymystietokanta("helpotKysymykset.txt");
        PisteidenLaskija laskuri = new PisteidenLaskija();

        kayttis.kaynnista(helpot, lukija, laskuri);
    }
}

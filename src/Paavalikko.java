import joonaksenTietovisa.*;
import miikanTietovisa.*;
import nikonTietovisa.*;

import java.util.Scanner;

public class Paavalikko {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        JoonaksenPeli joonas = new JoonaksenPeli();
        MiikanPeli miika = new MiikanPeli();
        NikonPeli niko = new NikonPeli();


        System.out.println("Tervetuloa pelaamaan! Kenen peliä haluaisit pelata? (Joonas, Miika tai Niko)");

        outer:
        while (true) {
            String vastaus = lukija.nextLine().toLowerCase();
            switch (vastaus) {
                case "joonas":
                    joonas.kaynnista();
                    break outer;
                case "miika":
                    miika.kaynnista();
                    break outer;
                case "niko":
                    niko.kaynnista();
                    break outer;
                default:
                    System.out.println("Väärä nimi, yritä uudelleen!");
            }
        }






    }
}

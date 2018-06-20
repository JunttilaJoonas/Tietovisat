package joonaksenTietovisa;

import java.util.Scanner;

public class Kayttoliittyma {
    public void kaynnista(Kysymystietokanta kysymykset, Scanner lukija, PisteidenLaskija laskuri){

        int kysytyt = 0;

        System.out.println("Tervetuloa tietovisaan!");
        System.out.println();
        System.out.println("===== SÄÄNNÖT ===== ");
        System.out.println("Oikeasta vastauksesta saa yhden pisteen, tyhjästä vastauksesta 0.");
        System.out.println("Väärästä vastauksesta menetät yhden pisteen!");
        System.out.println("Kun olet valmis aloittamaan, paina Enter-näppäintä.");
        System.out.println();
        System.out.println("----------------------------------------");

        while (true) {
            if (lukija.nextLine().equals("")) {
                while (kysymykset.kysymyslistanKoko()>0) {
                    kysymykset.kysy(lukija,laskuri);
                    kysytyt++;
                }

                System.out.println("Kiitos pelaamisesta! Lopullinen tuloksesi: " + laskuri.getPisteet() + "/" + kysytyt);
                break;
            }
        }

    }
}

package miikanTietovisa;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.shuffle;

public class Kysymys {
    private String kysymysteksti;
    private List<String> vastaukset = new ArrayList<>();
    private String oikea;
    private String merkit = "abcdefghijklmnopqrstuvwxyzåäö";


    Kysymys(String teksti) {
        int kyssarinIndeksi = teksti.indexOf("?");
        this.kysymysteksti = teksti.substring(0, kyssarinIndeksi + 1);
        String[] jako = teksti.substring(kyssarinIndeksi + 1).split(",");
        for (int i = 0; i < jako.length - 1; i++) {
            this.vastaukset.add(jako[i].trim());
        }
        shuffle(vastaukset);
        oikea = jako[jako.length - 1].trim();
    }

    public boolean onkoOikein(char vastaus) {


        for (int i = 0; i < merkit.length(); i++) {
            if (vastaus == merkit.charAt(i)){
                if (vastaukset.get(i).equals(this.oikea)){
                    return true;
                }
            }
        }
        return false;
    }

    public void tulostaKysymys() {

        StringBuilder latoja = new StringBuilder();
        latoja.append(kysymysteksti);
        for (int i = 0; i < vastaukset.size(); i++) {
            latoja.append("\t" + merkit.charAt(i) + ") " + vastaukset.get(i));
        }

        System.out.println(latoja);

    }

    public String getOikea() {
        return oikea;
    }


}

package Sprint1.InlämningVäxthotell;

import javax.swing.*;
import java.util.ArrayList;

public class Huvudprogram {
    public static void main(String[] args) {

        //Polymorfism, skapar instanser av underklasser, men refererar till dem med överklass Växter
        Växter laura = new Palmer(5, "Laura");
        Växter meatloaf = new KöttätandeVäxter(0.7, "Meatloaf");
        Växter igge = new Kaktus(0.2, "Igge");
        Växter olof = new Palmer(1, "Olof");

        ArrayList<Växter> växterLista = new ArrayList<>();
        växterLista.add(laura);
        växterLista.add(meatloaf);
        växterLista.add(igge);
        växterLista.add(olof);

        Växter söktVäxt = null;

        while (söktVäxt == null) {
            String växtNamn = JOptionPane.showInputDialog("Skriv in namnet på växten du vill kolla: ");

            for (Växter växt : växterLista) {
                if (växt.getNamn().equalsIgnoreCase(växtNamn)) {
                    söktVäxt = växt;
                    break;
                }
            }
            if (växtNamn == null) {
                return;
            }

            if (söktVäxt == null) {
                int val = JOptionPane.showConfirmDialog(null, "Växten hittades ej, försök igen!",
                        "fel", JOptionPane.OK_CANCEL_OPTION);
                if (val == JOptionPane.OK_CANCEL_OPTION) {
                    return;
                }

            }

        }
        //Polymorfism, använder referens Växters metoder, men objekt avgör beteende (Palmer etc)
        JOptionPane.showMessageDialog(null, "Vätskemängd för " + söktVäxt.getNamn() +
                ":\n" + söktVäxt.getVätskeMängd() + " liter " + söktVäxt.getVätskeSort() + " per dag");
    }
}

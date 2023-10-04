package Sprint1.InlämningVäxthotell;

public class KöttätandeVäxter extends Växter { //Arv
    //Inkapsling
    private double basDosKöttVäxt = 0.1;
    private double antalLiterFörLängd = 0.2;
    private String vätskeSort = "Proteindryck";

    public KöttätandeVäxter(double höjd, String namn) {
        super(höjd, namn);
    }


    public double getVätskeMängd() {

        return basDosKöttVäxt + (antalLiterFörLängd * getHöjd());
    }


    public String getVätskeSort() {

        return vätskeSort;
    }
}

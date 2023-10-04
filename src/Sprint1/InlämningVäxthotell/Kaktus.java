package Sprint1.InlämningVäxthotell;

public class Kaktus extends Växter { //Arv
    //Inkapsling
    private double dagligDosKaktus = 0.02;
    private String vätskeSort = "Mineralvatten";

    public Kaktus(double höjd, String namn) {
        super(höjd, namn);
    }


    public double getVätskeMängd() {

        return dagligDosKaktus;
    }


    public String getVätskeSort() {

        return vätskeSort;
    }
}

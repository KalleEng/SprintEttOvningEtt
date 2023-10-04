package Sprint1.InlämningVäxthotell;

public class Palmer extends Växter { //Arv av Växter, därmed implementation av VattningOchDosering

    public Palmer(double höjd, String namn) {
        //Kallar på överklassen Växters constructor
        super(höjd, namn);
    }
    //Inkapsling
    private double halvLiter = 0.5;
    private String vätskeSort = "Kranvatten";

    //Getter
    public double getVätskeMängd() {
        return halvLiter * getHöjd();

    }

    public String getVätskeSort() {
        return vätskeSort;

    }
}


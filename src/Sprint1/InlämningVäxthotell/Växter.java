package Sprint1.InlämningVäxthotell;

//Abstrakt överklass som implementerar Interface för alla växttyper
public abstract class Växter implements VattningOchDosering {
    //Inkapsling av variabler med public getters och setters
    private double höjd;

    private String namn;


    public Växter(double höjd, String namn) {
        this.höjd = höjd;
        this.namn = namn;
    }

    public double getHöjd() {
        return höjd;
    } //Getter

    public String getNamn() {
        return namn;
    }

}

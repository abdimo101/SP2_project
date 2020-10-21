//abstract klasse som ikke kan bruges til at lave objekter, men andre klasser kan stadig bruge egenskaberne og konstruktøren.
abstract public class Bil {
    //egenskaber
    private int regNr;
    private String mærke;
    private String model;
    private int årgang;
    private int antalDøre;

    //konstruktør som kommer til at blive implementeret i andre sub klassernes konstruktør.
    public Bil(int regNr, String mærke, String model, int årgang, int antalDøre){
        this.regNr = regNr;
        this.mærke = mærke;
        this.model = model;
        this.årgang = årgang;
        this.antalDøre = antalDøre;
    }
    //getter & setter
    public int getRegNr() {
        return regNr;
    }

    public void setRegNr(int regNr) {
        this.regNr = regNr;
    }

    public String getMærke() {
        return mærke;
    }

    public void setMærke(String mærke) {
        this.mærke = mærke;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getÅrgang() {
        return årgang;
    }

    public void setÅrgang(int årgang) {
        this.årgang = årgang;
    }

    public int getAntalDøre() {
        return antalDøre;
    }

    public void setAntalDøre(int antalDøre) {
        this.antalDøre = antalDøre;
    }

    //abstract metode har ikke en body -> {...} da det er sub klasserne der skal sørge for det.
   protected abstract double beregnGrønEjerafgift();
}

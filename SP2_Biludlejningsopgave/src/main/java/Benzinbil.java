public class Benzinbil extends Bil {
    //egenskaber
    private int oktantal;
    private double kmPrL;

    //konstruktør
    public Benzinbil(int regNr, String mærke, String model, int årgang, int antalDøre, int oktantal, double kmPrL) {
        super(regNr, mærke, model, årgang, antalDøre);
        this.oktantal = oktantal;
        this.kmPrL = kmPrL;
    }
    //getter & setter
    public int getOktantal() {
        return oktantal;
    }

    public void setOktantal(int oktantal) {
        this.oktantal = oktantal;
    }

    public double getKmPrL() {
        return kmPrL;
    }

    public void setKmPrL(double kmPrL) {
        this.kmPrL = kmPrL;
    }
    //Overrider toString default.
    @Override
    public String toString() {
        String beskrivelse = ("Benzinbil: \n Regnr: " + getRegNr() + ". Mærke: " + getMærke() + ". Model: "
                + getModel() + ". Årgang:" + getÅrgang() + ". Døre: " + getAntalDøre() + ". Oktantal: "
                + getOktantal() + ". Km/l: " + getKmPrL());
        return beskrivelse;
    }
    //abstract metode
    protected double beregnGrønEjerafgift() {
        double afgift = 0;
        if (kmPrL < 5) {
            return afgift = 10470;
        } else if (kmPrL > 5 && kmPrL < 10) {
            return afgift = 5500;
        } else if (kmPrL > 10 && kmPrL < 15) {
            return afgift = 2340;
        } else if (kmPrL > 15 && kmPrL < 20) {
            return afgift = 1050;
        } else if (kmPrL > 20 && kmPrL < 50) {
            return afgift = 330;
        } else {
            System.out.println("ERROR");
        }
        return afgift;
    }
}

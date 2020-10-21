public class Dieselbil extends Bil {
    //egenskaber
    private boolean harPartikelfilter;
    private double kmPrL;

    //konstruktør
    public Dieselbil(int regNr, String mærke, String model, int årgang, int antalDøre, boolean harPartikelfilter, double kmPrL) {
        super(regNr, mærke, model, årgang, antalDøre);
        this.harPartikelfilter = harPartikelfilter;
        this.kmPrL = kmPrL;
    }
    //getter & setter
    public boolean isHarPartikelfilter() {
        return harPartikelfilter;
    }

    public void setHarPartikelfilter(boolean harPartikelfilter) {
        this.harPartikelfilter = harPartikelfilter;

    }

    public double getKmPrL() {
        return kmPrL;
    }

    public void setKmPrL(double kmPrL) {
        this.kmPrL = kmPrL;
    }
    //Overrider toString default til sit eget.
    @Override
    public String toString() {
        String beskrivelse = (" \n Dieselbil: \n Regnr: " + getRegNr() + ". Mærke: " + getMærke() + ". Model: "
                + getModel() + ". Årgang:" + getÅrgang() + ". Døre: " + getAntalDøre() + ". Partikelfilter: "
                + isHarPartikelfilter() + ". Km/l: " + kmPrL);
        return beskrivelse;
    }

   //abstract metode
    protected double beregnGrønEjerafgift(){
        double afgift;
        if(harPartikelfilter == true){
            afgift = 1000;
        } else {
            afgift = 0;
        }

        if(kmPrL < 5){
            return afgift = 10470 + 15260;
        } else if(kmPrL > 5 && kmPrL < 10) {
            return afgift = 5500 + 2770;
        } else if(kmPrL > 10 && kmPrL < 15){
            return afgift = 2340 + 1850;
        } else if(kmPrL > 15 && kmPrL < 20) {
            return afgift = 1050 + 1390;
        } else if(kmPrL > 20 && kmPrL < 50){
            return afgift = 330 + 130;
        } else {
            System.out.println("ERROR");

        }
        return afgift;
    }
}

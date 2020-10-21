public class Elbil extends Bil {
    //egenskaber
    private int batterikapacitetKWh;
    private int maxKm;
    private double whPrKm;

    //konstruktør
    public Elbil(int regNr, String mærke, String model, int årgang, int antalDøre, int batterikapacitetKWh, int maxKm, double whPrKm) {
        super(regNr, mærke, model, årgang, antalDøre);
        this.batterikapacitetKWh = batterikapacitetKWh;
        this.maxKm = maxKm;
        this.whPrKm = whPrKm;
    }
    //getter & setter
    public int getBatterikapacitetKWh() {
        return batterikapacitetKWh;
    }

    public void setBatterikapacitetKWh(int batterikapacitetKWh) {
        this.batterikapacitetKWh = batterikapacitetKWh;
    }

    public int getMaxKm() {
        return maxKm;
    }

    public void setMaxKm(int maxKm) {
        this.maxKm = maxKm;
    }

    public double getWhPrKm() {
        return whPrKm;
    }

    public void setWhPrKm(double whPrKm) {
        this.whPrKm = whPrKm;
    }
    //Overrider toString default ved at skrive sit eget toString.
    @Override
    public String toString() {
        String beskrivelse = (" \n Elbil: \n Regnr: " + getRegNr() + ". Mærke: " + getMærke() + ". Model: "
                + getModel() + ". Årgang:" + getÅrgang() + ". Døre: " + getAntalDøre() + ". Batterikapacitet: "
                + getBatterikapacitetKWh() + ". Tophastighed: " + getMaxKm() + ". Energiforbrug: " + getWhPrKm());
        return beskrivelse;
    }
    //abstract metode
    protected double beregnGrønEjerafgift(){
        double afgift = 0;

        if(whPrKm < 1780.519633){
            return afgift = 10470;
        } else if(whPrKm > 1780.519633 && whPrKm < 890.259816){
            return afgift = 5500;
        } else if(whPrKm > 890.259816 && whPrKm < 593.506544){
            return afgift = 2340;
        } else if(whPrKm > 593.506544 && whPrKm < 445.129908) {
            return afgift = 1050;
        } else if(whPrKm > 445.129908 && whPrKm < 178.051963){
            return afgift = 330;
        } else {
            System.out.println("ERROR");
        }
        return afgift;
    }
}
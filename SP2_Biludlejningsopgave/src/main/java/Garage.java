//importeret en eksisterende klasse.
import java.util.ArrayList;

public class Garage{
    //egenskaber
   private String navn;
    ArrayList<Bil> carPark = new ArrayList<Bil>();


    // metoder
    public void addCar(Bil bil){
        carPark.add(bil);
    }

    public double beregnGrønAfgiftForBilpark(){
        double total = 0;
        for(Bil biler:carPark){
            total += biler.beregnGrønEjerafgift();
        }
        return total;
    }

    //getter & setter
    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    //Overrider toString default til sit eget.
    @Override
    public String toString() {
        return "Garage: " +
                "navn =" + navn  + ", carPark=" + carPark;
    }

}

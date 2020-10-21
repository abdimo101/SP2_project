public class Main {
    //main klassen, som bruges til at køre programmet.
    public static void main(String [] args){
        //Objekter bliver både erklæret og initialiseret.
        Garage garage = new Garage();
        Benzinbil benzinBil = new Benzinbil(2017, "Mercedes", "E360", 2017, 4, 100, 29.8);
        Dieselbil dieselBil = new Dieselbil(2016, "Porsche", "Cayenne", 2017, 5, true, 14.7);
        Elbil elBil = new Elbil(2013, "Tesla", "Model S", 2013, 5, 85, 209, 181.0);
        //En metode fra Garage klassen bliver kaldet og brugt.
        garage.addCar(benzinBil);
        garage.addCar(dieselBil);
        garage.addCar(elBil);

        //Alle toStrings fra de 3 Bil subklasser bliver printet via. en Arrayliste kaldet "carPark" som indeholder alle bilobjekter.
        System.out.println(garage.carPark);
        //Den samlede beregning af alle bilers afgifter bliver printet ved brug af metoden "beregnGrønAfgiftForBilPark" fra klassen Garage.
        System.out.println("Samlede grønne afgift for alle bilerne i garagen: " + garage.beregnGrønAfgiftForBilpark() + " kr.");
    }
}

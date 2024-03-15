

import dojezdzac.Rower;
import dojezdzac.Samochod;
import pracowac.Leczenie;
import pracowac.NaprawaSamochodow;
import pracowac.RoznoszenieListow;
import spedzaniewolnegoczasu.LiteraturaPopularnoNaukowa;
import spedzaniewolnegoczasu.Silownia;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pracownik> pracowniks = new ArrayList<>();

        pracowniks.add(new Pracownik("Slusarz"));
        pracowniks.add(new Pracownik("Rybak"));
        pracowniks.add(new Pracownik(new Leczenie(), new Samochod(), new Silownia()));
        pracowniks.add(new Pracownik(new NaprawaSamochodow(), new Samochod(), new LiteraturaPopularnoNaukowa()));
        pracowniks.add(new Pracownik(new RoznoszenieListow(), new Rower(), new LiteraturaPopularnoNaukowa()));


        for (Pracownik pracownik: pracowniks){
            System.out.println("Pracownik: " + pracowniks.indexOf(pracownik));
            pracownik.getDojezdzac();
            pracownik.getPracowac();
            pracownik.getSpedzanieWolnegoCzasu();
        }
    }
}
import java.util.Objects;
import dojezdzac.Dojezdzac;
import dojezdzac.Rower;
import pracowac.Pracowac;
import spedzaniewolnegoczasu.LiteraturaPopularnoNaukowa;
import spedzaniewolnegoczasu.SpedzanieWolnegoCzasu;
public class Pracownik {

    Pracowac pracowac;

    Dojezdzac dojezdzac;

    SpedzanieWolnegoCzasu spedzanieWolnegoCzasu;

    String zawod;

    public Pracownik(String zawod) {
        this.zawod = zawod;
        this.pracowac = () -> System.out.println("pracuje aktualnie jako " + zawod);
        this.dojezdzac = new Rower();
        this.spedzanieWolnegoCzasu = new LiteraturaPopularnoNaukowa();
    }

    public Pracownik(Pracowac aPracowac, Dojezdzac aDojezdzac, SpedzanieWolnegoCzasu aSpedzanieWolnegoCzasu) {
        pracowac = aPracowac;
        dojezdzac = aDojezdzac;
        spedzanieWolnegoCzasu = aSpedzanieWolnegoCzasu;
    }

    public void getPracowac() {
        pracowac.pracuj();
    }

    void setPracowac(Pracowac aPracowac) {
        pracowac = aPracowac;
    }

    public void getDojezdzac() {
        dojezdzac.dojezdzaj();
    }

    void setDojezdzac(Dojezdzac aDojezdzac) {
        dojezdzac = aDojezdzac;
    }

    public void getSpedzanieWolnegoCzasu() {
        spedzanieWolnegoCzasu.spedzajWolnyCzas();
    }

    void setSpedzanieWolnegoCzasu(SpedzanieWolnegoCzasu aSpedzanieWolnegoCzasu) {
        spedzanieWolnegoCzasu = aSpedzanieWolnegoCzasu;
    }


    @Override
    public boolean equals(Object aO) {
        if (this == aO) return true;
        if (aO == null || getClass() != aO.getClass()) return false;
        Pracownik pracownik = (Pracownik) aO;
        return Objects.equals(pracowac, pracownik.pracowac) && Objects.equals(dojezdzac, pracownik.dojezdzac) && Objects.equals(spedzanieWolnegoCzasu, pracownik.spedzanieWolnegoCzasu);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pracowac, dojezdzac, spedzanieWolnegoCzasu);
    }

    @Override
    public String toString() {
        return "Pracownik{" +
                "pracowac=" + pracowac +
                ", dojezdzac=" + dojezdzac +
                ", spedzanieWolnegoCzasu=" + spedzanieWolnegoCzasu +
                '}';
    }
}

package be.kdg.ExparcSystems.domain.parkeerbeheer;

import be.kdg.ExparcSystems.domain.marketing.Partij;

import java.util.ArrayList;

public class Klant extends Partij {
    private Boolean registreerToestemming;
    private int totaalBeurten;
    private ArrayList<Abonnement> abonnementen;

    public Klant() {
    }

    public Boolean getRegistreerToestemming() {
        return registreerToestemming;
    }

    public int getTotaalBeurten() {
        return totaalBeurten;
    }

    public ArrayList<Abonnement> getAbonnementen() {
        return abonnementen;
    }

    public void setRegistreerToestemming(Boolean registreerToestemming) {
        this.registreerToestemming = registreerToestemming;
    }

    public void setTotaalBeurten(int totaalBeurten) {
        this.totaalBeurten = totaalBeurten;
    }

    public void setAbonnementen(ArrayList<Abonnement> abonnementen) {
        this.abonnementen = abonnementen;
    }
}

package be.kdg.ExparcSystems.domain.parkeerbeheer;

import be.kdg.ExparcSystems.domain.marketing.Partij;

import java.util.ArrayList;

public class Klant extends Partij {
    private Boolean registreerToestemming;
    private int aantalbeurten;
    private ArrayList<Abonnement> abonnementen;

    public Klant() {
    }

    public Boolean getRegistreerToestemming() {
        return registreerToestemming;
    }

    public int getAantalbeurten() {
        return aantalbeurten;
    }

    public ArrayList<Abonnement> getAbonnementen() {
        return abonnementen;
    }

    public void setRegistreerToestemming(Boolean registreerToestemming) {
        this.registreerToestemming = registreerToestemming;
    }

    public void setAantalbeurten(int aantalbeurten) {
        this.aantalbeurten = aantalbeurten;
    }

    public void setAbonnementen(ArrayList<Abonnement> abonnementen) {
        this.abonnementen = abonnementen;
    }
}

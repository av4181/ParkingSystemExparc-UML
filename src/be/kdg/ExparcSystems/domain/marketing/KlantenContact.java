package be.kdg.ExparcSystems.domain.marketing;

import java.time.LocalTime;
import be.kdg.ExparcSystems.domain.personeel.Medewerker;

public class KlantenContact {
    private Criterium onderwerp;
    private LocalTime tijdstip;
    private Medewerker medewerker;
    private TypeContact typeContact;

    public KlantenContact(Criterium onderwerp, LocalTime tijdstip, Medewerker medewerker, TypeContact typeContact) {
        this.onderwerp = onderwerp;
        this.tijdstip = tijdstip;
        this.medewerker = medewerker;
        this.typeContact = typeContact;
    }

    public Criterium getOnderwerp() {
        return onderwerp;
    }

    public LocalTime getTijdstip() {
        return tijdstip;
    }

    public Medewerker getMedewerker() {
        return medewerker;
    }

    public TypeContact getTypeContact() {
        return typeContact;
    }

    public void setOnderwerp(Criterium onderwerp) {
        this.onderwerp = onderwerp;
    }

    public void setTijdstip(LocalTime tijdstip) {
        this.tijdstip = tijdstip;
    }

    public void setMedewerker(Medewerker medewerker) {
        this.medewerker = medewerker;
    }

    public void setTypeContact(TypeContact typeContact) {
        this.typeContact = typeContact;
    }
}

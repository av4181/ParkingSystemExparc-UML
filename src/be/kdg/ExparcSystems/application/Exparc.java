package be.kdg.ExparcSystems.application;

import be.kdg.ExparcSystems.domain.parkeerbeheer.ParkeerGarage;
import be.kdg.ExparcSystems.domain.personeel.Medewerker;
import be.kdg.ExparcSystems.persistence.KlantenBestand;
import be.kdg.ExparcSystems.persistence.TevredenheidOnderzoekBestand;

import java.util.ArrayList;

public class Exparc {
    private KlantenBestand klanten = new KlantenBestand();
    private TevredenheidOnderzoekBestand tevredenheidsOnderzoeken = new TevredenheidOnderzoekBestand();
    private ArrayList<Medewerker> medewerkers;
    private ArrayList<ParkeerGarage> garages;

    public KlantenBestand getKlanten() {
        return klanten;
    }

    public TevredenheidOnderzoekBestand getTevredenheidsOnderzoeken() {
        return tevredenheidsOnderzoeken;
    }

    ParkeerGarageController initSessie(){
        return  new ParkeerGarageController(klanten,tevredenheidsOnderzoeken);
    }

}

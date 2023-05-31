package be.kdg.ExparcSystems.application;

import be.kdg.ExparcSystems.persistence.KlantenBestand;
import be.kdg.ExparcSystems.persistence.TevredenheidOnderzoekBestand;

public class Exparc {
    private KlantenBestand klanten = new KlantenBestand();
    private TevredenheidOnderzoekBestand tevredenheidsOnderzoeken = new TevredenheidOnderzoekBestand();

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

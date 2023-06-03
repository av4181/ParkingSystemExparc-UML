package be.kdg.ExparcSystems.application;

import be.kdg.ExparcSystems.domain.parkeerbeheer.Klant;
import be.kdg.ExparcSystems.persistence.KlantenBestand;

public class KlantRegistratieController {
    private final KlantenBestand kb;
    public KlantRegistratieController(KlantenBestand klanten) {
        this.kb = klanten;
    }

    public Klant registreerKlant(String naam){
        //TODO
        Klant klant = kb.get(naam);
        if( klant != null){
            return klant;
        };
        return klant;
    }
}

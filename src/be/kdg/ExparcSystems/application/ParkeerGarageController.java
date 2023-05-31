package be.kdg.ExparcSystems.application;

import be.kdg.ExparcSystems.domain.marketing.TevredenheidsOnderzoek;
import be.kdg.ExparcSystems.domain.parkeerbeheer.Klant;
import be.kdg.ExparcSystems.domain.parkeerbeheer.ParkeerBeurt;
import be.kdg.ExparcSystems.domain.parkeerbeheer.ParkeerBewijs;
import be.kdg.ExparcSystems.persistence.KlantenBestand;
import be.kdg.ExparcSystems.persistence.TevredenheidOnderzoekBestand;

public class ParkeerGarageController {
    private final KlantenBestand kb;
    private final TevredenheidOnderzoekBestand tb;
    private ParkeerBeurt parkeerBeurt;
    private ParkeerBewijs parkeerBewijs;
    private TevredenheidsOnderzoek tevredenheidsOnderzoek;
    private Klant klant;

    public boolean logIn(String username, String wachtwoord) {
        //TODO
        return false;
    }
    public ParkeerGarageController(KlantenBestand klanten, TevredenheidOnderzoekBestand tevredenheidsOnderzoeken) {
        this.kb = klanten;
        this.tb = tevredenheidsOnderzoeken;
    }
    public ParkeerBeurt registreerParkeerbeurt(){
        //TODO
        return parkeerBeurt;
    }
    public void betaalParkeerBeurt(ParkeerBewijs parkeerBewijs){
        //TODO
    }
    public TevredenheidsOnderzoek registreerTevredenheidsOnderzoek(){
        //TODO
        return tevredenheidsOnderzoek;
    }
    public Klant registreerKlant(){
        //TODO
        return klant;
    }

}


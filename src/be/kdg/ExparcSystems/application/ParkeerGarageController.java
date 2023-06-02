package be.kdg.ExparcSystems.application;

import be.kdg.ExparcSystems.domain.marketing.TevredenheidsOnderzoek;
import be.kdg.ExparcSystems.domain.parkeerbeheer.Klant;
import be.kdg.ExparcSystems.domain.parkeerbeheer.ParkeerBeurt;
import be.kdg.ExparcSystems.domain.parkeerbeheer.ParkeerBewijs;
import be.kdg.ExparcSystems.persistence.KlantenBestand;
import be.kdg.ExparcSystems.persistence.TevredenheidOnderzoekBestand;

import java.time.LocalTime;

public class ParkeerGarageController {
    private final KlantenBestand kb;
    private final TevredenheidOnderzoekBestand tb;

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
        LocalTime inRijMoment = LocalTime.now();
        ParkeerBeurt parkeerBeurt = new ParkeerBeurt(inRijMoment);
        return parkeerBeurt;
    }
    public void betaalParkeerBeurt(ParkeerBewijs parkeerBewijs){
        //TODO
    }
    public TevredenheidsOnderzoek registreerTevredenheidsOnderzoek(){
        //TODO
        TevredenheidsOnderzoek tevredenheidsOnderzoek = new TevredenheidsOnderzoek();
        return tevredenheidsOnderzoek;
    }


}


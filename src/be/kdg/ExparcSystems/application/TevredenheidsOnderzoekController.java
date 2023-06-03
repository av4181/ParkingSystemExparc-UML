package be.kdg.ExparcSystems.application;

import be.kdg.ExparcSystems.domain.marketing.TevredenheidsOnderzoek;
import be.kdg.ExparcSystems.persistence.TevredenheidOnderzoekBestand;

public class TevredenheidsOnderzoekController {
    private final TevredenheidOnderzoekBestand tb;

    public TevredenheidsOnderzoekController(TevredenheidOnderzoekBestand tevredenheidsOnderzoeken) {
        this.tb = tevredenheidsOnderzoeken;
    }

    public TevredenheidsOnderzoek registreerTevredenheidsOnderzoek(){
        //TODO
        TevredenheidsOnderzoek tevredenheidsOnderzoek = new TevredenheidsOnderzoek();
        return tevredenheidsOnderzoek;
    }
}

package be.kdg.ExparcSystems.persistence;

import be.kdg.ExparcSystems.domain.marketing.TevredenheidsOnderzoek;
import be.kdg.ExparcSystems.domain.parkeerbeheer.Klant;

import java.util.HashMap;
import java.util.Map;

public class TevredenheidOnderzoekBestand {
    private Map<String, TevredenheidsOnderzoek> tevredenheidsOnderzoeken = new HashMap<>();
    public void put(String id,TevredenheidsOnderzoek tevredenheidsOnderzoek) {
        tevredenheidsOnderzoeken.put(id, tevredenheidsOnderzoek);
    }
    public TevredenheidsOnderzoek get(String id) {
        return tevredenheidsOnderzoeken.get(id);
    }

}

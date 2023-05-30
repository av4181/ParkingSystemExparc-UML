package be.kdg.ExparcSystems.domain.personeel;
import be.kdg.ExparcSystems.domain.marketing.KlantenContact;
import be.kdg.ExparcSystems.domain.marketing.TevredenheidsOnderzoek;

import java.time.LocalDate;

public class Medewerker {
    private LocalDate startDienst;
    private LocalDate eindeDienst;
    private String functie;

    public Medewerker() {
    }
    public TevredenheidsOnderzoek startTevredenheidsOnderzoek(){
        TevredenheidsOnderzoek tevredenheidsOnderzoek = new TevredenheidsOnderzoek();

        return tevredenheidsOnderzoek;
    }
}

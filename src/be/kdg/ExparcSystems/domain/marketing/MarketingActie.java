package be.kdg.ExparcSystems.domain.marketing;

public class MarketingActie extends KlantenCampagne{
    private String naamCampagne;

    public MarketingActie(String naamCampagne) {
        this.naamCampagne = naamCampagne;
    }

    @Override
    public void initialiseerCampagne() {
        super.initialiseerCampagne();
    }
}

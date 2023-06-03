package be.kdg.ExparcSystems.domain.marketing;

import java.util.ArrayList;

public class TevredenheidsOnderzoek extends KlantenCampagne {
    private int tevredenheidsScore;
    private TevredenheidsCriteria criteria;

    public TevredenheidsOnderzoek() {
    }

    public int getTevredenheidsScore() {
        return tevredenheidsScore;
    }

    public TevredenheidsCriteria getCriteria() {
        return criteria;
    }

    public void setCriteria(TevredenheidsCriteria criteria) {
        this.criteria = criteria;
    }

    public void setTevredenheidsScore(int tevredenheidsScore) {
        this.tevredenheidsScore = tevredenheidsScore;
    }
}

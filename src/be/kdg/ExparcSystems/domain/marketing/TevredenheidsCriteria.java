package be.kdg.ExparcSystems.domain.marketing;

import java.util.ArrayList;

public class TevredenheidsCriteria {
    private String naam;
    private int scoreBehaald;
    private ArrayList<Criterium> criterium;

    public TevredenheidsCriteria(String naam, int scoreBehaald, ArrayList<Criterium> criterium) {
        this.naam = naam;
        this.scoreBehaald = scoreBehaald;
        this.criterium = criterium;
    }
}

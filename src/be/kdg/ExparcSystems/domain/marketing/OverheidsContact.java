package be.kdg.ExparcSystems.domain.marketing;

import java.time.LocalDate;

public class OverheidsContact {
    private LocalDate laatsteContactDatum;
    private String laatsteContactOnderwerp;

    public OverheidsContact() {
    }

    public LocalDate getLaatsteContactDatum() {
        return laatsteContactDatum;
    }

    public String getLaatsteContactOnderwerp() {
        return laatsteContactOnderwerp;
    }

}

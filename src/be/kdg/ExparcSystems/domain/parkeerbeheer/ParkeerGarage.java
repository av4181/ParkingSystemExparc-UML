package be.kdg.ExparcSystems.domain.parkeerbeheer;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class ParkeerGarage {
    private String garageNaam;
    private Boolean isVol = false;
    private ArrayList<ParkeerBeurt> parkeerBeurten;
    private ArrayList<Klant> klanten;
    private Boolean inRijDetectie = false;
    private Boolean uitRijDetectie = false;

    public ParkeerGarage(String garageNaam) {
        this.garageNaam = garageNaam;
    }
    public ArrayList<ParkeerBeurt> registreerParkeerBeurt(String nummerplaat){
//        TODO
//        for(Klant klant:klanten){
//            for(Abonnement abonnement:klant.getAbonnementen()){
//                if (nummerplaat == abonnement.getNummerplaat()) {
//                    ParkeerBeurt parkeerBeurt = new ParkeerBeurt();
//                    parkeerBeurt.setInRijMoment();
//                }
//            }
//        }
        return parkeerBeurten;
    }

    public String getGarageNaam() {
        return garageNaam;
    }

    public Boolean getVol() {
        return isVol;
    }

    public void setVol(Boolean vol) {
        isVol = vol;
    }
}

package be.kdg.ExparcSystems.domain.parkeerbeheer;

import java.time.LocalTime;

public class ParkeerBeurt {
    private LocalTime inRijMoment;
    private LocalTime uitRijMoment;
    private String automerk;
    private String model;
    private TypeMotor motorType;
    private Abonnement abonnee;
    private ParkeerBewijs parkeerBewijs;

    public ParkeerBeurt(LocalTime inRijMoment) {
        this.inRijMoment=LocalTime.now();
    }
    public int berekenTotaal(LocalTime inrijMoment, LocalTime uitRijMoment){
        //TODO
        int totaalBedrag = 0;
        return totaalBedrag;
    }
    public ParkeerBewijs parkeerBewijs(){
        //TODO
        return parkeerBewijs;
    }

    public LocalTime getInRijMoment() {
        return inRijMoment;
    }

    public LocalTime getUitRijMoment() {
        return uitRijMoment;
    }

    public String getAutomerk() {
        return automerk;
    }

    public String getModel() {
        return model;
    }

    public TypeMotor getMotorType() {
        return motorType;
    }

    public Abonnement getAbonnee() {
        return abonnee;
    }

    public void setInRijMoment(LocalTime inRijMoment) {
        this.inRijMoment = inRijMoment;
    }

    public void setUitRijMoment(LocalTime uitRijMoment) {
        this.uitRijMoment = uitRijMoment;
    }

    public void setAutomerk(String automerk) {
        this.automerk = automerk;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setMotorType(TypeMotor motorType) {
        this.motorType = motorType;
    }

    public void setAbonnee(Abonnement abonnee) {
        this.abonnee = abonnee;
    }
}

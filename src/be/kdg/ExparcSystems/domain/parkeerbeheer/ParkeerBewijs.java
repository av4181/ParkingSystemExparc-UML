package be.kdg.ExparcSystems.domain.parkeerbeheer;

public class ParkeerBewijs {
    private int bewijsIdentificatie;
    private Boolean betaald;

    public ParkeerBewijs() {
    }


    public int getBewijsIdentificatie() {
        return bewijsIdentificatie;
    }

    public Boolean getBetaald() {
        return betaald;
    }

    public void setBetaald(Boolean betaald) {
        this.betaald = betaald;
    }
}

package be.kdg.ExparcSystems.domain.parkeerbeheer;

public class Abonnement {
    private Klant klant;
    private String email;
    private String gsmnr;
    private String nummerplaat;
    private String automerk;
    private String model;
    private TypeMotor motorType;

    public Abonnement(Klant klant, String email, String gsmnr, String nummerplaat, String automerk, String model, TypeMotor motorType) {
        this.klant = klant;
        this.email = email;
        this.gsmnr = gsmnr;
        this.nummerplaat = nummerplaat;
        this.automerk = automerk;
        this.model = model;
        this.motorType = motorType;
    }

    public Klant getKlant() {
        return klant;
    }

    public String getEmail() {
        return email;
    }

    public String getGsmnr() {
        return gsmnr;
    }

    public String getNummerplaat() {
        return nummerplaat;
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
}

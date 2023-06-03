package be.kdg.ExparcSystems.application;

import be.kdg.ExparcSystems.domain.marketing.TevredenheidsOnderzoek;
import be.kdg.ExparcSystems.domain.parkeerbeheer.Klant;
import be.kdg.ExparcSystems.domain.parkeerbeheer.ParkeerBeurt;
import be.kdg.ExparcSystems.domain.personeel.Medewerker;
import be.kdg.ExparcSystems.persistence.KlantenBestand;
import be.kdg.ExparcSystems.persistence.TevredenheidOnderzoekBestand;

import java.util.ArrayList;

public class Application {
    private static final String DOMAIN = "kdg.be";
    private static ArrayList<Klant> klantData = new ArrayList<>(){    };
    private static ArrayList<TevredenheidsOnderzoek> tevredenheidsData = new ArrayList<>(){    };
    public static void main(String[] args) {
        // Preconditie C01 initialisatie van  systeem structuur: creatie databases en verbinden aan systeem
        Exparc system = new Exparc();
        // initialisatie alle klanten data en tevredenheidsOnderzoeken
        initData(system);
        // C01  initialisatie van een parkeerBeurt registratie
        ParkeerGarageController parkeerGarageCtrl = system.initParkeerGarageSessie();
        // start use case 1
        registrerenParkeerBeurt(parkeerGarageCtrl);
        // start use case 2
        betalenParkeerBeurt(parkeerGarageCtrl);
        // Initialisatie van een tevredenheidsonderzoek
        TevredenheidsOnderzoekController tevredenheidsOnderzoekCtrl = system.initTevredenheidsOnderzoekSessie();
        // start use case 3
        registrerenTevrdenheidsOnderzoek(tevredenheidsOnderzoekCtrl);
        // Initialisatie van een klanten registratie
        KlantRegistratieController klantRegistratieCtrl = system.initKlantRegistratieSessie();
        // start use case 4
        registrerenKlant(klantRegistratieCtrl);

    }

    private static void registrerenParkeerBeurt(ParkeerGarageController parkeerGarageCtrl) {
        // operatiecontract C01 registreer parkeerbeurt
        //TODO
        ParkeerBeurt beurt = parkeerGarageCtrl.registreerParkeerbeurt();
    }
    private static void betalenParkeerBeurt(ParkeerGarageController parkeerGarageCtrl) {
        // operatiecontract C02-C05 betalen parkeerbeurt
        //TODO
    }
    private static void registrerenTevrdenheidsOnderzoek(TevredenheidsOnderzoekController tevredenheidsOnderzoekCtrl) {
        // operatiecontract C06-C10 registreren tevredenheidsonderzoek
        //TODO
    }
    private static void registrerenKlant(KlantRegistratieController klantRegistratieCtrl) {
        // operatiecontract C11 registreren klant
        //TODO
    }


    private static void initData(Exparc system) {
        initKlanten(system.getKlanten());
        initTevredenheidsOnderzoeken(system.getTevredenheidsOnderzoeken());

    }

    private static void initKlanten(KlantenBestand klantenBestand) {
        //TODO
    }

    private static void initTevredenheidsOnderzoeken(TevredenheidOnderzoekBestand tevredenheidsBestand) {
        //TODO
    }

    private static Medewerker initMedewerker(String voornaam, String achternaam) {
        //TODO
        return new Medewerker();
    }
}
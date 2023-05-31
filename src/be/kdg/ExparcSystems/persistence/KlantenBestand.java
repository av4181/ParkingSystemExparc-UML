package be.kdg.ExparcSystems.persistence;

import be.kdg.ExparcSystems.domain.parkeerbeheer.Klant;

import java.util.HashMap;
import java.util.Map;

public class KlantenBestand {
    private Map<String, Klant> klanten = new HashMap<>();
    public void put(String id,Klant klant) {
        klanten.put(id, klant);
    }
    public Klant get(String id) {
        return klanten.get(id);
    }
}

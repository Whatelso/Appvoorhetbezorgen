package com.bezorgvooryc.appvoorhetbezorgen.persistence;

import com.bezorgvooryc.appvoorhetbezorgen.domein.Bestelling;
import com.bezorgvooryc.appvoorhetbezorgen.domein.Klant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import java.util.ArrayList;

@Service
public class BestellingService {
    @Autowired
    BestellingRepository br;

    @Autowired
    KlantRepository kr;
    public Iterable<Bestelling> maakBestellingaan(){
        System.out.println("bestelling aanmaken in BService");
        br.save(new Bestelling());
        return br.findAll();
    }

    public Iterable<Bestelling> vindAlleBestellingen() {
        //fix dat alle bestellingen opgehaald kunnen worden uit de db
        return br.findAll();
    }

    public void nieuweBestellingAanmaken(Bestelling bestelling) {
        br.save(bestelling);
    }

    public Bestelling vindBestellingById(long bestellingid) {
        Bestelling nogffgebruiken = br.findById(bestellingid).get();
        Klant k = new Klant();
        k.setAdres("Vlakbij 13");
        Klant temp = kr.save(k);
        nogffgebruiken.setKlant(k);
        br.save(nogffgebruiken);
        return nogffgebruiken;
    }
}

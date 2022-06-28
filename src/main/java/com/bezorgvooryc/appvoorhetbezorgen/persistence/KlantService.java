package com.bezorgvooryc.appvoorhetbezorgen.persistence;

import com.bezorgvooryc.appvoorhetbezorgen.domein.Klant;
import com.bezorgvooryc.appvoorhetbezorgen.domein.Klant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class KlantService {
    @Autowired
    KlantRepository kr;

    public void maakKlantaan(Klant m){
        kr.save(m);
    }

    public Iterable<Klant> vindAlleKlanten() {
        //fix dat alle Klanten opgehaald kunnen worden uit de db
        return kr.findAll();
    }

    public void nieuweKlantAanmaken(Klant Klant) {
        kr.save(Klant);
    }

    public Klant vindKlant(long id){
        Optional<Klant> klunt = kr.findById(id);
        if (klunt.isPresent()){
            return klunt.get();
        }
        else{
            return null;
        }
    }

    public void deleteKlant(long id){
        kr.deleteById(id);
    }
}
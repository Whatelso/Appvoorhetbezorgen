package com.bezorgvooryc.appvoorhetbezorgen.persistence;

import com.bezorgvooryc.appvoorhetbezorgen.domein.Maaltijd;
import com.bezorgvooryc.appvoorhetbezorgen.domein.Klant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MaaltijdService {
    @Autowired
    MaaltijdRepository br;

    public void maakMaaltijdaan(Maaltijd m){
        br.save(m);
    }

    public Iterable<Maaltijd> vindAlleMaaltijden() {
        //fix dat alle Maaltijden opgehaald kunnen worden uit de db
        return br.findAll();
    }

    public void nieuweMaaltijdAanmaken(Maaltijd Maaltijd) {
        br.save(Maaltijd);
    }

//    public Maaltijd vindMaaltijd(long id){
//        Optional<Maaltijd> temp = br.findById(id);
//        if (temp instanceof Maaltijd) {
//            return temp;
//        }
//        return br.findById(id);
//    }

    public void deleteMaaltijd(long id){
        br.deleteById(id);
    }
}
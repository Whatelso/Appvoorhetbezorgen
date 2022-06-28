package com.bezorgvooryc.appvoorhetbezorgen.rest;

import com.bezorgvooryc.appvoorhetbezorgen.domein.Bestelling;
import com.bezorgvooryc.appvoorhetbezorgen.domein.Maaltijd;
import com.bezorgvooryc.appvoorhetbezorgen.persistence.BestellingService;
import com.bezorgvooryc.appvoorhetbezorgen.persistence.MaaltijdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class MaaltijdEndpoint {
    @Autowired
    MaaltijdService ms;

    @GetMapping("/api/maaltijd")
    public Iterable<Maaltijd> allMaaltijds() {

        return ms.vindAlleMaaltijden();
    }

    @PostMapping("/api/maaltijd")
    public void posten(@RequestBody Maaltijd m) {
        System.out.println(m.getNaam());
         ms.maakMaaltijdaan(m);
    }

    @PutMapping("/api/maaltijd/{id}")
    public void updateMaaltijd(@PathVariable ("id") long id, @RequestBody Maaltijd m) {
        m.setId(id);
        ms.maakMaaltijdaan(m);
    }

    @DeleteMapping("/api/maaltijd/{id}")
    public void deleteMaaltijd(@PathVariable("id") long id){
        ms.deleteMaaltijd(id);
    }
}



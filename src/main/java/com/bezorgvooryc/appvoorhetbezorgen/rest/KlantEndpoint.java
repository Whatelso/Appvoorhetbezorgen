package com.bezorgvooryc.appvoorhetbezorgen.rest;

import com.bezorgvooryc.appvoorhetbezorgen.domein.Bestelling;
import com.bezorgvooryc.appvoorhetbezorgen.domein.Klant;
import com.bezorgvooryc.appvoorhetbezorgen.persistence.BestellingService;
import com.bezorgvooryc.appvoorhetbezorgen.persistence.KlantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class KlantEndpoint {
    @Autowired
    KlantService ms;

    @GetMapping("/api/klant")
    public Iterable<Klant> allKlants() {

        return ms.vindAlleKlanten();
    }

    @PostMapping("/api/klant")
    public void posten(@RequestBody Klant m) {
        System.out.println(m.getNaam());
        ms.maakKlantaan(m);
    }

    @PutMapping("/api/klant/{id}")
    public void updateKlant(@PathVariable ("id") long id, @RequestBody Klant m) {
        m.setId(id);
        ms.maakKlantaan(m);
    }

    @DeleteMapping("/api/klant/{id}")
    public void deleteKlant(@PathVariable("id") long id){
        ms.deleteKlant(id);
    }
}



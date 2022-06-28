package com.bezorgvooryc.appvoorhetbezorgen.rest;

import com.bezorgvooryc.appvoorhetbezorgen.domein.Bestelling;
import com.bezorgvooryc.appvoorhetbezorgen.persistence.BestellingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.bezorgvooryc.appvoorhetbezorgen.domein.Maaltijd;




@RestController
public class BestellingEndpoint {
    @Autowired
    BestellingService bs;

    @GetMapping("/status")
    public String status(){
        return "OK";
    }

    @GetMapping("ffproberen")
    public String ffproberen(){
        System.out.println("ffproberen!pls!");
        return "Ontvangen";
    }
    @GetMapping("eenbestelling")
    public Bestelling eenbestelling(){
        System.out.println("Een bestelling");
        return new Bestelling();
    }

    @GetMapping("voorbeeld/{mijncijfer}")
    public int voorbeeld(@PathVariable("mijncijfer") int mijncijfer){
        System.out.println("Een bestelling"+mijncijfer);
        return 6;
    }

    @GetMapping("voorbeeld2")
    public int voorbeeld2(@RequestParam("mijncijfer") int mijncijfer){
        System.out.println("Een bestelling"+mijncijfer);
        bs.maakBestellingaan();
        return 6;
    }
    @PostMapping("voorbeeld3")
    public Iterable<Bestelling> posten(@RequestBody Maaltijd m) {
        System.out.println(m.getNaam());
        return bs.maakBestellingaan();
    }

    @GetMapping("alle/bestellingen")
    public Iterable<Bestelling> allebestellingen(){
        return bs.vindAlleBestellingen();
    }

    @PostMapping("nieuwebestelling")
    public void nieuwebestelling(@RequestBody Bestelling bestelling){
        System.out.println("Hij doet het");
        bs.nieuweBestellingAanmaken(bestelling);
    }

    @GetMapping("vindbestelling/{bestelid}")
    public Bestelling vindBestelling(@PathVariable("bestelid") int bestellingid) {
        return bs.vindBestellingById(bestellingid);
    }
}

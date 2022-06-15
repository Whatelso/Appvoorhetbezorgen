package com.bezorgvooryc.appvoorhetbezorgen.domein;

import javax.persistence.*;
import java.util.List;

@Entity
public class Bestelling {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private int totalprice;
    private boolean bezorgd;

    @OneToMany
    List<Maaltijd> maaltijden;

    @ManyToOne
    Klant klant;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(int totalprice) {
        this.totalprice = totalprice;
    }

    public boolean isBezorgd() {
        return bezorgd;
    }

    public void setBezorgd(boolean bezorgd) {
        this.bezorgd = bezorgd;
    }

    public List<Maaltijd> getMaaltijden() {
        return maaltijden;
    }

    public void setMaaltijden(List<Maaltijd> maaltijden) {
        this.maaltijden = maaltijden;
    }

    public Klant getKlant() {
        return klant;
    }

    public void setKlant(Klant klant) {
        this.klant = klant;
    }
}

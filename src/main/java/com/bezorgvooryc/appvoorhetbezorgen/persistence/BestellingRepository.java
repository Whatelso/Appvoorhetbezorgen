package com.bezorgvooryc.appvoorhetbezorgen.persistence;

import com.bezorgvooryc.appvoorhetbezorgen.domein.Bestelling;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface BestellingRepository extends CrudRepository<Bestelling,Long> {
    List<Bestelling> findByBezorgd(boolean bezorgd);
    List<Bestelling> findByBezorgdAndTotalprice(boolean bezorgd, int totalprice);

}

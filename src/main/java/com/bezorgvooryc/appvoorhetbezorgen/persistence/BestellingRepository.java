package com.bezorgvooryc.appvoorhetbezorgen.persistence;

import com.bezorgvooryc.appvoorhetbezorgen.domein.Bestelling;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface BestellingRepository extends CrudRepository<Bestelling,Long> {

}

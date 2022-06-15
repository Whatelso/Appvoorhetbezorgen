package com.bezorgvooryc.appvoorhetbezorgen.persistence;

import com.bezorgvooryc.appvoorhetbezorgen.domein.Klant;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface KlantRepository extends CrudRepository<Klant, Long> {
}

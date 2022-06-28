package com.bezorgvooryc.appvoorhetbezorgen.persistence;

import com.bezorgvooryc.appvoorhetbezorgen.domein.Bestelling;
import com.bezorgvooryc.appvoorhetbezorgen.domein.Maaltijd;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Component
public interface MaaltijdRepository extends CrudRepository<Maaltijd,Long> {

}

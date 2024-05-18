package com.uis.sisgan.persistence.crud;

import com.uis.sisgan.persistence.entity.Cattle;
import com.uis.sisgan.persistence.entity.Lot;
import org.springframework.data.repository.CrudRepository;

public interface LotCrudRepository  extends CrudRepository<Lot, Integer> {

}

package com.ihirwe.erainb.dao;
import org.springframework.data.repository.CrudRepository;

import com.ihirwe.erainb.model.Property;
public interface PropertyDao extends CrudRepository<Property, Long> {
	Property findByName(String name);
}

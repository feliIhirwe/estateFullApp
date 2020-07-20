package com.ihirwe.erainb.service;

import java.util.List;

import com.ihirwe.erainb.model.Property;

public interface PropertyService {
	public Property createProperty(Property property);

	public List<Property> viewAllProperty();

	public void updateProperty(Property Property) throws Exception;

	public Property findByName(String name);

	void removeProperty(String name) throws Exception;

}
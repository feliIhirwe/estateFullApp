package com.ihirwe.erainb.serviceImpl;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ihirwe.erainb.model.Property;
import com.ihirwe.erainb.service.PropertyService;
import com.ihirwe.erainb.dao.PropertyDao;

@Service
public class PropertyServiceImpl implements PropertyService {

	@Autowired
	private PropertyDao propertyDao;

	@Override
	public Property createProperty(Property property) {
		Date now= new Date();
		property.setDateAdded(now);
		propertyDao.save(property);
		return property;
	}

	@Override
	public List<Property> viewAllProperty() {
		return (List<Property>) propertyDao.findAll();
	}

	@Override
	public void removeProperty(String name) throws Exception {
		
		Property localProperty = propertyDao.findByName(name);
		if (localProperty != null) {
			propertyDao.delete(localProperty);
		} else {
			throw new Exception("Property not exists");
		}
	}

	@Override
	public void updateProperty(Property property) throws Exception {
		if (propertyDao.findByName(property.getName()) != null) {
			propertyDao.save(property);
		} else {
			throw new Exception("Mentioned Property doesnot exist");
		}
	}

	@Override
	public Property findByName(String name) {
		return propertyDao.findByName(name);
	}
}

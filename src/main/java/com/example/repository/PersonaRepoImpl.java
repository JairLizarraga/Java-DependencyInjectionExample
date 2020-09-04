package com.example.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.example.SpringConsoleDemoApplication;

@Repository
public class PersonaRepoImpl implements IPersonaRepo{

	private static Logger LOG = LoggerFactory.getLogger(SpringConsoleDemoApplication.class);
	
	@Override
	public void registrar(String nombre) {
		LOG.info("SE REGISTRÓ A " + nombre);
		
	}

}

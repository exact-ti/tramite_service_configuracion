package com.exact.configuracion.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.exact.configuracion.dao.IConfiguracionDAO;
import com.exact.configuracion.entity.Configuracion;
import com.exact.configuracion.repository.IConfiguracionRepository;

@Component
@Qualifier("SimpleConfiguracionDAO")
public class SimpleConfiguracionDAO implements IConfiguracionDAO {
	
	@Autowired
	IConfiguracionRepository configRepo;

	@Override
	public List<Configuracion> getAll() {
		return (List<Configuracion>) configRepo.findAll();
	}
	

}

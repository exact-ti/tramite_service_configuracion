package com.exact.configuracion.service;

import java.util.List;

import com.exact.configuracion.dao.IConfiguracionDAO;
import com.exact.configuracion.entity.Configuracion;

public class ConfiguracionService {
	
	IConfiguracionDAO configDAO;
	
	public ConfiguracionService(IConfiguracionDAO configDAO) {
		this.configDAO = configDAO;
	}
	
	public List<Configuracion> listar() {
		return configDAO.getAll();
	}
	
}

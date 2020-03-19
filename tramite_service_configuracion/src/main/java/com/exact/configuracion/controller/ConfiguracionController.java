package com.exact.configuracion.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exact.configuracion.dao.IConfiguracionDAO;
import com.exact.configuracion.entity.Configuracion;
import com.exact.configuracion.service.ConfiguracionService;

@RestController
@RequestMapping("/configuraciones")
public class ConfiguracionController {
	
	ConfiguracionService configService;
	
	@Autowired
	@Qualifier("SimpleConfiguracionDAO")
	IConfiguracionDAO simpleConfigDAO;
	
	@GetMapping
	public ResponseEntity<List<Configuracion>> listar(){
		configService = new ConfiguracionService(simpleConfigDAO);
		return new ResponseEntity<List<Configuracion>>(configService.listar(), HttpStatus.OK);
	}
	
}

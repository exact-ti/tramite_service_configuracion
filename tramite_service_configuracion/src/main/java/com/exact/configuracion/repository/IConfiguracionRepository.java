package com.exact.configuracion.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.exact.configuracion.entity.Configuracion;

@Repository
public interface IConfiguracionRepository extends CrudRepository<Configuracion, Long> {
	
}

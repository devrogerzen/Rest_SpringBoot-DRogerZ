package com.drogerz.rest.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.drogerz.rest.entity.Empleado;


@Repository
public interface EmpleadoRepo extends JpaRepository<Empleado, Integer> {

	
	
}

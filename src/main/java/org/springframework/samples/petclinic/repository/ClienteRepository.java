package org.springframework.samples.petclinic.repository;

import org.springframework.dao.DataAccessException;
import org.springframework.data.repository.Repository;
import org.springframework.samples.petclinic.model.Cliente;
import org.springframework.samples.petclinic.model.Pet;

public interface ClienteRepository extends Repository<Pet, Integer> {
	
	void save(Cliente cliente) throws DataAccessException;

}

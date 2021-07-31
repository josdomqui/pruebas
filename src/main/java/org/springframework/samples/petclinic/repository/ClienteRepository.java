package org.springframework.samples.petclinic.repository;


import java.util.Collection;

import org.springframework.dao.DataAccessException;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;
import org.springframework.samples.petclinic.model.Cliente;
import org.springframework.samples.petclinic.model.Pet;

public interface ClienteRepository extends Repository<Pet, Integer> {
	
	void save(Cliente cliente) throws DataAccessException;
	
	@Query("select c from Cliente c where c.id=:id")
	public Collection<Cliente> findById(@Param("id") Integer id); 
}

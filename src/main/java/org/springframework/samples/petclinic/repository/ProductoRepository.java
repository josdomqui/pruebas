package org.springframework.samples.petclinic.repository;

import java.util.Collection;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.samples.petclinic.model.Producto;

public interface ProductoRepository extends Repository<Producto, Integer> {
	
	void save(Producto producto) throws DataAccessException;
	
	@Query("SELECT p FROM Producto p ORDER BY p.name")
	Collection<Producto> pepe() throws DataAccessException;

}

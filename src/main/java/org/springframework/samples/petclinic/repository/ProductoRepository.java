package org.springframework.samples.petclinic.repository;

import java.util.Collection;

import org.springframework.dao.DataAccessException;
import org.springframework.data.repository.Repository;
import org.springframework.samples.petclinic.model.Producto;

public interface ProductoRepository extends Repository<Producto, Integer> {
	
	/**
	 * Retrieve all <code>Producto</code>s from the data store.
	 * @return a <code>Collection</code> of <code>Producto</code>s
	 */
	
	Collection<Producto> findAll() throws DataAccessException;

}

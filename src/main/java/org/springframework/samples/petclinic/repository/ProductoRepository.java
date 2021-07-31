package org.springframework.samples.petclinic.repository;

import java.util.Collection;

import org.springframework.dao.DataAccessException;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;
import org.springframework.samples.petclinic.model.Producto;

public interface ProductoRepository extends Repository<Producto, Integer> {
	
	void save(Producto producto) throws DataAccessException;

	@Query("select c from Producto c where c.id=:id")
	public Collection<Producto> findById(@Param("id") Integer id); 
}

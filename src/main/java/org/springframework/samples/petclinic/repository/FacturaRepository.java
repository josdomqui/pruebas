package org.springframework.samples.petclinic.repository;


import java.util.Collection;

import org.springframework.dao.DataAccessException;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;
import org.springframework.samples.petclinic.model.BaseEntity;
import org.springframework.samples.petclinic.model.Factura;

public interface FacturaRepository extends Repository<Factura, Integer> {

		/**
		 * Save a <code>Visit</code> to the data store, either inserting or updating it.
		 * @param visit the <code>Visit</code> to save
		 * @see BaseEntity#isNew
		 */
		void save(Factura factura) throws DataAccessException;
		
		@Query("select c from Factura c where c.id=:id")
		public Collection<Factura> findById(@Param("id") Integer id);

}

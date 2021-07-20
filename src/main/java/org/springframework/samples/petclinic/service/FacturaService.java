package org.springframework.samples.petclinic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.samples.petclinic.model.Factura;
import org.springframework.samples.petclinic.repository.FacturaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class FacturaService {
	
	private FacturaRepository facturaRepository;
	
	
	@Autowired
	public FacturaService(FacturaRepository facturaRepository) {
		this.facturaRepository = facturaRepository;
	}
	
	@Transactional
	public void saveFactura(Factura factura) throws DataAccessException {
		//creating factura
		facturaRepository.save(factura);		
		
	}		
}

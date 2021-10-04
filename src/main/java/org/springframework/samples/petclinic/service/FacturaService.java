package org.springframework.samples.petclinic.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.samples.petclinic.model.Factura;
import org.springframework.samples.petclinic.model.Producto;
import org.springframework.samples.petclinic.model.Vet;
import org.springframework.samples.petclinic.repository.ClienteRepository;
import org.springframework.samples.petclinic.repository.FacturaRepository;
import org.springframework.samples.petclinic.repository.ProductoRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class FacturaService {
	
	private FacturaRepository facturaRepository;
	private ProductoRepository productoRepository;
	
	
	@Autowired
	public FacturaService(FacturaRepository facturaRepository, ClienteRepository clienteRepository, 
			ProductoRepository productoRepository) {
		this.facturaRepository = facturaRepository;
		this.productoRepository = productoRepository;

	}
	
	@Transactional
	public void saveFactura(Factura factura) throws DataAccessException {
		//creating factura
		facturaRepository.save(factura);		
		
	}		
	
	@Transactional(readOnly = true)	
	public Collection<Producto> findProductos() throws DataAccessException {
		return productoRepository.findAll();
		
	}
	
	void sinnada() {
		
	}
	
	
}

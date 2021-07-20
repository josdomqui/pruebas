package org.springframework.samples.petclinic.service;

import org.springframework.dao.DataAccessException;
import org.springframework.samples.petclinic.model.Producto;
import org.springframework.samples.petclinic.repository.ProductoRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductoService {
	private ProductoRepository productoRepository;
	
	@Transactional
	public void saveProducto(Producto producto) throws DataAccessException {
		productoRepository.save(producto);
	}
}
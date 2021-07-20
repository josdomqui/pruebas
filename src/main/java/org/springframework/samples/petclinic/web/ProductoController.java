package org.springframework.samples.petclinic.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.petclinic.service.AuthoritiesService;
import org.springframework.samples.petclinic.service.FacturaService;
import org.springframework.samples.petclinic.service.ProductoService;
import org.springframework.samples.petclinic.service.UserService;

public class ProductoController {
	private static final String VIEWS_OWNER_CREATE_OR_UPDATE_FORM = "facturas/createOrUpdateFacturaForm";

	private final ProductoService productoService;
	private final FacturaService facturaService;

	@Autowired
	public ProductoController(ProductoService productoService, FacturaService facturaService) {
		this.productoService = productoService;
		this.facturaService = facturaService;
	}
}

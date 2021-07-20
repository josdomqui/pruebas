package org.springframework.samples.petclinic.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.petclinic.repository.PetRepository;
import org.springframework.samples.petclinic.repository.VisitRepository;
import org.springframework.samples.petclinic.service.AuthoritiesService;
import org.springframework.samples.petclinic.service.FacturaService;
import org.springframework.samples.petclinic.service.OwnerService;
import org.springframework.samples.petclinic.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/facturas/{id}")
public class FacturaController {
	
	private static final String VIEWS_OWNER_CREATE_OR_UPDATE_FORM = "facturas/createOrUpdateFacturaForm";

	private final FacturaService facturaService;

	@Autowired
	public FacturaController(FacturaService facturaService, UserService userService, AuthoritiesService authoritiesService) {
		this.facturaService = facturaService;
	}
}

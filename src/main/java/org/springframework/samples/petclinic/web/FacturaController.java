package org.springframework.samples.petclinic.web;

import java.util.Collection;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.petclinic.model.Factura;
import org.springframework.samples.petclinic.model.Owner;
import org.springframework.samples.petclinic.model.Pet;
import org.springframework.samples.petclinic.model.PetType;
import org.springframework.samples.petclinic.repository.PetRepository;
import org.springframework.samples.petclinic.repository.VisitRepository;
import org.springframework.samples.petclinic.service.AuthoritiesService;
import org.springframework.samples.petclinic.service.FacturaService;
import org.springframework.samples.petclinic.service.OwnerService;
import org.springframework.samples.petclinic.service.UserService;
import org.springframework.samples.petclinic.service.exceptions.DuplicatedPetNameException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
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
	
	@GetMapping(value = "/facturas/new")
	public String initCreationForm(Map<String, Object> model) {
		Factura factura= new Factura();
		model.put("factura", factura);
		return VIEWS_OWNER_CREATE_OR_UPDATE_FORM;
	}

	@PostMapping(value = "/facturas/new")
	public String processCreationForm(Factura factura, BindingResult result, ModelMap model) {		
		if (result.hasErrors()) {
			return VIEWS_OWNER_CREATE_OR_UPDATE_FORM;
		}
		else {
			
			this.facturaService.saveFactura(factura);
			
			return "redirect:/facturas/" + factura.getId();
		}
	}
}

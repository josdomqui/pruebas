package org.springframework.samples.petclinic.web;

import java.util.Collection;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.petclinic.model.Factura;
import org.springframework.samples.petclinic.model.PetType;
import org.springframework.samples.petclinic.model.Producto;
import org.springframework.samples.petclinic.model.Vets;
import org.springframework.samples.petclinic.service.AuthoritiesService;
import org.springframework.samples.petclinic.service.FacturaService;
import org.springframework.samples.petclinic.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FacturaController {
	
	private final FacturaService facturaService;

	@Autowired
	public FacturaController(FacturaService facturaService) {
		this.facturaService = facturaService;
	}
	
	@GetMapping(value = { "/facturas/new" })
	public String showProductsList(Map<String, Object> model) {
		// Here we are returning an object of type 'Vets' rather than a collection of Vet
		// objects
		// so it is simpler for Object-Xml mapping
		Factura facturas = new Factura();
		facturas.getVetList().addAll(this.facturaService.findProductos());
		model.put("facturas", facturas);
		return "facturas/createOrUpdateFacturaForm";
	}
	

}

package org.springframework.samples.petclinic.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

import javax.persistence.Table;

@Entity
@Table(name = "facturas")
public class Factura extends BaseEntity{
	
//	@ManyToMany
//	@JoinColumn(name = "producto_id")
//	private Producto producto;
//
//	@ManyToMany
//	@JoinColumn(name = "ciente_id")
//	private Cliente cliente;

	
}

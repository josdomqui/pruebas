package org.springframework.samples.petclinic.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "productos")
public class Producto extends NamedEntity{
	@NotEmpty
	@Column(name = "description")
	private String description;
	
	@NotEmpty
	@Column(name = "coste")
	private String coste;

	@ManyToOne
	@JoinColumn(name = "factura_id")
	private Factura factura;
	
}
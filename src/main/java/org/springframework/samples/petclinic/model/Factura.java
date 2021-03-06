package org.springframework.samples.petclinic.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "facturas")
public class Factura extends BaseEntity{
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id", referencedColumnName = "id")
	private Cliente cliente;
	
	@Column(name = "fecha")
	@DateTimeFormat(pattern = "yyyy/MM/dd")
	private LocalDate fecha;

	
	@ManyToOne
	@JoinColumn(name = "producto_id")
	private Producto producto;
	
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	
	public List<Producto> getVetList() {
		List<Producto> lista = new ArrayList<>();
		lista.add(producto);
		return lista;
	}
	
	
//	List<Producto> sortedProductos = new ArrayList<>(getPetsInternal());
//		PropertyComparator.sort(sortedPets, new MutableSortDefinition("name", true, true));
//		return Collections.unmodifiableList(sortedPets);
//	}
//
//	public void addPet(Pet pet) {
//		getPetsInternal().add(pet);
//		pet.setOwner(this);
//	}
	
}

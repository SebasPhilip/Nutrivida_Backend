package com.nutrivida.nutrivida.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Planes {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String nombre;
private Integer precio;
private String categoria;
private Boolean oferta;


public Planes() {
}
public Planes(String nombre, Integer precio, String categoria, Boolean oferta) {
this.nombre = nombre;
this.precio = precio;
this.categoria = categoria;
this.oferta = oferta;
}
public Long getId() { return id; }
public void setId(Long id) { this.id = id; }
public String getNombre() { return nombre; }
public void setNombre(String nombre) { this.nombre = nombre; }
public Integer getPrecio() { return precio; }
public void setPrecio(Integer precio) { this.precio = precio;}
public String getCategoria() { return categoria; }
public void setCategoria(String categoria) { this.categoria = categoria; }
public Boolean getOferta() { return oferta; }
public void setOferta(Boolean oferta) { this.oferta = oferta; }
}

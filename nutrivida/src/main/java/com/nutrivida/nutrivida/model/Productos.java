package com.nutrivida.nutrivida.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Productos {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String nombre;
private Integer precio;
private String categoria;
private Integer stock;



public Productos() {
}
public Productos (String nombre, Integer precio, String categoria, Integer Stock) {
this.nombre = nombre;
this.precio = precio;
this.categoria = categoria;
this.stock = Stock;
}
public Long getId() { return id; }
public void setId(Long id) { this.id = id; }
public String getNombre() { return nombre; }
public void setNombre(String nombre) { this.nombre = nombre; }
public Integer getPrecio() { return precio; }
public void setPrecio(Integer precio) { this.precio = precio; }
public String getCategoria() { return categoria; }
public void setCategoria(String categoria) { this.categoria = categoria; }
public Integer getStock() { return stock; }
public void setStock(Integer stock) { this.stock = stock; }
}
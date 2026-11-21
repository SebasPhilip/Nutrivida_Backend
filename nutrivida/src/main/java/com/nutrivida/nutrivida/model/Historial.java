package com.nutrivida.nutrivida.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Historial {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String fecha;
private Double peso;
private Double talla;
private Double imc; 
private Double cintura;
private String notas;


public Historial() {
}
public Historial(String fecha, Double peso, Double talla, Double imc, Double cintura, String notas) {
this.fecha = fecha;
this.peso = peso;
this.talla = talla;
this.imc = imc;
this.cintura = cintura;
this.notas = notas;
}

public Long getId() { return id; }
public void setId(Long id) { this.id = id; }
public String getFecha() { return fecha; }
public void setFecha(String fecha) { this.fecha = fecha; }
public Double getPeso() { return peso; }
public void setPeso(Double peso) { this.peso = peso; }
public Double getTalla() { return talla; }
public void setTalla(Double talla) { this.talla = talla; }
public Double getImc() { return imc; }
public void setImc(Double imc) { this.imc = imc; }
public Double getCintura() { return cintura; }
public void setCintura(Double cintura) { this.cintura = cintura; }
public String getNotas() { return notas; }
public void setNotas(String notas) { this.notas = notas;}    
}

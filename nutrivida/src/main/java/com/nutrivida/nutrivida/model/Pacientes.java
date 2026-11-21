package com.nutrivida.nutrivida.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Pacientes {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String nombre;
private String plan;
private String estado;
private String profesional;


public Pacientes() {
}
public Pacientes(String nombre, String plan, String estado, String profesional) {
this.nombre = nombre;
this.plan = plan;
this.estado= estado;
this.profesional = profesional;
}
public Long getId() { return id; }
public void setId(Long id) { this.id = id; }    
public String getNombre() { return nombre; }
public void setNombre (String nombre) {this.nombre = nombre; }
public String getPlan() { return plan; }
public void setPlan(String plan) { this.plan = plan; }
public String getEstado() { return estado; }
public void setEstado(String estado) { this.estado = estado;}
public String getProfesional() { return profesional; }
public void setProfesional(String profesional) { this.profesional = profesional; }

}

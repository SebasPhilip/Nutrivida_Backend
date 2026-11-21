package com.nutrivida.nutrivida.controller;

import com.nutrivida.nutrivida.model.Pacientes;
import com.nutrivida.nutrivida.service.PacientesService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/api/pacientes")
@Tag(name = "Pacientes", description = "Operaciones CRUD sobre pacientes")
public class PacientesController {
private static final Pacientes Pacientes = null;
@Autowired
private PacientesService pacientesService;
@GetMapping
@Operation(summary = "Listar todos los pacientes")
public List<Pacientes> getAll() {
return pacientesService.findAll();
}
@GetMapping("/{id}")
@Operation(summary = "Obtener un paciente por su id")
public Pacientes getById(@PathVariable Long id) {
return pacientesService.findById(id);
}
@PostMapping
@ResponseStatus(HttpStatus.CREATED)
@Operation(summary = "Crear un paciente")
public Pacientes create(@RequestBody Pacientes paciente) {
return pacientesService.save(Pacientes);
}
@PutMapping("/{id}")
@Operation(summary = "Actualizar los pacientes existentes")
public Pacientes update(@PathVariable Long id, @RequestBody Pacientes paciente) {
return pacientesService.update(id, paciente);
}
@DeleteMapping("/{id}")
@ResponseStatus(HttpStatus.NO_CONTENT)
@Operation(summary = "Eliminar un paciente")
public void delete(@PathVariable Long id) {
pacientesService.delete(id);
}
}
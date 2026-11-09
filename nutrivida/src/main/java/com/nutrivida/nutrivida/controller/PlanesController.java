package com.nutrivida.nutrivida.controller;
import com.nutrivida.nutrivida.model.Planes;
import com.nutrivida.nutrivida.service.PlanesService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/api/planes")
@Tag(name = "Planes", description = "Operaciones CRUD sobre planes")
public class PlanesController {
@Autowired
private PlanesService planesService;
@GetMapping
@Operation(summary = "Listar todos los planes")
public List<Planes> getAll() {
return planesService.findAll();
}
@GetMapping("/{id}")
@Operation(summary = "Obtener un plan por su id")
public Planes getById(@PathVariable Long id) {
return planesService.findById(id);
}
@PostMapping
@ResponseStatus(HttpStatus.CREATED)
@Operation(summary = "Crear un plan nuevo ")
public Planes create(@RequestBody Planes plan) {
return planesService.save(plan);
}
@PutMapping("/{id}")
@Operation(summary = "Actualizar un plan existente")
public Planes update(@PathVariable Long id, @RequestBody Planes plan) {
return planesService.update(id, plan);
}
@DeleteMapping("/{id}")
@ResponseStatus(HttpStatus.NO_CONTENT)
@Operation(summary = "Eliminar un plan")
public void delete(@PathVariable Long id) {
planesService.delete(id);
}
}
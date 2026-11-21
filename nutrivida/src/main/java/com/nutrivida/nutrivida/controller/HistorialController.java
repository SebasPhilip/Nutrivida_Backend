package com.nutrivida.nutrivida.controller;

import com.nutrivida.nutrivida.model.Historial;
import com.nutrivida.nutrivida.service.HistorialService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/api/historial")
@Tag(name = "Historial", description = "Operaciones CRUD sobre el historial")
public class HistorialController {
@Autowired
private HistorialService historialService;
@GetMapping
@Operation(summary = "Mostrar todos los historiales")
public List<Historial> getAll() {
return historialService.findAll();
}
@GetMapping("/{id}")
@Operation(summary = "Obtener un historial por su id")
public Historial getById(@PathVariable Long id) {
return historialService.findById(id);
}
@PostMapping
@ResponseStatus(HttpStatus.CREATED)
@Operation(summary = "Crear un historial")
public Historial create(@RequestBody Historial historial) {
return historialService.save(historial);
}
@PutMapping("/{id}")
@Operation(summary = "Actualizar un historial existente")
public Historial update(@PathVariable Long id, @RequestBody Historial historial) {
return historialService.update(id, historial);
}
@DeleteMapping("/{id}")
@ResponseStatus(HttpStatus.NO_CONTENT)
@Operation(summary = "Eliminar el historial")
public void delete(@PathVariable Long id) {
historialService.delete(id);
}
}
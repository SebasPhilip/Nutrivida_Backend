package com.nutrivida.nutrivida.controller;
import com.nutrivida.nutrivida.model.Productos;
import com.nutrivida.nutrivida.service.ProductosService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/api/productos")
@Tag(name = "Productos", description = "Operaciones CRUD sobre productos")
public class ProductosController {
@Autowired
private ProductosService productosService;
@GetMapping
@Operation(summary = "Listar todos los productos")
public List<Productos> getAll() {
return productosService.findAll();
}
@GetMapping("/{id}")
@Operation(summary = "Obtener un producto por su id")
public Productos getById(@PathVariable Long id) {
return productosService.findById(id);
}
@PostMapping
@ResponseStatus(HttpStatus.CREATED)
@Operation(summary = "Crear un producto nuevo ")
public Productos create(@RequestBody Productos producto) {
return productosService.save(producto);
}
@PutMapping("/{id}")
@Operation(summary = "Actualizar un producto existente")
public Productos update(@PathVariable Long id, @RequestBody Productos producto) {
return productosService.update(id, producto);
}
@DeleteMapping("/{id}")
@ResponseStatus(HttpStatus.NO_CONTENT)
@Operation(summary = "Eliminar un producto")
public void delete(@PathVariable Long id) {
productosService.delete(id);
}
}
package com.nutrivida.nutrivida.service;

import com.nutrivida.nutrivida.exception.ResourceNotFoundException;
import com.nutrivida.nutrivida.model.Productos;
import com.nutrivida.nutrivida.repository.ProductosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ProductosService {
@Autowired
private ProductosRepository productosRepository;
public List<Productos> findAll() {
return productosRepository.findAll();
}
public Productos findById(Long id) {
return productosRepository.findById(id)
.orElseThrow(() -> new ResourceNotFoundException("Producto no encontrado: " + id));
}
public Productos save(Productos productos) {
productos.setId(null);
return productosRepository.save(productos);
}
public Productos update(Long id, Productos data) {
Productos existing = findById(id);
existing.setNombre(data.getNombre());
existing.setPrecio(data.getPrecio());
existing.setCategoria(data.getCategoria());
existing.setStock(data.getStock());
return productosRepository.save(existing);
}
public void delete(Long id) {
if (!productosRepository.existsById(id)) {
throw new ResourceNotFoundException("Producto no encontrado: " + id);
}
productosRepository.deleteById(id);
}
}

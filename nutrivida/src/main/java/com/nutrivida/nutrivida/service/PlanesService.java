package com.nutrivida.nutrivida.service;

import com.nutrivida.nutrivida.exception.ResourceNotFoundException;
import com.nutrivida.nutrivida.model.Planes;
import com.nutrivida.nutrivida.repository.PlanesRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class PlanesService {
@Autowired
private PlanesRepository planesRepository;
public List<Planes> findAll() {
return planesRepository.findAll();
}
public Planes findById(Long id) {
return planesRepository.findById(id)
.orElseThrow(() -> new ResourceNotFoundException("plan no encontrado: " + id));
}
public Planes save(Planes planes) {
planes.setId(null);
return planesRepository.save(planes);
}
public Planes update(Long id, Planes data) {
Planes existing = findById(id);
existing.setNombre(data.getNombre());
existing.setPrecio(data.getPrecio());
existing.setCategoria(data.getCategoria());
existing.setOferta(data.getOferta());
return planesRepository.save(existing);
}
public void delete(Long id) {
if (!planesRepository.existsById(id)) {
throw new ResourceNotFoundException("Plan no encontrado: " + id);
}
planesRepository.deleteById(id);
}
}
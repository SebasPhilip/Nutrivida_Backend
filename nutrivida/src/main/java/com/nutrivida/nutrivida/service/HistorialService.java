package com.nutrivida.nutrivida.service;

import com.nutrivida.nutrivida.exception.ResourceNotFoundException;
import com.nutrivida.nutrivida.model.Historial;
import com.nutrivida.nutrivida.repository.HistorialRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class HistorialService {
@Autowired
private HistorialRepository historialRepository;
public List<Historial> findAll() {
return historialRepository.findAll();
}
public Historial findById(Long id) {
return historialRepository.findById(id)
.orElseThrow(() -> new ResourceNotFoundException("historial no encontrado " + id));
}
public Historial save(Historial historial) {
historial.setId(null);
return historialRepository.save(historial);
}
public Historial update(Long id, Historial data) {
Historial existing = findById(id);
existing.setFecha(data.getFecha());
existing.setPeso(data.getPeso());
existing.setTalla(data.getTalla());
existing.setImc(data.getImc());
existing.setCintura(data.getCintura());
existing.setNotas(data.getNotas());
return historialRepository.save(existing);
}
public void delete(Long id) {
if (!historialRepository.existsById(id)) {
throw new ResourceNotFoundException("Historial no encontrado: " + id);
}
historialRepository.deleteById(id);
}
}


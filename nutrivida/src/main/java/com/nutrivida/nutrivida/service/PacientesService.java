package com.nutrivida.nutrivida.service;

import com.nutrivida.nutrivida.exception.ResourceNotFoundException;
import com.nutrivida.nutrivida.model.Pacientes;
import com.nutrivida.nutrivida.repository.PacientesRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class PacientesService {
@Autowired
private PacientesRepository pacientesRepository;
public List<Pacientes> findAll() {
return pacientesRepository.findAll();
}
public Pacientes findById(Long id) {
return pacientesRepository.findById(id)
.orElseThrow(() -> new ResourceNotFoundException("paciente no encontrado: " + id));
}
public Pacientes save(Pacientes pacientes) {
pacientes.setId(id:null);
return pacientesRepository.save(pacientes);
}
public Pacientes update(Long id, Pacientes data) {
Pacientes existing = findById(id);
existing.setNombre(data.getNombre());
existing.setPlan(data.getPlan());
existing.setEstado(data.getEstado());
existing.setProfesional(data.getProfesional());
return pacientesRepository.save(existing);
}
public void delete(Long id) {
if (!pacientesRepository.existsById(id)) {
throw new ResourceNotFoundException("Paciente no encontrado: " + id);
}
pacientesRepository.deleteById(id);
}
}


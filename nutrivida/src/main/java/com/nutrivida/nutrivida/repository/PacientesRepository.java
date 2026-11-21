package com.nutrivida.nutrivida.repository;

import com.nutrivida.nutrivida.model.Pacientes;
import org.springframework.data.jpa.repository.JpaRepository;
public interface PacientesRepository extends JpaRepository<Pacientes, Long> {
}
package com.nutrivida.nutrivida.repository;

import com.nutrivida.nutrivida.model.Planes;
import org.springframework.data.jpa.repository.JpaRepository;
public interface PlanesRepository extends JpaRepository<Planes, Long> {
}
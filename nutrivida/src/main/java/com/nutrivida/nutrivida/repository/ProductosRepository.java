package com.nutrivida.nutrivida.repository;

import com.nutrivida.nutrivida.model.Productos;
import org.springframework.data.jpa.repository.JpaRepository;
public interface ProductosRepository extends JpaRepository<Productos, Long> {
}
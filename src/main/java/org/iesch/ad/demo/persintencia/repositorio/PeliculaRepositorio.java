package org.iesch.ad.demo.persintencia.repositorio;

import org.iesch.ad.demo.persintencia.modelos.Pelicula;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PeliculaRepositorio extends JpaRepository<Pelicula, Long> {
}

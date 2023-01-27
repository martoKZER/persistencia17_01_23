package org.iesch.ad.demo.persintencia.repositorio;

import org.iesch.ad.demo.persintencia.modelos.Actor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActorRepositorio extends JpaRepository<Actor, String> {

}

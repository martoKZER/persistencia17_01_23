package org.iesch.ad.demo.persintencia.servicios;
import org.iesch.ad.demo.persintencia.modelos.Actor;
import org.iesch.ad.demo.persintencia.repositorio.ActorRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActoresServicios {
    @Autowired
    ActorRepositorio actorRepositorio;
    public List<Actor> buscaTodosLosActores(){

        return actorRepositorio.findAll();
    }
}

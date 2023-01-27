package org.iesch.ad.demo.persintencia.controlador;
import org.iesch.ad.demo.persintencia.modelos.Actor;
import org.iesch.ad.demo.persintencia.servicios.ActoresServicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ActoresControlador {
    @Autowired
    ActoresServicios actoresServicios;
    @GetMapping("api/actores")
    public List<Actor> obtenerTodas(){
        return actoresServicios.buscaTodosLosActores();
    }

    @GetMapping("api/actor/{dni}")
    public Actor buscaPorDni(@PathVariable String dni){
        return actoresServicios.buscaPorId(dni);
    }
    @PostMapping("api/actor")
    public Actor insertarActor(@RequestBody Actor actor){
        Actor actorSalvado = actoresServicios.guardaActor(actor);
        return actorSalvado;
    }

}


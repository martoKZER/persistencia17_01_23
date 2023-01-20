package org.iesch.ad.demo.persintencia.controlador;
import org.iesch.ad.demo.persintencia.modelos.Actor;
import org.iesch.ad.demo.persintencia.servicios.ActoresServicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class ActoresControlador {
    @Autowired
    ActoresServicios actoresServicios;
    @GetMapping("api/actores")
    public List<Actor> obtenerTodas(){
        return actoresServicios.buscaTodosLosActores();


    }

}


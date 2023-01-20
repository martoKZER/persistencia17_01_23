package org.iesch.ad.demo.persintencia.controlador;
import org.iesch.ad.demo.persintencia.modelos.Pelicula;
import org.iesch.ad.demo.persintencia.servicios.PeliculasServicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class PeliculasControlador {

    @Autowired
    PeliculasServicios peliculasServicios;
    @GetMapping("api/peliculas")
    public List<Pelicula> obtenerTodas(){
        return peliculasServicios.buscaTodasLasPeliculas();


    }
}

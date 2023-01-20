package org.iesch.ad.demo.persintencia.servicios;
import org.iesch.ad.demo.persintencia.modelos.Pelicula;
import org.iesch.ad.demo.persintencia.repositorio.PeliculaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class PeliculasServicios {
    @Autowired
    PeliculaRepositorio peliculaRepositorio;
    public List<Pelicula> buscaTodasLasPeliculas(){

        return peliculaRepositorio.findAll();
    }

}

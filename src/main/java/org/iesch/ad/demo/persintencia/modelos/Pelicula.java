package org.iesch.ad.demo.persintencia.modelos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Pelicula {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String titulo;
    LocalDate year;
    String genero;
    String urlFoto;
    String director;
    String sinopsis;
    int duracion;
    int puntuacion;

    @OneToMany (mappedBy= "pelicula", fetch = FetchType.EAGER)
    List<Actor> listaActores = new ArrayList<Actor>();

}

package co.edu.uniandes.dse.TallerPersistencia.entities;

import jakarta.persistence.*;
import lombok.Data;
import uk.co.jemos.podam.common.PodamExclude;
import java.util.*;

@Data
@Entity
public class DirectorEntity {
    private String nombre;
    private String biografia;

    @PodamExclude
    @OneToMany(mappedBy = "director")
    private List<PeliculaEntity> peliculas;
}
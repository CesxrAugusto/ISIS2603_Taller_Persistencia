package co.edu.uniandes.dse.TallerPersistencia.entities;

import jakarta.persistence.*;
import lombok.Data;
import uk.co.jemos.podam.common.PodamExclude;
import java.util.*;

@Data
@Entity
public class PeliculaEntity extends BaseEntity{
    private String titulo;
    private Integer anioLanzamiento;

    @PodamExclude
    @ManyToMany
    private List<ActorEntity> actores;

    @PodamExclude
    @ManyToOne
    private DirectorEntity director;
}

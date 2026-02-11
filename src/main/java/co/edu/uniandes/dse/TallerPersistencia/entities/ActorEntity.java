package co.edu.uniandes.dse.TallerPersistencia.entities;
import java.util.*;
import jakarta.persistence.*;
import lombok.*;
import uk.co.jemos.podam.common.PodamExclude;

@Data
@Entity
public class ActorEntity extends BaseEntity {


    private String nombre;
    private String nacionalidad;

    @PodamExclude
    @ManyToMany(mappedBy="actores")
    private List<PeliculaEntity> peliculas;


    
}
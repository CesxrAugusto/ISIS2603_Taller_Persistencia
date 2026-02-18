package co.edu.uniandes.dse.TallerPersistencia.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import co.edu.uniandes.dse.TallerPersistencia.entities.*;
import co.edu.uniandes.dse.TallerPersistencia.exceptions.IllegalOperationException;
import co.edu.uniandes.dse.TallerPersistencia.repositories.PeliculaRepository;
@Service
public class PeliculaService {
    @Autowired
    PeliculaRepository peliculaRepository;

    public void crearPelicula(PeliculaEntity pelicula) throws IllegalOperationException{
        if (pelicula.getTitulo() == null){
            throw new IllegalOperationException("El título de la película no debería estar vacío.");
        }

        PeliculaEntity peliculaMismoNombre = peliculaRepository.findByTitulo(pelicula.getTitulo());
        if (peliculaMismoNombre != null){
            throw new IllegalOperationException("El título de la película no debería estar repetido.");
        }

        if (pelicula.getAnioLanzamiento() <= 1930){
            throw new IllegalOperationException("El año de la película no debería ser menor o igual a 1930.");
        }

    }
}

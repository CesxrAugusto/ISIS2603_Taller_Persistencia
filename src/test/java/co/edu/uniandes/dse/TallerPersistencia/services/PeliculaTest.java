package co.edu.uniandes.dse.TallerPersistencia.services;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import co.edu.uniandes.dse.TallerPersistencia.entities.*;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import uk.co.jemos.podam.api.PodamFactory;
import uk.co.jemos.podam.api.PodamFactoryImpl;

@ExtendWith(SpringExtension.class)
@DataJpaTest
@Import(PeliculaService.class)
@Transactional

public class PeliculaTest{
    @Autowired 
    PeliculaService empresaService;

    @Autowired
    EntityManager entityManager;

    private PodamFactory factory = new PodamFactoryImpl();

    private List <PeliculaEntity> listaPeliculas = new ArrayList<PeliculaEntity>(); 

    

}

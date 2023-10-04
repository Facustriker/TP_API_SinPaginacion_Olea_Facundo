package com.utn.proyectoAPIREST.servicios;

import com.utn.proyectoAPIREST.entidades.Persona;
import com.utn.proyectoAPIREST.repositorios.BaseRepository;
import com.utn.proyectoAPIREST.repositorios.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaServiceImpl extends BaseServiceImpl<Persona, Long> implements PersonaService{

    @Autowired
    private PersonaRepository personaRepository;

    public PersonaServiceImpl(BaseRepository<Persona, Long> baseRepository, PersonaRepository personaRepository) {
        super(baseRepository);
        this.personaRepository = personaRepository;
    }
}

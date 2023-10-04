package com.utn.proyectoAPIREST.servicios;

import com.utn.proyectoAPIREST.entidades.Localidad;
import com.utn.proyectoAPIREST.repositorios.BaseRepository;
import org.springframework.stereotype.Service;

@Service
public class LocalidadServiceImpl extends BaseServiceImpl<Localidad, Long> implements LocalidadService {

    public LocalidadServiceImpl(BaseRepository<Localidad, Long> baseRepository) {
        super(baseRepository);
    }
}

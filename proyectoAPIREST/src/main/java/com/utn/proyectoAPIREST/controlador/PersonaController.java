package com.utn.proyectoAPIREST.controlador;

import com.utn.proyectoAPIREST.entidades.Persona;
import com.utn.proyectoAPIREST.servicios.PersonaServiceImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*") //Nos permite ingresar desde variso clientes a nuestra API
@RequestMapping(path = "api/v1/personas")
public class PersonaController extends BaseControllerImpl<Persona, PersonaServiceImpl>{


}


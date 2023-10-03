package com.utn.proyectoAPIREST.entidades;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Localidad extends BaseEntidad{

    private String denominacion;

}

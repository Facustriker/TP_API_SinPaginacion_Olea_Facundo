package com.utn.proyectoAPIREST.entidades;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "Autor")
public class Autor extends BaseEntidad{

    private String nombre;
    private String apellido;
    @Column(length = 1500)
    private String biografia;

}

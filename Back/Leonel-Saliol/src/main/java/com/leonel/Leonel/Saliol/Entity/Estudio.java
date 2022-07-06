package com.leonel.Leonel.Saliol.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Getter @Setter

public class Estudio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(min = 1, max = 50, message = "No cumple con los requisitos")
    private String nomEst;


    @NotNull
    @Size(min = 1, max = 10, message = "Ingrese del siguiente formato (Ej: 'DD/MM/YYYY') ")
    private String year;

    @NotNull
    @Size(min = 1, max = 400, message = "No cumple con los requisitos")
    private String descripcion;
}
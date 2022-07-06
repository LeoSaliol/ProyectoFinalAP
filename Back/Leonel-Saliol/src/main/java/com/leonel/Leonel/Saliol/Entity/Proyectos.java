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

public class Proyectos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size( min=1, max=25, message = "No cumple con los requisitos")
    private String title;

    @NotNull
    @Size( min=1, max=25, message = "No cumple con los requisitos")
    private String year;

    @NotNull
    @Size( min=1, max=400, message = "No cumple con los requisitos")
    private String descripcion;

    @NotNull
    @Size( min=1, max=50, message = "No cumple con los requisitos")
    private String link;

}

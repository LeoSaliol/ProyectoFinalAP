package com.leonel.Leonel.Saliol.Interface;

import com.leonel.Leonel.Saliol.Entity.Proyectos;

import java.util.List;

public interface IProyectosService {

    public List<Proyectos> getProyectos();

    public Proyectos findProyecto(Long id);

    public void saveProyecto(Proyectos proyectos);

    public void deleteProyecto(Long id);


}

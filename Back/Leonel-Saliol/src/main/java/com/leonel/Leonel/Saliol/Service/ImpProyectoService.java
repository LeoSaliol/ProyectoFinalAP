package com.leonel.Leonel.Saliol.Service;

import com.leonel.Leonel.Saliol.Entity.Proyectos;
import com.leonel.Leonel.Saliol.Interface.IProyectosService;
import com.leonel.Leonel.Saliol.Repository.IProyectoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImpProyectoService implements IProyectosService {
    @Autowired
    IProyectoRepository iproyectoRepository;

    @Override
    public List<Proyectos> getProyectos() {
        List<Proyectos> proyectos = iproyectoRepository.findAll();
        return proyectos;
    }

    @Override
    public Proyectos findProyecto(Long id) {
        Proyectos proyecto = iproyectoRepository.findById(id).orElse(null);
        return proyecto;
    }

    @Override
    public void saveProyecto(Proyectos proyecto) {
    iproyectoRepository.save(proyecto);
    }

    @Override
    public void deleteProyecto(Long id) {
        iproyectoRepository.deleteById(id);
    }
}

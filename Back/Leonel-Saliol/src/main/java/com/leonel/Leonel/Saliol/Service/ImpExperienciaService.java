package com.leonel.Leonel.Saliol.Service;


import com.leonel.Leonel.Saliol.Entity.Experiencia;
import com.leonel.Leonel.Saliol.Interface.IExperienciaService;
import com.leonel.Leonel.Saliol.Repository.IExperienciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImpExperienciaService implements IExperienciaService {

    @Autowired
    IExperienciaRepository iexperienciaRepository;



    @Override
    public List<Experiencia> getExperiencia() {
        List<Experiencia> experiencia = iexperienciaRepository.findAll();
        return experiencia;
    }

    @Override
    public void saveExperiencia(Experiencia experiencia) {
        iexperienciaRepository.save(experiencia);
    }

    @Override
    public void deleteExperiencia(Long id) {
        iexperienciaRepository.deleteById(id);
    }

    @Override
    public Experiencia findExperiencia(Long id) {
        Experiencia experiencia = iexperienciaRepository.findById(id).orElse(null);
        return experiencia;
    }
}
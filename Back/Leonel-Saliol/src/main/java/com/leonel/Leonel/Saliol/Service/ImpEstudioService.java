package com.leonel.Leonel.Saliol.Service;


import com.leonel.Leonel.Saliol.Entity.Estudio;
import com.leonel.Leonel.Saliol.Interface.IEstudioServices;
import com.leonel.Leonel.Saliol.Repository.IEstudioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class ImpEstudioService implements IEstudioServices {

    @Autowired
    IEstudioRepository iestudioRepository;


    @Override
    public List<Estudio> getEstudio() {
        List<Estudio> estudio = iestudioRepository.findAll();
        return  estudio;
    }

    @Override
    public void saveEstudio(Estudio estudio) {
        iestudioRepository.save(estudio);
    }

    @Override
    public void deleteEstudio(Long id) {
        iestudioRepository.deleteById(id);
    }

    @Override
    public Estudio findEstudio(Long id) {
       Estudio estudio = iestudioRepository.findById(id).orElse(null);
       return estudio;
    }
}

package com.leonel.Leonel.Saliol.Service;

import com.leonel.Leonel.Saliol.Entity.Acerca;
import com.leonel.Leonel.Saliol.Interface.IAcercaService;
import com.leonel.Leonel.Saliol.Repository.IAcercaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service

public class ImpAcercaService implements IAcercaService {

   @Autowired
   IAcercaRepository iacercaRepository;




    @Override
    public void saveAcercaDeMi(Acerca acerca) {
        iacercaRepository.save(acerca);
    }

    @Override
    public void deleteAcerDeMi(Long id) {
        iacercaRepository.deleteById(id);
    }

    @Override
    public Acerca findAcerca(Long id) {
        Acerca acerca = iacercaRepository.findById(id).orElse(null);
        return acerca;
    }
}
package com.leonel.Leonel.Saliol.Service;


import com.leonel.Leonel.Saliol.Entity.HarSk;
import com.leonel.Leonel.Saliol.Interface.IHarSkService;
import com.leonel.Leonel.Saliol.Repository.IHarSkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class ImpHarSkService implements IHarSkService {

    @Autowired
    IHarSkRepository iharSkRepository;

    @Override
    public List<HarSk> getHarSk() {
        List<HarSk> harSk = iharSkRepository.findAll();
        return harSk;
    }

    @Override
    public void saveHarSk(HarSk harSk) {
        iharSkRepository.save(harSk);
    }

    @Override
    public void deleteHarSk(Long id) {
        iharSkRepository.deleteById(id);
    }

    @Override
    public HarSk findHarSk(Long id) {
        HarSk harSk = iharSkRepository.findById(id).orElse(null);
        return harSk;
    }
}

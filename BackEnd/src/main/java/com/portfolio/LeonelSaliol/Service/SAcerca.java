package com.portfolio.LeonelSaliol.Service;

import com.portfolio.LeonelSaliol.Entity.Acerca;
import com.portfolio.LeonelSaliol.Interface.IAcercaService;
import com.portfolio.LeonelSaliol.Repository.RAcerca;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@Transactional
public class SAcerca implements IAcercaService {
    @Autowired
    RAcerca rAcerca;

    @Override
    public void saveAcerca(Acerca acerca) {
        rAcerca.save(acerca);
    }

    @Override
    public Acerca findAcerca(int id) {
        Acerca acerca = rAcerca.findById(id).orElse(null);
        return acerca;
    }



}

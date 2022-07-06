package com.leonel.Leonel.Saliol.Interface;

import com.leonel.Leonel.Saliol.Entity.HarSk;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IHarSkService {

    public List<HarSk> getHarSk();

    public void saveHarSk(HarSk harSk);

    public void deleteHarSk(Long id);

    public HarSk findHarSk (Long id);

}

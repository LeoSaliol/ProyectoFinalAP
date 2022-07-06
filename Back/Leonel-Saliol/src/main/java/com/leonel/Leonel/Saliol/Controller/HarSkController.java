package com.leonel.Leonel.Saliol.Controller;

import com.leonel.Leonel.Saliol.Entity.HarSk;
import com.leonel.Leonel.Saliol.Interface.IHarSkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/hard&skills")

public class HarSkController {

    @Autowired
    IHarSkService iharSkService;

    @GetMapping("/traer")
    public List<HarSk> getHarSk(){
        return iharSkService.getHarSk();
    }

    @GetMapping("/traer/{id}")
    public HarSk findHarsk(@PathVariable Long id){
       return iharSkService.findHarSk(id);
    }

    @PostMapping("/crear")
    public String createHarSk(@RequestBody HarSk harSk){
        iharSkService.saveHarSk(harSk);
        return "Hard & Skills fue creado correctamente";
    }

    @DeleteMapping("/borrar/{id}")
    public String deleteHardSk(@PathVariable Long id){
        iharSkService.deleteHarSk(id);
        return "Hard & Skills fue borrado correctamente";
    }

    @PutMapping("/editar/{id}")
    public String editHardSk(@PathVariable Long id,
                             @RequestParam("title") String nuevoTitle,
                             @RequestParam("percent") int nuevoPercent){

        HarSk harSk = iharSkService.findHarSk(id);
        harSk.setTitle(nuevoTitle);
        harSk.setPercent(nuevoPercent);

        iharSkService.saveHarSk(harSk);
        return "Hard & Skills editado correctamente";
    }
}

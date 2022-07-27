package com.portfolio.LeonelSaliol.Controller;


import com.portfolio.LeonelSaliol.Dto.dtoAcerca;
import com.portfolio.LeonelSaliol.Entity.Acerca;
import com.portfolio.LeonelSaliol.Security.Controller.Mensaje;
import com.portfolio.LeonelSaliol.Service.SAcerca;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/acerca")
public class CAcerca {
    @Autowired
    SAcerca sAcerca;

    @GetMapping("/traer/perfil")
    public Acerca findAcerca(){
        return sAcerca.findAcerca((int)1);
    }


    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/update/{id}")
    public ResponseEntity<?>update(@PathVariable("id") int id,
                                   @RequestBody dtoAcerca dtoAcerca){
        Acerca acerca = sAcerca.findAcerca(id);
        acerca.setDescrip(dtoAcerca.getDescrip());
        sAcerca.saveAcerca(acerca);
        return new ResponseEntity<>(new Mensaje("Descripcion actualizada"), HttpStatus.OK);
    }
}

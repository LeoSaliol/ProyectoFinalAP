
package com.leonel.Leonel.Saliol.Interface;

import com.leonel.Leonel.Saliol.Entity.Persona;
import java.util.List;



public interface IPersonaService {

    public List<Persona> getPersona();

    public Persona findPersona(Long id);

    
    public void savePersona(Persona persona);

    
    public void deletePersona (Long id);

    

    
    
}

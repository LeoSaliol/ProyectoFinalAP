
package com.leonel.Leonel.Saliol.Interface;

import com.leonel.Leonel.Saliol.Entity.Persona;
import java.util.List;



public interface IPersonaService {
    
    // Traer una lista de personas
    
    public List<Persona> getPersona();
    
    //Guardar un objeto de persona
    
    public void savePersona(Persona persona);
    
    // Eliminar un objeto o usuario buscado por id
    
    public void deletePersona (Long id);
    
    // Buscar persona por id
    
    public Persona findPersona(Long id);
    
    
}

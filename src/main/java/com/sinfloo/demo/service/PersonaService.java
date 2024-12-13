package com.sinfloo.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sinfloo.demo.interfaces.IPersona;
import com.sinfloo.demo.modelo.Persona;


@Service
public class PersonaService {
     @Autowired//accede a los metodos set
     private IPersona data;
     
     public List<Persona>listar(){
    	 return (List<Persona>)data.findAll();
     }
     
     public Optional<Persona>listarId(int id){
    	 return data.findById(id);
     }
     
     public int save(Persona p) {
    	 int res=0;
    	 Persona persona=data.save(p);
    	 if(!persona.equals(null)) {
    		 res=1;
    	 }
    	 return 0;
     }
     
     public void delete(int id) {
    	 data.deleteById(id);
     }
     
     
}


package com.practica01.controller;

import com.practica01.dao.EstadoDao;
import com.practica01.domain.Estado;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class IndexController {
    
    
// se crea en tiempo de ejecucion si aun no se ha guardado    
    @Autowired
    private EstadoDao estadoDao;
    
    @GetMapping("/")
    public String inicio( Model model){
        
        log.info("Ahora se usa arquitectura MVC");
        
        
        var estados = estadoDao.findAll();
        
        model.addAttribute ("estado",estados);
        
        return "index";
    }
    
    
    
    
    
    
    
    
}

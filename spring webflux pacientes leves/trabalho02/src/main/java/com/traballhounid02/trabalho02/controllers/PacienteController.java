package com.traballhounid02.trabalho02.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.traballhounid02.trabalho02.models.Paciente;
import com.traballhounid02.trabalho02.services.PacienteService;

import reactor.core.publisher.Flux;



@RestController
@RequestMapping("/leves")
public class PacienteController {

    @Autowired  
    private PacienteService pacienteService;

    @GetMapping(path  = "/")
    public Flux<Paciente>  findNotEmergency() {

       return this.pacienteService.findNotEmergency();
    }

    @GetMapping(value = "/leves/{id}/delete")
    public void delete(@PathVariable Long id){
        this.pacienteService.deleteById(id);
        
    }
}

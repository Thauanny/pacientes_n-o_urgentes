package com.traballhounid02.trabalho02.repositories;


import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import com.traballhounid02.trabalho02.models.Paciente;

import reactor.core.publisher.Flux;

@Repository

public interface PacienteRepository extends ReactiveCrudRepository<Paciente, Long> {

    @Query("Select * from paciente where paciente.situation = \"Não Urgente\" OR paciente.situation = \"Pouco Urgente\"")
    public Flux<Paciente> findNotEmergency();
}

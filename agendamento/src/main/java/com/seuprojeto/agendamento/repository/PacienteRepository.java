package com.seuprojeto.agendamento.repository;

import com.seuprojeto.agendamento.model.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteRepository extends JpaRepository<Paciente, Long> {
}

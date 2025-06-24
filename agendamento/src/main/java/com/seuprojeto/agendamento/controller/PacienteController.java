package com.seuprojeto.agendamento.controller;

import com.seuprojeto.agendamento.model.Paciente;
import com.seuprojeto.agendamento.repository.PacienteRepository;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.List;

@Named
@ViewScoped
@Component
public class PacienteController implements Serializable {

    @Autowired
    private PacienteRepository pacienteRepository;

    private Paciente paciente = new Paciente();

    public void salvar() {
        pacienteRepository.save(paciente);
        paciente = new Paciente();
    }

    public void deletar(Paciente p) {
        pacienteRepository.delete(p);
    }

    public List<Paciente> getPacientes() {
        return pacienteRepository.findAll();
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
}

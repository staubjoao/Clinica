package telas;

import entidade.Medico;
import entidade.Paciente;
import java.util.ArrayList;
import java.util.Scanner;

public class TelaConsulta {

    private int idConsulta;
    private String data;
    private String horario;
    private boolean primeiraConsulta;
    private int idPaciente;
    private int idMedico;

    public TelaConsulta(ArrayList<Paciente> pacientes, ArrayList<Medico> medicos) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o id da consulta:");
        this.setIdConsulta(Integer.parseInt(sc.nextLine()));
        System.out.println("Digite a data:");
        this.setData(sc.nextLine());
        System.out.println("Digite o horario:");
        this.setHorario(sc.nextLine());
        System.out.println("Digite se é a primeira consulta(0 para não e 1 para sim):");
        int aux = Integer.parseInt(sc.nextLine());
        if (aux == 0) {
            this.setPrimeiraConsulta(false);
        } else {
            this.setPrimeiraConsulta(true);
        }
        new TelaRelatorioPaciente(pacientes);
        System.out.println("Digite id do paciente:");
        this.setIdPaciente(Integer.parseInt(sc.nextLine()));
        new TelaRelatorioMedico(medicos);
        System.out.println("Digite id do medico:");
        this.setIdMedico(Integer.parseInt(sc.nextLine()));
    }

    public int getIdConsulta() {
        return idConsulta;
    }

    public void setIdConsulta(int idConsulta) {
        this.idConsulta = idConsulta;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(int idMedico) {
        this.idMedico = idMedico;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public boolean getPrimeiraConsulta() {
        return primeiraConsulta;
    }

    public void setPrimeiraConsulta(boolean primeiraConsulta) {
        this.primeiraConsulta = primeiraConsulta;
    }

}

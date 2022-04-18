package telas;

import java.util.Scanner;
import controle.*;
import entidade.*;
import java.sql.SQLException;
import java.util.ArrayList;

public class TelaPrincipal {

    public TelaPrincipal() throws SQLException {
        Scanner sc = new Scanner(System.in);
        int r;
        System.out.println("*******CADASTRO******");
        System.out.println("Digite 1 para cadastrar um medico");
        System.out.println("Digite 2 para cadastrar um paciente");
        System.out.println("Digite 3 para cadastrar uma especialidade");
        // System.out.println("Digite 4 para cadastrar um medicamento");
        // System.out.println("Digite 5 para cadastrar um consulta");
        // System.out.println("Digite 6 para cadastrar uma receita");
        System.out.println("Digite 7 para listar");
        System.out.println("Digite 8 para alterar");
        System.out.println("Digite 9 para excluir");
        System.out.println("Digite 0 para sair");
        r = Integer.parseInt(sc.nextLine());

        if (r == 1) {
            System.out.println("\n------ CADASTRANDO MÉDICO ------\n");
            ControleEspecialidade controle1 = new ControleEspecialidade();
            ArrayList<Especialidade> esps = new ArrayList<>();
            esps = controle1.listar();
            TelaMedico tela = new TelaMedico(esps);
            ControleMedico controle2 = new ControleMedico();
            try {
                controle2.inserir(tela);
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        } else if (r == 2) {
            /*System.out.println("\n------ CADASTRANDO PACIENTE ------\n");
            TelaPaciente tela = new TelaPaciente();
            ControlePaciente controle = new ControlePaciente(path);
            try {
                controle.gravarArquivo(tela);
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }*/
        } else if (r == 3) {
            System.out.println("\n------ CADASTRANDO ESPECIALIDADE ------\n");
            TelaEspecialidade tela = new TelaEspecialidade();
            ControleEspecialidade controle = new ControleEspecialidade();
            try {
                controle.inserir(tela);
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        } else if (r == 4) {
            /*System.out.println("\n------ CADASTRANDO MEDICAMENTO ------\n");
            TelaMedicamento tela = new TelaMedicamento();
            ControleMedicamento controle = new ControleMedicamento(path);
            try {
                controle.gravarArquivo(tela);
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }*/
        } else if (r == 5) {
            /*System.out.println("\n------ CADASTRANDO CONSULTA ------\n");
            ControleMedico controle = new ControleMedico(path);
            ControlePaciente controle1 = new ControlePaciente(path);
            ArrayList<Medico> medico = new ArrayList<>();
            ArrayList<Paciente> paciente = new ArrayList<>();
            medico = controle.lerArquivo("medico.txt");
            paciente = controle1.lerArquivo("paciente.txt");
            TelaConsulta tela = new TelaConsulta(paciente, medico);
            ControleConsulta controle2 = new ControleConsulta(path);
            try {
                controle2.gravarArquivo(tela);
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }*/
        } else if (r == 6) {
            /*ControleMedico controle1 = new ControleMedico(path);
            ControleMedicamento controle2 = new ControleMedicamento(path);
            ArrayList<Medico> medicos = controle1.lerArquivo("medico.txt");
            ArrayList<Medicamento> medicamentos = controle2.lerArquivo("medicamento.txt");
            TelaReceita tela = new TelaReceita(medicamentos, medicos);
            ControleReceita controle3 = new ControleReceita(path);
            controle3.gravarArquivo(tela);*/
        } else if (r == 7) {
            new TelaListagem();
        } else if (r == 8) {
            new TelaAltera();
        } else if (r == 0) {
            System.exit(0);
        } else {
            new TelaPrincipal();
        }

        new TelaPrincipal();

    }
}

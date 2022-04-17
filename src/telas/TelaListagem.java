package telas;

import controle.ControleConsulta;
import controle.ControleEspecialidade;
import controle.ControleMedicamento;
import controle.ControleMedico;
import controle.ControlePaciente;
import entidade.Consulta;
import entidade.Especialidade;
import entidade.Medicamento;
import entidade.Medico;
import entidade.Paciente;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class TelaListagem {

    private String path;

    public TelaListagem(String path) throws IOException {
        this.path = path;
        Scanner sc = new Scanner(System.in);
        int r = 1;

        System.out.println("*******LISTAGEM******");
        System.out.println("Digite 1 para listar as especialidades");
        System.out.println("Digite 2 para listar os medicos");
        System.out.println("Digite 3 para listar os pacientes");
        System.out.println("Digite 4 para listar os medicamentos");
        System.out.println("Digite 5 para listar os consultas");
        r = Integer.parseInt(sc.nextLine());

        if (r == 1) {
            ArrayList<Especialidade> especialidade = new ArrayList<>();
            ControleEspecialidade controle = new ControleEspecialidade(path);
            especialidade = controle.lerArquivo("especialidade.txt");
            new TelaRelatorioEspecialidade(especialidade);
        } else if (r == 2) {
            ArrayList<Medico> medico = new ArrayList<>();
            ControleMedico controle = new ControleMedico(path);
            medico = controle.lerArquivo("medico.txt");
            new TelaRelatorioMedico(medico);
        } else if (r == 3) {
            ArrayList<Paciente> paciente = new ArrayList<>();
            ControlePaciente controle = new ControlePaciente(path);
            paciente = controle.lerArquivo("paciente.txt");
            new TelaRelatorioPaciente(paciente);
        } else if (r == 4) {
            ArrayList<Medicamento> medicamento = new ArrayList<>();
            ControleMedicamento controle = new ControleMedicamento(path);
            medicamento = controle.lerArquivo("medicamento.txt");
            new TelaRelatorioMedicamento(medicamento);
        } else if (r == 5) {
            ArrayList<Consulta> consulta = new ArrayList<>();
            ControleConsulta controle = new ControleConsulta(path);
            consulta = controle.lerArquivo("consulta.txt");
            new TelaRelatorioConsulta(consulta);
        } else {
            new TelaPrincipal();
        }
        new TelaPrincipal();
    }
}

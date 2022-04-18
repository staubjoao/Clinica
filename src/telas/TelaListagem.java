package telas;

import controle.*;
import entidade.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class TelaListagem {

    public TelaListagem() throws SQLException {
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
            ControleEspecialidade controle = new ControleEspecialidade();
            ArrayList<Especialidade> especialidades = new ArrayList<>();
            especialidades = controle.listar();
            new TelaRelatorioEspecialidade(especialidades);
        } else if (r == 2) {
        } else if (r == 3) {
        } else if (r == 4) {
        } else if (r == 5) {
        } else {
            new TelaPrincipal();
        }
        new TelaPrincipal();
    }
}

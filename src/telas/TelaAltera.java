package telas;

import controle.ControleEspecialidade;
import entidade.Especialidade;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class TelaAltera {

    public TelaAltera() throws SQLException {
        Scanner sc = new Scanner(System.in);
        int r;
        System.out.println("*******ALTERAÇÃO******");
        //System.out.println("Digite 1 para alterar um medico");
        //System.out.println("Digite 2 para alterar um paciente");
        System.out.println("Digite 3 para alterar uma especialidade");
        // System.out.println("Digite 4 para alterar um medicamento");
        // System.out.println("Digite 5 para alterar um consulta");
        // System.out.println("Digite 6 para alterar uma receita");
        r = Integer.parseInt(sc.nextLine());
        if (r == 1) {
        } else if (r == 2) {
        } else if (r == 3) {
            ControleEspecialidade controle = new ControleEspecialidade();
            ArrayList<Especialidade> especialidades = new ArrayList<>();
            especialidades = controle.listar();
            new TelaRelatorioEspecialidade(especialidades);
            System.out.println("Digite o id que deseja alterar");
            int id = Integer.parseInt(sc.nextLine());
            System.out.println("ID: "+id);
            System.out.println("Digite os novo nome da especialidade");
            String nome = sc.nextLine();
            Especialidade espc = new Especialidade(id, nome);
            controle.atualizar(espc);
        } else if (r == 4) {
        } else if (r == 5) {
        } else if (r == 6) {
        }
    }

}

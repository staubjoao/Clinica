package telas;

import controle.ControleItemReceita;
import controle.ControleMedicamento;
import entidade.ItemReceita;
import entidade.Medicamento;
import entidade.Medico;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class TelaReceita {

    private int idReceita;
    private String dataReceita;
    private String dataValidade;
    private ArrayList<ItemReceita> itemReceita = new ArrayList<>();
    private int idMedico;

    public TelaReceita(ArrayList<Medicamento> medicamentos, ArrayList<Medico> medicos) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o id da receita:");
        this.setIdReceita(Integer.parseInt(sc.nextLine()));
        System.out.println("Digite a data da receita:");
        this.setDataReceita(sc.nextLine());
        System.out.println("Digite a data de validade:");
        this.setDataValidade(sc.nextLine());
        int op = 0;
        System.out.println("Cadastro dos medicamentos:");
        while (op != -1) {
            TelaItemReceita tela = new TelaItemReceita(medicamentos);
            ControleItemReceita controle = new ControleItemReceita();
            itemReceita.add(controle.cadastrarItemReceita(tela));
            System.out.println("Digite -1 para parar e qualquer outro numero para continuar:");
            op = Integer.parseInt(sc.nextLine());
        }
        new TelaRelatorioMedico(medicos);
        System.out.println("Digite id do medico:");
        this.setIdMedico(Integer.parseInt(sc.nextLine()));
    }

    public ArrayList<ItemReceita> getItemReceita() {
        return itemReceita;
    }

    public int getIdReceita() {
        return idReceita;
    }

    private void setIdReceita(int idReceita) {
        this.idReceita = idReceita;
    }

    public String getDataReceita() {
        return dataReceita;
    }

    private void setDataReceita(String dataReceita) {
        this.dataReceita = dataReceita;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    private void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    public int getIdMedico() {
        return idMedico;
    }

    private void setIdMedico(int idMedico) {
        this.idMedico = idMedico;
    }

}

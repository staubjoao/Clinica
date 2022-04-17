package telas;

import entidade.Medicamento;
import java.util.ArrayList;
import java.util.Scanner;

public class TelaItemReceita {

    private int idItem;
    private int quantidade;
    private int idMedicamento;

    public TelaItemReceita(ArrayList<Medicamento> medicamentos) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o id do item:");
        this.setIdItem(Integer.parseInt(sc.nextLine()));
        System.out.println("Digite a quantidade:");
        this.setQuantidade(Integer.parseInt(sc.nextLine()));
        new TelaRelatorioMedicamento(medicamentos);
        System.out.println("Digite o id do medicamento:");
        this.setIdMedicamento(Integer.parseInt(sc.nextLine()));
    }

    public int getIdItem() {
        return idItem;
    }

    private void setIdItem(int idItem) {
        this.idItem = idItem;
    }

    public int getQuantidade() {
        return quantidade;
    }

    private void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getIdMedicamento() {
        return idMedicamento;
    }

    private void setIdMedicamento(int idMedicamento) {
        this.idMedicamento = idMedicamento;
    }
}

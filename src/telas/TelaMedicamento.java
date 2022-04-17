package telas;

import java.io.IOException;
import java.util.Scanner;

public class TelaMedicamento {

    private int idItem;
    private String medicamento;

    public TelaMedicamento() throws IOException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o id do medicamento:");
        this.setIdItem(Integer.parseInt(sc.nextLine()));
        System.out.println("Digite o medicamento:");
        this.setMedicamento(sc.nextLine());
    }

    public int getIdItem() {
        return idItem;
    }

    private void setIdItem(int idItem) {
        this.idItem = idItem;
    }

    public String getMedicamento() {
        return medicamento;
    }

    private void setMedicamento(String medicamento) {
        this.medicamento = medicamento;
    }
}

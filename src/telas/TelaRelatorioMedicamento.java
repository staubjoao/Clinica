package telas;

import entidade.Medicamento;
import java.util.ArrayList;

public class TelaRelatorioMedicamento {

    public TelaRelatorioMedicamento(ArrayList<Medicamento> medicam) {
        System.out.println("*******MEDICAMENTOS******");
        medicam.forEach(i -> System.out.println("[" + Integer.toString(i.getIdItem()) + "]" + i.getMedicamento()));
    }

}

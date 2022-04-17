package telas;

import entidade.Paciente;
import java.util.ArrayList;

public class TelaRelatorioPaciente {

    public TelaRelatorioPaciente(ArrayList<Paciente> pac) {
        System.out.println("*******PACIENTE******");
        pac.forEach(i -> System.out.println("[" + i.getIdPaciente() + "]" + i.getCpf() + " " + i.getNome() + " " + i.getEndereco() + " " + i.getTelefone() + " " + i.getAltura() + " " + i.getPeso()));
    }

}

package telas;

import entidade.Consulta;
import java.util.ArrayList;

public class TelaRelatorioConsulta {

    public TelaRelatorioConsulta(ArrayList<Consulta> consul) {
        System.out.println("*******CONSULTAS******");
        consul.forEach(i -> System.out.println("[" + Integer.toString(i.getIdConsulta()) + "]" + i.getData() + " " + i.getHorario() + " " + i.getIdPaciente() + " " + i.getIdMedico() + " " + i.getPrimeiraConsulta()));
    }
}

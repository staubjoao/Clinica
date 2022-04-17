package entidade;

import java.util.ArrayList;
import java.util.Date;

public final class Receita {

    private int idReceita;
    private String dataReceita;
    private String dataValidade;
    private ArrayList<ItemReceita> itemReceita = new ArrayList<>();
    private int idMedico;

    public Receita(int idReceita, String dataReceita, ArrayList<ItemReceita> item, int idMedico, String dataValidade) {
        this.setIdReceita(idReceita);
        this.setDataReceita(dataReceita);
        this.setIdMedico(idMedico);
        this.setDataValidade(dataValidade);
        this.setItemReceita(item);
    }

    public ArrayList<ItemReceita> getItemReceita() {
        return itemReceita;
    }

    private void setItemReceita(ArrayList<ItemReceita> itemReceita) {
        this.itemReceita = itemReceita;
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

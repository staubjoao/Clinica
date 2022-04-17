package entidade;

public class Medicamento {

    private int idItem;
    private String medicamento;

    public Medicamento(int idItem, String medicamento) {
        this.setIdItem(idItem);
        this.setMedicamento(medicamento);
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

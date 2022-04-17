package entidade;

public class ItemReceita {

    private int idItem;
    private int quantidade;
    private int idMedicamento;

    public ItemReceita(int idItem, int quantidade, int idMedicamento) {
        this.setIdItem(idItem);
        this.setQuantidade(quantidade);
        this.setIdMedicamento(idMedicamento);
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

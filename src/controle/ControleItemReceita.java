package controle;

import entidade.ItemReceita;
import telas.TelaItemReceita;

public class ControleItemReceita {

    private ItemReceita itemReceita;

    public ItemReceita cadastrarItemReceita(TelaItemReceita dadoItem) {
        itemReceita = new ItemReceita(dadoItem.getIdItem(), dadoItem.getQuantidade(), dadoItem.getIdMedicamento());
        return itemReceita;
    }

}

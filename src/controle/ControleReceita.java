package controle;

import entidade.ItemReceita;
import entidade.Receita;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import telas.TelaReceita;

public class ControleReceita {

    private Receita receita;
    private File f;
    private FileWriter fw;
    private BufferedWriter bw;
    private FileReader fr;
    private BufferedReader br;
    private String path;

    public ControleReceita(String path) {
        this.path = path;
    }

    private void abrirArquivo(String nome) throws IOException {
        String pathCompleto = path + nome;
        f = new File(pathCompleto);
        if (!f.exists()) {
            f.createNewFile();
        }
    }

    public void gravarArquivo(TelaReceita dadoReceita) throws FileNotFoundException, IOException {
        abrirArquivo("receita.txt");
        fw = new FileWriter(f, true);
        bw = new BufferedWriter(fw);
        receita = new Receita(dadoReceita.getIdReceita(), dadoReceita.getDataReceita(), dadoReceita.getItemReceita(), dadoReceita.getIdMedico(), dadoReceita.getDataValidade());
        String re = receita.getIdReceita() + ", " + receita.getDataReceita() + ", " + receita.getDataValidade() + ", " + receita.getIdMedico();
        bw.write(re);
        ArrayList<ItemReceita> itens = receita.getItemReceita();
        //consul.forEach(i -> System.out.println("[" + Integer.toString(i.getIdConsulta()) + "]" + i.getData() + " " + i.getHorario() + " " + i.getIdPaciente() + " " + i.getIdMedico() + " " + i.getPrimeiraConsulta()));
        bw.newLine();
        re = "";
        for (ItemReceita i : itens) {
            re = i.getIdItem() + ", " + i.getIdMedicamento() + ", " + i.getQuantidade();
            bw.write(re);
            bw.newLine();
            re = "";
        }
        bw.newLine();
        bw.close();
        fecharArquivo();

    }

    public void fecharArquivo() throws IOException {
        if (f.exists()) {
            bw.close();
            fw.close();
        }
    }
}

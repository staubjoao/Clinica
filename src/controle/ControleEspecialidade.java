package controle;

import java.io.*;
import java.util.ArrayList;

import entidade.Especialidade;
import telas.TelaEspecialidade;

public class ControleEspecialidade {

    private Especialidade especialidade;
    private File f;
    private FileWriter fw;
    private BufferedWriter bw;
    private FileReader fr;
    private BufferedReader br;
    private String path;

    public ControleEspecialidade(String path) {
        this.path = path;
    }

    private void abrirArquivo(String nome) throws IOException {

        String pathCompleto = path + nome;
        f = new File(pathCompleto);
        if (!f.exists()) {
            f.createNewFile();
        }
    }

    public void gravarArquivo(TelaEspecialidade dadoEsp) throws FileNotFoundException, IOException {

        abrirArquivo("especialidade.txt");
        fw = new FileWriter(f, true);
        bw = new BufferedWriter(fw);
        especialidade = new Especialidade(dadoEsp.getIdEspecialidade(), dadoEsp.getNome());
        String esp = especialidade.getIdEspecialidade() + ", " + especialidade.getNome();
        bw.write(esp);
        bw.newLine();
        bw.close();
        fecharArquivo();

    }

    public ArrayList lerArquivo(String nomeArq) throws IOException {
        String linha = "";
        abrirArquivo(nomeArq);
        fr = new FileReader(f);
        br = new BufferedReader(fr);
        ArrayList<Especialidade> esps = new ArrayList<>();
        while ((linha = br.readLine()) != null) {
            String[] dados = linha.split(",");
            especialidade = new Especialidade(Integer.parseInt(dados[0]), dados[1]);
            esps.add(especialidade);
        }

        br.close();
        fr.close();
        return esps;
    }

    public void fecharArquivo() throws IOException {
        if (f.exists()) {
            bw.close();
            fw.close();
        }
    }
}

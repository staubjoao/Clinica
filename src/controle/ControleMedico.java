package controle;

import entidade.Especialidade;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

import entidade.Medico;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import telas.TelaMedico;

public class ControleMedico {

    private Medico medico;
    private File f;
    private FileWriter fw;
    private BufferedWriter bw;
    private FileReader fr;
    private BufferedReader br;
    private String path;

    public ControleMedico(String path) {
        this.path = path;
    }

    private void abrirArquivo(String nome) throws IOException {

        String pathCompleto = path + nome;
        f = new File(pathCompleto);
        if (!f.exists()) {
            f.createNewFile();
        }
    }

    public void gravarArquivo(TelaMedico dadoMedico) throws FileNotFoundException, IOException {

        abrirArquivo("medico.txt");
        fw = new FileWriter(f, true);
        bw = new BufferedWriter(fw);
        medico = new Medico(dadoMedico.getIdMedico(), dadoMedico.getNome(), dadoMedico.getCrm(), dadoMedico.getEndereco(),
                dadoMedico.getIdEspecialidade());
        String medi = medico.getIdMedico() + ", " + medico.getNome() + ", " + medico.getCrm() + ", " + medico.getEndereco() + ", "
                + medico.getIdEspecialidade();
        bw.write(medi);
        bw.newLine();
        bw.close();
        fecharArquivo();

    }

    public ArrayList lerArquivo(String nomeArq) throws IOException {
        String linha = "";
        abrirArquivo(nomeArq);
        fr = new FileReader(f);
        br = new BufferedReader(fr);
        ArrayList<Medico> medis = new ArrayList<>();
        while ((linha = br.readLine()) != null) {
            String[] dados = linha.split(", ");
            medico = new Medico(Integer.parseInt(dados[0]), dados[1], dados[2], dados[3], Integer.parseInt(dados[4]));
            medis.add(medico);
        }

        br.close();
        fr.close();
        return medis;
    }

    public void fecharArquivo() throws IOException {
        if (f.exists()) {
            bw.close();
            fw.close();
        }
    }

}

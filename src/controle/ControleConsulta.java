package controle;

import entidade.Consulta;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import telas.TelaConsulta;

public class ControleConsulta {

    private Consulta consulta;
    private File f;
    private FileWriter fw;
    private BufferedWriter bw;
    private FileReader fr;
    private BufferedReader br;
    private String path;

    public ControleConsulta(String path) {
        this.path = path;
    }

    private void abrirArquivo(String nome) throws IOException {

        String pathCompleto = path + nome;
        f = new File(pathCompleto);
        if (!f.exists()) {
            f.createNewFile();
        }
    }

    public void gravarArquivo(TelaConsulta dadoConsulta) throws FileNotFoundException, IOException {

        abrirArquivo("consulta.txt");
        fw = new FileWriter(f, true);
        bw = new BufferedWriter(fw);
        consulta = new Consulta(dadoConsulta.getIdConsulta(), dadoConsulta.getData(), dadoConsulta.getHorario(), dadoConsulta.getPrimeiraConsulta(), dadoConsulta.getIdPaciente(), dadoConsulta.getIdMedico());
        String consul = consulta.getIdConsulta() + ", " + consulta.getData() + ", " + consulta.getHorario() + ", " + consulta.getPrimeiraConsulta() + ", " + consulta.getIdPaciente() + ", " + consulta.getIdMedico();
        bw.write(consul);
        bw.newLine();
        bw.close();
        fecharArquivo();

    }

    public ArrayList lerArquivo(String nomeArq) throws IOException {
        String linha = "";
        abrirArquivo(nomeArq);
        fr = new FileReader(f);
        br = new BufferedReader(fr);
        ArrayList<Consulta> consult = new ArrayList<>();
        while ((linha = br.readLine()) != null) {
            String[] dados = linha.split(", ");
            consulta = new Consulta(Integer.parseInt(dados[0]), dados[1], dados[2], Boolean.parseBoolean(dados[3]), Integer.parseInt(dados[4]), Integer.parseInt(dados[5]));
            consult.add(consulta);
        }

        br.close();
        fr.close();
        return consult;
    }

    public void fecharArquivo() throws IOException {
        if (f.exists()) {
            bw.close();
            fw.close();
        }
    }
}

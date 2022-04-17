package controle;

import entidade.Medico;
import java.io.*;

import entidade.Paciente;
import java.util.ArrayList;
import telas.TelaPaciente;

public class ControlePaciente {

    private Paciente paciente;
    private File f;
    private FileWriter fw;
    private BufferedWriter bw;
    private FileReader fr;
    private BufferedReader br;
    private String path;

    public ControlePaciente(String path) {
        this.path = path;
    }

    private void abrirArquivo(String nome) throws IOException {

        String pathCompleto = path + nome;
        f = new File(pathCompleto);
        if (!f.exists()) {
            f.createNewFile();
        }
    }

    public void gravarArquivo(TelaPaciente dadoPaciente) throws FileNotFoundException, IOException {

        abrirArquivo("paciente.txt");
        fw = new FileWriter(f, true);
        bw = new BufferedWriter(fw);
        paciente = new Paciente(dadoPaciente.getIdPaciente(), dadoPaciente.getNome(), dadoPaciente.getCpf(), dadoPaciente.getEndereco(),
                dadoPaciente.getTelefone(), dadoPaciente.getPeso(), dadoPaciente.getAltura(), dadoPaciente.getIdade());
        String paci = paciente.getIdPaciente() + ", " + paciente.getNome() + ", " + paciente.getCpf() + ", " + paciente.getEndereco() + ", "
                + paciente.getTelefone() + ", " + paciente.getPeso() + ", " + paciente.getAltura() + ", "
                + paciente.getIdade();
        bw.write(paci);
        bw.newLine();
        bw.close();
        fecharArquivo();

    }

    public ArrayList lerArquivo(String nomeArq) throws IOException {
        String linha = "";
        abrirArquivo(nomeArq);
        fr = new FileReader(f);
        br = new BufferedReader(fr);
        ArrayList<Paciente> pacis = new ArrayList<>();
        while ((linha = br.readLine()) != null) {
            String[] dados = linha.split(", ");
            paciente = new Paciente(Integer.parseInt(dados[0]), dados[1], dados[2], dados[3], dados[4], Float.parseFloat(dados[5]), Float.parseFloat(dados[6]), Integer.parseInt(dados[7]));
            pacis.add(paciente);
        }

        br.close();
        fr.close();
        return pacis;
    }

    public void fecharArquivo() throws IOException {
        if (f.exists()) {
            bw.close();
            fw.close();
        }
    }
}

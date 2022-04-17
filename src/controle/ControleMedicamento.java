package controle;

import entidade.Medicamento;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import telas.TelaMedicamento;

public class ControleMedicamento {
    
    private Medicamento medicamento;
    private File f;
    private FileWriter fw;
    private BufferedWriter bw;
    private FileReader fr;
    private BufferedReader br;
    private String path;
    
    public ControleMedicamento(String path) {
        this.path = path;
    }
    
    private void abrirArquivo(String nome) throws IOException {
        
        String pathCompleto = path + nome;
        f = new File(pathCompleto);
        if (!f.exists()) {
            f.createNewFile();
        }
    }
    
    public void gravarArquivo(TelaMedicamento dadoMedicamento) throws FileNotFoundException, IOException {
        
        abrirArquivo("medicamento.txt");
        fw = new FileWriter(f, true);
        bw = new BufferedWriter(fw);
        medicamento = new Medicamento(dadoMedicamento.getIdItem(), dadoMedicamento.getMedicamento());
        String medicam = medicamento.getIdItem()+ ", " + medicamento.getMedicamento();
        bw.write(medicam);
        bw.newLine();
        bw.close();
        fecharArquivo();
        
    }
    
    public ArrayList lerArquivo(String nomeArq) throws IOException {
        String linha = "";
        abrirArquivo(nomeArq);
        fr = new FileReader(f);
        br = new BufferedReader(fr);
        ArrayList<Medicamento> medis = new ArrayList<>();
        while ((linha = br.readLine()) != null) {
            String[] dados = linha.split(", ");
            medicamento = new Medicamento(Integer.parseInt(dados[0]), dados[1]);
            medis.add(medicamento);
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

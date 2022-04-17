package entidade;

public class Medico {

    private int idMedico;
    private String crm;
    private String nome;
    private String endereco;
    private int idEspecialidade;

    public Medico(int idMedico,String crm, String nome, String endereco, int especialidade) {
        this.setIdMedico(idMedico);
        this.setCrm(crm);
        this.setNome(nome);
        this.setEndereco(endereco);
        this.setIdEspecialidade(especialidade);
    }

    public int getIdMedico() {
        return idMedico;
    }

    private void setIdMedico(int idMedico) {
        this.idMedico = idMedico;
    }

    public String getCrm() {
        return crm;
    }

    private void setCrm(String crm) {
        this.crm = crm;
    }

    public String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    private void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getIdEspecialidade() {
        return idEspecialidade;
    }

    private void setIdEspecialidade(int idEspecialidade) {
        this.idEspecialidade = idEspecialidade;
    }

}

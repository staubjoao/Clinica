package entidade;

public class Medico {

    private String crm;
    private String nome;
    private int idEspecialidade;

    public Medico(String crm, String nome, int especialidade) {
        this.setCrm(crm);
        this.setNome(nome);
        this.setIdEspecialidade(especialidade);
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

    public int getIdEspecialidade() {
        return idEspecialidade;
    }

    private void setIdEspecialidade(int idEspecialidade) {
        this.idEspecialidade = idEspecialidade;
    }

}

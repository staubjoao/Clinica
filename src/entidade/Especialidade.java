package entidade;

public class Especialidade {

    private int idEspecialidade;
    private String nome;

    public Especialidade(int idEspecialidade, String nome) {
        this.setIdEspecialidade(idEspecialidade);
        this.setNome(nome);
    }
    
    @Override
    public String toString(){
        return this.nome;
    }

    public int getIdEspecialidade() {
        return idEspecialidade;
    }

    private void setIdEspecialidade(int idEspecialidade) {
        this.idEspecialidade = idEspecialidade;
    }

    public String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

}

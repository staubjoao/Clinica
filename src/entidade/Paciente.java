package entidade;

public class Paciente extends Pessoa {

    private int idPaciente;
    private float peso;
    private float altura;
    private int idade;

    public Paciente(int idPaciente, String nome, String cpf, String endereco, String telefone, float peso, float altura, int idade) {
        this.setIdPaciente(idPaciente);
        this.setNome(nome);
        this.setCpf(cpf);
        this.setEndereco(endereco);
        this.setTelefone(telefone);
        this.setPeso(peso);
        this.setAltura(altura);
        this.setIdade(idade);
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    private void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public float getPeso() {
        return peso;
    }

    private void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    private void setAltura(float altura) {
        this.altura = altura;
    }

    public int getIdade() {
        return idade;
    }

    private void setIdade(int idade) {
        this.idade = idade;
    }

}

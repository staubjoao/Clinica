package entidade;

public class Consulta {

    private int idConsulta;
    private String data;
    private String horario;
    private boolean primeiraConsulta;
    private int idPaciente;
    private int idMedico;

    public Consulta(int idConsulta, String data, String horario, boolean primeiraConsulta, int idPaciente, int idMedico) {
        this.setIdConsulta(idConsulta);
        this.setData(data);
        this.setHorario(horario);
        this.setPrimeiraConsulta(primeiraConsulta);
        this.setIdPaciente(idPaciente);
        this.setIdMedico(idMedico);
    }

    public int getIdConsulta() {
        return idConsulta;
    }

    private void setIdConsulta(int idConsulta) {
        this.idConsulta = idConsulta;
    }

    public String getData() {
        return data;
    }

    private void setData(String data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    private void setHorario(String horario) {
        this.horario = horario;
    }

    public boolean getPrimeiraConsulta() {
        return primeiraConsulta;
    }

    public void setPrimeiraConsulta(boolean primeiraConsulta) {
        this.primeiraConsulta = primeiraConsulta;
    }

    public int getIdMedico() {
        return idMedico;
    }

    private void setIdMedico(int idMedico) {
        this.idMedico = idMedico;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    private void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

}

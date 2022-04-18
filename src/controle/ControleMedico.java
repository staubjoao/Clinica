package controle;

import entidade.Especialidade;
import entidade.Medico;
import factory.MySqlFactory;
import java.sql.*;
import java.util.ArrayList;
import telas.TelaEspecialidade;
import telas.TelaMedico;

public class ControleMedico {

    private MySqlFactory conn;
    private Connection conMedico;

    public ControleMedico() {
        try {
            this.conMedico = DriverManager.getConnection("jdbc:mysql://localhost:3306/aula_poo", "root", "root");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void inserir(TelaMedico med) throws SQLException {
        String sql = "INSERT INTO medico"
                + " (idmedico, crm, nome, endereco, especialidade_idespecialidade)"
                + "VALUES (?, ?, ?, ?, ?)";
        try {
            PreparedStatement stmt = this.conMedico.prepareStatement(sql);
            stmt.setInt(1, med.getIdMedico());
            stmt.setString(2, med.getCrm());
            stmt.setString(3, med.getNome());
            stmt.setString(4, med.getEndereco());
            stmt.setInt(5, med.getIdEspecialidade());
            //executando
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public ArrayList listar() {
        String sql = "SELECT * FROM medico";

        ArrayList<Medico> medicos = new ArrayList<>();
        Medico medico;
        try {
            Statement stmt = this.conMedico.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                int id = rs.getInt("idmedico");
                String crm = rs.getString("crm");
                String nome = rs.getString("nome");
                String endereco = rs.getString("endereco");
                int idespecialidade = rs.getInt("especialidade_idespecialidade");
                medico = new Medico(id, crm, nome, endereco, idespecialidade);
                medicos.add(medico);
            }
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return medicos;
    }

    public void atualizar() {

    }

    public void excluir() {

    }

}

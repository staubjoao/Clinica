package DAO;

import entidade.Medico;
import factory.MySqlFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MedicoDAO {

    private MySqlFactory conn;

    public MedicoDAO() {
        conn = new MySqlFactory();
    }

    public void inserir(Medico med) {
        String sql = "INSERT INTO medico"
                + " (crm, "
                + "nomeMedico, "
                + "idEspecialidade)"
                + "VALUES (?, ?, ?)";
        Connection conMedico = conn.getConnection();
        try {
            PreparedStatement stmt = conMedico.prepareStatement(sql);
            stmt.setString(1, med.getCrm());
            stmt.setString(2, med.getNome());
            stmt.setInt(3, med.getIdEspecialidade());
            //executando
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

package controle;

import java.io.*;
import java.util.ArrayList;

import entidade.Especialidade;
import factory.MySqlFactory;
import java.sql.*;

public class ControleEspecialidade {

    private MySqlFactory conn;

    public ControleEspecialidade() {
        conn = new MySqlFactory();
    }

    public void inserir(int id, String especialidade) throws SQLException {
        String sql = "INSERT INTO especialidade"
                + " (idEspecialidade, "
                + "nomeEspecialidade)"
                + "VALUES (?, ?)";
        Connection conEspecialidade = conn.getConnection();
        try {
            PreparedStatement stmt = conEspecialidade.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.setString(2, especialidade);
            //executando
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public ArrayList listar() {
        String sql = "SELECT "
                + "idEspecialidade, "
                + "nomeEspecialidade "
                + "FROM especialidade";

        Connection conEspecialidade = conn.getConnection();
        ArrayList<Especialidade> especialidades = new ArrayList<>();
        Especialidade especialidade;
        try {
            Statement stmt = conEspecialidade.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                especialidade = new Especialidade(rs.getInt(1), rs.getString(2));
                especialidades.add(especialidade);
            }
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return especialidades;
    }

    public void atualizar(Especialidade especialidade) {
        String sql = "UPDATE especialidade\n"
                + "SET nome = ?\n"
                + "WHERE idespecialidade = ?;";
        System.out.println(especialidade.getNome() + especialidade.getIdEspecialidade());

        Connection conEspecialidade = conn.getConnection();
        try {
            PreparedStatement stmt = conEspecialidade.prepareStatement(sql);
            stmt.setString(1, especialidade.getNome());
            stmt.setInt(2, especialidade.getIdEspecialidade());
            //executando
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void excluir() {

    }
}

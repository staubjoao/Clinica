package controle;

import java.io.*;
import java.util.ArrayList;

import entidade.Especialidade;
import factory.MySqlFactory;
import java.sql.*;
import telas.TelaEspecialidade;

public class ControleEspecialidade {

    private MySqlFactory conn;
    private Connection conEspecialidade;

    public ControleEspecialidade() {
        try {
            this.conEspecialidade = DriverManager.getConnection("jdbc:mysql://localhost:3306/aula_poo", "root", "root");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void inserir(TelaEspecialidade especialidades) throws SQLException {
        String sql = "INSERT INTO especialidade"
                + " (idespecialidade, nome)"
                + "VALUES (?, ?)";
        try {
            PreparedStatement stmt = this.conEspecialidade.prepareStatement(sql);
            stmt.setInt(1, especialidades.getIdEspecialidade());
            stmt.setString(2, especialidades.getNome());
            //executando
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public ArrayList listar() {
        String sql = "SELECT * FROM especialidade";

        ArrayList<Especialidade> especialidades = new ArrayList<>();
        Especialidade especialidade;
        try {
            Statement stmt = this.conEspecialidade.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                int id = rs.getInt("idespecialidade");
                String nome = rs.getString("nome");
                especialidade = new Especialidade(id, nome);
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
        System.out.println(especialidade.getNome()+ especialidade.getIdEspecialidade());
        
        try {
            PreparedStatement stmt = this.conEspecialidade.prepareStatement(sql);
            stmt.setString(1, especialidade.getNome());
            stmt.setInt(2, especialidade.getIdEspecialidade());
            //executando
            stmt.execute();
            stmt.close();
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }

    public void excluir() {

    }
}

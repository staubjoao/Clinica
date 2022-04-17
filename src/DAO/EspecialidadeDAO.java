package DAO;

import factory.MySqlFactory;
import java.sql.*;
import telas.TelaEspecialidade;

public class EspecialidadeDAO {

    private MySqlFactory conn;

    public void inserir(TelaEspecialidade especialidades) throws SQLException {
        String sql = "INSERT INTO especialidade"
                + " (id_especialidade, nome)"
                + "VALUES (?, ?)";
        Connection conEspecialidade;
        try {
            conEspecialidade = DriverManager.getConnection("jdbc:mysql://localhost:3306/aula_poo", "root", "root");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        try {
            PreparedStatement stmt = conEspecialidade.prepareStatement(sql);
            stmt.setInt(1, especialidades.getIdEspecialidade());
            stmt.setString(2, especialidades.getNome());
            //executando
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

     public void listar(){
        String sql = "SELECT * FROM especialidade";
        Connection conEspecialidade;
        try {
            conEspecialidade = DriverManager.getConnection("jdbc:mysql://localhost:3306/aula_poo", "root", "root");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        try {
            Statement stmt = conEspecialidade.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            
            while(rs.next())
            {
                int id = rs.getInt("id_especialidade");
                String nome = rs.getString("nome");
                System.out.format("%s %s\n", id, nome);
            }
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
     }
             
    
    public void atualizar() {

    }

    public void excluir() {

    }
}

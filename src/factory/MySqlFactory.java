package factory;

import java.sql.*;

public class MySqlFactory implements ConnectionFactory {

    @Override
    public Connection getConnection() {
        String bd = "aula_poo";
        String url = "jdbc:mysql://localhost:3306/" + bd;
        String user = "root";
        String psw = "root";
        try {
            return DriverManager.getConnection(url, user, psw);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

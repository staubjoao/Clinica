package factory;

import java.sql.*;

public class MySqlFactory implements ConnectionFactory {
    
    /**
     *
     * @return
     */
    @Override
    public Connection getConnection(){
        Connection con = null;
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/aula_poo","root","root");
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
        return con;
    }
}

package factory;

import java.sql.Connection;

public interface ConnectionFactory {

    /**
     *
     * @return
     */
    public Connection getConnection();
}

package br.com.ideao.jdbc;

import br.com.ideao.jdbc.connection.BasicConnectionPool;
import br.com.ideao.jdbc.connection.ConnectionPool;

import java.sql.SQLException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SQLException {
        ConnectionPool connectionPool = BasicConnectionPool.create("jdbc:mysql://localhost/test",
                "root", "password");
        System.out.println(connectionPool.getConnection().isValid(1));
    }
}

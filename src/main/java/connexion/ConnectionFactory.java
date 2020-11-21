/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connexion;

import static connexion.Properties.addresselocal;
import static connexion.Properties.motdepasslocal;
import static connexion.Properties.port;
import static connexion.Properties.userlocal;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.postgresql.ds.PGSimpleDataSource;

/**
 * @document ConnectionFactory
 * @date 2 mai 2018, 11:26:10
 * @author Njinga TCHAPTCHET
 */
public class ConnectionFactory {

    private PGSimpleDataSource source;
    private boolean sourceSet = false;
    private Connection connection = null;
    public static String basedonne = "pelearning";

    private ConnectionFactory() {
        try {
            Class.forName("org.postgresql.Driver");
            source = new PGSimpleDataSource();
            setSource();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static ConnectionFactory getInstance() {
        return ConnectionFactoryHolder.INSTANCE;
    }

    private static class ConnectionFactoryHolder {

        private static final ConnectionFactory INSTANCE = new ConnectionFactory();
    }

    private void setSource() {
        this.source.setServerName(addresselocal);
        this.source.setDatabaseName(basedonne);
        this.source.setUser(userlocal);
        this.source.setPassword(motdepasslocal);
        this.source.setPortNumber(port);
//        this.source.setMaxConnections(20);
        this.sourceSet = true;

    }
//    private void setSource() {
//        this.source.setServerName("10.0.0.1");
//        this.source.setDatabaseName("taxation_TIC");
//        this.source.setUser("postgres");
//        this.source.setPassword("avompetit1985");
//        this.source.setPortNumber(5432);
////        this.source.setMaxConnections(20);
//        this.sourceSet = true;
//    }

    public Connection getConnection() throws SQLException {
        if (!this.sourceSet) {
            setSource();
        }
        if (connection == null) {
            connection = source.getConnection();
        }
        return connection;
    }

    public void delConnection() throws SQLException {
        connection = null;
        this.sourceSet = false;

    }

}

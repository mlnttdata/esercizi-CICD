package org.example;

import com.mysql.cj.jdbc.MysqlDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EsempioDatabase {

    private Connection con;
    public static void main(String[] args) {

        EsempioDatabase d = new EsempioDatabase();

        try {


            System.out.println("Prova Connessione:");
            System.out.println(d.startConnection().isValid(100));
            System.out.println(d.startConnection().isClosed());

            d.esempioSelect();



        }catch (SQLException e) {
            System.out.println("Siamo nel catch, c'è un errore di connessione");
            e.printStackTrace();
        }


    }

    public Connection startConnection() throws SQLException {
        if (con==null) {
            MysqlDataSource dataSource = new MysqlDataSource();
            dataSource.setServerName("127.0.0.1");
            dataSource.setPortNumber(3306);
            dataSource.setUser("root");
            dataSource.setPassword("1234");
            dataSource.setDatabaseName("campionati");

            con = dataSource.getConnection();
        }
        return con;


    }




    public void esempioSelect() throws SQLException {
    /*Questa riga andrà a restituire l'elenco dei clienti*/

    String sql = "SELECT * FROM partita WHERE (1<(Punti_squadra_1 + Punti_squadra_2)<4)";

    //Passiamo la query in ingresso

    PreparedStatement statement = startConnection().prepareStatement(sql);
    statement.executeQuery();
    ResultSet rs = ((PreparedStatement) statement).executeQuery();

    while (rs.next()) {
        System.out.println("idPartita: "+rs.getInt(1));
        System.out.println("----------");
        System.out.println("Data: "+rs.getString(2));
        System.out.println("ID_squadra_1: "+rs.getString(3));
        System.out.println("ID_squadra_2: "+rs.getString(4));
        System.out.println("Punti_Squadra1: "+rs.getString(5));
        System.out.println("Punti_Squadra2 "+rs.getString(6));
        System.out.println("----------");


    }
}
}
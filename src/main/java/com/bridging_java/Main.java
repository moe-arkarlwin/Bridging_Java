package com.bridging_java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

    private String ipaddress = "db";
    private int port = 3306;
    private String username = "root";
    private String password = "root";
    private String dbname = "sample_db";

    private Connection conn;

    public void db_Connection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            conn = DriverManager.getConnection("jdbc:mysql://" + ipaddress + ":" + port + "/" + dbname +
                    "?useSSL=false&allowPublicKeyRetrieval=true", username, password);

            System.out.println("Connected to database successfully");
        }
        catch (ClassNotFoundException ce) {
            ce.printStackTrace();
        }
        catch (SQLException se) {
            se.printStackTrace();
        }
    }

    static void main() {
        Main m = new Main();
        m.db_Connection();
    }
}

package pl.pizza;

import java.sql.*;

public class Connect {
    public static void main( String args[] ) {
        Connection c = null;
        Statement stmt = null;

        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:test.db");
            c.setAutoCommit(false);
            System.out.println("Opened database successfully");

            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery( "SELECT * FROM Dishes;" );

            while ( rs.next() ) {
                int id = rs.getInt("id");
                double  price = rs.getDouble("price");
                String name  = rs.getString("name");

                System.out.println( "ID = " + id );
                System.out.println( "PRICE = " + price );
                System.out.println( "NAME = " + name );
                System.out.println();
            }

            rs.close();
            stmt.close();
            c.close();
        } catch ( Exception e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }
        System.out.println("Operation done successfully");
    }

}
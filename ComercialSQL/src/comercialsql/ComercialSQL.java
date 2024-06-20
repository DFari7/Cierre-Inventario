package comercialsql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ComercialSQL {
    
    Connection con;
    //String ur = "jdbc:mysql://localhost/comercial?useSSL=false&serverTimezone=UTC";
    String ur = "jdbc:mysql://localhost:3306/comercial2";
    String uss="root";
    String pas="root1234";
        
    public Connection establecerConection(){
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(ur,uss,pas);
            //System.out.println("Conexión exitosa");
           // con.close();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error al conectarse a la BD "+e);
        }
        return con;
    }
    public static void main(String[] args) {
        ComercialSQL db = new ComercialSQL();
        db.establecerConection();
    } 
}
    

/*   Author: Griselda Medina Avendaño
    Creado : 8 mar 2022
    Actualización: 
    Descripción:
*/

package db;



import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
import java.sql.Statement;

public class Conexion {
    private final String pass; // = "administrador";
    private final String user;// = "administrador";
    private final String url; //= "localhost";
    private final String nombrebd;
    private  Connection con = null;

    public Conexion(String user, String pass,String url, String nombrebd ) {
        this.user= user;
        this.pass= pass;
        this.url= url;
        this.nombrebd= nombrebd;
    }
    
    public void Conectar(){
        try {
            Class.forName("org.postgresql.Driver");
            this.con = DriverManager.getConnection("jdbc:postgresql://" + url + "/" + nombrebd, user, pass);
            System.out.println("conexion establecida");
        } catch (Exception ex) {
            System.out.println("Error al conectar:" + ex.getMessage());
        }
    }
    
    public void Desconectar(){
         try {
            con.close();
            con=null;
            System.out.println("conexion finalizada");
        } catch (Exception ex) {
            System.out.println("Error" + ex.getMessage());
        }
        
    }
    
    
   public Connection getConnection() { 
        return this.con;
    }

    @Override
    public String toString() {
        return "Conexion{" + "pass=" + pass + ", user=" + user + ", url=" + url + ", con=" + con + '}';
    }
     
    
//    public void ejecutaUpdate(String sql) {
//        try {
//            
//            Statement st = getConnection().createStatement();
//            st.executeUpdate(sql);
//            System.out.println("operación exitosa");
//            
//        } catch (Exception ex) {
//            System.out.println("Error ejecutaQuery:" + ex.getMessage());
//    
//        }
//    }
    
//    public ResultSet ejecutaQuery(String sql) {
//        ResultSet rs = null;
//        try {
//            
//            java.sql.Statement st = getConnection().createStatement();
//            rs = st.executeQuery(sql);
//            System.out.println("operación exitosa");
//            
//        } catch (Exception ex) {
//            System.out.println("Error:" + ex.getMessage());
//        }
//        return rs;
//    }
    
    
    
    
    public static void main(String args[]){
       Conexion c=new Conexion("postgres","medinagris","localhost","clothing");
        System.out.println("Datos: "+ c.toString());
        c.Conectar();
//        c.ejecutaUpdate("insert into producto values('8', 'Pantalon', 'mezclilla"
//                + "', 152.5, 10 );");
        c.Desconectar();
       
    }
    
} 
    
 

   



    
    
    

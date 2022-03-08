/*   Author: Griselda Medina Avendaño
    Creado : 8 mar 2022
    Actualización: 
    Descripción:
*/

package db;

import jakarta.jms.Connection;


public class Conexion {
    private final Connection connection;
    private final String url;
    private final String user;
    private final String pwd;

    
    public Conexion(Connection connection, String url, String user, String pwd) {
        this.connection = connection;
        this.url = url;
        this.user = user;
        this.pwd = pwd;
    }
    
    public void Conectar(){
        
    }
    
    public void Desconectar(){
        
    }
    
   
    public Connection getConnection() {
        return connection;
    }

    public static void main(String args[]){
       
       
    }
    
    
    
}

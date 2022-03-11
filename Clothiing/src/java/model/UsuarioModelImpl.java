
package model;

import db.Conexion;
import entity.Usuario;
import jakarta.jms.Connection;
import java.util.List;
import java.sql.*;
/*   Author     : Griselda Medina Avendaño
    Creado : 7 mar 2022
    Actualización: 
    Descripción:
*/
public class UsuarioModelImpl implements IUsuarioModel{

    private Conexion conexion;
    private Connection connection;
    
    
    
           
    @Override
    public void crearRegistro(Usuario usuario) {
        try{
            conexion= new Conexion();
            conexion.Conectar();
            connection= (Connection) conexion.getConnection();
            String sql= "insert into....";
            
            
            
        }catch(SQLException c){
            
        }
    }

    @Override
    public void ActualizarRegistro(Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void EliminarRegistro(int idUsuario) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Usuario> obtenerRegistros() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void ObtenerRegistro(int idUsuario) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

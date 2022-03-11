
package model;

import entity.Usuario;
import java.util.List;


public interface IUsuarioModel {
    public void crearRegistro(Usuario usuario);
    
    public void ActualizarRegistro(Usuario usuario);
    
    public void EliminarRegistro(int idUsuario);
    
    public List<Usuario> obtenerRegistros();
    
    public void ObtenerRegistro(int idUsuario);
    
    
}

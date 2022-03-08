/*   Author     : Griselda Medina Avendaño
    Creado : 7 mar 2022
    Actualización: 
    Descripción:
*/
package entity;

import java.util.ArrayList;
import java.util.List;

/*   Author     : Griselda Medina Avendaño
    Creado : 7 mar 2022
    Actualización: 
    Descripción:
*/
public class Usuario extends Persona{
    private String contraseña;
    private String codigo;
    private String nombreUsuario;

    public Usuario() {
    }

    public Usuario(String contraseña, String nombreUsuario) {
        this.contraseña = contraseña;
        this.nombreUsuario = nombreUsuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }


     public static void main(String args[]){
       Usuario a= new Usuario("1234", "Mari" );
       a.setEdad(15);
       a.setNombre("Mariana");
       
       Usuario b= new Usuario("5678", "Karlita" );
       b.setEdad(20);
       b.setNombre("Karla");
       
       Usuario c= new Usuario("9632", "Jonh");
       c.setEdad(17);
       c.setNombre("Jonathan");
      
       List <Usuario> listaUsuarios =new ArrayList <Usuario>();
       listaUsuarios.add(a);
       listaUsuarios.add(b);
       listaUsuarios.add(c);
 
         for (Usuario i:  listaUsuarios ){
             System.out.println("Usuario: "+i.getNombre());
             System.out.println("Edad: "+i.getEdad()+" años");
             System.out.println("Nombre usuario:"+i.getNombreUsuario());
             System.out.println("Contraseña:"+i.getContraseña()+"\n\n");  
         }
    }
}

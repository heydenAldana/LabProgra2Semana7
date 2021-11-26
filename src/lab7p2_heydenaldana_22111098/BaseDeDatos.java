/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7p2_heydenaldana_22111098;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author heyde
 */
public class BaseDeDatos 
{
    // guardar la lista de lo que sea que vaya aqui
    private ArrayList<userAdmin> user = new ArrayList<userAdmin>();
    private ArrayList<Comprador> comp = new ArrayList<Comprador>();
    private ArrayList<Accesorio> accesorio = new ArrayList<Accesorio>();

    // ------------- AQUI VA ADMIN ------------------- //
    
    // AGREGAR UN NUEVO USUARIO
    public void agregarUsuario(String tipo, String usuario, String password, int edad)
    {
        // Evalua si existe entre ADMINISTRAORES
        for (int i = 0; i < user.size(); i++) 
        {
            if(user.get(i).getUsuario().equals(usuario))
            {
                JOptionPane.showMessageDialog(null, "Este usuario ya existe mi estimado");
                return;
            }
        }
        // EVALUA SI EXISTE ENTRE compradores
        for (int i = 0; i < comp.size(); i++) 
        {
            if(comp.get(i).getUsuario().equals(usuario))
            {
                JOptionPane.showMessageDialog(null, "Este usuario ya existe mi estimado");
                return;
            }
        }
        
        // agrega al user pasada la prueba
        if(tipo.equalsIgnoreCase("administrador"))
            user.add(new userAdmin(usuario, password, edad));
        else if(tipo.equalsIgnoreCase("comprador"))
            comp.add(new Comprador(usuario, password, edad));
    }
    
    
    // AGREGAR UN ACCESORIO
    public void agregarAccesorio(String nombre, double precio, int cantidad)
    {
        for (int i = 0; i < accesorio.size(); i++) 
        {
            if(accesorio.get(i).getNombre().equals(nombre))
            {
                JOptionPane.showMessageDialog(null, "No se pudo agreagr.\n ¿Escribio bien los datos?");
                return;
            }
        }
        
        accesorio.add(new Accesorio(nombre, precio, cantidad));
        
    }
    
    
    // EDITAR UN ACCESORIO
    public void editarAccesorio(String nombre, double precio, int cantidad)
    {
        for (int i = 0; i < accesorio.size(); i++) 
        {
            if(accesorio.get(i).getNombre().equals(nombre))
            {
                accesorio.get(i).setNombre(nombre);
                accesorio.get(i).setPrecio(precio);
                accesorio.get(i).setCantidad(cantidad);
                return;
            }
        }
        
        // no se pudo agregar
        JOptionPane.showMessageDialog(null, "No se pudo agreagr.\n ¿Escribio bien los datos?");
    }
    
    
    // ELIMINAR UN ACCESORIO
    public void eliminarAccesorio(String id)
    {
        for (int i = 0; i < accesorio.size(); i++) 
        {
            if(accesorio.get(i).getId().equals(id))
            {
                accesorio.remove(i);
                return;
            }
        }
        
        // no se pudo agregar
        JOptionPane.showMessageDialog(null, "No se pudo eliminar");
    }
}

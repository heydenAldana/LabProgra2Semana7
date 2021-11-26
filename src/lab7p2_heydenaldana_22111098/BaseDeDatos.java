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
    private ArrayList factura = new ArrayList();
    // ------------- AQUI VA ADMIN ------------------- //
    
    public void agregarUsuario(String tipo, String usuario, String password, int edad)
    {
        for (int i = 0; i < user.size(); i++) 
        {
            if(user.get(i).equals(usuario))
            {
                JOptionPane.showMessageDialog(null, "Este usuario ya existe mi estimado");
                return;
            }
        }
        
        // agrega al user pasada la prueba
        
    }
    
    
    
    
    
    
    
    
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7p2_heydenaldana_22111098;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author heyde
 */
public class Comprador extends userAdmin
{
    private double dinero;
    private  ArrayList<Accesorio> acc;
    
    private Random rand;
    
    
    public Comprador(String usuario, String password, int edad)
    {
        super(usuario, password, edad);
        this.dinero = generarDinero();
        this.acc = new ArrayList<Accesorio>();
    } 
    
    // generar dinero automaticamente
    private double generarDinero()
    {
        rand = new Random();
        double cash = rand.nextInt(6999) + 1000;
        
        return cash;
    }
    
    // get y set

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

    public Random getRand() {
        return rand;
    }

    public void setRand(Random rand) {
        this.rand = rand;
    }
    
    // ya que vos manejas compradores te 
    // dejo aqui por si te toca agregar algo aqui
    
    
    
    
    
}

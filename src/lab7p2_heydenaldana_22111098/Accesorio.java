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
public class Accesorio 
{
    private String id, nombre;
    private double precio;
    private int cantidad;

    private Random rand;
    
    
    public Accesorio(String nombre, double precio, int cantidad) 
    {
        // genera el id
        this.id = generarId();
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }
    
    // funcion privada para generar un ID UNICO.
    private String generarId()
    {
        rand = new Random();
        int numeralinicial = rand.nextInt(8);
        int idnumeros = rand.nextInt(9999) + 1000;
        
        String IDaccesorio = String.valueOf(numeralinicial) + String.valueOf(idnumeros);
        
        return IDaccesorio;
    }
    
    // get y sey

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
}

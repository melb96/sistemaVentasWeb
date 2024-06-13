/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemaventasweb.clases;
import java.io.Serializable;

/**
 *
 * @author melb
 */
public class Disco implements Serializable{
    
    private String nombre;
    private String interprete;
    private String genero;
    private double precio;
    
    private static final long serialVersionUID = 1L; // Número de versión para la serialización
    
    //Constructor

    public Disco(String nombre, String interprete, String genero, double precio) {
        this.nombre = nombre;
        this.interprete = interprete;
        this.genero = genero;
        this.precio = precio;
    }
    
    //Getters and Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getInterprete() {
        return interprete;
    }

    public void setInterprete(String interprete) {
        this.interprete = interprete;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
}

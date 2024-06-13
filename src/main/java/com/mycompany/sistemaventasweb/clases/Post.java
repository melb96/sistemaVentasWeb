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
public class Post implements Serializable{
    
    String titulo;
    String autor;
    String discoPost;
    String contenido;

    public Post(String titulo, String autor, String discoPost, String contenido) {
        this.titulo = titulo;
        this.autor = autor;
        this.discoPost = discoPost;
        this.contenido = contenido;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getDiscoPost() {
        return discoPost;
    }

    public void setDiscoPost(String discoPost) {
        this.discoPost = discoPost;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
    
    
    
    
}

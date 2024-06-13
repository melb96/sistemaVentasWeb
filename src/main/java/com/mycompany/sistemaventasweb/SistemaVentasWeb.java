/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistemaventasweb;

import com.mycompany.sistemaventasweb.clases.Usuario;
import com.mycompany.sistemaventasweb.gui.GUILogIn;

/**
 *
 * @author melb
 */
public class SistemaVentasWeb {

    public static void main(String[] args) {

        GUILogIn iLogIn = new GUILogIn();
        iLogIn.setVisible(true);
        
}
    
   public Usuario adminUsuario(){
            
       return new Usuario("admin", "admin@email.com", "admin", "administrador");

    }
   
   public Usuario normalUsuario(){
       
       return new Usuario("user", "user@email.com", "password", "usuario");
       
   }
    
}

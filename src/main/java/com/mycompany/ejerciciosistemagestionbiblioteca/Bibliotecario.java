
package com.mycompany.ejerciciosistemagestionbiblioteca;

public class Bibliotecario extends Usuario {
    private String turno;
    
    public Bibliotecario(String nombre, int idUsuario, String correoElectronico, String turno){
    super(nombre, idUsuario, correoElectronico);
    this.turno = turno;
    }
    
     @Override
     public void mostrarInformacion(){
     super.mostrarInformacion();
         System.out.println("Turno " + turno);
     }
    
}
   
    
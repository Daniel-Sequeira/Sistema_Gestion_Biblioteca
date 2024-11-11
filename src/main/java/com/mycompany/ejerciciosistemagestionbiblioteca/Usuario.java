package com.mycompany.ejerciciosistemagestionbiblioteca;

public class Usuario {
    private String nombre;
    private int  idUsuario;
    private String correoElectronico;
    
    public Usuario(String nombre, int idUsuario, String correoElectronico){
        this.nombre = nombre;
        this.idUsuario= idUsuario;
        this.correoElectronico = correoElectronico;
    }
    
   public void mostrarInformacion(){
       System.out.println("Nombre: "+nombre);
       System.out.println("Id Usuario: " + idUsuario);
       System.out.println("Correo Electronico: " + correoElectronico);
   }
}

package com.mycompany.ejerciciosistemagestionbiblioteca;

/**
 *
 * @author danie
 */
public class Estudiante extends Usuario{
    private String grado;
    
    public Estudiante (String nombre , int idUsuario , String correoElectronico, String grado){
      super(nombre , idUsuario , correoElectronico);
            this.grado = grado;
    }
    
    @Override
    public void mostrarInformacion(){
    super.mostrarInformacion();
        System.out.println("Grado: " + grado);
    }
    
}


package com.mycompany.ejerciciosistemagestionbiblioteca;

public class Profesor extends Usuario {
    private String departamento;
    
    public Profesor(String nombre , int idUsuario, String correoElectronico, String departamento){
    super(nombre , idUsuario , correoElectronico);
    this.departamento = departamento;
    }
    
    @Override
    public void mostrarInformacion(){
      super.mostrarInformacion();
        System.out.println("Departamento: " + departamento);
    }
    
}

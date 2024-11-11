
package com.mycompany.ejerciciosistemagestionbiblioteca;

public class EjercicioSistemaGestionBiblioteca {

    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Juan Perez", 101, "juan,perez@example.com", "Segundo");
        Profesor profesor = new Profesor("Ana Garcia", 102, "ana.garcia@example.com", "Matematicas" );
        Bibliotecario bibliotecario = new Bibliotecario("Carlos Lopez", 103, "carlos.lopez@example.com", "Diurno");
        
        System.out.println("Informacion del Estudiante: ");
        estudiante.mostrarInformacion();
        System.out.println();
        
        System.out.println("Informacion del Profesor: ");
        profesor.mostrarInformacion();
        System.out.println();
        
        System.out.println("Informacion del Bibliotecario: ");
        bibliotecario.mostrarInformacion();
        
    }
}

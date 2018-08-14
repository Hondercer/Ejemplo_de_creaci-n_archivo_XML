/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author jhon.acevedo
 */
public class Estudiante extends Persona{
    
    private String codigo;
    private String carrera;

    public Estudiante(String codigo, String carrera, String nombre, String telefono, String correo) {
        super(nombre, telefono, correo);
        this.codigo = codigo;
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return "Estudiante" + super.toString() + "codigo=" + codigo + ", carrera=" + carrera + '}';
    }
    
    
    
}

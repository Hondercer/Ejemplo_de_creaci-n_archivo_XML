/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;

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

    public Estudiante(){
        
    }
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    

    @Override
    public String toString() {
        return "Estudiante" + super.toString() + "codigo=" + codigo + ", carrera=" + carrera + '}';
    }

    public boolean crearArchivoXML(LinkedList<Estudiante> listaE) {
        boolean g = false;
        try {
            Element universidad = new Element("universidad");
            Document doc = new Document(universidad);
            
            for(int i = 0; i < listaE.size(); i++){
            Element estudiante = new Element("estudiante");
            estudiante.addContent(new Element("nombre").setText(
                    listaE.get(i).getNombre()));
            estudiante.addContent(new Element("telefono").setText(
                    listaE.get(i).getTelefono()));
            estudiante.addContent(new Element("correo").setText(
                    listaE.get(i).getCorreo()));
            estudiante.addContent(new Element("codigo").setText(
                    listaE.get(i).getCodigo()));
            estudiante.addContent(new Element("carrera").setText(
                    listaE.get(i).getCarrera()));
            
            doc.getRootElement().addContent(estudiante);
            }
            XMLOutputter xmlOutPut = new XMLOutputter();
            xmlOutPut.setFormat(Format.getPrettyFormat());
            xmlOutPut.output(doc, new FileWriter("universidad.xml"));
            g = true;
            System.out.println("Archivo grabado");
        }catch(IOException io){
            System.out.println(io.getMessage());
            g = false;
        }
        
        return g;
    }
    
    
    
}

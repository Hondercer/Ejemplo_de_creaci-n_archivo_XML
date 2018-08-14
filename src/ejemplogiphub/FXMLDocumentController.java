/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplogiphub;

import Modelo.Estudiante;
import java.net.URL;
import java.util.LinkedList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author jhon.acevedo
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private Label label1;
    @FXML
    private Label label2;
    @FXML
    private Label label3;
    @FXML
    private Label label4;
    @FXML
    private Label label5;
    @FXML
    private TextField tCodigo;
    @FXML
    private TextField tCarrera;
    @FXML
    private TextField tNombre;
    @FXML
    private TextField tTelefono;
    @FXML
    private TextField tCorreo;
    @FXML
    LinkedList<Estudiante> listaE;
    
    @FXML
    private void agregarEstudiante(ActionEvent event) {
        String codigo = tCodigo.getText();
        String carrera = tCarrera.getText();
        String nombre = tNombre.getText();
        String telefono = tTelefono.getText();
        String correo = tCorreo.getText();
        
        Estudiante objE = new Estudiante(codigo,carrera,nombre,telefono,correo);
        listaE.add(objE);
        
    }
    
    @FXML
    private void GuardarXML(ActionEvent event) {
        Estudiante objV = new Estudiante();
        boolean guardar = objV.crearArchivoXML(listaE);
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        listaE = new LinkedList<>();
    }    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author s1290
 */
public class LoginControlador implements Initializable {

    @FXML
    private Button btnIniciarSesion;
    @FXML
    private TextField textFieldCorreoElec;
    @FXML
    private PasswordField fieldContra;
    @FXML
    private Button btnMenu;
    @FXML
    private Button btnCrearCuenta;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void showIniciarSesion(ActionEvent event) throws IOException {

        try {
            String user = textFieldCorreoElec.getText();
            String contra = fieldContra.getText();

           
            String url = "select username,contraseña,rol from tableusuarios where username = '" + user + "'";

            Connection conexion = BaseDeDatosConector.obtenerConexion();

            PreparedStatement ps = conexion.prepareStatement(url);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                //si existe el usuario
                String usuario = rs.getString("username");
                String contraseña =rs.getString("contraseña");
                String rol = rs.getString("rol");
       
                
                if(contra.equals(contraseña)){
                    
                    if(rol.equals("usuario")){
        
                    }else if(rol.equals("admin")){
                         FXMLLoader loader = new FXMLLoader(getClass().getResource("/vista/BienvenidaAdministradorVista.fxml"));
                Parent root = loader.load();
                BienvenidaAdministradorControlador controlador = loader.getController();

                Scene scene = new Scene(root);
                Stage stage = new Stage();
                stage.setScene(scene);
                stage.show();

                Stage myStage = (Stage) this.btnIniciarSesion.getScene().getWindow();
                myStage.close();
        }
                
                }else{
                 JOptionPane.showMessageDialog(null,"Contraseña incorrecta ");
                }
                
            }else {
                //el usuario no existe
                
                JOptionPane.showMessageDialog(null,"El usuario no existe");
            }
            
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        
    }

    @FXML
    private void showCorreoElec(ActionEvent event) {
    }

    @FXML
    private void showFieldContra(ActionEvent event) {
    }

    @FXML
       private void eventKey(KeyEvent event) {
        Object evento = event.getSource();
        
        if(evento.equals(textFieldCorreoElec)){
            
            if(event.getCharacter().equals(" ")){
                event.consume();
            }
        
        } else if(evento.equals(fieldContra)){
            if(event.getCharacter().equals(" ")){
                event.consume();
            }
        }
    }

    @FXML
    private void showIniciarSesion(MouseEvent event) {
       
        
    }

    @FXML
    private void showBienvenida(ActionEvent event) {
         try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/vista/BienvenidaVista.fxml"));
            
            Parent root = loader.load();
            
            BienvenidaControlador controlador = loader.getController();
            
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            
            
            stage.setScene(scene);
            stage.show();
            
           
            
            Stage myStage = (Stage) this.btnMenu.getScene() .getWindow();
            myStage.close();
            
        } catch (IOException ex) {
            Logger.getLogger(BienvenidaControlador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void showCrearCuenta(ActionEvent event) {
         try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/vista/CrearCuentaVista.fxml"));
            
            Parent root = loader.load();
            
            CrearCuentaControlador controlador = loader.getController();
            
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            
            
            stage.setScene(scene);
            stage.show();
            
           
            
            Stage myStage = (Stage) this.btnCrearCuenta.getScene() .getWindow();
            myStage.close();
            
        } catch (IOException ex) {
            Logger.getLogger(BienvenidaControlador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}

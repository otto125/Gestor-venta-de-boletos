/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author s1290
 */
public class ResumenCompraBoletosControlador implements Initializable {

    private Button btnRegresar;
    @FXML
    private Button btnMenu;
    @FXML
    private Button btnEscogerAsiento;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    private void showRegresar(ActionEvent event) {
         try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/vista/CarteleraVista.fxml"));
            
            Parent root = loader.load();
            
            CarteleraControlador controlador = loader.getController();
            
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            
            
            stage.setScene(scene);
            stage.show();
            
           
            
            Stage myStage = (Stage) this.btnRegresar.getScene() .getWindow();
            myStage.close();
            
        } catch (IOException ex) {
            Logger.getLogger(BienvenidaControlador.class.getName()).log(Level.SEVERE, null, ex);
        }
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
    private void showAsientos(ActionEvent event) {
         try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/vista/ResumenCompraAsientosVista.fxml"));
            
            Parent root = loader.load();
            
            ResumenCompraAsientosControlador controlador = loader.getController();
            
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            
            
            stage.setScene(scene);
            stage.show();
            
           
            
            Stage myStage = (Stage) this.btnEscogerAsiento.getScene() .getWindow();
            myStage.close();
            
        } catch (IOException ex) {
            Logger.getLogger(BienvenidaControlador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}

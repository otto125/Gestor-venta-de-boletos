/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class EscogerFechaControlador implements Initializable {

    @FXML
    private Button btnOpenYouTube;
    @FXML
    private Button btnMenu;
    @FXML
    private Button btnOpenYouTube1;
    @FXML
    private Button btnFecha;
    @FXML
    private Button btnOpenYouTube3;
    @FXML
    private Button btnRegresar;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
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
    private void showVideoFnaf(ActionEvent event) {
         String videoUrl = "https://youtu.be/f-zqS2CiZqw"; 

        try {
            Desktop.getDesktop().browse(new URI(videoUrl));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //

    @FXML
    private void showVideoCienpiesH(ActionEvent event) {
        String videoUrl = "https://youtu.be/GpcCJ8ozirU"; 

        try {
            Desktop.getDesktop().browse(new URI(videoUrl));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void showcompraBoletos(ActionEvent event) {
         try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/vista/ResumenCompraBoletosVista.fxml"));
            
            Parent root = loader.load();
            
            ResumenCompraBoletosControlador controlador = loader.getController();
            
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            
            
            stage.setScene(scene);
            stage.show();
            
            Stage myStage = (Stage) this.btnFecha.getScene() .getWindow();
            myStage.close();
            
            
            
        } catch (IOException ex) {
            Logger.getLogger(BienvenidaControlador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void showVideoReadyPlayers(ActionEvent event) {
      
        String videoUrl = "https://www.youtube.com/watch?v=QxVvk-OuJb0&ab_channel=WarnerBros.PicturesLatinoamérica"; 

        try {
            Desktop.getDesktop().browse(new URI(videoUrl));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void showRegresar(ActionEvent event) {
         try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/vista/BienvenidaVista.fxml"));
            
            Parent root = loader.load();
            
            BienvenidaControlador controlador = loader.getController();
            
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

}
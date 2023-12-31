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
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author s1290
 */
public class CarteleraControlador implements Initializable {

    @FXML
    private Button btnRegresar;
    @FXML
    private Button btnPeliculaFnaf;
    @FXML
    private Button btnPeliculaCienpiesH;
    @FXML
    private Button btnPeliculaReadyPlayers;
    @FXML
    private Button btnMenu;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
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

    void closeWindows() {
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

  


 

    @FXML
    private void showBoletoFnaf(ActionEvent event) {
         try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/vista/EscogerFechaVista.fxml"));
            
            Parent root = loader.load();
            
            EscogerFechaControlador controlador = loader.getController();
            
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            
            
            stage.setScene(scene);
            stage.show();
            
            Stage myStage = (Stage) this.btnPeliculaFnaf.getScene() .getWindow();
            myStage.close();
            
            
            
        } catch (IOException ex) {
            Logger.getLogger(BienvenidaControlador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void showBoletoCienpiesH(ActionEvent event) {
         try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/vista/EscogerFechaVista.fxml"));
            
            Parent root = loader.load();
            
            EscogerFechaControlador controlador = loader.getController();
            
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            
            
            stage.setScene(scene);
            stage.show();
            
            Stage myStage = (Stage) this.btnPeliculaFnaf.getScene() .getWindow();
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
    private void showBoletoReadyPlayers(ActionEvent event) {
         try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/vista/EscogerFechaVista.fxml"));
            
            Parent root = loader.load();
            
            EscogerFechaControlador controlador = loader.getController();
            
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            
            
            stage.setScene(scene);
            stage.show();
            
            Stage myStage = (Stage) this.btnPeliculaFnaf.getScene() .getWindow();
            myStage.close();
            
            
            
        } catch (IOException ex) {
            Logger.getLogger(BienvenidaControlador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    
}

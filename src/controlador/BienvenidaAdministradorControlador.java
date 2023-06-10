/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import java.net.URL;
import static java.time.Clock.system;
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
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author s1290
 */
public class BienvenidaAdministradorControlador implements Initializable {

    @FXML
    private BorderPane BorderPane;
    @FXML
    private AnchorPane AnchorPane;
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
    private void home(MouseEvent event) {
        BorderPane.setCenter(AnchorPane);
    }

    @FXML
    private void listaDeEventos(MouseEvent event) {
    
        loadPage("ListaDeEventosAdministradorVista");
    }

    @FXML
    private void listaDeBoletos(MouseEvent event) {
        loadPage("ListaDeBoletosAdministradorVista");
      
    }

    @FXML
    private void DetallesDeBoletos(MouseEvent event) {
        loadPage("DetallesBoletosAdministradorVista");
     
    }

    @FXML
    private void ListaDeUsuarios(MouseEvent event) {
        loadPage("ListaDeUsuariosAdministradorVista");
       
    }

    @FXML
    private void consultarBoleto(MouseEvent event) {
        loadPage("ConsultarBoletosAdministradorVista");
       
    }
    
    private void loadPage(String page){
    Parent root = null;
    
        try {
            root = FXMLLoader.load(getClass().getResource("/vista/"+page+".fxml"));
        } catch (IOException ex) {
            Logger.getLogger(BienvenidaAdministradorControlador.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       BorderPane.setCenter(root);
    }

    void setRol(String rol) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setUsername(String usuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @FXML
    private void Salir(MouseEvent event) {
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
    
}

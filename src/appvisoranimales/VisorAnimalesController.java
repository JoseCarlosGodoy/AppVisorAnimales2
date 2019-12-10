/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appvisoranimales;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 * FXML Controller class
 *
 * @author Usuario
 */
public class VisorAnimalesController implements Initializable {

    @FXML
    private ListView<Animal> listview;
    @FXML
    private ImageView imageview;

    private ObservableList<Animal> obListAnimales;
    
    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        obListAnimales= FXCollections.observableArrayList();
        
        obListAnimales.add(new Animal("Perro","image/thumbperro.jpg","image/perro_1.jpg"));
        obListAnimales.add(new Animal("Gato","image/thumbgato.jpg","image/gato_1.jpg"));
        obListAnimales.add(new Animal("Pajaro","image/thumbpajaro.jpg","image/pajaro_1.jpg"));
        
        listview.setItems(obListAnimales);
        
        listview.getSelectionModel().selectedItemProperty().addListener(new ChangeListener() {
            @Override
            public void changed(ObservableValue observable, Object oldValue, Object newValue) {
                Animal value=(Animal) newValue;
                imageview.setImage(new Image(value.getImagenGrande()));
            }
        });
           
        listview.setCellFactory((ListView<Animal> l)-> new CeldaImagenTexto());
    }    
    
}

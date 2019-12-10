/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appvisoranimales;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

/**
 *
 * @author Usuario
 */
public class CeldaImagenTexto extends ListCell<Animal>{
    private VBox v;
    private Label l;
    private ImageView i;
    
    public CeldaImagenTexto() { 
        v=new VBox();
        v.setAlignment(Pos.CENTER);
        l=new Label();
        i=new ImageView();
        i.setFitHeight(100);
        
        v.getChildren().add(i);
        v.getChildren().add(l);
        l.wrapTextProperty();
        v.setPrefWidth(USE_PREF_SIZE);
    }
     
    
    @Override
    protected void updateItem(Animal item, boolean empty) {
        super.updateItem(item, empty); //To change body of generated methods, choose Tools | Templates.
        if(item!=null){
            l.setText(item.getNombre());
            i.setImage(new Image(item.getImagenMiniatura()));
        
            setGraphic(v);
        }else
            setGraphic(null);
    
    }
    
    
}

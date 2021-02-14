package mhd.wahba.firstappgrafic;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 *
 * @author mohammed
 */
public class FXMLDocumentController implements Initializable {
    
    
   private MessageManager manager = new MessageManager();
    
   @FXML 
   private TextField txtFeld;
   
   @FXML
   private Button btnSave;
   
   @FXML
   private TextArea txtArea;
    
    
    @FXML
    private void maxhWas(ActionEvent event) {
//        String s =txtFeld.getText();
        manager.saveMessage(new Message(txtFeld.getText()));          
        txtFeld.clear();
        refreschTectArea();
    }
    
    private void refreschTectArea(){
        StringBuilder sb = new StringBuilder();
        
        for (Message message : manager.getMessages()) {
            sb.append(message).append("\n");
            
        }
        txtArea.setText(sb.toString());
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}

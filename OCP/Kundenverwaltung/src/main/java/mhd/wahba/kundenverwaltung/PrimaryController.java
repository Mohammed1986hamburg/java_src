package mhd.wahba.kundenverwaltung;


import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.TextInputControl;


public class PrimaryController implements Initializable {
    
    private CustomerProvider provider ;
      
    @FXML
    private TextField txtFirstName;
    @FXML
    private TextField txtLastName;
    @FXML
    private TextField txtEmail;
    @FXML
    private TextArea txtOutput;
  
    @FXML
    private Label sysMessage;
    
    @FXML
    private  TableView<Customer>   tableView;
    
    
  
    
    @FXML
    private void save(ActionEvent e){
        
        Customer c = new Customer(txtFirstName.getText(), txtLastName.getText(), txtEmail.getText());
        
        try {
            provider.add(c);
            updateOutput();
             clearField(txtEmail,txtFirstName,txtLastName);
             sysMessage.setText("");
        } catch (Exception ex) {
            sysMessage.setText("kann nicht geschpeirt werden");
        }
        
        
    }
    
    public void updateOutput(){
            tableView.setItems(FXCollections.observableList(provider.getAll())); 
    }
    
    private  void clearField(TextInputControl... fields){
        for (TextInputControl field : fields) {
            field.clear();
            
        }
        
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
         provider= new CustomerProvider();
        try {
          provider.init();
          sysMessage.setText("die alte Data geladen wurde");
        } catch (Exception e) {
            sysMessage.setText("keine Data gefunden");
        }
       updateOutput();
    }
}

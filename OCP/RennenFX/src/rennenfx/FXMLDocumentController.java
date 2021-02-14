/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rennenfx;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;

/**
 *
 * @author tlubowiecki
 */
public class FXMLDocumentController implements Initializable {
    
    private Color[] colors = {
        Color.RED,
        Color.BLUE,
        Color.VIOLET,
        Color.YELLOW,
        Color.GREEN,
        Color.BROWN,
        Color.ORANGE,
        Color.DEEPPINK,
        Color.ORCHID,
        Color.OLIVE
    };
    
    private final int ZIEL = 200;
    
    private Random rand = new Random();
    
    @FXML
    private TextField numLines;
    
    @FXML
    private AnchorPane pane;
    
    @FXML
    private void starteRennen(ActionEvent event) {
        
        pane.getChildren().clear();
        
        try {
            int count = Integer.parseInt(numLines.getText());
            for(int i = 0; i < count; i++) {
                createLine(i);
            }
        }
        catch(NumberFormatException e) {
            System.out.println("Ungültige Zahl.");
        }
    }
    
    private void createLine(int count) {
        
        Line l = new Line(0, (count + 1) * 20, 0, (count + 1) * 20);
        l.setStroke(colors[count]);
        l.setStrokeWidth(5);
        pane.getChildren().add(l);
        
        Runnable r = () -> {
            try {
                while(true) {
                    Platform.runLater(()-> {
                        l.setEndX(l.getEndX() + (rand.nextInt(10) + 1));
                    });
                    if(l.getEndX() >= ZIEL) {
                        System.out.println("EXIT");
                        break;
                    }
                    
                    Thread.sleep(1000);
                }
            } catch (Exception e) {
                System.out.println("Problem");
            }
        };
        Thread t = new Thread(r);
        t.setDaemon(true);
        t.start();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}

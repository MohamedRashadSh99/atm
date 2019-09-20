/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simple.atm;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.stage.Window;

/**
 *
 * @author pc
 */
public class num {
  TextField T2 = new TextField();
    public void rooty(StackPane root) {
        abstraction a = new abstraction();
      
        
        T2.setPrefSize(33,33); 
        root.setMargin(T2, new Insets(20, 20, 200, 200));
        Image i8 = new Image(getClass().getResourceAsStream("1.png"), 45, 45, false, false);
        Button b1 = new Button();
        b1.setGraphic(new ImageView(i8));
        Image i9 = new Image(getClass().getResourceAsStream("2.png"), 45, 45, false, false);
        Button b2 = new Button();
        b2.setGraphic(new ImageView(i9));
        Image i10 = new Image(getClass().getResourceAsStream("3.jpg"), 45, 45, false, false);
        Button b3 = new Button();
        b3.setGraphic(new ImageView(i10));
        Image i11 = new Image(getClass().getResourceAsStream("4.png"), 45, 45, false, false);
        Button b4 = new Button();
        b4.setGraphic(new ImageView(i11));
        Image i12 = new Image(getClass().getResourceAsStream("5.png"), 45, 45, false, false);
        Button b5 = new Button();
        b5.setGraphic(new ImageView(i12));
        Image i13 = new Image(getClass().getResourceAsStream("6.png"), 45, 45, false, false);
        Button b6 = new Button();
        b6.setGraphic(new ImageView(i13));
        Image i14 = new Image(getClass().getResourceAsStream("7.jpg"), 45, 45, false, false);
        Button b7 = new Button();
        b7.setGraphic(new ImageView(i14));
        Image i15 = new Image(getClass().getResourceAsStream("8.jpg"), 45, 45, false, false);
        Button b8 = new Button();
        b8.setGraphic(new ImageView(i15));
        Image i16 = new Image(getClass().getResourceAsStream("9.jpg"), 45, 45, false, false);
        Button b9 = new Button();
        b9.setGraphic(new ImageView(i16));
        Image i17 = new Image(getClass().getResourceAsStream("0.jpg"), 45, 45, false, false);
        Button b0 = new Button();
        b0.setGraphic(new ImageView(i17));
        Image i18 = new Image(getClass().getResourceAsStream("de.png"), 45, 45, false, false);
        Button bd = new Button();
        bd.setGraphic(new ImageView(i18));
         
       
        root.setMargin(b1, new Insets(0, 520, 10, 0));
        root.setMargin(b2, new Insets(0, 390, 10, 0));
        root.setMargin(b3, new Insets(0, 260, 10, 0));
        root.setMargin(b4, new Insets(150, 520, 10, 0));
        root.setMargin(b5, new Insets(150, 390, 10, 0));
        root.setMargin(b6, new Insets(150, 260, 10, 0));
        root.setMargin(b7, new Insets(300, 520, 10, 0));
        root.setMargin(b8, new Insets(300, 390, 10, 0));
        root.setMargin(b9, new Insets(300, 260, 10, 0));
        root.setMargin(b0, new Insets(450, 520, 10, 0));
        root.setMargin(bd, new Insets(450, 390, 10, 0));

        root.getChildren().addAll(b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bd,T2);
        //  
        b1.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {

                a.put(T2, "1");

            }
        });

        b2.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {

                a.put(T2, "2");

            }
        });
        b3.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {

                a.put(T2, "3");

            }
        });
        b4.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {

                a.put(T2, "4");

            }
        });
        b5.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {

                a.put(T2, "5");

            }
        });
        b6.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {

                a.put(T2, "6");
            }
        });
        b7.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {

                a.put(T2, "7");

            }
        });
        b8.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {

                a.put(T2, "8");

            }
        });
        b9.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {

                a.put(T2, "9");

            }
        });
        b0.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                a.put(T2, "0");
            }
        });
        bd.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {

                a.delete(T2);
            }

        });
        
    }
    public String g()
    {
       String x= T2.getText();
       return x;
    }
     public void s()
    {
       T2.setText("");
      
    }
   
}

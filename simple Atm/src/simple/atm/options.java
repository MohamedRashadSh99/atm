/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simple.atm;

import java.util.ArrayList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author pc
 */
public class options {
Account a;
//ArrayList<String> trans = a.getTrans();
int index=0;
    public options(Account a) {
        this.a = a;
    }

    public Scene getroot(Stage primaryStage) {
        TextField T1 = new TextField();
        Image image = new Image(getClass().getResourceAsStream("x.jpg"), 1200, 1200, false, false);
        ImageView BackGround = new ImageView(image);
        BackGround.setX(0);
        BackGround.setY(0);
        BackGround.setFitHeight(600);
        BackGround.setFitWidth(600);
        BackGround.setPreserveRatio(true);
        Image i8 = new Image(getClass().getResourceAsStream("deposite.jpg"), 100, 100, false, false);
        Button b1 = new Button();
        b1.setGraphic(new ImageView(i8));
        Image i9 = new Image(getClass().getResourceAsStream("withdraw.jpg"), 100, 100, false, false);
        Button b2 = new Button();
        b2.setGraphic(new ImageView(i9));
        Image i10 = new Image(getClass().getResourceAsStream("balance.jpg"), 100, 100, false, false);
        Button b3 = new Button();
        b3.setGraphic(new ImageView(i10));
        Image i11 = new Image(getClass().getResourceAsStream("next.jpg"), 100, 100, false, false);
        Button b4 = new Button();
        b4.setGraphic(new ImageView(i11));
        Image i12 = new Image(getClass().getResourceAsStream("p.png"), 100, 100, false, false);
        Button b5 = new Button();
        b5.setGraphic(new ImageView(i12));
        Image i91 = new Image(getClass().getResourceAsStream("back.png"), 100, 100, false, false);
        Button b2a = new Button();
        b2a.setGraphic(new ImageView(i91));
        StackPane root = new StackPane();
        root.setMargin(b1, new Insets(0, 300, 200, 200));
        root.setMargin(b2, new Insets(0, 0, 200, 200));
        root.setMargin(b5, new Insets(300, 300, 200, 200));
        root.setMargin(b4, new Insets(300, 0, 200, 200));
        root.setMargin(b3, new Insets(300, 600, 200, 200));
        root.setMargin(T1, new Insets(600, 100, 200, 200));
        root.setMargin(b2a, new Insets(0, 600, 200, 200));
        b2a.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                gui o = new gui(a);

                primaryStage.setScene(o.getroot(primaryStage));

            }
        });
        root.getChildren().addAll(BackGround, b1, b2, b3, b4, b2a,T1);

        b2.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {

                with w = new with(a);

                primaryStage.setScene(w.s(primaryStage));

            }
        });
        b1.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                depo d = new depo(a);
                primaryStage.setScene(d.s(primaryStage));

            }
        });
        b3.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                 T1.setText(a.getBalance());
            }
        });
        
         b4.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
               if (a.getN()!=0)
               { if(index<a.getN()){
                T1.setText(a.getTrans().get(index));
           
                index++;
               
                }
                else
                {
                    index=0;
                    T1.setText(a.getTrans().get(index));
                    index++;
                
                }
            }}
        });
          b5.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                 if(index>-1&&index<a.getN()){
                T1.setText(a.getTrans().get(index));
                index--;}
                else
                {
                    index=a.getTrans().size()-1;
                    
                    T1.setText(a.getTrans().get(index));
                }
            }
        });
        Scene scene = new Scene(root, 600, 600);

        return scene;

    }
}

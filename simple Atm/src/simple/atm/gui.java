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
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.stage.Window;

/**
 *
 * @author pc
 */
public class gui {

  Account a;

    public gui(Account a) {
        this.a = a;
    }
  
    
    public Scene getroot(Stage primaryStage) {
         num n = new num();
         
        Image image = new Image(getClass().getResourceAsStream("v.jpg"), 1200, 1200, false, false);
        ImageView BackGround = new ImageView(image);
        BackGround.setX(0);
        BackGround.setY(0);
        BackGround.setFitHeight(600);
        BackGround.setFitWidth(600);
        BackGround.setPreserveRatio(true);
        Image i1 = new Image(getClass().getResourceAsStream("resume.png"), 45, 45, false, false);
        Button go = new Button();
        go.setGraphic(new ImageView(i1));
        StackPane root = new StackPane();
        root.setMargin(go, new Insets(200, 200, 200, 200));
        root.getChildren().addAll(BackGround, go);
        n.rooty(root);
        go.setOnAction(new EventHandler<ActionEvent>(){
			public void handle (ActionEvent event)
			{
                                    if(a.getX().equals(n.g()))
                                    {options o=new options(a);

					primaryStage.setScene(o.getroot(primaryStage));     
                                    }
				 
			
			}});
		

        Scene scene = new Scene(root, 600, 600);

        return scene;

    }
}

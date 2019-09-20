/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simple.atm;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author pc
 */
public class depo {
 
    num e=new num();
   Account a;

    public depo(Account a) {
        this.a = a;
    }
   public Scene s(Stage primaryStage) 
    {
         Image image = new Image(getClass().getResourceAsStream("deposite.jpg"), 1200, 1200, false, false);
        ImageView BackGround = new ImageView(image);
        BackGround.setX(0);
        BackGround.setY(0);
        BackGround.setFitHeight(600);
        BackGround.setFitWidth(600);
        BackGround.setPreserveRatio(true);

        Image i91 = new Image(getClass().getResourceAsStream("back.png"), 100, 100, false, false);
        Button b2a = new Button();
        b2a.setGraphic(new ImageView(i91));
        Image i92 = new Image(getClass().getResourceAsStream("deposite.jpg"), 100, 100, false, false);
        Button b2 = new Button();
        b2.setGraphic(new ImageView(i92));
 StackPane root =new StackPane();
   b2a.setOnAction(new EventHandler<ActionEvent>(){
			public void handle (ActionEvent event)
			{
                                        options o=new options(a);

					primaryStage.setScene(o.getroot(primaryStage));
			
			}});
    b2.setOnAction(new EventHandler<ActionEvent>(){
			public void handle (ActionEvent event)
			{
                                  //      a.deposit(null);
                                  a.deposit(e.g());
                                  e.s();
				//	primaryStage.setScene(o.getroot(primaryStage));
			
			}});
        
        root.setMargin(b2, new Insets(400, 100, 200, 200));
        root.setMargin(b2a, new Insets(600, 100, 200, 200));
        root.getChildren().addAll(BackGround, b2a,b2);
        e.rooty(root);
        
        Scene scene=new Scene(root,600,600);
        return scene;            
}
}

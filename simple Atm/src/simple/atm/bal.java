/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simple.atm;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;

/**
 *
 * @author pc
 */
public class bal {
     public Scene getroot() {

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
        Image i11 = new Image(getClass().getResourceAsStream("next.jpg"),100, 100, false, false);
        Button b4 = new Button();
        b4.setGraphic(new ImageView(i11));
        Image i12 = new Image(getClass().getResourceAsStream("p.png"), 100, 100, false, false);
        Button b5 = new Button();
        b5.setGraphic(new ImageView(i12));
        StackPane root = new StackPane();
        root.setMargin(b1, new Insets(0, 300, 200, 200));
        root.setMargin(b2, new Insets(0, 0, 200, 200));
        root.setMargin(b5, new Insets(300, 300, 200, 200));
        root.setMargin(b4, new Insets(300, 0, 200, 200));
        root.setMargin(b3, new Insets(600, 300, 200, 200));
        root.getChildren().addAll(BackGround, b1,b2,b3,b4,b5);
        

        Scene scene = new Scene(root, 600, 600);

        return scene;

    }
}

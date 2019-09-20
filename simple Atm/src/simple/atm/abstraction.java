/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simple.atm;

import javafx.scene.control.TextField;
import javafx.scene.control.Label;

/**
 *
 * @author pc
 */
public class abstraction {
    /*
     * To change this license header, choose License Headers in Project Properties.
     * To change this template file, choose Tools | Templates
     * and open the template in the editor.
     */

    /**
     *
     * @author pc
     */
    public void put(TextField T1, String y1) {

        if (T1.getText().equals("")) {

            T1.setText(y1);
        } else {
            
            int y = Integer.valueOf(T1.getText());
            int y2 = Integer.valueOf(y1);
            y = y * 10 + y2;
            String z = String.valueOf(y);
            T1.setText(z);

        }

    }

    public void delete(TextField T1) {
      if(T1.getText().equals("")==false)
      {  int y = Integer.valueOf(T1.getText());
        y = y / 10;
        String z = String.valueOf(y);
        T1.setText(z);
        if (y == 0) {
            T1.setText("");
        }
      }
    }
}

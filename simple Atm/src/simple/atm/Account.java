/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simple.atm;

import java.util.ArrayList;
import javafx.scene.control.TextField;

/**
 *
 * @author pc
 */
public class Account {

    ArrayList<String> trans = new ArrayList<String>();
    int n=0;
    private int Balance;
    String x;

    public Account() {
        Balance = 0;
        x = "3699";
    }

    public String getBalance() {

        String z = "balance=" + String.valueOf(Balance);
        if (trans.size() == 5) {
            trans.remove(0);
            trans.add(z);
        } else {
            trans.add(z);
        }
        
        return  "Balance="+String.valueOf(Balance);
    }

    public void setBalance(int Balance) {
        this.Balance = Balance;
    }

    public void setX(String x) {
        this.x = x;
    }

    public String getX() {
        return x;
    }

    public void deposit(String T1) {

        int y = Integer.valueOf(T1);
        Balance = Balance + y;
        String z = "deposite " + String.valueOf(y);
        if (trans.size() == 5) {
            trans.remove(0);
            trans.add(z);
            
        } else {
            trans.add(z);
             n++;
        }
    }

    public void WithDraw(String T1) {
        int y = Integer.valueOf(T1);
        if (y <= Balance) {
            Balance = Balance - y;
            String z = "withdraw" + String.valueOf(y);
            if (trans.size() == 5) {
            
                trans.remove(0);
            trans.add(z);
        } else {
            trans.add(z);
            n++;
        }
        }
        else
        {
             String z = "try withdraw but error" ;
             if (trans.size() == 5) {
            
                trans.remove(0);
            trans.add(z);
        } else {
            trans.add(z);
            n++;
        }
        }
            
            
        

    }

    public int getN() {
        return n;
    }

    public ArrayList<String> getTrans() {
        return trans;
    }
}

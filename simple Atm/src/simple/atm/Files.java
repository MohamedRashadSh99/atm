/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simple.atm;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author pc
 */
public class Files implements Serializable {
    /*
     * To change this license header, choose License Headers in Project Properties.
     * To change this template file, choose Tools | Templates
     * and open the template in the editor.
     */

    /**
     *
     * @author pc
     */
   

      // private Account ar[1]=new account()l
        private ArrayList<String> list2 = new ArrayList<String>(5);

        int index;

    ArrayList<Account> list3 = new ArrayList<Account>(2);
        // ArrayList<Driver> list4 = new ArrayList<Driver>();
        void addarraylist1() {
        //   Account trip1 = new Account(0,"yor balance");

     //       list3.add(trip1);
 
        }
        public void addTrip1(Account trip1) {
            list3.add(trip1);

        }

    /*    public void addTrip2(String trans) {
            list2.add(trans);

        }
*/
        public void save1() throws FileNotFoundException, IOException, ClassNotFoundException {

            // El code dah ye save el data le file ana mesameeh persons , howa beysave el object ka kol
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("balance.txt"));
            int size = list3.size();
            int i = 0;
            while (i < size) {
                // now i loop 3ala kol object fe list wa save fe file
                out.writeObject(list3.get(i));
                 System.out.println(list3.get(i));
                i++;

            }

        }

// Now lets try to input data in a new empty arraylist list2
        public void load1() throws FileNotFoundException, IOException, ClassNotFoundException {
try{
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("balance.txt"));

            // loop read object by object we add le list
            while (true) {
                try { // tries to read from file , then adds to list
                    Account p = (Account) in.readObject();
                    int i=0;
                    list3.add(p);
                
                 System.out.println("load file Succe");
             
                } catch (java.io.EOFException eofe) { // if end of file reached exception is thrown and caught here so break out of loop
                    break;
                }

            }

        }
catch(Exception ex)
        {
            System.out.println("fds");
        }
        }
        
        public ArrayList<Account> getList() {
            return list3;
        }

     /*   public void setList(ArrayList<String> list) {
            this.list1 = list;

        }
*/
   /*     void addarraylist2(String trans) {

            list2.add(trans);

        }
/*
        /*

         public void save2() throws FileNotFoundException, IOException, ClassNotFoundException{
   

   

         ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Tripsbooked.txt"));
         System.out.println("sad");
         int size = list2.size();
         int i =0;
         while(i<size)
         {
         // now i loop 3ala kol object fe list wa save fe file
         out.writeObject(list2.get(i));
         i++;
			
         }
		
		
		
         // now i loop 3ala kol object fe list wa save fe file
			
			
			
		
		
         }	
           
           
         public void load2() throws FileNotFoundException, IOException, ClassNotFoundException{
         ObjectInputStream in = new ObjectInputStream(new FileInputStream("Tripsbooked.txt"));

		
         // loop read object by object we add le list
         while(true)
         {
         try { // tries to read from file , then adds to list
         Trips p = (Trips)in.readObject();
         list2.add(p);}
			
         catch (java.io.EOFException eofe){ // if end of file reached exception is thrown and caught here so break out of loop
         break;
         }
			

         }}
         public ArrayList<Trips> getList2() {
         return list2;
         }

         public void setList2(ArrayList<Trips> list) {
         this.list2 = list;
        
         }

         public ArrayList<Trips> getList1() {
         return list1;
         }

         public void setList1(ArrayList<Trips> list1) {
         this.list1 = list1;
         }

         */
    }



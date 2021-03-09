/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Joás
 */
public class Principal {
    
    public static void main(String []args){
        StringBuffer buffer = new StringBuffer();
        
        MyThread objMyThread1 = new MyThread(buffer, "My Thread one \n");
        MyThread objMyThread2 = new MyThread(buffer, "My Thread two \n");
        MyThread objMyThread3 = new MyThread(buffer, "My Thread three \n");
        
        objMyThread1.run();
        objMyThread2.run();
        objMyThread3.run();
        
        for (int i = 0; i < 3; i++) {
            System.out.println( buffer.toString() );
            
            
        }
    }
    
}

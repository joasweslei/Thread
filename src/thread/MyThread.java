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
public class MyThread extends Thread{
    StringBuffer objStringBuffer;
    private String texto;
    
    public MyThread(StringBuffer objBuffer, String text){
        this.objStringBuffer = objBuffer;
        this.texto = text;
    }
    
    public void run(){
        for (int i = 0; i < 10; i++) {
            this.objStringBuffer.append(texto);
            try{
                sleep( (long) Math.random() * 100);
            } catch (InterruptedException ex) {
                
            }
        }
    }

    
    
}

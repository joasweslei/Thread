/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread;

import static java.lang.Thread.sleep;

/**
 *
 * @author joasb
 */
public class Thread extends java.lang.Thread {

    StringBuffer buf;
    private String texto;

    public Thread(StringBuffer buf, String texto) {
        this.buf = buf;
        this.texto = texto;
    }

    public void run() {

        for (int i = 0; i < 10; i++) {
            buf.append(texto);

            try {
                sleep((long) ( Math.random() * 100));
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }

        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StringBuffer buf = new StringBuffer();
        Thread her1 = new Thread(buf, "thread 1\n");
        Thread her2 = new Thread(buf, "thread 2\n");
        Thread her3 = new Thread(buf, "thread 3\n");
        her1.start();
        her2.start();
        her3.start();
        for (int i = 0; true; i++) {
            System.out.println(buf.toString());
        }

    }

}

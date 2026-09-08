/*
 * RedPanel.java
 *
 * Created on November 17, 2007, 4:10 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package Main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.JPanel;

/**
 *
 * @author Bokhoo™ ©/SW04D405/
 */
public class RedPanel  extends JPanel implements GameData, Runnable {
    private CanImage cImage;
    private Image[] image = {null,null,null,null};
    private Thread thread;
    private long paintTime;
    private int ThreadSpeed = 400;
    private Image img;
    private int too=0;
    
    public RedPanel() {
        cImage = new CanImage();
        image[0] = cImage.get_Image(Up1Path2);
        image[1] = cImage.get_Image(Left1Path2);
        image[2] = cImage.get_Image(Down1Path2);
        image[3] = cImage.get_Image(Right1Path2);
        img = image[too];
    }
    
    public void stop(){
        thread = null;
    }
    
    public void start(){
        if(thread == null){
            thread = new Thread(this);
            thread.start();
        }
    }
    
    protected void paintComponent(Graphics g) {
        Graphics2D gr = (Graphics2D)g;
        gr.setColor(Color.gray);
        gr.fillRect(0,0,getWidth(),getHeight());
        gr.drawImage(img,0,0,this);
    }
    
    public void run() {
        Thread mythread = Thread.currentThread();
        long scheduled = System.currentTimeMillis();
        paintTime = scheduled;
        while (thread == mythread) {
            synchronized (this) {
                try {
                    scheduled += ThreadSpeed;
                    long delta = scheduled - paintTime;
                    if (delta > 0) {
                        this.wait(delta);
                    }
                    too++;
                    if(too == 4){
                        too = 0;
                    }
                    img = image[too];
                    repaint();
                    if (thread != null) {
                        thread = null;
                        thread = new Thread(this);
                        thread.start();
                    }
                } catch (InterruptedException e) {
                }
            }
        }
    }
    
}

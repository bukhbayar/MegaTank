
package Main;

//import com.sun.media.MediaPlayer;
//import javax.media.bean.playerbean.MediaPlayer;
import java.awt.*;
import java.awt.event.*;
import java.net.URL;

import javax.swing.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.util.Timer;
public class MainJApplet extends JApplet implements KeyListener{
    
    private Panel2D panel;
    private Timer timer;
    private SlideTask task;
    public static MediaCredit NewCredit;
     
    public static void main(String s[]) {
        JFrame frame = new JFrame();
        frame.setTitle("MegaTank - Java2D by SW04D405");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        MediaCredit credit = new MediaCredit();
        NewCredit = credit;
        frame.add(credit);
        
        JApplet applet = new MainJApplet();
        applet.init();
        
        frame.getContentPane().add(applet);
        frame.setLocation(150,50);
        frame.setResizable(false);
        frame.setVisible(true);
        //frame.setAlwaysOnTop(true);
        frame.setSize(920,775);
        frame.pack();
    }
    
    @Override
    public void init() {
        panel = new Panel2D(this);
        addKeyListener(this);
        getContentPane().add(panel);
        
      /*timer = new Timer();
        task = new SlideTask(panel);
        timer.schedule(task, 0, 10);*/
    }
    
    public void setPointer(MediaCredit mm){
        NewCredit = mm;
        System.out.println(NewCredit);
    }
    public void ShowMedia(){
        NewCredit.ShowMedia();
        NewCredit.setBounds(-3,-3,960,820);
        NewCredit.setVisible(true);
        //this.setVisible(false);
    }
    
    public void HideMedia(){
        NewCredit.HideMedia();
        NewCredit.setVisible(false);
    }
    public void keyTyped(KeyEvent e) {
        
    }
    
    
    public void keyPressed(KeyEvent e) {
        switch(e.getKeyCode()){
            case KeyEvent.VK_ENTER:{
                panel.SELECT();
            }break;
            case KeyEvent.VK_DOWN:{
                panel.DOWN();
            }break;
            case KeyEvent.VK_UP:{
                panel.UP();
            }break;
            case KeyEvent.VK_ESCAPE:{
                panel.Press_ESC();
            }break;
            case KeyEvent.VK_D:{
                panel.ChangeHead("RIGHT");
                panel.ChangeTarget("RIGHT");
            }break;
            case KeyEvent.VK_A:{
                panel.ChangeHead("LEFT");
                panel.ChangeTarget("LEFT");
            }break;
            case KeyEvent.VK_Q:{
                panel.ChangeTarget("LEFT");
            }break;
            case KeyEvent.VK_E:{
                panel.ChangeTarget("RIGHT");
            }break;
            case KeyEvent.VK_SPACE:{
                panel.Shoot();
            }break;
            default:{}break;
        }
    }
    
    
    public void keyReleased(KeyEvent e) {
    }
}

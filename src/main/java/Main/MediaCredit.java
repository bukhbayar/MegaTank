/*
 * MediaCredit.java
 *
 * Created on November 17, 2007, 6:50 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package Main;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.net.URL;
import javax.media.Time;
import javax.media.bean.playerbean.MediaPlayer;
import javax.swing.JApplet;

/**
 *
 * @author Bokhoo
 */
public class MediaCredit extends JApplet{
    private MediaPlayer media;
    public MediaCredit() {
        media = new MediaPlayer();
        media.setLocation(-100,-150);
        media.setSize(1180,1160);
        media.setVisible(false);
        media.setMediaLocationVisible(false);
        add(media);
    }
    
    public void ShowMedia(){
        try{
            URL url = MediaCredit.class.getResource("/resource/media/clip.mpg");
            media.setMediaLocation(url.toExternalForm());
            media.setMediaLocationVisible(true);
            media.start();
        } catch(Exception ex){  System.out.println("MEDIA ERROR - "+ex.getMessage());}
    }
    
    public void HideMedia(){
        try{
            media.stop();
            media.setVisible(false);
        }catch(Exception ex){
            
        }
    }
 }

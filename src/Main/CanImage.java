/*
 * CanImage.java
 *
 * Created on November 5, 2007, 1:41 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package Main;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;

/**
 *
 * @author Bokhoo
 */
public class CanImage{
    public CanImage() {
        
    }
    
    public Image get_Image(String path){
        Image img = null;
        try{
            URL url =  Panel2D.class.getResource("/"+path);
            img = Toolkit.getDefaultToolkit().getImage(url);
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return img;
    }
}

/*
 * MapCanvas.java
 *
 * Created on November 19, 2007, 6:51 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package Main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.util.Vector;
import javax.swing.JPanel;

/**
 *
 * @author Bokhoo
 */


public class MapCanvas extends JPanel{
    private Vector<Image> vectorMap = new Vector<Image>();
    private CanImage cImage;
    private int Index;
    
    public MapCanvas() {
        cImage = new CanImage();
        try{
            vectorMap.addElement(cImage.get_Image("resource/Map/fullMap1.png"));
        }catch(Exception e){}
        Index = 0;
    }
    
    public void chooseMap(int index){
        this.Index = index;
        repaint();
    }
    
    protected void paintComponent(Graphics g) {
        Graphics2D gr = (Graphics2D)g;
        gr.setColor(Color.black);
        gr.fillRect(0,0,getWidth(),getHeight());
        if(!vectorMap.isEmpty()){
            gr.drawImage(vectorMap.get(Index),0,0,this);
        }
    }
}

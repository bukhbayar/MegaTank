/*
 * SlideTask.java
 *
 * Created on November 7, 2007, 1:20 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package Main;

import java.util.TimerTask;

class SlideTask extends TimerTask
        
{
    private Panel2D panel;
    
    public SlideTask(Panel2D p) {
        panel = p;
    }
    
    public void run() {
        panel.repaint();
    }
}


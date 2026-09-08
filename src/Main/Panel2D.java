/*
 * Panel2D.java
 *
 * Created on November 5, 2007, 3:23 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package Main;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Random;
import java.util.Vector;
import javax.swing.*;

/*
 *  Target and Head ....
 *      1
 *  4       2
 *      3
 */
/**
 *
 * @author Bokhoo
 */
public class Panel2D extends JPanel implements MenuData, GameMap, GameData, Runnable {
    //********** Player 1 **********************
    private Vector<Image> VectorPlayer1 = new Vector<Image>();
    private Vector VectorPlayer1X = new Vector();
    private Vector VectorPlayer1Y = new Vector();
    private Vector VectorPlayer1H = new Vector();
    private Vector VectorPlayer1T = new Vector();
    private Vector VectorPlayer1A = new Vector();
    private Vector VectorPlayer1L = new Vector();
    private Vector VectorPlayer1S = new Vector();
    private Vector VectorPlayer1Sum = new Vector();
    
    private Vector<Image> SumVectorP = new Vector<Image>();
    private Vector SumVectorX = new Vector();
    private Vector SumVectorY = new Vector();
    private Vector SumVectorT = new Vector();
    //private Vector SumVectorSp = new Vector();
    private Vector SumVectorS = new Vector();
    //********** Player 1 **********************
    
    
    private Vector<Image> VectorPlayer2 = new Vector<Image>();
    private Vector VectorPlayer2X = new Vector();
    private Vector VectorPlayer2Y = new Vector();
    private Vector VectorPlayer2H = new Vector();
    private Vector VectorPlayer2T = new Vector();
    private Vector VectorPlayer2A = new Vector();
    private Vector VectorPlayer2L = new Vector();
    private Vector VectorPlayer2S = new Vector();
    private Vector VectorPlayer2Sum = new Vector();
    
    private Vector<Image> SumVectorP2 = new Vector<Image>();
    private Vector SumVectorX2 = new Vector();
    private Vector SumVectorY2 = new Vector();
    private Vector SumVectorT2 = new Vector();
    //private Vector SumVectorSp2 = new Vector();
    private Vector SumVectorS2 = new Vector();
    
    //**********************************
    
    private Vector<Image> VectorSoldier2 = new Vector<Image>();
    private Vector VectorSoldier2X = new Vector();
    private Vector VectorSoldier2Y = new Vector();
    private Vector VectorSoldier2H = new Vector();
    private Vector VectorSoldier2T = new Vector();
    private Vector VectorSoldier2A = new Vector();
    private Vector VectorSoldier2L = new Vector();
    private Vector VectorSoldier2S = new Vector();
    private Vector VectorSoldier2C = new Vector();
    private Vector VectorSoldier2W = new Vector();
    
    
    private Vector<Image> SumVectorPE = new Vector<Image>();
    private Vector SumVectorXE = new Vector();
    private Vector SumVectorYE = new Vector();
    private Vector SumVectorTE = new Vector();
    //private Vector SumVectorSpE = new Vector();
    private Vector SumVectorSE = new Vector();
    
    //************************************************
    
    private Vector<Image> VectorSoldier1 = new Vector<Image>();
    private Vector VectorSoldier1X = new Vector();
    private Vector VectorSoldier1Y = new Vector();
    private Vector VectorSoldier1H = new Vector();
    private Vector VectorSoldier1T = new Vector();
    private Vector VectorSoldier1A = new Vector();
    private Vector VectorSoldier1L = new Vector();
    private Vector VectorSoldier1S = new Vector();
    
    private Vector<Image> SumVectorPS = new Vector<Image>();
    private Vector SumVectorXS = new Vector();
    private Vector SumVectorYS = new Vector();
    private Vector SumVectorTS = new Vector();
    //private Vector SumVectorSpS = new Vector();
    private Vector SumVectorSS = new Vector();
    
    
    private Vector<Image> MapVectorP = new Vector<Image>();
    private Vector MapVectorX = new Vector();
    private Vector MapVectorY = new Vector();
    private Vector MapVectorM = new Vector();
    
    
    private Image WallpaperImg;
    private Image PlayImg;
    private Image SettingsImg;
    private Image StaticImg;
    private Image ExitImg;
    private Image SingleImg;
    private Image MulthiImg;
    private Image FrameImg;
    private Image[] sumImg = {null,null,null,null};
    
    private Image[] Player1Up = {null,null,null,null};
    private Image[] Player1Left = {null,null,null,null};
    private Image[] Player1Down = {null,null,null,null};
    private Image[] Player1Right = {null,null,null,null};
    
    private Image[] Player2Up = {null,null,null,null};
    private Image[] Player2Left = {null,null,null,null};
    private Image[] Player2Down = {null,null,null,null};
    private Image[] Player2Right = {null,null,null,null};
    
    private Image[] MapItemImg = {null,null,null,null,null,null,null,null};
    private Image[] LifeImg = {null,null,null,null};
    private Image[] ArmorImg = {null,null,null,null};
    
    private Image[] SelectItemImg = {null,null};
    
    private Image MapImage;
    private Image LifeImage;
    private Image ArmorImage;
    private Image SelectItemImage;
    private Image SumImage;
    
    private Image[] SLeftImg2 = {null,null,null,null};
    private Image[] SRightImg2 = {null,null,null,null};
    private Image[] SUpImg2 = {null,null,null,null};
    private Image[] SDownImg2 = {null,null,null,null};
    
    private Image[] SLeftImg1 = {null,null,null,null};
    private Image[] SRightImg1 = {null,null,null,null};
    private Image[] SUpImg1 = {null,null,null,null};
    private Image[] SDownImg1 = {null,null,null,null};
    
    private Image setSumImage;
    private Image setSumImage2;
    
    
    private CanImage cimg;
    private Thread thread;
    private int ThreadSpeed;
    private long paintTime;
    private int x1;
    private int x2;
    private int x3;
    private int x4;
    private int x5;
    private int x6;
    private int x7;
    private int x8;
    private int SelectIndex;
    private int GForm;
    
    private int Speed;
    
    //************************************************
    private int SumX;
    private int SumY;
    
    private int SumSpeed;
    // private int SumTarget;
    //************************************************
    private int LifeX;
    private int LifeY;
    private int ArmorX;
    private int ArmorY;
    private JTextField jt;
    private String PlayerName = "";
    private int PlayerScore;
    
    private boolean isChat = false;
    private String SendTextChat = "";
    private int PortChat;
    private String IPChat;
    private Vector<String> RecieveChat = new Vector<String>();
    private Vector MessageTime = new Vector();
    private Vector VectorMessY = new Vector();
    private int WaitMessage = 0;
    
    
    private Random random;
    private MainJApplet mainApp;
    private int OwnerPlayer;
    private int MyTime;
    private TankClient tk;
    private boolean isShoot = true;
    private int ShootTime = 30;
    private boolean isMove = true;
    private boolean isBackMove = true;
    private int indexBACK = -1;
    private int indexUP = -1;
    private int isChange;
    private int EnemySpeed;
    private boolean isIn;
    private boolean isInR;
    private int isMoveEnemy;
    private int EnemyLimint = 1;
    private int EnemyLimintR = 2;
    private boolean Empty;
    private boolean EmptyR;
    
    private int ServerMode = -1;
    
    private int ShootTimeEnemy = 0;
    private boolean yesShoot;
    private int sx = 0;
    private int sy = 0;
    private Image imgAMMO = null;
    
    private int ammoSpeed;
    
    private String GAME_OVER = "";
    public Panel2D(MainJApplet m) {
        mainApp = m;
        setPreferredSize(new Dimension(925, 800));
        setBackground(Color.black);
        cimg = new CanImage();
        random = new Random();
        x1 = Menu1 - 40;
        x2 = Menu2;
        x3 = Menu3;
        x4 = Menu4;
        x5 = Menu5 - 40;
        x6 = Menu6;
        x7 = Menu7 - 40;
        x8 = Menu8;
        SelectIndex = 1;
        GForm = MainMenu;
        
        //************************************************
        Speed = 5;
        SumSpeed = 10;
        ammoSpeed = 10;
        EnemySpeed = 5;
        //************************************************
        LifeX = 198;
        LifeY = 730;
        ArmorX = 198;
        ArmorY = 760;
        
        ThreadSpeed=10;
        WaitMessage = 1000;
        if (thread == null) {
            thread = new Thread(this);
            thread.start();
        }
        
        jt = new JTextField();
        jt.setBackground(Color.BLACK);
        jt.setForeground(Color.ORANGE);
        jt.setCaretColor(Color.GREEN);
        jt.setLocation(150, 660);
        jt.setSize(300, 25);
        jt.setText("");
        jt.setVisible(false);
        
        jt.addKeyListener(new java.awt.event.KeyAdapter() {
            
            @Override
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtKeyPressed(evt);
            }
        });
        
        add(jt);
        OwnerPlayer=1;
        renderImage();
        //addEnemySoldiers(5);
        //addOurSoldiers(5);
        
        
        
    }
    
    public int getRandom(int limit){
        int too = 0;
        too = random.nextInt(limit);
        if(too == 0){
            too = getRandom(limit);
        }
        return too;
    }
    
    private void jtKeyPressed(KeyEvent evt) {
        switch (evt.getKeyCode()) {
            case KeyEvent.VK_ENTER:
            {
                SendTextChat = jt.getText();
                tk.Send(PlayerName + ":" + SendTextChat, IPChat, PortChat);
                jt.setVisible(false);
                isChat = false;
            }
            break;
        }
    }
    
    
    
    public void renderImage(){
        WallpaperImg = cimg.get_Image(WallpaperPath);
        PlayImg = cimg.get_Image(PlayPath);
        SettingsImg = cimg.get_Image(SettingsPath);
        StaticImg = cimg.get_Image(StaticPath);
        ExitImg = cimg.get_Image(ExitPath);
        SingleImg = cimg.get_Image(SinglePath);
        MulthiImg = cimg.get_Image(MulthiPath);
        FrameImg = cimg.get_Image(FramePath);
        
        sumImg[0] = cimg.get_Image(SumPath1);
        sumImg[1] = cimg.get_Image(SumPath2);
        sumImg[2] = cimg.get_Image(SumPath3);
        sumImg[3] = cimg.get_Image(SumPath4);
        
        SLeftImg2[0] = cimg.get_Image(SLeft1Path2);
        SLeftImg2[1] = cimg.get_Image(SLeft2Path2);
        SLeftImg2[2] = cimg.get_Image(SLeft3Path2);
        SLeftImg2[3] = cimg.get_Image(SLeft4Path2);
        
        SRightImg2[0] = cimg.get_Image(SRight1Path2);
        SRightImg2[1] = cimg.get_Image(SRight2Path2);
        SRightImg2[2] = cimg.get_Image(SRight3Path2);
        SRightImg2[3] = cimg.get_Image(SRight4Path2);
        
        SUpImg2[0] = cimg.get_Image(SUp1Path2);
        SUpImg2[1] = cimg.get_Image(SUp2Path2);
        SUpImg2[2] = cimg.get_Image(SUp3Path2);
        SUpImg2[3] = cimg.get_Image(SUp4Path2);
        
        SDownImg2[0] = cimg.get_Image(SDown1Path2);
        SDownImg2[1] = cimg.get_Image(SDown2Path2);
        SDownImg2[2] = cimg.get_Image(SDown3Path2);
        SDownImg2[3] = cimg.get_Image(SDown4Path2);
        
        SLeftImg1[0] = cimg.get_Image(SLeft1Path1);
        SLeftImg1[1] = cimg.get_Image(SLeft2Path1);
        SLeftImg1[2] = cimg.get_Image(SLeft3Path1);
        SLeftImg1[3] = cimg.get_Image(SLeft4Path1);
        
        SRightImg1[0] = cimg.get_Image(SRight1Path1);
        SRightImg1[1] = cimg.get_Image(SRight2Path1);
        SRightImg1[2] = cimg.get_Image(SRight3Path1);
        SRightImg1[3] = cimg.get_Image(SRight4Path1);
        
        SUpImg1[0] = cimg.get_Image(SUp1Path1);
        SUpImg1[1] = cimg.get_Image(SUp2Path1);
        SUpImg1[2] = cimg.get_Image(SUp3Path1);
        SUpImg1[3] = cimg.get_Image(SUp4Path1);
        
        SDownImg1[0] = cimg.get_Image(SDown1Path1);
        SDownImg1[1] = cimg.get_Image(SDown2Path1);
        SDownImg1[2] = cimg.get_Image(SDown3Path1);
        SDownImg1[3] = cimg.get_Image(SDown4Path1);
        
        if(OwnerPlayer == 1){
            Player1Up[0] = cimg.get_Image(Up1Path);
            Player1Up[1] = cimg.get_Image(Up2Path);
            Player1Up[2] = cimg.get_Image(Up3Path);
            Player1Up[3] = cimg.get_Image(Up4Path);
            
            Player1Left[0] = cimg.get_Image(Left1Path);
            Player1Left[1] = cimg.get_Image(Left2Path);
            Player1Left[2] = cimg.get_Image(Left3Path);
            Player1Left[3] = cimg.get_Image(Left4Path);
            
            Player1Down[0] = cimg.get_Image(Down1Path);
            Player1Down[1] = cimg.get_Image(Down2Path);
            Player1Down[2] = cimg.get_Image(Down3Path);
            Player1Down[3] = cimg.get_Image(Down4Path);
            
            Player1Right[0] = cimg.get_Image(Right1Path);
            Player1Right[1] = cimg.get_Image(Right2Path);
            Player1Right[2] = cimg.get_Image(Right3Path);
            Player1Right[3] = cimg.get_Image(Right4Path);
            //*******************************************
            Player2Up[0] = cimg.get_Image(Up1Path2);
            Player2Up[1] = cimg.get_Image(Up2Path2);
            Player2Up[2] = cimg.get_Image(Up3Path2);
            Player2Up[3] = cimg.get_Image(Up4Path2);
            
            Player2Left[0] = cimg.get_Image(Left1Path2);
            Player2Left[1] = cimg.get_Image(Left2Path2);
            Player2Left[2] = cimg.get_Image(Left3Path2);
            Player2Left[3] = cimg.get_Image(Left4Path2);
            
            Player2Down[0] = cimg.get_Image(Down1Path2);
            Player2Down[1] = cimg.get_Image(Down2Path2);
            Player2Down[2] = cimg.get_Image(Down3Path2);
            Player2Down[3] = cimg.get_Image(Down4Path2);
            
            Player2Right[0] = cimg.get_Image(Right1Path2);
            Player2Right[1] = cimg.get_Image(Right2Path2);
            Player2Right[2] = cimg.get_Image(Right3Path2);
            Player2Right[3] = cimg.get_Image(Right4Path2);
        }
        
        if(OwnerPlayer == 2){
            Player2Up[0] = cimg.get_Image(Up1Path);
            Player2Up[1] = cimg.get_Image(Up2Path);
            Player2Up[2] = cimg.get_Image(Up3Path);
            Player2Up[3] = cimg.get_Image(Up4Path);
            
            Player2Left[0] = cimg.get_Image(Left1Path);
            Player2Left[1] = cimg.get_Image(Left2Path);
            Player2Left[2] = cimg.get_Image(Left3Path);
            Player2Left[3] = cimg.get_Image(Left4Path);
            
            Player2Down[0] = cimg.get_Image(Down1Path);
            Player2Down[1] = cimg.get_Image(Down2Path);
            Player2Down[2] = cimg.get_Image(Down3Path);
            Player2Down[3] = cimg.get_Image(Down4Path);
            
            Player2Right[0] = cimg.get_Image(Right1Path);
            Player2Right[1] = cimg.get_Image(Right2Path);
            Player2Right[2] = cimg.get_Image(Right3Path);
            Player2Right[3] = cimg.get_Image(Right4Path);
            //*******************************************
            Player1Up[0] = cimg.get_Image(Up1Path2);
            Player1Up[1] = cimg.get_Image(Up2Path2);
            Player1Up[2] = cimg.get_Image(Up3Path2);
            Player1Up[3] = cimg.get_Image(Up4Path2);
            
            Player1Left[0] = cimg.get_Image(Left1Path2);
            Player1Left[1] = cimg.get_Image(Left2Path2);
            Player1Left[2] = cimg.get_Image(Left3Path2);
            Player1Left[3] = cimg.get_Image(Left4Path2);
            
            Player1Down[0] = cimg.get_Image(Down1Path2);
            Player1Down[1] = cimg.get_Image(Down2Path2);
            Player1Down[2] = cimg.get_Image(Down3Path2);
            Player1Down[3] = cimg.get_Image(Down4Path2);
            
            Player1Right[0] = cimg.get_Image(Right1Path2);
            Player1Right[1] = cimg.get_Image(Right2Path2);
            Player1Right[2] = cimg.get_Image(Right3Path2);
            Player1Right[3] = cimg.get_Image(Right4Path2);
        }
        
        
        
        
        LifeImg[0] = cimg.get_Image(LifePath1);
        LifeImg[1] = cimg.get_Image(LifePath2);
        LifeImg[2] = cimg.get_Image(LifePath3);
        LifeImg[3] = cimg.get_Image(LifePath4);
        
        ArmorImg[0] = cimg.get_Image(ArmorPath1);
        ArmorImg[1] = cimg.get_Image(ArmorPath2);
        ArmorImg[2] = cimg.get_Image(ArmorPath3);
        ArmorImg[3] = cimg.get_Image(ArmorPath4);
        
        MapItemImg[0] = cimg.get_Image(BetonPath);
        MapItemImg[1] = cimg.get_Image(BrickPath);
        MapItemImg[2] = cimg.get_Image(OldBrickPath);
        MapItemImg[3] = cimg.get_Image(WaterPath);
        MapItemImg[4] = cimg.get_Image(TreePath);
        MapItemImg[5] = cimg.get_Image(HospitalPath);
        MapItemImg[6] = cimg.get_Image(StarPath);
        MapItemImg[7] = cimg.get_Image(FlagPath);
        
        SelectItemImg[0] = cimg.get_Image(SumItem);
        SelectItemImg[1] = null;
        
        MapImage = MapItemImg[0];
        LifeImage = LifeImg[0];
        ArmorImage = ArmorImg[0];
        SumImage = sumImg[0];
        SelectItemImage = cimg.get_Image(SumItem);
    }
    
    public Image PathSummary(int head,int target, int p){
        Image PImage = null;
        if(p == Game1){
            if(head == PUP && target == TUP){
                PImage = Player1Up[0];
            }else if(head == PUP && target== TRIGHT){
                PImage = Player1Up[3];
            }else if(head == PUP && target== TDOWN){
                PImage = Player1Up[2];
            }else if(head == PUP && target== TLEFT){
                PImage = Player1Up[1];
            }else if(head == PLEFT && target== TLEFT){
                PImage = Player1Left[0];
            }else if(head == PLEFT && target== TDOWN){
                PImage = Player1Left[1];
            }else if(head == PLEFT && target== TRIGHT){
                PImage = Player1Left[2];
            }else if(head == PLEFT && target== TUP){
                PImage = Player1Left[3];
            }else if(head == PDOWN && target== TDOWN){
                PImage = Player1Down[0];
            }else if(head == PDOWN && target== TRIGHT){
                PImage = Player1Down[1];
            }else if(head == PDOWN && target== TUP){
                PImage = Player1Down[2];
            }else if(head == PDOWN && target== TLEFT){
                PImage = Player1Down[3];
            }else if(head == PRIGHT && target== TRIGHT){
                PImage = Player1Right[0];
            }else if(head == PRIGHT && target== TUP){
                PImage = Player1Right[3];
            }else if(head == PRIGHT && target== TLEFT){
                PImage = Player1Right[2];
            }else if(head == PRIGHT && target== TDOWN){
                PImage = Player1Right[1];
            }
        }else if(p == Game2){
            if(head == PUP && target == TUP){
                PImage = Player2Up[0];
            }else if(head == PUP && target== TRIGHT){
                PImage = Player2Up[3];
            }else if(head == PUP && target== TDOWN){
                PImage = Player2Up[2];
            }else if(head == PUP && target== TLEFT){
                PImage = Player2Up[1];
            }else if(head == PLEFT && target== TLEFT){
                PImage = Player2Left[0];
            }else if(head == PLEFT && target== TDOWN){
                PImage = Player2Left[1];
            }else if(head == PLEFT && target== TRIGHT){
                PImage = Player2Left[2];
            }else if(head == PLEFT && target== TUP){
                PImage = Player2Left[3];
            }else if(head == PDOWN && target== TDOWN){
                PImage = Player2Down[0];
            }else if(head == PDOWN && target== TRIGHT){
                PImage = Player2Down[1];
            }else if(head == PDOWN && target== TUP){
                PImage = Player2Down[2];
            }else if(head == PDOWN && target== TLEFT){
                PImage = Player2Down[3];
            }else if(head == PRIGHT && target== TRIGHT){
                PImage = Player2Right[0];
            }else if(head == PRIGHT && target== TUP){
                PImage = Player2Right[3];
            }else if(head == PRIGHT && target== TLEFT){
                PImage = Player2Right[2];
            }else if(head == PRIGHT && target== TDOWN){
                PImage = Player2Right[1];
            }
        }else if(p == SGame1){
            if(head == PUP && target == TUP){
                PImage = SUpImg1[0];
            }else if(head == PUP && target== TRIGHT){
                PImage = SUpImg1[3];
            }else if(head == PUP && target== TDOWN){
                PImage = SUpImg1[2];
            }else if(head == PUP && target== TLEFT){
                PImage = SUpImg1[1];
            }else if(head == PLEFT && target== TLEFT){
                PImage = SLeftImg1[0];
            }else if(head == PLEFT && target== TDOWN){
                PImage = SLeftImg1[1];
            }else if(head == PLEFT && target== TRIGHT){
                PImage = SLeftImg1[2];
            }else if(head == PLEFT && target== TUP){
                PImage = SLeftImg1[3];
            }else if(head == PDOWN && target== TDOWN){
                PImage = SDownImg1[0];
            }else if(head == PDOWN && target== TRIGHT){
                PImage = SDownImg1[1];
            }else if(head == PDOWN && target== TUP){
                PImage = SDownImg1[2];
            }else if(head == PDOWN && target== TLEFT){
                PImage = SDownImg1[3];
            }else if(head == PRIGHT && target== TRIGHT){
                PImage = SRightImg1[0];
            }else if(head == PRIGHT && target== TUP){
                PImage = SRightImg1[3];
            }else if(head == PRIGHT && target== TLEFT){
                PImage = SRightImg1[2];
            }else if(head == PRIGHT && target== TDOWN){
                PImage = SRightImg1[1];
            }
        }else if(p == SGame2){
            if(head == PUP && target == TUP){
                PImage = SUpImg2[0];
            }else if(head == PUP && target== TRIGHT){
                PImage = SUpImg2[3];
            }else if(head == PUP && target== TDOWN){
                PImage = SUpImg2[2];
            }else if(head == PUP && target== TLEFT){
                PImage = SUpImg2[1];
            }else if(head == PLEFT && target== TLEFT){
                PImage = SLeftImg2[0];
            }else if(head == PLEFT && target== TDOWN){
                PImage = SLeftImg2[1];
            }else if(head == PLEFT && target== TRIGHT){
                PImage = SLeftImg2[2];
            }else if(head == PLEFT && target== TUP){
                PImage = SLeftImg2[3];
            }else if(head == PDOWN && target== TDOWN){
                PImage = SDownImg2[0];
            }else if(head == PDOWN && target== TRIGHT){
                PImage = SDownImg2[1];
            }else if(head == PDOWN && target== TUP){
                PImage = SDownImg2[2];
            }else if(head == PDOWN && target== TLEFT){
                PImage = SDownImg2[3];
            }else if(head == PRIGHT && target== TRIGHT){
                PImage = SRightImg2[0];
            }else if(head == PRIGHT && target== TUP){
                PImage = SRightImg2[3];
            }else if(head == PRIGHT && target== TLEFT){
                PImage = SRightImg2[2];
            }else if(head == PRIGHT && target== TDOWN){
                PImage = SRightImg2[1];
            }
        }
        return PImage;
    }
    
    @Override
    @SuppressWarnings(value = "unchecked")
    public void paintComponent(Graphics g) {
        Graphics2D g2 = null;
        super.paintComponent(g);
        g2 = (Graphics2D) g;
        
        if (GForm == MainMenu) {
            g2.drawImage(WallpaperImg, 0, 0, this);
            g2.drawImage(PlayImg, x1, 60, this);
            g2.drawImage(SettingsImg, x2, 134, this);
            g2.drawImage(StaticImg, x3, 204, this);
            g2.drawImage(ExitImg, x4, 278, this);
        } else if (GForm == Play) {
            g2.drawImage(WallpaperImg, 0, 0, this);
            g2.drawImage(SingleImg, x5, 60, this);
            g2.drawImage(MulthiImg, x6, 134, this);
        } else if (GForm == Multhi) {
            checkShoot();
            DetectCollision();
            
            if(ServerMode == 1){
                doChangeEnemy();
                AddEnemies();
                AddEnemiesRight();
                DetectCollEnemy();
                detectWar();
            }
            
            if (!MapVectorP.isEmpty()) {
                for (int j = 0; j < MapVectorP.size(); j++) {
                    if(Integer.parseInt(MapVectorM.get(j).toString()) != 5){
                        g2.drawImage(MapVectorP.get(j), Integer.parseInt(MapVectorX.get(j).toString()), Integer.parseInt(MapVectorY.get(j).toString()), this);
                    }
                }
            } else if (MapVectorP.isEmpty()) {
                DrawMap();
            }
            
            
            if(!VectorSoldier2.isEmpty()){
                for(int i=0; i < VectorSoldier2.size(); i++){
                    g2.drawImage(VectorSoldier2.get(i),Integer.parseInt(VectorSoldier2X.get(i).toString()),Integer.parseInt(VectorSoldier2Y.get(i).toString()),this);
                }
            }
            
            if(!VectorSoldier1.isEmpty()){
                for(int i=0; i < VectorSoldier1.size(); i++){
                    g2.drawImage(VectorSoldier1.get(i),Integer.parseInt(VectorSoldier1X.get(i).toString()),Integer.parseInt(VectorSoldier1Y.get(i).toString()),this);
                }
            }
            
            //*********** Player 1************
            if(!VectorPlayer1.isEmpty()){
                g2.drawImage(VectorPlayer1.get(0), Integer.parseInt(String.valueOf(VectorPlayer1X.get(0))) , Integer.parseInt(String.valueOf(VectorPlayer1Y.get(0))), this);
            }
            //*********** Player 1************
            
            
            //*********** Player 2************
            if(!VectorPlayer2.isEmpty()){
                g2.drawImage(VectorPlayer2.get(0), Integer.parseInt(String.valueOf(VectorPlayer2X.get(0))) , Integer.parseInt(String.valueOf(VectorPlayer2Y.get(0))), this);
            }
            
            if (!SumVectorP2.isEmpty()) {
                for (int i = 0; i < SumVectorP2.size(); i++) {
                    try{
                        g2.drawImage(SumVectorP2.get(i), Integer.parseInt(SumVectorX2.get(i).toString()), Integer.parseInt(SumVectorY2.get(i).toString()), this);
                    } catch(Exception e){}
                }
            }
            
            //*********** Player 2************
            
            
            if (!SumVectorP.isEmpty()) {
                for (int i = 0; i < SumVectorP.size(); i++) {
                    g2.drawImage(SumVectorP.get(i), Integer.parseInt(SumVectorX.get(i).toString()), Integer.parseInt(SumVectorY.get(i).toString()), this);
                    int t = Integer.parseInt(SumVectorT.get(i).toString());
                    SumMove(t, i);
                  /*  if(!VectorPlayer2.isEmpty()){
                        if(isCollision(Integer.parseInt(SumVectorX.get(i).toString()),Integer.parseInt(SumVectorY.get(i).toString()),7,15,Integer.parseInt(VectorPlayer2X.get(0).toString())+22,Integer.parseInt(VectorPlayer2Y.get(0).toString())+22,46,46)){
                            System.out.println("Coll");
                            if(Integer.parseInt(VectorPlayer2A.get(0).toString()) > 0){
                                //-1
                                //tk.Send(""+index,IPChat, PortChat);
                            }else if(Integer.parseInt(VectorPlayer2A.get(0).toString()) == 0){
                                if(Integer.parseInt(VectorPlayer2L.get(0).toString()) > 0){
                                    //-1
                   
                                }else if(Integer.parseInt(VectorPlayer2L.get(0).toString()) == 0){
                                    //dead
                   
                                }
                            }
                        }
                    }*/
                }
            }
            
            if (!SumVectorPE.isEmpty()) {
                for (int i = 0; i < SumVectorPE.size(); i++) {
                    try{
                        g2.drawImage(SumVectorPE.get(i), Integer.parseInt(SumVectorXE.get(i).toString()), Integer.parseInt(SumVectorYE.get(i).toString()), this);
                    }catch(Exception e) {}
                    int t = Integer.parseInt(SumVectorTE.get(i).toString());
                    doAmmoMove(i,t);
                }
            }
            
            if (!SumVectorPS.isEmpty()) {
                for (int i = 0; i < SumVectorPS.size(); i++) {
                    try{
                        g2.drawImage(SumVectorPS.get(i), Integer.parseInt(SumVectorXS.get(i).toString()), Integer.parseInt(SumVectorYS.get(i).toString()), this);
                    }catch(Exception e) {}
                }
            }
            
            
            
            if (!MapVectorP.isEmpty()) {
                for (int j = 0; j < MapVectorP.size(); j++) {
                    if(Integer.parseInt(MapVectorM.get(j).toString()) == 5){
                        g2.drawImage(MapVectorP.get(j), Integer.parseInt(MapVectorX.get(j).toString()), Integer.parseInt(MapVectorY.get(j).toString()), this);
                    }
                }
            } else if (MapVectorP.isEmpty()) {
                DrawMap();
            }
            g2.drawImage(FrameImg, 0, 0, this);
            //*********** Player 1************
            getLife();
            getArmor();
            g2.drawImage(LifeImage, LifeX, LifeY, this);
            g2.drawImage(ArmorImage, ArmorX, ArmorY, this);
            
            Font font = new Font("Serif", Font.BOLD, 20);
            g2.setFont(font);
            g2.setColor(Color.white);
            g2.drawString("\u041e\u043d\u043e\u043e:", 700, 25);
            g2.drawString(String.valueOf(PlayerScore), 760, 25);
            g2.drawString("\u041d\u044d\u0440:" + PlayerName, 405, 780);
            g2.drawString("\u0421\u0443\u043c:", 745, 775);
            if(!VectorPlayer1Sum.isEmpty()){
                g2.drawString(String.valueOf(VectorPlayer1Sum.get(0)), 805, 755);
            }
            g2.drawImage(SelectItemImage, 85, 730, this);
            //*********** Player 1************
            
            if (!RecieveChat.isEmpty()) {
                for (int i = 0; i < RecieveChat.size(); i++) {
                    VectorMessY.set(i,MesY[i]);
                    if (Integer.parseInt(MessageTime.get(i).toString()) >= 0) {
                        Font font3 = new Font("Serif", Font.ROMAN_BASELINE, 13);
                        g2.setFont(font3);
                        g2.setColor(Color.ORANGE);
                        g2.drawString(RecieveChat.get(i), 30, Integer.parseInt(VectorMessY.get(i).toString()));
                        MessageTime.set(i, Integer.parseInt(MessageTime.get(i).toString()) - 1);
                    } else {
                        RecieveChat.removeElementAt(i);
                        MessageTime.removeElementAt(i);
                        VectorMessY.removeElementAt(i);
                    }
                }
            }
            Font fOver = new Font("Serif", Font.ROMAN_BASELINE, 25);
            g2.setFont(fOver);
            g.drawString(GAME_OVER,500,400);
            
        } else if (GForm == Static) {
            g2.drawImage(WallpaperImg, 0, 0, this);
            g2.setColor(Color.LIGHT_GRAY);
            g2.fillRoundRect(getWidth() / 4, getHeight() / 4, getWidth() / 2, getHeight() / 2, 50, 50);
            Font font = new Font("Serif", Font.BOLD, 30);
            g2.setFont(font);
            g2.setColor(Color.blue);
            g2.drawString("\u041d\u044d\u0440:", getWidth() / 3 - 30, getHeight() / 4 + 30);
            g2.drawString("\u041e\u043d\u043e\u043e:", getWidth() / 3 - 30 + 150, getHeight() / 4 + 30);
            g2.drawString("orHoo:", getWidth() / 3 - 30 + 300, getHeight() / 4 + 30);
        } else if (GForm == Single) {
            //Game Mode....
            checkShoot();
            DetectCollision();
            doChangeEnemy();
            AddEnemies();
            AddEnemiesRight();
            
            if (!MapVectorP.isEmpty()) {
                for (int j = 0; j < MapVectorP.size(); j++) {
                    if(Integer.parseInt(MapVectorM.get(j).toString()) != 5){
                        g2.drawImage(MapVectorP.get(j), Integer.parseInt(MapVectorX.get(j).toString()), Integer.parseInt(MapVectorY.get(j).toString()), this);
                    }
                }
            } else if (MapVectorP.isEmpty()) {
                DrawMap();
            }
            
            
            if(!VectorSoldier2.isEmpty()){
                for(int i=0; i < VectorSoldier2.size(); i++){
                    g2.drawImage(VectorSoldier2.get(i),Integer.parseInt(VectorSoldier2X.get(i).toString()),Integer.parseInt(VectorSoldier2Y.get(i).toString()),this);
                }
            }
            
            if(!VectorSoldier1.isEmpty()){
                for(int i=0; i < VectorSoldier1.size(); i++){
                    g2.drawImage(VectorSoldier1.get(i),Integer.parseInt(VectorSoldier1X.get(i).toString()),Integer.parseInt(VectorSoldier1Y.get(i).toString()),this);
                }
            }
            
            
            
            //*********** Player 1************
            g2.drawImage(VectorPlayer1.get(0), Integer.parseInt(String.valueOf(VectorPlayer1X.get(0))) , Integer.parseInt(String.valueOf(VectorPlayer1Y.get(0))), this);
            //*********** Player 1************
            
            
            if (!SumVectorP.isEmpty()) {
                for (int i = 0; i < SumVectorP.size(); i++) {
                    g2.drawImage(SumVectorP.get(i), Integer.parseInt(SumVectorX.get(i).toString()), Integer.parseInt(SumVectorY.get(i).toString()), this);
                    int t = Integer.parseInt(SumVectorT.get(i).toString());
                    SumMove(t, i);
                }
            }
            
            if (!SumVectorPE.isEmpty()) {
                for (int i = 0; i < SumVectorPE.size(); i++) {
                    g2.drawImage(SumVectorPE.get(i), Integer.parseInt(SumVectorXE.get(i).toString()), Integer.parseInt(SumVectorYE.get(i).toString()), this);
                    int t = Integer.parseInt(SumVectorTE.get(i).toString());
                    doAmmoMove(i,t);
                }
            }
            
            if (!MapVectorP.isEmpty()) {
                for (int j = 0; j < MapVectorP.size(); j++) {
                    if(Integer.parseInt(MapVectorM.get(j).toString()) == 5){
                        g2.drawImage(MapVectorP.get(j), Integer.parseInt(MapVectorX.get(j).toString()), Integer.parseInt(MapVectorY.get(j).toString()), this);
                    }
                }
            } else if (MapVectorP.isEmpty()) {
                DrawMap();
            }
            g2.drawImage(FrameImg, 0, 0, this);
            //*********** Player 1************
            getLife();
            getArmor();
            g2.drawImage(LifeImage, LifeX, LifeY, this);
            g2.drawImage(ArmorImage, ArmorX, ArmorY, this);
            
            Font font = new Font("Serif", Font.BOLD, 20);
            g2.setFont(font);
            g2.setColor(Color.white);
            g2.drawString("\u041e\u043d\u043e\u043e:", 700, 25);
            g2.drawString(String.valueOf(PlayerScore), 760, 25);
            g2.drawString("\u041d\u044d\u0440:" + PlayerName, 405, 780);
            g2.drawString("\u0421\u0443\u043c:", 745, 775);
            g2.drawString(String.valueOf(VectorPlayer1Sum.get(0)), 805, 755);
            g2.drawImage(SelectItemImage, 85, 730, this);
            //*********** Player 1************
        }
    }
    
    public void setTank(int status,int life,int armor,int head,int target,int x,int y,int sum){
        if(status == Game1){
            VectorPlayer1.setElementAt(PathSummary(head,target,Game1),0);
            VectorPlayer1X.setElementAt(x,0);
            VectorPlayer1Y.setElementAt(y,0);
            VectorPlayer1A.setElementAt(armor,0);
            VectorPlayer1H.setElementAt(head,0);
            VectorPlayer1T.setElementAt(target,0);
            VectorPlayer1L.setElementAt(life,0);
            VectorPlayer1S.setElementAt(status,0);
            VectorPlayer1Sum.setElementAt(sum,0);
        }else if(status == Game2){
            VectorPlayer2.setElementAt(PathSummary(head,target,Game2),0);
            VectorPlayer2X.setElementAt(x,0);
            VectorPlayer2Y.setElementAt(y,0);
            VectorPlayer2A.setElementAt(armor,0);
            VectorPlayer2H.setElementAt(head,0);
            VectorPlayer2T.setElementAt(target,0);
            VectorPlayer2L.setElementAt(life,0);
            VectorPlayer2S.setElementAt(status,0);
            VectorPlayer2Sum.setElementAt(sum,0);
        }
    }
    
    public void AddTank(int status,int life,int armor,int head,int target,int x,int y,int sum){
        if(status == Game1){
            VectorPlayer1.addElement(PathSummary(head,target,Game1));
            VectorPlayer1X.addElement(x);
            VectorPlayer1Y.addElement(y);
            VectorPlayer1A.addElement(armor);
            VectorPlayer1H.addElement(head);
            VectorPlayer1T.addElement(target);
            VectorPlayer1L.addElement(life);
            VectorPlayer1S.addElement(status);
            VectorPlayer1Sum.addElement(sum);
        }else if(status == Game2){
            VectorPlayer2.addElement(PathSummary(head,target,Game2));
            VectorPlayer2X.addElement(x);
            VectorPlayer2Y.addElement(y);
            VectorPlayer2A.addElement(armor);
            VectorPlayer2H.addElement(head);
            VectorPlayer2T.addElement(target);
            VectorPlayer2L.addElement(life);
            VectorPlayer2S.addElement(status);
            VectorPlayer2Sum.addElement(sum);
        }else if(status == SGame2){
            VectorSoldier2.addElement(PathSummary(head,target,SGame2));
            VectorSoldier2X.addElement(x);
            VectorSoldier2Y.addElement(y);
            VectorSoldier2A.addElement(armor);
            VectorSoldier2H.addElement(head);
            VectorSoldier2T.addElement(target);
            VectorSoldier2L.addElement(life);
            VectorSoldier2S.addElement(status);
            VectorSoldier2C.addElement(1);
            VectorSoldier2W.addElement(-1);
        }else if(status == SGame1){
            VectorSoldier2.addElement(PathSummary(head,target,SGame1));
            VectorSoldier2X.addElement(x);
            VectorSoldier2Y.addElement(y);
            VectorSoldier2A.addElement(armor);
            VectorSoldier2H.addElement(head);
            VectorSoldier2T.addElement(target);
            VectorSoldier2L.addElement(life);
            VectorSoldier2S.addElement(status);
            VectorSoldier2C.addElement(1);
            VectorSoldier2W.addElement(-1);
        }
    }
    
    @SuppressWarnings(value = {"unchecked", "unchecked"})
    public void DrawMap(){
        int Mean = 0;
        try {
            for (int i = 0; i <= 17; i++) {
                for (int j = 0; j <= 13; j++) {
                    if (MapLevel1[j][i] == 1) {
                        Mean = MapLevel1[j][i];
                        MapImage = MapItemImg[0];
                    } else if (MapLevel1[j][i] == 2) {
                        MapImage = MapItemImg[1];
                        Mean = MapLevel1[j][i];
                    } else if (MapLevel1[j][i] == 3) {
                        MapImage = MapItemImg[2];
                        Mean = MapLevel1[j][i];
                    } else if (MapLevel1[j][i] == 4) {
                        MapImage = MapItemImg[3];
                        Mean = MapLevel1[j][i];
                    } else if (MapLevel1[j][i] == 5) {
                        MapImage = MapItemImg[4];
                        Mean = MapLevel1[j][i];
                    } else if (MapLevel1[j][i] == 6) {
                        MapImage = MapItemImg[5];
                        Mean = MapLevel1[j][i];
                    } else if (MapLevel1[j][i] == 7) {
                        MapImage = MapItemImg[6];
                        Mean = MapLevel1[j][i];
                    } else if (MapLevel1[j][i] == 0) {
                        MapImage = null;
                        Mean = MapLevel1[j][i];
                    } else if(MapLevel1[j][i] == 8){
                        MapImage = MapItemImg[7];
                        Mean = MapLevel1[j][i];
                    }
                    MapVectorP.addElement(MapImage);
                    MapVectorX.addElement(MapX[i]);
                    MapVectorY.addElement(MapY[j]);
                    MapVectorM.addElement(Mean);
                }
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public void checkShoot(){
        if(ShootTime >0){
            ShootTime--;
        }else{
            isShoot = true;
        }
    }
    
    public void getLife() {
        if(!VectorPlayer1.isEmpty()){
            if (Integer.parseInt(String.valueOf(VectorPlayer1L.get(0))) == 1) {
                LifeImage = LifeImg[0];
            } else if (Integer.parseInt(String.valueOf(VectorPlayer1L.get(0))) == 2) {
                LifeImage = LifeImg[1];
            } else if (Integer.parseInt(String.valueOf(VectorPlayer1L.get(0))) == 3) {
                LifeImage = LifeImg[2];
            } else if (Integer.parseInt(String.valueOf(VectorPlayer1L.get(0))) == 4) {
                LifeImage = LifeImg[3];
            }else if (Integer.parseInt(String.valueOf(VectorPlayer1L.get(0))) == 0) {
                LifeImage = null;
            }
        }else{
            LifeImage = null;
        }
    }
    
    public void getArmor() {
        if(!VectorPlayer1.isEmpty()){
            if (Integer.parseInt(String.valueOf(VectorPlayer1A.get(0))) == 1) {
                ArmorImage = ArmorImg[0];
            } else if (Integer.parseInt(String.valueOf(VectorPlayer1A.get(0))) == 2) {
                ArmorImage = ArmorImg[1];
            } else if (Integer.parseInt(String.valueOf(VectorPlayer1A.get(0))) == 3) {
                ArmorImage = ArmorImg[2];
            } else if (Integer.parseInt(String.valueOf(VectorPlayer1A.get(0))) == 4) {
                ArmorImage = ArmorImg[3];
            } else if (Integer.parseInt(String.valueOf(VectorPlayer1A.get(0))) == 0) {
                ArmorImage = null;
            }
        }else{
            ArmorImage = null;
        }
    }
    
    public void SumMove(int t, int i) {
        switch (t) {
            case TUP:
            {
                if (Integer.parseInt(SumVectorY.get(i).toString()) <= 10) {
                    DeleteSum(i);
                } else {
                    SumVectorY.set(i, Integer.parseInt(SumVectorY.get(i).toString()) - SumSpeed);
                }
            }
            break;
            case TRIGHT:
            {
                if (Integer.parseInt(SumVectorX.get(i).toString()) >= 880) {
                    DeleteSum(i);
                } else {
                    SumVectorX.set(i, Integer.parseInt(SumVectorX.get(i).toString()) + SumSpeed);
                }
            }
            break;
            case TDOWN:
            {
                if (Integer.parseInt(SumVectorY.get(i).toString()) >= 675) {
                    DeleteSum(i);
                } else {
                    SumVectorY.set(i, Integer.parseInt(SumVectorY.get(i).toString()) + SumSpeed);
                }
            }
            break;
            case TLEFT:
            {
                if (Integer.parseInt(SumVectorX.get(i).toString()) <= 10) {
                    DeleteSum(i);
                } else {
                    SumVectorX.set(i, Integer.parseInt(SumVectorX.get(i).toString()) - SumSpeed);
                }
            }
            break;
        }
    }
    
    public boolean isCollision(int x1,int y1,int w1,int h1, int x2,int y2,int w2,int h2){
        return(x1 < x2 + w2 &&
                x2 < x1 + w1 &&
                y1 < y2 + h2 &&
                y2 < y1 + h1 );
    }
    
    
    public void DetectPCollUP(){
        if(!MapVectorP.isEmpty()){
            for(int i=0; i<MapVectorP.size(); i++){
                if(Integer.parseInt(MapVectorM.get(i).toString()) == 6){
                    if(isCollision(Integer.parseInt(MapVectorX.get(i).toString()),Integer.parseInt(MapVectorY.get(i).toString()),50,50,Integer.parseInt(VectorPlayer1X.get(0).toString())+22,Integer.parseInt(VectorPlayer1Y.get(0).toString())+22,46,46) == true){
                        VectorPlayer1L.setElementAt(4,0);
                        DeleteMapItem(i);
                    }
                }else if(Integer.parseInt(MapVectorM.get(i).toString()) == 7){
                    if(isCollision(Integer.parseInt(MapVectorX.get(i).toString()),Integer.parseInt(MapVectorY.get(i).toString()),50,50,Integer.parseInt(VectorPlayer1X.get(0).toString())+22,Integer.parseInt(VectorPlayer1Y.get(0).toString())+22,46,46) == true){
                        VectorPlayer1Sum.setElementAt(Integer.parseInt(VectorPlayer1Sum.get(0).toString())+100,0);
                        DeleteMapItem(i);
                    }
                }else if(Integer.parseInt(MapVectorM.get(i).toString()) == 1 || Integer.parseInt(MapVectorM.get(i).toString()) == 2 || Integer.parseInt(MapVectorM.get(i).toString()) == 3 || Integer.parseInt(MapVectorM.get(i).toString()) == 4){
                    if(isCollision(Integer.parseInt(MapVectorX.get(i).toString()),Integer.parseInt(MapVectorY.get(i).toString()),50,50,Integer.parseInt(VectorPlayer1X.get(0).toString())+22,Integer.parseInt(VectorPlayer1Y.get(0).toString())+22,46,46) == true){
                        isMove = false;
                        indexUP = i;
                    }
                    if(indexBACK != -1){
                        if(isCollision(Integer.parseInt(MapVectorX.get(indexBACK).toString()),Integer.parseInt(MapVectorY.get(indexBACK).toString()),50,50,Integer.parseInt(VectorPlayer1X.get(0).toString())+22,Integer.parseInt(VectorPlayer1Y.get(0).toString())+22,46,46) != true){
                            isBackMove = true;
                            indexBACK = -1;
                        }
                    }
                }
            }
        }
    }
    
    public void DetectPCollBACK(){
        if(!MapVectorP.isEmpty()){
            for(int i=0; i<MapVectorP.size(); i++){
                if(Integer.parseInt(MapVectorM.get(i).toString()) == 6){
                    if(isCollision(Integer.parseInt(MapVectorX.get(i).toString()),Integer.parseInt(MapVectorY.get(i).toString()),50,50,Integer.parseInt(VectorPlayer1X.get(0).toString())+22,Integer.parseInt(VectorPlayer1Y.get(0).toString())+22,46,46) == true){
                        VectorPlayer1L.setElementAt(4,0);
                        DeleteMapItem(i);
                    }
                }else if(Integer.parseInt(MapVectorM.get(i).toString()) == 7){
                    if(isCollision(Integer.parseInt(MapVectorX.get(i).toString()),Integer.parseInt(MapVectorY.get(i).toString()),50,50,Integer.parseInt(VectorPlayer1X.get(0).toString())+22,Integer.parseInt(VectorPlayer1Y.get(0).toString())+22,46,46) == true){
                        VectorPlayer1Sum.setElementAt(Integer.parseInt(VectorPlayer1Sum.get(0).toString())+100,0);
                        DeleteMapItem(i);
                    }
                }else if(Integer.parseInt(MapVectorM.get(i).toString()) == 1 || Integer.parseInt(MapVectorM.get(i).toString()) == 2 || Integer.parseInt(MapVectorM.get(i).toString()) == 3 || Integer.parseInt(MapVectorM.get(i).toString()) == 4){
                    if(isCollision(Integer.parseInt(MapVectorX.get(i).toString()),Integer.parseInt(MapVectorY.get(i).toString()),50,50,Integer.parseInt(VectorPlayer1X.get(0).toString())+22,Integer.parseInt(VectorPlayer1Y.get(0).toString())+22,46,46) == true){
                        isBackMove = false;
                        indexBACK = i;
                    }
                    if(indexUP != -1){
                        if(isCollision(Integer.parseInt(MapVectorX.get(indexUP).toString()),Integer.parseInt(MapVectorY.get(indexUP).toString()),50,50,Integer.parseInt(VectorPlayer1X.get(0).toString())+22,Integer.parseInt(VectorPlayer1Y.get(0).toString())+22,46,46) != true){
                            isMove = true;
                            indexUP = -1;
                        }
                    }
                }
            }
        }
    }
    
    public void DeleteMapItem(int index){
        if(GForm == Multhi){
            tk.Send("&"+index,IPChat, PortChat);
        }
        Image TempImg = null;
        MapVectorP.setElementAt(TempImg,index);
        MapVectorM.setElementAt(0,index);
    }
    
    public void ChangeMapItem(int index){
        if(GForm == Multhi){
            tk.Send("?"+index,IPChat, PortChat);
        }
        Image TempRock = MapItemImg[2];
        MapVectorP.setElementAt(TempRock,index);
        MapVectorM.setElementAt(3,index);
    }
    
    public void DetectCollision(){
        if(!MapVectorP.isEmpty()){
            for(int i=0; i<MapVectorP.size(); i++){
                for(int j=0; j<SumVectorP.size(); j++){
                    if(Integer.parseInt(MapVectorM.get(i).toString()) == 2){
                        if(isCollision(Integer.parseInt(MapVectorX.get(i).toString()),Integer.parseInt(MapVectorY.get(i).toString()),50,50,Integer.parseInt(SumVectorX.get(j).toString()),Integer.parseInt(SumVectorY.get(j).toString()),7,15)){
                            ChangeMapItem(i);
                            DeleteSum(j);
                        }
                    }else if(Integer.parseInt(MapVectorM.get(i).toString()) == 3){
                        if(isCollision(Integer.parseInt(MapVectorX.get(i).toString()),Integer.parseInt(MapVectorY.get(i).toString()),50,50,Integer.parseInt(SumVectorX.get(j).toString()),Integer.parseInt(SumVectorY.get(j).toString()),7,15)){
                            DeleteMapItem(i);
                            DeleteSum(j);
                        }
                    }else if(Integer.parseInt(MapVectorM.get(i).toString()) == 1){
                        if(isCollision(Integer.parseInt(MapVectorX.get(i).toString()),Integer.parseInt(MapVectorY.get(i).toString()),50,50,Integer.parseInt(SumVectorX.get(j).toString()),Integer.parseInt(SumVectorY.get(j).toString()),7,15)){
                            DeleteSum(j);
                        }
                    }
                }
            }
        }
    }
    
    
    public void DetectCollEnemy(){
        if(!MapVectorP.isEmpty()){
            for(int i=0; i<MapVectorP.size(); i++){
                for(int j=0; j<SumVectorPE.size(); j++){
                    if(Integer.parseInt(MapVectorM.get(i).toString()) == 2){
                        if(isCollision(Integer.parseInt(MapVectorX.get(i).toString()),Integer.parseInt(MapVectorY.get(i).toString()),50,50,Integer.parseInt(SumVectorXE.get(j).toString()),Integer.parseInt(SumVectorYE.get(j).toString()),7,15)){
                            ChangeMapItem(i);
                            DeleteAmmo(j);
                        }
                    }else if(Integer.parseInt(MapVectorM.get(i).toString()) == 3){
                        if(isCollision(Integer.parseInt(MapVectorX.get(i).toString()),Integer.parseInt(MapVectorY.get(i).toString()),50,50,Integer.parseInt(SumVectorXE.get(j).toString()),Integer.parseInt(SumVectorYE.get(j).toString()),7,15)){
                            DeleteMapItem(i);
                            DeleteAmmo(j);
                        }
                    }else if(Integer.parseInt(MapVectorM.get(i).toString()) == 1){
                        if(isCollision(Integer.parseInt(MapVectorX.get(i).toString()),Integer.parseInt(MapVectorY.get(i).toString()),50,50,Integer.parseInt(SumVectorXE.get(j).toString()),Integer.parseInt(SumVectorYE.get(j).toString()),7,15)){
                            DeleteAmmo(j);
                        }
                    }else if(Integer.parseInt(MapVectorM.get(i).toString()) == 8){
                        if(isCollision(Integer.parseInt(MapVectorX.get(i).toString()),Integer.parseInt(MapVectorY.get(i).toString()),50,50,Integer.parseInt(SumVectorXE.get(j).toString()),Integer.parseInt(SumVectorYE.get(j).toString()),7,15)){
                            // tk.Send("-",IPChat, PortChat);
                            GAME_OVER = "::.. Game Over ..::";
                            DeleteMapItem(i);
                            DeleteAmmo(j);
                        }
                    }
                }
            }
        }
    }
    
    public void detectWar(){
        try{
            if(!SumVectorPE.isEmpty()){
                for(int i=0; i<SumVectorPE.size(); i++){
                    if(!VectorPlayer1.isEmpty()){
                        if(isCollision(Integer.parseInt(VectorPlayer1X.get(0).toString())+22,Integer.parseInt(VectorPlayer1Y.get(0).toString())+22,46,46,Integer.parseInt(SumVectorXE.get(i).toString()),Integer.parseInt(SumVectorYE.get(i).toString()),7,15)){
                            if(Integer.parseInt(VectorPlayer1A.get(0).toString()) > 0){
                                VectorPlayer1A.setElementAt(Integer.parseInt(VectorPlayer1A.get(0).toString())-1,0);
                            }else{
                                if(Integer.parseInt(VectorPlayer1L.get(0).toString()) > 1){
                                    VectorPlayer1L.setElementAt(Integer.parseInt(VectorPlayer1L.get(0).toString())-1,0);
                                }else{
                                    //GAME OVER
                                    VectorPlayer1L.setElementAt(Integer.parseInt(VectorPlayer1L.get(0).toString())-1,0);
                                    VectorPlayer1.removeElementAt(0);
                                    VectorPlayer1X.removeElementAt(0);
                                    VectorPlayer1Y.removeElementAt(0);
                                    VectorPlayer1T.removeElementAt(0);
                                    VectorPlayer1A.removeElementAt(0);
                                    VectorPlayer1L.removeElementAt(0);
                                    VectorPlayer1Sum.removeElementAt(0);
                                    VectorPlayer1S.removeElementAt(0);
                                    VectorPlayer1H.removeElementAt(0);
                                    
                                    tk.Send("-",IPChat, PortChat);
                                }
                            }
                            DeleteAmmo(i);
                            
                        }
                    }
                    if(!VectorPlayer2.isEmpty()){
                        if(isCollision(Integer.parseInt(VectorPlayer2X.get(0).toString())+22,Integer.parseInt(VectorPlayer2Y.get(0).toString())+22,46,46,Integer.parseInt(SumVectorXE.get(i).toString()),Integer.parseInt(SumVectorYE.get(i).toString()),7,15)){
                            tk.Send("+",IPChat, PortChat);
                            DeleteAmmo(i);
                        }
                    }
                }
            }
            if(!VectorSoldier2.isEmpty()){
                for(int i=0; i<VectorSoldier2.size(); i++){
                    if(!SumVectorP.isEmpty()){
                        for(int j=0; j<SumVectorP.size(); j++){
                            if(isCollision(Integer.parseInt(VectorSoldier2X.get(i).toString())+22,Integer.parseInt(VectorSoldier2Y.get(i).toString())+22,46,46,Integer.parseInt(SumVectorX.get(j).toString()),Integer.parseInt(SumVectorY.get(j).toString()),7,15)){
                                if(Integer.parseInt(VectorSoldier2L.get(i).toString()) > 0){
                                    VectorSoldier2L.setElementAt(Integer.parseInt(VectorSoldier2L.get(i).toString())-2,i);
                                }else{
                                    VectorSoldier2.removeElementAt(i);
                                    VectorSoldier2X.removeElementAt(i);
                                    VectorSoldier2Y.removeElementAt(i);
                                    VectorSoldier2L.removeElementAt(i);
                                    VectorSoldier2S.removeElementAt(i);
                                    VectorSoldier2A.removeElementAt(i);
                                    VectorSoldier2T.removeElementAt(i);
                                    VectorSoldier2H.removeElementAt(i);
                                    VectorSoldier2C.removeElementAt(i);
                                    VectorSoldier2W.removeElementAt(i);
                                    tk.Send(":"+i,IPChat, PortChat);
                                    PlayerScore+=3;
                                }
                                DeleteSum(j);
                                PlayerScore++;
                            }
                        }
                    }
                    if(!SumVectorP2.isEmpty()){
                        for(int j=0; j<SumVectorP2.size(); j++){
                            if(isCollision(Integer.parseInt(VectorSoldier2X.get(i).toString())+22,Integer.parseInt(VectorSoldier2Y.get(i).toString())+22,46,46,Integer.parseInt(SumVectorX2.get(j).toString()),Integer.parseInt(SumVectorY2.get(j).toString()),7,15)){
                                // tk.Send("^"+i+"."+j,IPChat, PortChat);
                                if(Integer.parseInt(VectorSoldier2L.get(i).toString()) > 0){
                                    VectorSoldier2L.setElementAt(Integer.parseInt(VectorSoldier2L.get(i).toString())-2,i);
                                }else{
                                    VectorSoldier2.removeElementAt(i);
                                    VectorSoldier2X.removeElementAt(i);
                                    VectorSoldier2Y.removeElementAt(i);
                                    VectorSoldier2L.removeElementAt(i);
                                    VectorSoldier2S.removeElementAt(i);
                                    VectorSoldier2A.removeElementAt(i);
                                    VectorSoldier2T.removeElementAt(i);
                                    VectorSoldier2H.removeElementAt(i);
                                    VectorSoldier2C.removeElementAt(i);
                                    VectorSoldier2W.removeElementAt(i);
                                    tk.Send(":"+i,IPChat, PortChat);
                                    tk.Send("^"+j,IPChat, PortChat);
                                }
                            }
                        }
                    }
                }
            }
        }catch(Exception e){}
    }
    
    public void DeleteSum(int index) {
        if(!SumVectorP.isEmpty()){
            if(GForm == Multhi){
                tk.Send("@"+index,IPChat, PortChat);
            }
            
            SumVectorP.removeElementAt(index);
            SumVectorY.removeElementAt(index);
            SumVectorX.removeElementAt(index);
            SumVectorT.removeElementAt(index);
            SumVectorS.removeElementAt(index);
        }
    }
    
    public void Shoot() {
        if((isShoot == true && GForm == Single) || (isShoot == true && GForm == Multhi)){
            if(!VectorPlayer1.isEmpty()){
                int tar = Integer.parseInt(String.valueOf(VectorPlayer1T.get(0)));
                if (Integer.parseInt(String.valueOf(VectorPlayer1Sum.get(0))) > 0) {
                    if (tar == TUP) {
                        SumX = Integer.parseInt(String.valueOf(VectorPlayer1X.get(0))) + 42;
                        SumY = Integer.parseInt(String.valueOf(VectorPlayer1Y.get(0))) - 20;
                        SumImage = sumImg[0];
                    } else if (tar == TLEFT) {
                        SumX = Integer.parseInt(String.valueOf(VectorPlayer1X.get(0))) - 20;
                        SumY = Integer.parseInt(String.valueOf(VectorPlayer1Y.get(0))) + 42;
                        SumImage = sumImg[1];
                    } else if (tar == TDOWN) {
                        SumX = Integer.parseInt(String.valueOf(VectorPlayer1X.get(0))) + 42;
                        SumY = Integer.parseInt(String.valueOf(VectorPlayer1Y.get(0))) + 75;
                        SumImage = sumImg[2];
                    } else if (tar == TRIGHT) {
                        SumX = Integer.parseInt(String.valueOf(VectorPlayer1X.get(0))) + 75;
                        SumY = Integer.parseInt(String.valueOf(VectorPlayer1Y.get(0))) + 42;
                        SumImage = sumImg[3];
                    }
                    
                    SumVectorP.addElement(SumImage);
                    SumVectorX.addElement(SumX);
                    SumVectorY.addElement(SumY);
                    SumVectorT.addElement(tar);
                    SumVectorS.addElement(Game1);
                    VectorPlayer1Sum.setElementAt(Integer.parseInt(String.valueOf(VectorPlayer1Sum.get(0)))-1,0);
                    isShoot = false;
                    ShootTime = 30;
                }
            }
        }
    }
    
    public int getSpeed() {
        return Speed;
    }
    
    public void setSpeed(int s) {
        Speed = s;
    }
    
    public void doChangeTarget(int index){
        //Enemy
        int ih = 0;
        int target = 0;
        
        ih = getRandom(5);
        target = Integer.parseInt(VectorSoldier2T.get(index).toString());
        if(ih == 1){
            //LEFT
            if (target == TUP) {
                target = TLEFT;
            } else if (target == TLEFT) {
                target = TDOWN;
            } else if (target == TDOWN) {
                target = TRIGHT;
            } else if (target == TRIGHT) {
                target = TUP;
            }
        }else if(ih == 2){
            //RIGHT
            if (target == TUP) {
                target = TRIGHT;
            } else if (target == TLEFT) {
                target = TUP;
            } else if (target == TDOWN) {
                target = TLEFT;
            } else if (target == TRIGHT) {
                target = TDOWN;
            }
        }
        VectorSoldier2T.setElementAt(target,index);
        VectorSoldier2.setElementAt(PathSummary(Integer.parseInt(VectorSoldier2H.get(index).toString()),Integer.parseInt(VectorSoldier2T.get(index).toString()),SGame2),index);
    }
    
    public void doChangeHead(int index){
        int ih = 0;
        int head = 0;
        
        ih = getRandom(3);
        head = Integer.parseInt(VectorSoldier2H.get(index).toString());
        if(ih == 1){
            //LEFT
            if (head == PUP) {
                head = PLEFT;
            } else if (head == PLEFT) {
                head = PDOWN;
            } else if (head == PDOWN) {
                head = PRIGHT;
            } else if (head == PRIGHT) {
                head = PUP;
            }
        }else if(ih == 2){
            //RIGHT
            if (head == PUP) {
                head = PRIGHT;
            } else if (head == PLEFT) {
                head = PUP;
            } else if (head == PDOWN) {
                head = PLEFT;
            } else if (head == PRIGHT) {
                head = PDOWN;
            }
        }
        VectorSoldier2H.setElementAt(head,index);
        VectorSoldier2.setElementAt(PathSummary(Integer.parseInt(VectorSoldier2H.get(index).toString()),Integer.parseInt(VectorSoldier2T.get(index).toString()),SGame2),index);
    }
    
    
    public void doChangeEnemy(){
        if(!VectorSoldier2.isEmpty() && isMoveEnemy == 0){
            for(int i=0; i<VectorSoldier2.size(); i++){
                if(isChange == 0 && Integer.parseInt(VectorSoldier2C.get(i).toString()) == 1){
                    doChangeTarget(i);
                    doChangeHead(i);
                }
                
                if(Integer.parseInt(VectorSoldier2C.get(i).toString()) == 1){
                    EnemyMove(i);
                }else if(Integer.parseInt(VectorSoldier2C.get(i).toString()) == 2){
                    EnemyBackMove(i);
                    DeCollisionEnemy(i);
                    
                    // ... BUG ...
                    doChangeTarget(i);
                    doChangeHead(i);
                }else if(Integer.parseInt(VectorSoldier2C.get(i).toString()) == 3){
                    EnemyBackMove(i);
                    DeCollisionOur(i);
                    
                    // ... BUG ...
                    doChangeTarget(i);
                    doChangeHead(i);
                }
                CollisionEnemy(i);
                ShootEnemy(i);
                CheckingYesShoot();
            }
        }
        
        if(isChange > 0){
            isChange--;
        }else if(isChange == 0){
            isChange = 80;
        }
        if(isMoveEnemy > 0){
            isMoveEnemy--;
        }else if(isMoveEnemy == 0){
            isMoveEnemy = 5;
        }
    }
    
    public void doAmmoMove(int i, int t){
        switch (t) {
            case TUP:
            {
                if (Integer.parseInt(SumVectorYE.get(i).toString()) <= 10) {
                    DeleteAmmo(i);
                } else {
                    SumVectorYE.set(i, Integer.parseInt(SumVectorYE.get(i).toString()) - ammoSpeed);
                }
            }
            break;
            case TRIGHT:
            {
                if (Integer.parseInt(SumVectorXE.get(i).toString()) >= 880) {
                    DeleteAmmo(i);
                } else {
                    SumVectorXE.set(i, Integer.parseInt(SumVectorXE.get(i).toString()) + ammoSpeed);
                }
            }
            break;
            case TDOWN:
            {
                if (Integer.parseInt(SumVectorYE.get(i).toString()) >= 675) {
                    DeleteAmmo(i);
                } else {
                    SumVectorYE.set(i, Integer.parseInt(SumVectorYE.get(i).toString()) + ammoSpeed);
                }
            }
            break;
            case TLEFT:
            {
                if (Integer.parseInt(SumVectorXE.get(i).toString()) <= 10) {
                    DeleteAmmo(i);
                } else {
                    SumVectorXE.set(i, Integer.parseInt(SumVectorXE.get(i).toString()) - ammoSpeed);
                }
            }
            break;
        }
    }
    
    public void DeleteAmmo(int index){
        if(ServerMode == 1){
            // tk.Send("~"+index,IPChat, PortChat);
        }
        SumVectorPE.removeElementAt(index);
        SumVectorXE.removeElementAt(index);
        SumVectorYE.removeElementAt(index);
        SumVectorTE.removeElementAt(index);
        SumVectorSE.removeElementAt(index);
    }
    
    public void ShootEnemy(int index){
        int tar = Integer.parseInt(String.valueOf(VectorSoldier2T.get(index)));
        if(yesShoot == true){
            if (tar == TUP) {
                sx = Integer.parseInt(String.valueOf(VectorSoldier2X.get(index))) + 42;
                sy = Integer.parseInt(String.valueOf(VectorSoldier2Y.get(index))) - 20;
                imgAMMO = sumImg[0];
            } else if (tar == TLEFT) {
                sx = Integer.parseInt(String.valueOf(VectorSoldier2X.get(index))) - 20;
                sy = Integer.parseInt(String.valueOf(VectorSoldier2Y.get(index))) + 42;
                imgAMMO = sumImg[1];
            } else if (tar == TDOWN) {
                sx = Integer.parseInt(String.valueOf(VectorSoldier2X.get(index))) + 42;
                sy = Integer.parseInt(String.valueOf(VectorSoldier2Y.get(index))) + 75;
                imgAMMO = sumImg[2];
            } else if (tar == TRIGHT) {
                sx = Integer.parseInt(String.valueOf(VectorSoldier2X.get(index))) + 75;
                sy = Integer.parseInt(String.valueOf(VectorSoldier2Y.get(index))) + 42;
                imgAMMO = sumImg[3];
            }
            
            SumVectorPE.addElement(imgAMMO);
            SumVectorXE.addElement(sx);
            SumVectorYE.addElement(sy);
            SumVectorTE.addElement(tar);
            SumVectorSE.addElement(SGame2);
            yesShoot = false;
            ShootTimeEnemy = 10;
        }
    }
    
    public void CheckingYesShoot(){
        if(ShootTimeEnemy > 0){
            ShootTimeEnemy--;
        }else{
            yesShoot = true;
        }
    }
    
    public void AddEnemies(){
        if(!VectorSoldier2.isEmpty() && !MapVectorP.isEmpty()){
            for(int i=0; i<VectorSoldier2.size(); i++){
                if(isCollision(Integer.parseInt(MapVectorX.get(0).toString()),Integer.parseInt(MapVectorY.get(0).toString()),50,50,Integer.parseInt(VectorSoldier2X.get(i).toString())+22,Integer.parseInt(VectorSoldier2Y.get(i).toString())+22,46,46) == true){
                    Empty = true;
                    isIn = true;
                }else{
                    if(isIn ==false){
                        Empty = false;
                    }
                }
            }
            isIn = false;
            if(Empty == false){
                if(EnemyLimint > 0){
                    this.AddTank(SGame2,4,4,PRIGHT,TRIGHT,-5,-7,-1);
                    EnemyLimint--;
                }
            }
        }
    }
    
    public void AddEnemiesRight(){
        if(!VectorSoldier2.isEmpty() && !MapVectorP.isEmpty()){
            for(int i=0; i<VectorSoldier2.size(); i++){
                if(isCollision(Integer.parseInt(MapVectorX.get(238).toString()),Integer.parseInt(MapVectorY.get(238).toString()),50,50,Integer.parseInt(VectorSoldier2X.get(i).toString())+22,Integer.parseInt(VectorSoldier2Y.get(i).toString())+22,46,46) == true){
                    EmptyR = true;
                    isInR = true;
                }else{
                    if(isInR ==false){
                        EmptyR = false;
                    }
                }
            }
            isInR = false;
            if(EmptyR == false){
                if(EnemyLimintR > 0){
                    this.AddTank(SGame2,4,4,PRIGHT,TRIGHT,850,-7,-1);
                    EnemyLimintR--;
                }
            }
        }
    }
    
    
    public void CollisionEnemy(int index){
        if(!MapVectorP.isEmpty()){
            for(int i=0; i<MapVectorP.size(); i++){
                if(Integer.parseInt(MapVectorM.get(i).toString()) == 6){
                    if(isCollision(Integer.parseInt(MapVectorX.get(i).toString()),Integer.parseInt(MapVectorY.get(i).toString()),50,50,Integer.parseInt(VectorSoldier2X.get(index).toString())+22,Integer.parseInt(VectorSoldier2Y.get(index).toString())+22,46,46) == true){
                        VectorSoldier2L.setElementAt(4,0);
                        DeleteMapItem(i);
                    }
                }else if(Integer.parseInt(MapVectorM.get(i).toString()) == 7){
                    if(isCollision(Integer.parseInt(MapVectorX.get(i).toString()),Integer.parseInt(MapVectorY.get(i).toString()),50,50,Integer.parseInt(VectorSoldier2X.get(index).toString())+22,Integer.parseInt(VectorSoldier2Y.get(index).toString())+22,46,46) == true){
                        DeleteMapItem(i);
                    }
                }else if(Integer.parseInt(MapVectorM.get(i).toString()) == 1 || Integer.parseInt(MapVectorM.get(i).toString()) == 2 || Integer.parseInt(MapVectorM.get(i).toString()) == 3 || Integer.parseInt(MapVectorM.get(i).toString()) == 4){
                    if(isCollision(Integer.parseInt(MapVectorX.get(i).toString()),Integer.parseInt(MapVectorY.get(i).toString()),50,50,Integer.parseInt(VectorSoldier2X.get(index).toString())+22,Integer.parseInt(VectorSoldier2Y.get(index).toString())+22,46,46) == true){
                        VectorSoldier2C.setElementAt(2,index);
                        VectorSoldier2W.setElementAt(i,index);
                    }
                }
            }
        }
        for(int j=0; j<VectorSoldier2.size(); j++){
            if(index != j){
                if(isCollision(Integer.parseInt(VectorSoldier2X.get(j).toString())+22,Integer.parseInt(VectorSoldier2Y.get(j).toString())+22,46,46,Integer.parseInt(VectorSoldier2X.get(index).toString())+22,Integer.parseInt(VectorSoldier2Y.get(index).toString())+22,46,46) == true){
                    VectorSoldier2C.setElementAt(3,index);
                    VectorSoldier2W.setElementAt(j,index);
                }
            }
        }
    }
    
    public void DeCollisionOur(int index){
        if(isCollision(Integer.parseInt(VectorSoldier2X.get(Integer.parseInt(VectorSoldier2W.get(index).toString())).toString())+22,Integer.parseInt(VectorSoldier2Y.get(Integer.parseInt(VectorSoldier2W.get(index).toString())).toString())+22,46,46,Integer.parseInt(VectorSoldier2X.get(index).toString())+22,Integer.parseInt(VectorSoldier2Y.get(index).toString())+22,46,46) != true){
            VectorSoldier2C.setElementAt(1,index);
            VectorSoldier2W.setElementAt(-1,index);
        }
    }
    
    public void DeCollisionEnemy(int index){
        if(isCollision(Integer.parseInt(MapVectorX.get(Integer.parseInt(VectorSoldier2W.get(index).toString())).toString()),Integer.parseInt(MapVectorY.get(Integer.parseInt(VectorSoldier2W.get(index).toString())).toString()),50,50,Integer.parseInt(VectorSoldier2X.get(index).toString())+22,Integer.parseInt(VectorSoldier2Y.get(index).toString())+22,46,46) != true){
            VectorSoldier2C.setElementAt(1,index);
            VectorSoldier2W.setElementAt(-1,index);
        }
    }
    
    public void EnemyBackMove(int index){
        switch (Integer.parseInt(VectorSoldier2H.get(index).toString())) {
            case PUP:{
                if (Integer.parseInt(String.valueOf(VectorSoldier2Y.get(index))) <= 640) {
                    VectorSoldier2Y.setElementAt(Integer.parseInt(String.valueOf(VectorSoldier2Y.get(index)))+EnemySpeed,index);
                }
            }break;
            case PRIGHT: {
                if (Integer.parseInt(String.valueOf(VectorSoldier2X.get(index))) >= 0) {
                    VectorSoldier2X.setElementAt(Integer.parseInt(String.valueOf(VectorSoldier2X.get(index)))-EnemySpeed,index);
                }
            }break;
            case PDOWN: {
                if (Integer.parseInt(String.valueOf(VectorSoldier2Y.get(index))) >= 0) {
                    VectorSoldier2Y.setElementAt(Integer.parseInt(String.valueOf(VectorSoldier2Y.get(index)))-EnemySpeed,index);
                }
            }break;
            case PLEFT: {
                if (Integer.parseInt(String.valueOf(VectorSoldier2X.get(index))) <= 842) {
                    VectorSoldier2X.setElementAt(Integer.parseInt(String.valueOf(VectorSoldier2X.get(index)))+EnemySpeed,index);
                }
            }break;
        }
    }
    
    public void doBackMove() {
        if(!VectorPlayer1.isEmpty()){
            switch (Integer.parseInt(String.valueOf(VectorPlayer1H.get(0)))) {
                case PUP:{
                    if (Integer.parseInt(String.valueOf(VectorPlayer1Y.get(0))) <= 640) {
                        VectorPlayer1Y.setElementAt(Integer.parseInt(String.valueOf(VectorPlayer1Y.get(0)))+Speed,0);
                    }
                }break;
                case PRIGHT:{
                    if (Integer.parseInt(String.valueOf(VectorPlayer1X.get(0))) >= 0) {
                        VectorPlayer1X.setElementAt(Integer.parseInt(String.valueOf(VectorPlayer1X.get(0)))-Speed,0);
                    }
                }break;
                case PDOWN:{
                    if (Integer.parseInt(String.valueOf(VectorPlayer1Y.get(0))) >= 0) {
                        VectorPlayer1Y.setElementAt(Integer.parseInt(String.valueOf(VectorPlayer1Y.get(0)))-Speed,0);
                    }
                } break;
                case PLEFT:{
                    if (Integer.parseInt(String.valueOf(VectorPlayer1X.get(0))) <= 842) {
                        VectorPlayer1X.setElementAt(Integer.parseInt(String.valueOf(VectorPlayer1X.get(0)))+Speed,0);
                    }
                }break;
            }
        }
        DetectPCollBACK();
    }
    /*0
     *837
     *620
     -7*/
    public void EnemyMove(int index){
        switch(Integer.parseInt(String.valueOf(VectorSoldier2H.get(index)))){
            case PUP:{
                if(Integer.parseInt(String.valueOf(VectorSoldier2Y.get(index))) >= 0){
                    VectorSoldier2Y.setElementAt(Integer.parseInt(String.valueOf(VectorSoldier2Y.get(index)))-EnemySpeed,index);
                }
            }break;
            case PRIGHT:{
                if(Integer.parseInt(String.valueOf(VectorSoldier2X.get(index)))<=842){
                    VectorSoldier2X.setElementAt(Integer.parseInt(String.valueOf(VectorSoldier2X.get(index)))+EnemySpeed,index);
                }
            }break;
            case PDOWN:{
                if(Integer.parseInt(String.valueOf(VectorSoldier2Y.get(index))) <= 640){
                    VectorSoldier2Y.setElementAt(Integer.parseInt(String.valueOf(VectorSoldier2Y.get(index)))+EnemySpeed,index);
                }
            }break;
            case PLEFT:{
                if(Integer.parseInt(String.valueOf(VectorSoldier2X.get(index)))>=-7){
                    VectorSoldier2X.setElementAt(Integer.parseInt(String.valueOf(VectorSoldier2X.get(index)))-EnemySpeed,index);
                }
            }break;
        }
    }
    
    public void doMove(){
        if(!VectorPlayer1.isEmpty()){
            switch(Integer.parseInt(String.valueOf(VectorPlayer1H.get(0)))){
                case PUP:{
                    if(Integer.parseInt(String.valueOf(VectorPlayer1Y.get(0))) >= 0){
                        VectorPlayer1Y.setElementAt(Integer.parseInt(String.valueOf(VectorPlayer1Y.get(0)))-Speed,0);
                    }
                }break;
                case PRIGHT:{
                    if(Integer.parseInt(String.valueOf(VectorPlayer1X.get(0)))<=842){
                        VectorPlayer1X.setElementAt(Integer.parseInt(String.valueOf(VectorPlayer1X.get(0)))+Speed,0);
                    }
                }break;
                case PDOWN:{
                    if(Integer.parseInt(String.valueOf(VectorPlayer1Y.get(0))) <= 640){
                        VectorPlayer1Y.setElementAt(Integer.parseInt(String.valueOf(VectorPlayer1Y.get(0)))+Speed,0);
                    }
                }break;
                case PLEFT:{
                    if(Integer.parseInt(String.valueOf(VectorPlayer1X.get(0)))>=-7){
                        VectorPlayer1X.setElementAt(Integer.parseInt(String.valueOf(VectorPlayer1X.get(0)))-Speed,0);
                    }
                }break;
            }
        }
        DetectPCollUP();
    }
    
    
    
    public void ChangeTarget(String t) {
        int target = 0;
        if(!VectorPlayer1T.isEmpty()){
            target = Integer.parseInt(String.valueOf(VectorPlayer1T.get(0)));
        }
        if (t == "LEFT") {
            if (target == TUP) {
                target = TLEFT;
            } else if (target == TLEFT) {
                target = TDOWN;
            } else if (target == TDOWN) {
                target = TRIGHT;
            } else if (target == TRIGHT) {
                target = TUP;
            }
        } else if (t == "RIGHT") {
            if (target == TUP) {
                target = TRIGHT;
            } else if (target == TLEFT) {
                target = TUP;
            } else if (target == TDOWN) {
                target = TLEFT;
            } else if (target == TRIGHT) {
                target = TDOWN;
            }
        }
        if(!VectorPlayer1T.isEmpty() && !VectorPlayer1.isEmpty()){
            VectorPlayer1T.setElementAt(target,0);
            VectorPlayer1.setElementAt(PathSummary(Integer.parseInt(String.valueOf(VectorPlayer1H.get(0))), Integer.parseInt(String.valueOf(VectorPlayer1T.get(0))),Game1),0);
        }
    }
    
    public void ChangeHead(String h) {
        int head = 0;
        if(!VectorPlayer1H.isEmpty()){
            head = Integer.parseInt(String.valueOf(VectorPlayer1H.get(0)));
        }
        if (h == "LEFT") {
            if (head == PUP) {
                head = PLEFT;
            } else if (head == PLEFT) {
                head = PDOWN;
            } else if (head == PDOWN) {
                head = PRIGHT;
            } else if (head == PRIGHT) {
                head = PUP;
            }
        } else if (h == "RIGHT") {
            if (head == PUP) {
                head = PRIGHT;
            } else if (head == PLEFT) {
                head = PUP;
            } else if (head == PDOWN) {
                head = PLEFT;
            } else if (head == PRIGHT) {
                head = PDOWN;
            }
        }
        if(!VectorPlayer1H.isEmpty() && !VectorPlayer1.isEmpty()){
            VectorPlayer1H.setElementAt(head,0);
            VectorPlayer1.setElementAt(PathSummary(Integer.parseInt(String.valueOf(VectorPlayer1H.get(0))), Integer.parseInt(String.valueOf(VectorPlayer1T.get(0))),Game1),0);
        }
        
        
    }
    
    public void UP() {
        if (GForm == MainMenu) {
            MainMenuUpMove();
        } else if (GForm == Play) {
            if (x6 == Menu6 - 40) {
                x5 = Menu5 - 40;
                x6 = Menu6;
                SelectIndex = 1;
            } else if (x5 == Menu5 - 40) {
                x6 = Menu6 - 40;
                x5 = Menu5;
                SelectIndex = 2;
            }
        }else if (GForm == Single || GForm == Multhi) {
            if(isMove == true){
                doMove();
            }
        }
    }
    
    public void Press_ESC() {
        if (GForm != MainMenu) {
            if (GForm == Play) {
                GForm = MainMenu;
            } else if (GForm == Multhi) {
                GForm = Play;
            } else if (GForm == Single) {
                GForm = Play;
            } else if (GForm == Setting) {
                GForm = MainMenu;
                mainApp.HideMedia();
                SelectIndex = 1;
                ThreadSpeed = 10;
                MainMenuUpMove();
            } else if (GForm == Static) {
                GForm = MainMenu;
            }
            SelectIndex = 1;
        }
    }
    
    public void MainMenuDownMove() {
        if (x1 == Menu1 - 40) {
            x2 = Menu2 - 40;
            x1 = Menu1;
            SelectIndex = 2;
        } else if (x2 == Menu2 - 40) {
            x3 = Menu3 - 40;
            x2 = Menu2;
            SelectIndex = 3;
        } else if (x3 == Menu3 - 40) {
            x4 = Menu4 - 40;
            x3 = Menu3;
            SelectIndex = 4;
        } else if (x4 == Menu4 - 40) {
            x1 = Menu1 - 40;
            x4 = Menu4;
            SelectIndex = 1;
        }
    }
    
    public void MainMenuUpMove() {
        if (x1 == Menu1 - 40) {
            x4 = Menu4 - 40;
            x1 = Menu1;
            SelectIndex = 4;
        } else if (x4 == Menu4 - 40) {
            x3 = Menu3 - 40;
            x4 = Menu4;
            SelectIndex = 3;
        } else if (x3 == Menu3 - 40) {
            x2 = Menu2 - 40;
            x3 = Menu3;
            SelectIndex = 2;
        } else if (x2 == Menu2 - 40) {
            x1 = Menu1 - 40;
            x2 = Menu2;
            SelectIndex = 1;
        }
    }
    
    public void DOWN() {
        if (GForm == MainMenu) {
            MainMenuDownMove();
        } else if (GForm == Play) {
            if (x6 == Menu6 - 40) {
                x5 = Menu5 - 40;
                x6 = Menu6;
                SelectIndex = 1;
            } else if (x5 == Menu5 - 40) {
                x6 = Menu6 - 40;
                x5 = Menu5;
                SelectIndex = 2;
            }
        } else if (GForm == Single || GForm == Multhi) {
            if(isBackMove == true){
                doBackMove();
            }
        }
    }
    
    public void SELECT() {
        if (GForm == MainMenu) {
            switch (SelectIndex) {
                case 1:{
                    GForm = Play;
                    SelectIndex = 1;
                }break;
                case 2:{
                    SelectIndex = 1;
                    mainApp.ShowMedia();
                    MyTime = 27;
                    ThreadSpeed = 1000;
                    GForm = Setting;
                } break;
                case 3:
                {
                    GForm = Static;
                    SelectIndex = 1;
                }
                break;
                case 4:
                {
                    System.exit(0);
                }
                break;
            }
        } else if (GForm == Play) {
            switch (SelectIndex) {
                case 1:
                {
                    SingleFrame f = new SingleFrame(this);
                    f.FrameShow();
                }
                break;
                case 2:
                {
                    CreateServer cs = new CreateServer(this);
                    cs.ShowServer();
                }
                break;
            }
        } else if (GForm == Multhi) {
            if (isChat == false) {
                jt.setLocation(150, 700);
                jt.setText("");
                jt.requestFocus();
                jt.setVisible(true);
                isChat = true;
            } else if (isChat == true) {
                jt.setVisible(false);
                isChat = false;
            }
        }
    }
    
    public void ShowSingle(String str) {
        //Local ...(Computer)
        renderImage();
        this.AddTank(Game1,4,4,PUP,TUP,494,645,500);
        
        this.AddTank(SGame2,4,4,PRIGHT,TRIGHT,-5,-7,-1);
        
        GForm = Single;
        SelectIndex = 1;
        PlayerName = str;
    }
    
    public String sendEnemies(String status,String life,String armor,String head,String target,String x,String y,String index,String size){
        String str;
        str = "%"+size+"."+status+"."+life+"."+armor+"."+head+"."+target+"."+x+"."+y+"."+index+".";
        return str;
    }
    
    public String sendSum(String size,String x, String y, String t, String s,String index){
        String str = "";
        str = "#"+size+"."+x+"."+y+"."+t+"."+s+"."+index+".";
        return str;
    }
    
    public String sendTanks(String status,String life,String armor,String head,String target,String x,String y,String sum){
        String str = "";
        str = "*"+status+"."+life+"."+armor+"."+head+"."+target+"."+x+"."+y+"."+sum+".";
        return str;
    }
    
    public String sendEnemyAMMO(String size,String x, String y, String t, String s,String index){
        String str = "";
        str = "$"+size+"."+x+"."+y+"."+t+"."+s+"."+index+".";
        return str;
    }
    
    
    public void setChatData(String str) {
        //********************* Team **********************
        String tempStr = "";
        int ss = 0;
        int ll = 0;
        int aa = 0;
        int hh = 0;
        int tt = 0;
        int xx = 0;
        int yy = 0;
        int Ssum = 0;
        int tempInt = 0;
        //********************* Team AMMO ******************
        String SumStr = "";
        int SumX = 0;
        int SumY = 0;
        int SumT = 0;
        int SumOwn = 0;
        int SumSize = 0;
        int SumTemp = 0;
        int SumIndex = 0;
        // ******************* Enemy *******************
        String tempEnemyStr = "";
        int tempEnemyInt = 0;
        int enemyX = 0;
        int enemyY = 0;
        int enemyStatus = 0;
        int enemyT = 0;
        int enemyL = 0;
        int enemyH = 0;
        int enemyA = 0;
        int enemySize = 0;
        int enemyIndex = 0;
        //******************* Enemy Ammo *********************
        String SumStr2 = "";
        int SumX2 = 0;
        int SumY2 = 0;
        int SumT2 = 0;
        int SumOwn2 = 0;
        int SumSize2 = 0;
        int SumTemp2 = 0;
        int SumIndex2 = 0;
        
        if(str.charAt(0) == '*'){
            for(int i=0; i<str.length(); i++){
                if(str.substring(i,i+1).compareTo("*") != 0){
                    if(str.substring(i,i+1).compareTo(".") != 0){
                        tempStr += str.substring(i,i+1);
                    }else if(str.substring(i,i+1).compareTo(".") == 0){
                        if(tempInt == 0){
                            ss = Integer.parseInt(tempStr);
                        }else if(tempInt == 1){
                            ll = Integer.parseInt(tempStr);
                        }else if(tempInt == 2){
                            aa = Integer.parseInt(tempStr);
                        }else if(tempInt == 3){
                            hh = Integer.parseInt(tempStr);
                        }else if(tempInt == 4){
                            tt = Integer.parseInt(tempStr);
                        }else if(tempInt == 5){
                            xx = Integer.parseInt(tempStr);
                        }else if(tempInt == 6){
                            yy = Integer.parseInt(tempStr);
                        }else if(tempInt == 7){
                            Ssum = Integer.parseInt(tempStr);
                        }
                        tempStr="";
                        tempInt++;
                    }
                }
            }
            if(VectorPlayer2.isEmpty()){
                this.AddTank(ss,ll,aa,hh,tt,xx,yy,Ssum);
            }else{
                this.setTank(ss,ll,aa,hh,tt,xx,yy,Ssum);
            }
            tempStr = "";
            tempInt = 0;
        }else if(str.charAt(0) == '@'){
            if(!SumVectorP2.isEmpty()){
                SumVectorP2.removeElementAt(Integer.parseInt(str.substring(1)));
                SumVectorX2.removeElementAt(Integer.parseInt(str.substring(1)));
                SumVectorY2.removeElementAt(Integer.parseInt(str.substring(1)));
                SumVectorT2.removeElementAt(Integer.parseInt(str.substring(1)));
                SumVectorS2.removeElementAt(Integer.parseInt(str.substring(1)));
            }
        }else if(str.charAt(0) == '#'){
            for(int i=0; i<str.length(); i++){
                if(str.substring(i,i+1).compareTo("#") != 0){
                    if(str.substring(i,i+1).compareTo(".") != 0){
                        SumStr += str.substring(i,i+1);
                    }else if(str.substring(i,i+1).compareTo(".") == 0){
                        if(SumTemp == 0){
                            SumSize = Integer.parseInt(SumStr);
                        }else if(SumTemp == 1){
                            SumX = Integer.parseInt(SumStr);
                        }else if(SumTemp == 2){
                            SumY = Integer.parseInt(SumStr);
                        }else if(SumTemp == 3){
                            SumT = Integer.parseInt(SumStr);
                        }else if(SumTemp == 4){
                            SumOwn = Integer.parseInt(SumStr);
                        }else if(SumTemp == 5){
                            SumIndex = Integer.parseInt(SumStr);
                        }
                        SumStr="";
                        SumTemp++;
                    }
                }
            }
            
            if(SumVectorP2.isEmpty()){
                for(int i=0; i<SumSize; i++){
                    SumVectorP2.addElement(null);
                    SumVectorX2.addElement(0);
                    SumVectorY2.addElement(0);
                    SumVectorT2.addElement(null);
                    SumVectorS2.addElement(null);
                }
            }else{
                if(SumVectorP2.size() < SumSize){
                    for(int i=SumVectorP2.size(); i<SumSize; i++){
                        SumVectorP2.addElement(null);
                        SumVectorX2.addElement(0);
                        SumVectorY2.addElement(0);
                        SumVectorT2.addElement(null);
                        SumVectorS2.addElement(null);
                    }
                }
                
                if (SumT == TUP) {
                    setSumImage = sumImg[0];
                } else if (SumT == TLEFT) {
                    setSumImage = sumImg[1];
                } else if (SumT == TDOWN) {
                    setSumImage = sumImg[2];
                } else if (SumT == TRIGHT) {
                    setSumImage = sumImg[3];
                }
                
                SumVectorP2.setElementAt(setSumImage,SumIndex);
                SumVectorX2.setElementAt(SumX,SumIndex);
                SumVectorY2.setElementAt(SumY,SumIndex);
                SumVectorT2.setElementAt(SumT,SumIndex);
                SumVectorS2.setElementAt(SumOwn,SumIndex);
            }
            SumStr="";
            SumTemp=0;
        }else if(str.charAt(0) == '?'){
            // change map
            Image TempRock = MapItemImg[2];
            MapVectorP.setElementAt(TempRock,Integer.parseInt(str.substring(1)));
            MapVectorM.setElementAt(3,Integer.parseInt(str.substring(1)));
        }else if(str.charAt(0) == '&'){
            //delete map
            Image TempImg = null;
            MapVectorP.setElementAt(TempImg,Integer.parseInt(str.substring(1)));
            MapVectorM.setElementAt(0,Integer.parseInt(str.substring(1)));
        }else if(str.charAt(0) == '%'){
            if(ServerMode != 1){
                for(int i=0; i<str.length(); i++){
                    if(str.substring(i,i+1).compareTo("%") != 0){
                        if(str.substring(i,i+1).compareTo(".") != 0){
                            tempEnemyStr += str.substring(i,i+1);
                        }else if(str.substring(i,i+1).compareTo(".") == 0){
                            if(tempEnemyInt == 0){
                                enemySize = Integer.parseInt(tempEnemyStr);
                            }else if(tempEnemyInt == 1){
                                enemyStatus = Integer.parseInt(tempEnemyStr);
                            }else if(tempEnemyInt == 2){
                                enemyL = Integer.parseInt(tempEnemyStr);
                            }else if(tempEnemyInt == 3){
                                enemyA = Integer.parseInt(tempEnemyStr);
                            }else if(tempEnemyInt == 4){
                                enemyH = Integer.parseInt(tempEnemyStr);
                            }else if(tempEnemyInt == 5){
                                enemyT = Integer.parseInt(tempEnemyStr);
                            }else if(tempEnemyInt == 6){
                                enemyX = Integer.parseInt(tempEnemyStr);
                            }else if(tempEnemyInt == 7){
                                enemyY = Integer.parseInt(tempEnemyStr);
                            }else if(tempEnemyInt == 8){
                                enemyIndex = Integer.parseInt(tempEnemyStr);
                            }
                            tempEnemyInt++;
                            tempEnemyStr = "";
                        }
                    }
                }
                if(VectorSoldier2.isEmpty()){
                    for(int i=0; i<enemySize; i++){
                        VectorSoldier2.addElement(null);
                        VectorSoldier2X.addElement(0);
                        VectorSoldier2Y.addElement(0);
                        VectorSoldier2A.addElement(null);
                        VectorSoldier2H.addElement(null);
                        VectorSoldier2T.addElement(null);
                        VectorSoldier2L.addElement(null);
                        VectorSoldier2S.addElement(null);
                        VectorSoldier2C.addElement(1);
                        VectorSoldier2W.addElement(-1);
                    }
                }else{
                    if(VectorSoldier2.size() < enemySize){
                        for(int i=VectorSoldier2.size(); i<enemySize; i++){
                            VectorSoldier2.addElement(null);
                            VectorSoldier2X.addElement(0);
                            VectorSoldier2Y.addElement(0);
                            VectorSoldier2A.addElement(null);
                            VectorSoldier2H.addElement(null);
                            VectorSoldier2T.addElement(null);
                            VectorSoldier2L.addElement(null);
                            VectorSoldier2S.addElement(null);
                            VectorSoldier2C.addElement(1);
                            VectorSoldier2W.addElement(-1);
                        }
                    }
                }
                
                VectorSoldier2.setElementAt(PathSummary(enemyH,enemyT,enemyStatus),enemyIndex);
                VectorSoldier2X.setElementAt(enemyX,enemyIndex);
                VectorSoldier2Y.setElementAt(enemyY,enemyIndex);
                VectorSoldier2A.setElementAt(enemyA,enemyIndex);
                VectorSoldier2H.setElementAt(enemyH,enemyIndex);
                VectorSoldier2T.setElementAt(enemyT,enemyIndex);
                VectorSoldier2L.setElementAt(enemyL,enemyIndex);
                VectorSoldier2S.setElementAt(enemyStatus,enemyIndex);
            }
            tempEnemyStr = "";
            tempEnemyInt = 0;
        }else if(str.charAt(0) == '$'){
            if(ServerMode != 1){
                
                for(int i=0; i<str.length(); i++){
                    if(str.substring(i,i+1).compareTo("$") != 0){
                        if(str.substring(i,i+1).compareTo(".") != 0){
                            SumStr2+=str.substring(i,i+1);
                        }else if(str.substring(i,i+1).compareTo(".") == 0){
                            //System.out.println(SumStr2);
                            if(SumTemp2 == 0){
                                SumSize2 = Integer.parseInt(SumStr2);
                            }else if(SumTemp2 == 1){
                                SumX2 = Integer.parseInt(SumStr2);
                            }else if(SumTemp2 == 2){
                                SumY2 = Integer.parseInt(SumStr2);
                            }else if(SumTemp2 == 3){
                                SumT2 = Integer.parseInt(SumStr2);
                            }else if(SumTemp2 == 4){
                                SumOwn2 = Integer.parseInt(SumStr2);
                            }else if(SumTemp2 == 5){
                                SumIndex2 = Integer.parseInt(SumStr2);
                            }
                            //System.out.println("Recive "+SumSize2+" "+SumX2+" "+SumY2+" "+SumT2+" "+SumOwn2+" "+SumIndex2);
                            SumStr2="";
                            SumTemp2++;
                        }
                    }
                }
                
                if(SumVectorPS.isEmpty()){
                    for(int i=0; i<SumSize2; i++){
                        SumVectorPS.addElement(null);
                        SumVectorXS.addElement(0);
                        SumVectorYS.addElement(0);
                        SumVectorTS.addElement(null);
                        SumVectorSS.addElement(null);
                    }
                }else{
                    if(SumVectorPS.size() < SumSize2){
                        for(int i=SumVectorPE.size(); i<SumSize2; i++){
                            SumVectorPS.addElement(null);
                            SumVectorXS.addElement(0);
                            SumVectorYS.addElement(0);
                            SumVectorTS.addElement(null);
                            SumVectorSS.addElement(null);
                        }
                    }
                    
                    if (SumT2 == TUP) {
                        setSumImage2 = sumImg[0];
                    } else if (SumT2 == TLEFT) {
                        setSumImage2 = sumImg[1];
                    } else if (SumT2 == TDOWN) {
                        setSumImage2 = sumImg[2];
                    } else if (SumT2 == TRIGHT) {
                        setSumImage2 = sumImg[3];
                    }
                    
                    SumVectorPS.setElementAt(setSumImage2,SumIndex2);
                    SumVectorXS.setElementAt(SumX2,SumIndex2);
                    SumVectorYS.setElementAt(SumY2,SumIndex2);
                    SumVectorTS.setElementAt(SumT2,SumIndex2);
                    SumVectorSS.setElementAt(SumOwn2,SumIndex2);
                }
                SumStr2="";
                SumTemp2=0;
            }
        }else if(str.charAt(0) == '~'){
            //System.out.println("delete   "+str.substring(1));
            if(!SumVectorPS.isEmpty()){
                SumVectorPS.removeElementAt(Integer.parseInt(str.substring(1)));
                SumVectorXS.removeElementAt(Integer.parseInt(str.substring(1)));
                SumVectorYS.removeElementAt(Integer.parseInt(str.substring(1)));
                SumVectorTS.removeElementAt(Integer.parseInt(str.substring(1)));
                SumVectorSS.removeElementAt(Integer.parseInt(str.substring(1)));
            }
        }else if(str.charAt(0) == '+'){
            if(ServerMode != 1){
                if(Integer.parseInt(VectorPlayer1A.get(0).toString()) > 0){
                    VectorPlayer1A.setElementAt(Integer.parseInt(VectorPlayer1A.get(0).toString())-1,0);
                }else{
                    if(Integer.parseInt(VectorPlayer1L.get(0).toString()) > 1){
                        VectorPlayer1L.setElementAt(Integer.parseInt(VectorPlayer1L.get(0).toString())-1,0);
                    }else{
                        //GAME OVER
                        VectorPlayer1L.setElementAt(Integer.parseInt(VectorPlayer1L.get(0).toString())-1,0);
                        
                        VectorPlayer1.removeElementAt(0);
                        VectorPlayer1X.removeElementAt(0);
                        VectorPlayer1Y.removeElementAt(0);
                        VectorPlayer1T.removeElementAt(0);
                        VectorPlayer1A.removeElementAt(0);
                        VectorPlayer1L.removeElementAt(0);
                        VectorPlayer1Sum.removeElementAt(0);
                        VectorPlayer1S.removeElementAt(0);
                        VectorPlayer1H.removeElementAt(0);
                        tk.Send("-",IPChat, PortChat);
                    }
                }
            }
        }else if(str.charAt(0) == '-'){
            VectorPlayer2.removeElementAt(0);
            VectorPlayer2X.removeElementAt(0);
            VectorPlayer2Y.removeElementAt(0);
            VectorPlayer2T.removeElementAt(0);
            VectorPlayer2A.removeElementAt(0);
            VectorPlayer2L.removeElementAt(0);
            VectorPlayer2Sum.removeElementAt(0);
            VectorPlayer2S.removeElementAt(0);
            VectorPlayer2H.removeElementAt(0);
        }else if(str.charAt(0) == ':'){
            VectorSoldier2.removeElementAt(Integer.parseInt(str.substring(1)));
            VectorSoldier2X.removeElementAt(Integer.parseInt(str.substring(1)));
            VectorSoldier2Y.removeElementAt(Integer.parseInt(str.substring(1)));
            VectorSoldier2L.removeElementAt(Integer.parseInt(str.substring(1)));
            VectorSoldier2S.removeElementAt(Integer.parseInt(str.substring(1)));
            VectorSoldier2A.removeElementAt(Integer.parseInt(str.substring(1)));
            VectorSoldier2T.removeElementAt(Integer.parseInt(str.substring(1)));
            VectorSoldier2H.removeElementAt(Integer.parseInt(str.substring(1)));
            VectorSoldier2C.removeElementAt(Integer.parseInt(str.substring(1)));
            VectorSoldier2W.removeElementAt(Integer.parseInt(str.substring(1)));
        }else if(str.charAt(0) == '^'){
            DeleteSum(Integer.parseInt(str.substring(1)));
            PlayerScore+=2;
        }else{
            RecieveChat.addElement(str);
            MessageTime.addElement(WaitMessage);
            VectorMessY.addElement(13);
        }
    }
    
    
    public void ShowMulthi(String str, int Port, String IP,int owner,int pos, TankClient tt) {
        //Newtwork...
        tk = tt;
        
        OwnerPlayer = owner;
        GForm = Multhi;
        SelectIndex = 1;
        PlayerName = str;
        PortChat = Port;
        IPChat = IP;
        ServerMode = pos;
        renderImage();
        if(pos == 1){
            this.AddTank(Game1,4,4,PUP,TUP,494,645,500);
            //Enemy
            this.AddTank(SGame2,4,4,PRIGHT,TRIGHT,-5,-7,-1);
        }else if(pos == 2){
            this.AddTank(Game1,4,4,PUP,TUP,295,645,500);
        }
        
        // TankServer tk = new TankServer(this);
        // tk.CreateListener(PortChat);
    }
    
    
    public void run() {
        String TempStatus = "";
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
                    
                    if(GForm == Multhi){
                        if(!VectorPlayer1.isEmpty()){
                            TempStatus = String.valueOf(VectorPlayer1S.get(0));
                            if(TempStatus.compareTo("1") == 0){
                                TempStatus = "2";
                            }else{
                                TempStatus = "1";
                            }
                            tk.Send(sendTanks(TempStatus,String.valueOf(VectorPlayer1L.get(0)),String.valueOf(VectorPlayer1A.get(0)),String.valueOf(VectorPlayer1H.get(0)),String.valueOf(VectorPlayer1T.get(0)),String.valueOf(VectorPlayer1X.get(0)),String.valueOf(VectorPlayer1Y.get(0)),String.valueOf(VectorPlayer1Sum.get(0))),IPChat, PortChat);
                        }
                        if(!SumVectorP.isEmpty()){
                            for(int i=0; i<SumVectorP.size(); i++){
                                tk.Send(sendSum(String.valueOf(SumVectorP.size()),String.valueOf(SumVectorX.get(i)),String.valueOf(SumVectorY.get(i)),String.valueOf(SumVectorT.get(i)),String.valueOf(SumVectorS.get(i)),String.valueOf(i)),IPChat, PortChat);
                            }
                        }
                        if(!VectorSoldier2.isEmpty() && ServerMode == 1){
                            for(int i=0; i<VectorSoldier2.size(); i++){
                                tk.Send(sendEnemies(VectorSoldier2S.get(i).toString(),VectorSoldier2L.get(i).toString(),VectorSoldier2A.get(i).toString(),VectorSoldier2H.get(i).toString(),VectorSoldier2T.get(i).toString(),VectorSoldier2X.get(i).toString(),VectorSoldier2Y.get(i).toString(),String.valueOf(i),String.valueOf(VectorSoldier2.size())),IPChat, PortChat);
                            }
                        }
                        if(!SumVectorPE.isEmpty() && ServerMode == 1){
                            for(int i=0; i<SumVectorPE.size(); i++){
                                tk.Send(sendEnemyAMMO(String.valueOf(SumVectorPE.size()),SumVectorXE.get(i).toString(),SumVectorYE.get(i).toString(),SumVectorTE.get(i).toString(),SumVectorSE.get(i).toString(),String.valueOf(i)),IPChat, PortChat);
                            }
                        }
                    }
                    
                    if(GForm == Setting){
                        MyTime--;
                        if(MyTime == 0){
                            GForm = MainMenu;
                            mainApp.HideMedia();
                            SelectIndex = 1;
                            ThreadSpeed = 10;
                            MainMenuUpMove();
                        }
                    }
                    
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
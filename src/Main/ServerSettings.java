/*
 * ServerSettings.java
 *
 * Created on November 7, 2007, 10:55 PM
 */

package Main;

/**
 *
 * @author  Bokhoo
 */
public class ServerSettings extends javax.swing.JFrame implements Runnable{
    private String ConnData = "";
    private Thread thread;
    private int ThreadSpeed = 100;
    private long paintTime;
    private Panel2D panel;
    private WhitePanel wPanel;
    private RedPanel rPanel;
    private int ServerMode;
    private boolean firstTime;
    
    private String TempIp;
    private int TempPort;
    private TankServer ts;
    private TankClient tk;
    
    private String isConnect = "";
    public ServerSettings(Panel2D p) {
        initComponents();
        panel = p;
        this.setLocation(400,400);
        this.setTitle("MegaTank by SW04D405");
        wPanel = new WhitePanel();
        rPanel = new RedPanel();
        wPanel.setSize(90,90);
        rPanel.setSize(90,90);
        wPanel.setLocation(30,40);
        rPanel.setLocation(30,140);
        this.getContentPane().add(wPanel);
        this.getContentPane().add(rPanel);
        pack();
        wPanel.start();
        rPanel.start();
        ts = new TankServer(panel,this);
        tk = new TankClient();
        
        if(thread == null){
            thread = new Thread(this);
            thread.start();
        }
        firstTime = false;
        this.setResizable(false);
        
    }
    
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        txtName = new javax.swing.JTextField();
        txtIP = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtPort = new javax.swing.JTextField();
        btnOK = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("\u041d\u044d\u0440:");

        jLabel2.setText("IP \u0445\u0430\u044f\u0433:");

        jLabel3.setText("\u041f\u043e\u0440\u0442:");

        btnOK.setText("\u0422\u043e\u0433\u043b\u043e\u0451");
        btnOK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnOKMousePressed(evt);
            }
        });
        btnOK.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnOKKeyPressed(evt);
            }
        });

        btnCancel.setText("\u0413\u0430\u0440\u0430\u0445");
        btnCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCancelMousePressed(evt);
            }
        });

        jLabel4.setText("\u0425\u043e\u043b\u0431\u043e\u043b\u0442\u044b\u043d \u0442\u043e\u0445\u0438\u0440\u0433\u043e\u043e");

        jRadioButton1.setText("\u0426\u0430\u0433\u0430\u0430\u043d \u0442\u0430\u043d\u043a");
        jRadioButton1.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jRadioButton1.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jRadioButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton1MouseClicked(evt);
            }
        });

        jRadioButton2.setText("\u0423\u043b\u0430\u0430\u043d \u0442\u0430\u043d\u043a");
        jRadioButton2.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jRadioButton2.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jRadioButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton2MouseClicked(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel5.setText("\u0414\u0430\u0439\u0441\u0430\u043d");

        jButton1.setText("\u0425\u043e\u043b\u0431\u043e\u0433\u0434\u043e\u0445");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton2)
                            .addComponent(jRadioButton1)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnOK, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPort, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                            .addComponent(txtIP, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                            .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                            .addComponent(jLabel5))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(65, 65, 65)
                .addComponent(jRadioButton1)
                .addGap(74, 74, 74)
                .addComponent(jRadioButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(btnOK)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(btnCancel))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(57, 57, 57))
        );
        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void setConnData(String str){
        ConnData = str;
    }
    
    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed
        // Join Mode
        if(firstTime == false){
            ts.CreateListener(Integer.parseInt(this.txtPort.getText())+1,2);
            firstTime = true;
        }
        
        try{
            tk.Send("connecting...",this.txtIP.getText(),Integer.parseInt(this.txtPort.getText()));
        }catch(Exception e){}
        
    }//GEN-LAST:event_jButton1MousePressed
    
    private void jRadioButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton2MouseClicked
        //red
        if(this.jRadioButton1.isSelected() == true){
            this.jRadioButton1.setSelected(false);
        }
        rPanel.stop();
        wPanel.start();
    }//GEN-LAST:event_jRadioButton2MouseClicked
    
    private void jRadioButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton1MouseClicked
        //white
        if(this.jRadioButton2.isSelected() == true){
            this.jRadioButton2.setSelected(false);
        }
        wPanel.stop();
        rPanel.start();
    }//GEN-LAST:event_jRadioButton1MouseClicked
    
    private void btnOKKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnOKKeyPressed
        if(ServerMode == 1){
            if (txtIP.getText().compareTo("") != 0 && txtName.getText().compareTo("") != 0 && txtPort.getText().compareTo("") != 0 && (jRadioButton2.isSelected() == true || jRadioButton1.isSelected() == true)) {
                this.HideSettings();
            }
        }
    }//GEN-LAST:event_btnOKKeyPressed
    
    private void btnOKMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOKMousePressed
        if(ServerMode == 1){
            if (txtIP.getText().compareTo("") != 0 && txtName.getText().compareTo("") != 0 && txtPort.getText().compareTo("") != 0 && (jRadioButton2.isSelected() == true || jRadioButton1.isSelected() == true)) {
                this.HideSettings();
            }
        }
    }//GEN-LAST:event_btnOKMousePressed
    
    private void btnCancelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMousePressed
        this.setVisible(false);
        this.txtIP.setText("");
        this.txtName.setText("");
        this.txtPort.setText("");
        wPanel.stop();
        rPanel.stop();
    }//GEN-LAST:event_btnCancelMousePressed
    
    public void ShowSettings(int mode,String ip, int port) {
        ServerMode = mode;
        this.setVisible(true);
        if(ServerMode == 1){
            this.TempPort = port;
            this.TempIp = ip;
            this.txtIP.setText(TempIp);
            this.txtPort.setText(String.valueOf(TempPort));
            this.jButton1.setVisible(false);
            this.btnOK.setVisible(true);
            if(firstTime == false){
                ts.CreateListener(Integer.parseInt(txtPort.getText()),2);
                firstTime = true;
            }
        }else if(ServerMode == 2){
            this.jButton1.setVisible(true);
            this.btnOK.setVisible(false);
        }
    }
    
    public void HideSettings() {
        if(ServerMode == 1 && isConnect.compareTo("yes") == 0){
            tk.Send("^",this.txtIP.getText(),Integer.parseInt(this.txtPort.getText())+1);
            int owner = 0;
            ServerMode = 0;
            this.setVisible(false);
            wPanel.stop();
            rPanel.stop();
            if(jRadioButton1.isSelected() == true){
                owner = 1;
            }else if(jRadioButton2.isSelected() == true){
                owner = 2;
            }
            ts.ChangeMode(1);
            panel.ShowMulthi(this.txtName.getText(), Integer.parseInt(this.txtPort.getText())+1, this.txtIP.getText(),owner,1,tk);
        }else if(ServerMode == 2){
            int owner = 0;
            ServerMode = 0;
            this.setVisible(false);
            wPanel.stop();
            rPanel.stop();
            
            if(jRadioButton1.isSelected() == true){
                owner = 1;
            }else if(jRadioButton2.isSelected() == true){
                owner = 2;
            }
            ts.ChangeMode(1);
            panel.ShowMulthi(this.txtName.getText(), Integer.parseInt(this.txtPort.getText()), this.txtIP.getText(),owner,2,tk);
        }
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
                    
                    if(ConnData != ""){
                        //   System.out.println(ConnData);
                        if(ConnData.compareTo("connecting...") == 0){
                            //Server
                            this.jTextArea1.setText(this.jTextArea1.getText()+ConnData);
                            ConnData="";
                            int pport = Integer.parseInt(this.txtPort.getText())+1;
                            tk.Send("success",this.txtIP.getText(),pport);
                            ConnData="";
                        }
                        if(ConnData.compareTo("success") == 0){
                            //Client
                            this.jTextArea1.setText(ConnData);
                            tk.Send("yes",this.txtIP.getText(),Integer.parseInt(this.txtPort.getText()));
                            ConnData="";
                        }
                        if(ConnData.compareTo("yes") == 0){
                            //Server
                            ConnData="";
                            isConnect = "yes";
                            //tk.Send("start",this.txtIP.getText(),Integer.parseInt(this.txtPort.getText()));
                        }
                        if(ConnData.compareTo("^") == 0){
                            //call game
                            //Client
                            this.HideSettings();
                            ConnData="";
                        }
                    }
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
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnOK;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField txtIP;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPort;
    // End of variables declaration//GEN-END:variables
}
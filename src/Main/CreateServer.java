/*
 * CreateServer.java
 *
 * Created on November 19, 2007, 6:48 PM
 */

package Main;

import java.util.Vector;

/**
 *
 * @author  Bokhoo
 */
public class CreateServer extends javax.swing.JFrame {
    
    private MapCanvas canvas;
    private Panel2D panel;
    private Vector<String> vector = new Vector<String>();
    private ServerSettings server;
    public CreateServer(Panel2D p) {
        initComponents();
        this.setTitle("MegaTank by SW04D405");
        this.setResizable(false);
        panel = p;
        canvas = new MapCanvas();
        canvas.setLocation(10,10);
        canvas.setSize(400,300);
        this.add(canvas);
        vector.addElement("MegaTank-1");
        jList1.setListData(vector);
        this.jRadioButton1.setSelected(true);
        this.jButton2.setVisible(false);
        this.setLocation(400,400);
    }
    
    
    
    public void ShowServer(){
        this.setVisible(true);
    }
    
    public void HideServer(){
        this.setVisible(false);
    }
    
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jList1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(jList1);

        jButton1.setText("\u0421\u0435\u0440\u0432\u0435\u0440 \u04af\u04af\u0441\u0433\u044d\u0445");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1MousePressed(evt);
            }
        });

        jButton2.setText("\u0421\u0435\u0440\u0432\u0435\u0440\u0442\u044d\u0439 \u0445\u043e\u043b\u0431\u043e\u0433\u0434\u043e\u0445");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton2MousePressed(evt);
            }
        });

        jRadioButton1.setText("\u0421\u0435\u0440\u0432\u0435\u0440 \u04af\u04af\u0441\u0433\u044d\u0445");
        jRadioButton1.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jRadioButton1.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jRadioButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton1MouseClicked(evt);
            }
        });

        jRadioButton2.setText("\u0421\u0435\u0440\u0432\u044d\u0440\u0442\u044d\u0439 \u0445\u043e\u043b\u0431\u043e\u0433\u0434\u043e\u0445");
        jRadioButton2.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jRadioButton2.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jRadioButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton2MouseClicked(evt);
            }
        });

        jLabel1.setText("IP \u0445\u0430\u044f\u0433");

        jLabel2.setText("\u041f\u043e\u0440\u0442");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField1)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(323, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jRadioButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2))
                        .addGap(44, 44, 44))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))))
        );
        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void jRadioButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton2MouseClicked
        if(this.jRadioButton1.isSelected() == true){
            this.jRadioButton1.setSelected(false);
            this.jTextField1.setVisible(false);
            this.jTextField2.setVisible(false);
            this.jLabel1.setVisible(false);
            this.jLabel2.setVisible(false);
            this.jButton1.setVisible(false);
            this.jButton2.setVisible(true);
        }
    }//GEN-LAST:event_jRadioButton2MouseClicked
    
    private void jRadioButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton1MouseClicked
        if(this.jRadioButton2.isSelected() == true){
            this.jRadioButton2.setSelected(false);
            this.jTextField1.setVisible(true);
            this.jTextField2.setVisible(true);
            this.jLabel1.setVisible(true);
            this.jLabel2.setVisible(true);
            this.jButton1.setVisible(true);
            this.jButton2.setVisible(false);
        }
    }//GEN-LAST:event_jRadioButton1MouseClicked
    
    private void jButton2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MousePressed
        //Join to Server
        if(jList1.getSelectedIndex() >= 0){
            server = new ServerSettings(panel);
            server.ShowSettings(2,"",0);
            this.HideServer();
        }
    }//GEN-LAST:event_jButton2MousePressed
    
    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed
        // CreateServer
        if(jList1.getSelectedIndex() >= 0){
            if(jTextField1.getText().compareTo("") != 0 && jTextField2.getText().compareTo("") != 0){
                server = new ServerSettings(panel);
                server.ShowSettings(1,this.jTextField1.getText(),Integer.parseInt(this.jTextField2.getText()));
                this.HideServer();
            }
        }
    }//GEN-LAST:event_jButton1MousePressed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList jList1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
    
}

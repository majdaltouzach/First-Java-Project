/**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
*<pre>
* Class           VeryVeryBoards
* File            VeryVeryBoards.java
* Description     About form for Snowboards Application
*                 
* 
* @author         <i>Toufic Majdalani</i>
* Environment     PC, Windows 10, NetBeans IDE 8.2, jdk 1.8.0_131
* Date            1/30/2020
* @version        1.0.0
* @see            javax.swing.JOptionPane
* @see            javax.swing.JFrame
*</pre>
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
package Project1;

import java.awt.Toolkit;
import java.awt.Frame;

/**
 *
 * @author 955349413
 */
public class About extends javax.swing.JDialog {

    /**
     * Creates new form About
     * @param parent
     * Initializes icon image and sets close button as default button.
     * @param modal
     * Sets boolean modal as true
     */
    public About(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.getRootPane().setDefaultButton(closeJButton);
        //set icon
        this.setIconImage
        (Toolkit.getDefaultToolkit().getImage("src/Project1/Info_icon.jpg"));
        this.setLocationRelativeTo(this);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        imageJLabel = new javax.swing.JLabel();
        descriptionJScrollPane = new javax.swing.JScrollPane();
        descriptionJTextArea = new javax.swing.JTextArea();
        warningJLabel = new javax.swing.JLabel();
        closeJButton = new javax.swing.JButton();
        copyrightJLabel = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Snowboards About");
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        imageJLabel.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        imageJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project1/snowboarding_icon.jpg"))); // NOI18N
        imageJLabel.setText("Snowboarding FAQ");

        descriptionJTextArea.setEditable(false);
        descriptionJTextArea.setColumns(20);
        descriptionJTextArea.setFont(new java.awt.Font("Monospaced", 0, 11)); // NOI18N
        descriptionJTextArea.setRows(5);
        descriptionJTextArea.setText("\n Class           VeryVeryBoards\n File            VeryVeryBoards.java\n Description     A program used to rent snowboards to enjoy your time \n               snowboarding on the wonderful hills of Iceland.\n                          \n                  \t Prices are:\n                         Snowboards = $40.00\n                         Snowboards w/boots = $65.00\n\nAuthor                   Toufic Majdalani\n\n");
        descriptionJTextArea.setWrapStyleWord(true);
        descriptionJScrollPane.setViewportView(descriptionJTextArea);

        warningJLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        warningJLabel.setText("Warning: Free for all");

        closeJButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        closeJButton.setMnemonic('c');
        closeJButton.setText("Close");
        closeJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeJButtonActionPerformed(evt);
            }
        });

        copyrightJLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        copyrightJLabel.setText("Copyright: Toufic Majdalani");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(imageJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(descriptionJScrollPane))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(warningJLabel)
                        .addGap(101, 101, 101)
                        .addComponent(closeJButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 147, Short.MAX_VALUE)
                        .addComponent(copyrightJLabel)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(imageJLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(descriptionJScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(warningJLabel)
                    .addComponent(closeJButton)
                    .addComponent(copyrightJLabel))
                .addGap(51, 51, 51))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
    *	Method          closeJButtonActionPerformed()
    *	Description     Closes about form
    *	@param          evt java.awt.event.ActionEvent
    *   @see            java.awt.event.ActionEvent
    *	@author         <i>Toufic Majdalani</i>
    *	Date            1/30/2020
    *</pre>
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    private void closeJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeJButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_closeJButtonActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeJButton;
    private javax.swing.JLabel copyrightJLabel;
    private javax.swing.JScrollPane descriptionJScrollPane;
    private javax.swing.JTextArea descriptionJTextArea;
    private javax.swing.JLabel imageJLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel warningJLabel;
    // End of variables declaration//GEN-END:variables
}

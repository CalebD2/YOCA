/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Alpha;

/**
 *
 * @author Caleb
 */
public class distEdit extends javax.swing.JFrame {
    private GUI mainframe;

    /**
     * Creates new form semesterAddRem
     * and gets a reference to the window that created this pop-up
     */
    public distEdit(GUI mainframe) {
        initComponents();
        this.mainframe = mainframe;
    }
    
    private void editClassNameTextReset(){
        editDistNameText.setForeground(new java.awt.Color(153, 153, 153));
        editDistNameText.setText("ex. Biology");
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        panelEditDist = new javax.swing.JPanel();
        editButCancel = new javax.swing.JButton();
        editButSubmitDist = new javax.swing.JButton();
        remScrollPane = new javax.swing.JScrollPane();
        remList = new javax.swing.JList<>();
        editSeperator = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        editDistCBoxSemester = new javax.swing.JComboBox<>();
        editDistNameText = new javax.swing.JTextField();
        addDistSpinnerWeight = new javax.swing.JSpinner();
        addDistCBoxClass = new javax.swing.JComboBox<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setTitle("Edit Distribution");
        setAlwaysOnTop(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                distEdit.this.windowClosing(evt);
            }
        });

        editButCancel.setText("Cancel");
        editButCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButCancelActionPerformed(evt);
            }
        });

        editButSubmitDist.setText("Submit Changes");
        editButSubmitDist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButSubmitDistActionPerformed(evt);
            }
        });

        remList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        remScrollPane.setViewportView(remList);

        jLabel1.setText("Distribution Name");

        jLabel2.setText("Distribution Weight");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setLabelFor(remScrollPane);
        jLabel3.setText("Select Distribution to Change");
        jLabel3.setToolTipText("");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Enter Distribution Name and Weight");

        editDistCBoxSemester.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Semester...", "Item 2", "Item 3", "Item 4" }));
        editDistCBoxSemester.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editDistCBoxSemesterActionPerformed1(evt);
            }
        });

        editDistNameText.setForeground(new java.awt.Color(153, 153, 153));
        editDistNameText.setText("ex. Exam");
        editDistNameText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                editDistNameTextFocusLost(evt);
            }
        });
        editDistNameText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editDistNameTextMouseClicked(evt);
            }
        });

        addDistSpinnerWeight.setModel(new javax.swing.SpinnerNumberModel(25.0d, 0.0d, 100.0d, 0.5d));
        addDistSpinnerWeight.setEditor(new javax.swing.JSpinner.NumberEditor(addDistSpinnerWeight, ".#"));

        addDistCBoxClass.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Class...", "Item 2", "Item 3", "Item 4" }));
        addDistCBoxClass.setToolTipText("Select your class here");

        javax.swing.GroupLayout panelEditDistLayout = new javax.swing.GroupLayout(panelEditDist);
        panelEditDist.setLayout(panelEditDistLayout);
        panelEditDistLayout.setHorizontalGroup(
            panelEditDistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelEditDistLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEditDistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(editDistCBoxSemester, 0, 233, Short.MAX_VALUE)
                    .addComponent(addDistCBoxClass, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(editSeperator)
                    .addComponent(remScrollPane, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelEditDistLayout.createSequentialGroup()
                        .addComponent(editButCancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editButSubmitDist, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE))
                    .addGroup(panelEditDistLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelEditDistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(editDistNameText, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(addDistSpinnerWeight)))
                    .addGroup(panelEditDistLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(130, 130, 130)))
                .addContainerGap())
        );
        panelEditDistLayout.setVerticalGroup(
            panelEditDistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEditDistLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(editDistCBoxSemester, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addDistCBoxClass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(remScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(editSeperator, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEditDistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editDistNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEditDistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addDistSpinnerWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEditDistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editButSubmitDist)
                    .addComponent(editButCancel))
                .addGap(198, 198, 198))
        );

        jTabbedPane1.addTab("Edit Distribution", panelEditDist);

        jMenu1.setText("File");

        jMenuItem1.setText("Exit");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileExitActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("panelAddRemSem");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Action taken when file->exit is taken. Simply closes the entire system (The entire app)
    private void fileExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_fileExitActionPerformed

    // Action performed when the cancel button on the add Semester tab is clicked
    // Currently re-enables the original GUI
    // Then disposes the pop-up window
    private void editButCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButCancelActionPerformed
        // TODO add your handling code here:
        mainframe.setEnabled(true);
        this.setVisible(false);
    }//GEN-LAST:event_editButCancelActionPerformed

    // Action performed when window is closed
    // Currently re-enables the original GUI that instantiated this pop-up window
    private void windowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_windowClosing
        // TODO add your handling code here:
        mainframe.setEnabled(true);
    }//GEN-LAST:event_windowClosing

    private void editDistCBoxSemesterActionPerformed1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editDistCBoxSemesterActionPerformed1
        editDistCBoxSemester.setModel(new javax.swing.DefaultComboBoxModel(mainframe.listClasses((String) editDistCBoxSemester.getSelectedItem())));
    }//GEN-LAST:event_editDistCBoxSemesterActionPerformed1

    private void editDistNameTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_editDistNameTextFocusLost
        // TODO add your handling code here:
        if(editDistNameText.getText().equals(""))editClassNameTextReset();
    }//GEN-LAST:event_editDistNameTextFocusLost

    private void editDistNameTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editDistNameTextMouseClicked
        // TODO add your handling code here:
        if(editDistNameText.getText().equals("ex. Exam")){
            editDistNameText.setText("");
            editDistNameText.setForeground(new java.awt.Color(0, 0, 0));
        }
    }//GEN-LAST:event_editDistNameTextMouseClicked

    private void editButSubmitDistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButSubmitDistActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editButSubmitDistActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> addDistCBoxClass;
    private javax.swing.JSpinner addDistSpinnerWeight;
    private javax.swing.JButton editButCancel;
    private javax.swing.JButton editButSubmitDist;
    private javax.swing.JComboBox<String> editDistCBoxSemester;
    private javax.swing.JTextField editDistNameText;
    private javax.swing.JSeparator editSeperator;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel panelEditDist;
    private javax.swing.JList<String> remList;
    private javax.swing.JScrollPane remScrollPane;
    // End of variables declaration//GEN-END:variables
}

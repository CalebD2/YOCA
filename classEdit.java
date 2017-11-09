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
public class classEdit extends javax.swing.JFrame {
    private GUI mainframe;

    /**
     * Creates new form semesterAddRem
     * and gets a reference to the window that created this pop-up
     */
    public classEdit(GUI mainframe) {
        initComponents();
        this.mainframe = mainframe;
    }
    
    private void editClassNameTextReset(){
        editClassNameText.setForeground(new java.awt.Color(153, 153, 153));
        editClassNameText.setText("ex. Biology");
    }
    
    private void editClassCodeTextReset(){
        editClassCodeText.setForeground(new java.awt.Color(153, 153, 153));
        editClassCodeText.setText("ex. 1441");
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
        panelEditClass = new javax.swing.JPanel();
        editButCancel = new javax.swing.JButton();
        editButSubmitClass = new javax.swing.JButton();
        remScrollPane = new javax.swing.JScrollPane();
        remList = new javax.swing.JList<>();
        editSeperator = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        editClassCBoxSemester = new javax.swing.JComboBox<>();
        editClassNameText = new javax.swing.JTextField();
        editClassCodeText = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setTitle("Edit Class");
        setAlwaysOnTop(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                classEdit.this.windowClosing(evt);
            }
        });

        editButCancel.setText("Cancel");
        editButCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButCancelActionPerformed(evt);
            }
        });

        editButSubmitClass.setText("Submit Changes");
        editButSubmitClass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButSubmitClassActionPerformed(evt);
            }
        });

        remList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        remScrollPane.setViewportView(remList);

        jLabel1.setText("Class Name");

        jLabel2.setText("Class Code");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setLabelFor(remScrollPane);
        jLabel3.setText("Select Class to Change");
        jLabel3.setToolTipText("");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Enter Preferred Class Name and Code");

        editClassCBoxSemester.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Semester...", "Item 2", "Item 3", "Item 4" }));
        editClassCBoxSemester.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editClassCBoxSemesterActionPerformed1(evt);
            }
        });

        editClassNameText.setForeground(new java.awt.Color(153, 153, 153));
        editClassNameText.setText("ex. Biology");
        editClassNameText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                editClassNameTextFocusLost(evt);
            }
        });
        editClassNameText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editClassNameTextMouseClicked(evt);
            }
        });

        editClassCodeText.setForeground(new java.awt.Color(153, 153, 153));
        editClassCodeText.setText("ex. 1441");
        editClassCodeText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                editClassCodeTextFocusLost(evt);
            }
        });
        editClassCodeText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editClassCodeTextMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelEditClassLayout = new javax.swing.GroupLayout(panelEditClass);
        panelEditClass.setLayout(panelEditClassLayout);
        panelEditClassLayout.setHorizontalGroup(
            panelEditClassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelEditClassLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEditClassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(editClassCBoxSemester, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(editSeperator)
                    .addComponent(remScrollPane, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelEditClassLayout.createSequentialGroup()
                        .addGroup(panelEditClassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(editButCancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelEditClassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(editButSubmitClass, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                            .addComponent(editClassNameText)
                            .addComponent(editClassCodeText))))
                .addContainerGap())
        );
        panelEditClassLayout.setVerticalGroup(
            panelEditClassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEditClassLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(editClassCBoxSemester, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(remScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(editSeperator, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEditClassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editClassNameText))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEditClassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editClassCodeText))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEditClassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editButSubmitClass)
                    .addComponent(editButCancel))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Edit Class", panelEditClass);

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
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void editClassCBoxSemesterActionPerformed1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editClassCBoxSemesterActionPerformed1
        editClassCBoxSemester.setModel(new javax.swing.DefaultComboBoxModel(mainframe.listClasses((String) editClassCBoxSemester.getSelectedItem())));
    }//GEN-LAST:event_editClassCBoxSemesterActionPerformed1

    private void editClassNameTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_editClassNameTextFocusLost
        // TODO add your handling code here:
        if(editClassNameText.getText().equals(""))editClassNameTextReset();
    }//GEN-LAST:event_editClassNameTextFocusLost

    private void editClassCodeTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_editClassCodeTextFocusLost
        // TODO add your handling code here:
        if(editClassCodeText.getText().equals(""))editClassCodeTextReset();
    }//GEN-LAST:event_editClassCodeTextFocusLost

    private void editClassNameTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editClassNameTextMouseClicked
        // TODO add your handling code here:
        if(editClassNameText.getText().equals("ex. Biology")){
            editClassNameText.setText("");
            editClassNameText.setForeground(new java.awt.Color(0, 0, 0));
        }
    }//GEN-LAST:event_editClassNameTextMouseClicked

    private void editClassCodeTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editClassCodeTextMouseClicked
        // TODO add your handling code here:
        if(editClassCodeText.getText().equals("ex. 1441")){
            editClassCodeText.setText("");
            editClassCodeText.setForeground(new java.awt.Color(0, 0, 0));
        }
    }//GEN-LAST:event_editClassCodeTextMouseClicked

    private void editButSubmitClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButSubmitClassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editButSubmitClassActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton editButCancel;
    private javax.swing.JButton editButSubmitClass;
    private javax.swing.JComboBox<String> editClassCBoxSemester;
    private javax.swing.JTextField editClassCodeText;
    private javax.swing.JTextField editClassNameText;
    private javax.swing.JSeparator editSeperator;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel panelEditClass;
    private javax.swing.JList<String> remList;
    private javax.swing.JScrollPane remScrollPane;
    // End of variables declaration//GEN-END:variables
}

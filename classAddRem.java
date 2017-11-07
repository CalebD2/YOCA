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
public class classAddRem extends javax.swing.JFrame {
    private GUI mainframe;

    /**
     * Creates new form semesterAddRem
     * and gets a reference to the window that created this pop-up
     */
    public classAddRem(GUI mainframe) {
        initComponents();
        this.mainframe = mainframe;
    }
    
    private void addClassNameTextReset(){
        addClassNameText.setForeground(new java.awt.Color(153, 153, 153));
        addClassNameText.setText("ex. Biology");
    }
    
    private void addClassCodeTextReset(){
        addClassCodeText.setForeground(new java.awt.Color(153, 153, 153));
        addClassCodeText.setText("ex. 1441");
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
        panelAddClass = new javax.swing.JPanel();
        addClassCBoxSemester = new javax.swing.JComboBox<>();
        addButCancel = new javax.swing.JButton();
        addButCreateClass = new javax.swing.JButton();
        addClassNameText = new javax.swing.JTextField();
        addClassCodeText = new javax.swing.JTextField();
        addClassNameTitle = new javax.swing.JLabel();
        addClassCodeTitle = new javax.swing.JLabel();
        panelRemClass = new javax.swing.JPanel();
        remScrollPane = new javax.swing.JScrollPane();
        remList = new javax.swing.JList<>();
        remButCancel = new javax.swing.JButton();
        remButRemClass = new javax.swing.JButton();
        remClassCBoxSemester1 = new javax.swing.JComboBox<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setTitle("Add/Remove Class");
        setAlwaysOnTop(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                classAddRem.this.windowClosing(evt);
            }
        });

        addClassCBoxSemester.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Semester...", "Item 2", "Item 3", "Item 4" }));
        addClassCBoxSemester.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addClassCBoxSemesterActionPerformed1(evt);
            }
        });

        addButCancel.setText("Cancel");
        addButCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButCancelActionPerformed(evt);
            }
        });

        addButCreateClass.setText("Create Class");

        addClassNameText.setForeground(new java.awt.Color(153, 153, 153));
        addClassNameText.setText("ex. Biology");
        addClassNameText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                addClassNameTextFocusLost(evt);
            }
        });
        addClassNameText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addClassNameTextMouseClicked(evt);
            }
        });

        addClassCodeText.setForeground(new java.awt.Color(153, 153, 153));
        addClassCodeText.setText("ex. 1441");
        addClassCodeText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                addClassCodeTextFocusLost(evt);
            }
        });
        addClassCodeText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addClassCodeTextMouseClicked(evt);
            }
        });

        addClassNameTitle.setText("Class Name");

        addClassCodeTitle.setText("Class Code");

        javax.swing.GroupLayout panelAddClassLayout = new javax.swing.GroupLayout(panelAddClass);
        panelAddClass.setLayout(panelAddClassLayout);
        panelAddClassLayout.setHorizontalGroup(
            panelAddClassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAddClassLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAddClassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAddClassLayout.createSequentialGroup()
                        .addGroup(panelAddClassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(addButCancel, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                            .addComponent(addClassNameTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addClassCodeTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelAddClassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addButCreateClass, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(addClassNameText)
                            .addComponent(addClassCodeText)))
                    .addComponent(addClassCBoxSemester, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelAddClassLayout.setVerticalGroup(
            panelAddClassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAddClassLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addClassCBoxSemester, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelAddClassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addClassNameTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addClassNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelAddClassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addClassCodeText)
                    .addComponent(addClassCodeTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelAddClassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addButCancel)
                    .addComponent(addButCreateClass))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Add Class", panelAddClass);

        remList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        remScrollPane.setViewportView(remList);

        remButCancel.setText("Cancel");
        remButCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remButCancelActionPerformed(evt);
            }
        });

        remButRemClass.setText("Remove Class");

        remClassCBoxSemester1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Semester...", "Item 2", "Item 3", "Item 4" }));
        remClassCBoxSemester1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remClassCBoxSemester1ActionPerformed1(evt);
            }
        });

        javax.swing.GroupLayout panelRemClassLayout = new javax.swing.GroupLayout(panelRemClass);
        panelRemClass.setLayout(panelRemClassLayout);
        panelRemClassLayout.setHorizontalGroup(
            panelRemClassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRemClassLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRemClassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(remScrollPane)
                    .addGroup(panelRemClassLayout.createSequentialGroup()
                        .addComponent(remButCancel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(remButRemClass, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE))
                    .addComponent(remClassCBoxSemester1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelRemClassLayout.setVerticalGroup(
            panelRemClassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRemClassLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(remClassCBoxSemester1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(remScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelRemClassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(remButCancel)
                    .addComponent(remButRemClass))
                .addGap(47, 47, 47))
        );

        jTabbedPane1.addTab("Remove Class", panelRemClass);

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
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("panelAddRemClass");

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
    private void addButCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButCancelActionPerformed
        // TODO add your handling code here:
        mainframe.setEnabled(true);
        this.setVisible(false);
    }//GEN-LAST:event_addButCancelActionPerformed

    // Action performed when window is closed
    // Currently re-enables the original GUI that instantiated this pop-up window
    private void windowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_windowClosing
        // TODO add your handling code here:
        mainframe.setEnabled(true);
    }//GEN-LAST:event_windowClosing

    //Action performed when cancel button on remove tab
    // Currently re-enables the original GUI that instantiated this pop-up window
    // Then disposes the pop-up window
    private void remButCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remButCancelActionPerformed
        // TODO add your handling code here:
        mainframe.setEnabled(true);
        this.setVisible(false);
    }//GEN-LAST:event_remButCancelActionPerformed

    private void addClassCBoxSemesterActionPerformed1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addClassCBoxSemesterActionPerformed1
        addClassCBoxSemester.setModel(new javax.swing.DefaultComboBoxModel(mainframe.listClasses((String) addClassCBoxSemester.getSelectedItem())));
    }//GEN-LAST:event_addClassCBoxSemesterActionPerformed1

    private void remClassCBoxSemester1ActionPerformed1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remClassCBoxSemester1ActionPerformed1
        // TODO add your handling code here:
    }//GEN-LAST:event_remClassCBoxSemester1ActionPerformed1

    private void addClassNameTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_addClassNameTextFocusLost
        // TODO add your handling code here:
        if(addClassNameText.getText().equals(""))addClassNameTextReset();
    }//GEN-LAST:event_addClassNameTextFocusLost

    private void addClassCodeTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_addClassCodeTextFocusLost
        // TODO add your handling code here:
        if(addClassCodeText.getText().equals(""))addClassCodeTextReset();
    }//GEN-LAST:event_addClassCodeTextFocusLost

    private void addClassNameTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addClassNameTextMouseClicked
        // TODO add your handling code here:
        if(addClassNameText.getText().equals("ex. Biology")){
            addClassNameText.setText("");
            addClassNameText.setForeground(new java.awt.Color(0, 0, 0));
        }
    }//GEN-LAST:event_addClassNameTextMouseClicked

    private void addClassCodeTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addClassCodeTextMouseClicked
        // TODO add your handling code here:
        if(addClassCodeText.getText().equals("ex. 1441")){
            addClassCodeText.setText("");
            addClassCodeText.setForeground(new java.awt.Color(0, 0, 0));
        }
    }//GEN-LAST:event_addClassCodeTextMouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButCancel;
    private javax.swing.JButton addButCreateClass;
    private javax.swing.JComboBox<String> addClassCBoxSemester;
    private javax.swing.JTextField addClassCodeText;
    private javax.swing.JLabel addClassCodeTitle;
    private javax.swing.JTextField addClassNameText;
    private javax.swing.JLabel addClassNameTitle;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel panelAddClass;
    private javax.swing.JPanel panelRemClass;
    private javax.swing.JButton remButCancel;
    private javax.swing.JButton remButRemClass;
    private javax.swing.JComboBox<String> remClassCBoxSemester1;
    private javax.swing.JList<String> remList;
    private javax.swing.JScrollPane remScrollPane;
    // End of variables declaration//GEN-END:variables
}

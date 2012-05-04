/* 
 * Copyright (c) 2010-2012 Thiago T. Sá
 * 
 * This file is part of CloudReports.
 *
 * CloudReports is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * CloudReports is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * For more information about your rights as a user of CloudReports,
 * refer to the LICENSE file or see <http://www.gnu.org/licenses/>.
 */

package cloudreports.gui;

import cloudreports.dao.SettingDAO;
import cloudreports.models.Setting;
import java.util.Random;

/**
 * The RandomnessSettings form.
 * Most of its code is generated automatically by the NetBeans IDE.
 * 
 * @author      Thiago T. Sá
 * @since       1.0
 */
public class RandomnessSettings extends javax.swing.JDialog {

    /** An instance of settings DAO. */
    private SettingDAO sDAO;
    
    /** Creates a new RandomnessConfiguration form. */
    public RandomnessSettings() {
        setModal(true);
        initComponents();
        buttonGroup.add(JavaRadioButton);
        buttonGroup.add(QRBGRadioButton);
        
        this.sDAO = new SettingDAO();
        Setting randomnessSource = sDAO.getSetting("Randomness");
        if(randomnessSource.getValue().equals("0")) {
            JavaRadioButton.setSelected(true);
            setQRBGSettingsEnabled(false);
        }
        else {
            QRBGRadioButton.setSelected(true);
            setQRBGSettingsEnabled(true);
        }
        
        Setting QRBGpassword;
        Setting QRBGusername = sDAO.getSetting("QRBGusername");
        if(QRBGusername == null) {
            QRBGusername = new Setting("QRBGusername", "");
            QRBGpassword = new Setting("QRBGpassword", "");
            sDAO.insertSetting(QRBGusername);
            sDAO.insertSetting(QRBGpassword);
            QRBGUsernameTextField.setText("");
            QRBGPasswordTextField.setText("");
        }
        else {
            QRBGpassword = sDAO.getSetting("QRBGpassword");
            QRBGUsernameTextField.setText(QRBGusername.getValue());
            QRBGPasswordTextField.setText(QRBGpassword.getValue());
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        SourceOfRandomnessPanel = new javax.swing.JPanel();
        JavaRadioButton = new javax.swing.JRadioButton();
        QRBGRadioButton = new javax.swing.JRadioButton();
        QRBGSettingsPanel = new javax.swing.JPanel();
        QRBGUsernameLabel = new javax.swing.JLabel();
        QRBGPasswordLabel = new javax.swing.JLabel();
        QRBGUsernameTextField = new javax.swing.JTextField();
        QRBGPasswordTextField = new javax.swing.JPasswordField();
        okButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Randomness settings");
        setResizable(false);

        JavaRadioButton.setText("Java's Random class (pseudorandom)");
        JavaRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JavaRadioButtonActionPerformed(evt);
            }
        });

        QRBGRadioButton.setText("Quantum Random Bit Genetor Service");
        QRBGRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QRBGRadioButtonActionPerformed(evt);
            }
        });

        QRBGSettingsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("QRBG settings"));

        QRBGUsernameLabel.setText("Username:");

        QRBGPasswordLabel.setText("Password:");

        javax.swing.GroupLayout QRBGSettingsPanelLayout = new javax.swing.GroupLayout(QRBGSettingsPanel);
        QRBGSettingsPanel.setLayout(QRBGSettingsPanelLayout);
        QRBGSettingsPanelLayout.setHorizontalGroup(
            QRBGSettingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(QRBGSettingsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(QRBGSettingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(QRBGUsernameLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(QRBGPasswordLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(QRBGSettingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(QRBGUsernameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                    .addComponent(QRBGPasswordTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE))
                .addContainerGap(129, Short.MAX_VALUE))
        );

        QRBGSettingsPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {QRBGPasswordTextField, QRBGUsernameTextField});

        QRBGSettingsPanelLayout.setVerticalGroup(
            QRBGSettingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(QRBGSettingsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(QRBGSettingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(QRBGUsernameLabel)
                    .addComponent(QRBGUsernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(QRBGSettingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(QRBGPasswordLabel)
                    .addComponent(QRBGPasswordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        okButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cloudreports/gui/resources/ok.png"))); // NOI18N
        okButton.setText("OK");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SourceOfRandomnessPanelLayout = new javax.swing.GroupLayout(SourceOfRandomnessPanel);
        SourceOfRandomnessPanel.setLayout(SourceOfRandomnessPanelLayout);
        SourceOfRandomnessPanelLayout.setHorizontalGroup(
            SourceOfRandomnessPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SourceOfRandomnessPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SourceOfRandomnessPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SourceOfRandomnessPanelLayout.createSequentialGroup()
                        .addGroup(SourceOfRandomnessPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(QRBGSettingsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JavaRadioButton)
                            .addComponent(QRBGRadioButton))
                        .addContainerGap())
                    .addComponent(okButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        SourceOfRandomnessPanelLayout.setVerticalGroup(
            SourceOfRandomnessPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SourceOfRandomnessPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JavaRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(QRBGRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(QRBGSettingsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(okButton))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SourceOfRandomnessPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SourceOfRandomnessPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /** 
     * Enables/disables QRBG service as the randomness source when the QRBG
     * radio button is clicked.
     *
     * @param   evt     an action event.
     * @since           1.0
     */        
    private void QRBGRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QRBGRadioButtonActionPerformed
        Setting randomnessSource = sDAO.getSetting("Randomness");
        randomnessSource.setValue("1");
        this.sDAO.updateSetting(randomnessSource);
        setQRBGSettingsEnabled(true);
    }//GEN-LAST:event_QRBGRadioButtonActionPerformed

    /** 
     * Enables/disables the Java {@link Random} class as the randomness source
     * when the Java radio button is clicked.
     *
     * @param   evt     an action event.
     * @since           1.0
     */      
    private void JavaRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JavaRadioButtonActionPerformed
        Setting randomnessSource = sDAO.getSetting("Randomness");
        randomnessSource.setValue("0");
        this.sDAO.updateSetting(randomnessSource);
        setQRBGSettingsEnabled(false);
    }//GEN-LAST:event_JavaRadioButtonActionPerformed

    /** 
     * Saves the settings when the OK button is clicked.
     *
     * @param   evt     an action event.
     * @since           1.0
     */       
    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        Setting QRBGusername = sDAO.getSetting("QRBGusername");
        QRBGusername.setValue(QRBGUsernameTextField.getText());
        sDAO.updateSetting(QRBGusername);
        
        Setting QRBGpassword = sDAO.getSetting("QRBGpassword");
        QRBGpassword.setValue(new String(QRBGPasswordTextField.getPassword()));
        sDAO.updateSetting(QRBGpassword);
        
        this.dispose();
    }//GEN-LAST:event_okButtonActionPerformed

    /** 
     * Enables/disables the form components used to configure the QRBG
     * service settings.
     *
     * @param   enabled indicates whether mail notification is enabled or not.
     * @since           1.0
     */      
    private void setQRBGSettingsEnabled(boolean enabled) {
            QRBGSettingsPanel.setEnabled(enabled);
            QRBGUsernameLabel.setEnabled(enabled);
            QRBGUsernameTextField.setEnabled(enabled);
            QRBGPasswordLabel.setEnabled(enabled);
            QRBGPasswordTextField.setEnabled(enabled);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton JavaRadioButton;
    private javax.swing.JLabel QRBGPasswordLabel;
    private javax.swing.JPasswordField QRBGPasswordTextField;
    private javax.swing.JRadioButton QRBGRadioButton;
    private javax.swing.JPanel QRBGSettingsPanel;
    private javax.swing.JLabel QRBGUsernameLabel;
    private javax.swing.JTextField QRBGUsernameTextField;
    private javax.swing.JPanel SourceOfRandomnessPanel;
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JButton okButton;
    // End of variables declaration//GEN-END:variables
}

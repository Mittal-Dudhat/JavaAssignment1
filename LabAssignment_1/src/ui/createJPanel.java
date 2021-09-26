/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import com.toedter.calendar.JTextFieldDateEditor;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import javax.swing.JOptionPane;
import model.UserProfile;
import java.util.regex.*;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Mital
 */
public class createJPanel extends javax.swing.JPanel {

    /**
     * Creates new form createJPanel
     */
    UserProfile profile;
    String photoFileName;
    String biometricFileName;
    
    public createJPanel(UserProfile profile) {
        initComponents();
        this.profile = profile;
        JTextFieldDateEditor editor = (JTextFieldDateEditor) dateChooserDOB.getDateEditor();
        editor.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblHeading = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        allControlsPanel = new javax.swing.JPanel();
        dateChooserDOB = new com.toedter.calendar.JDateChooser();
        lblTeleNo = new javax.swing.JLabel();
        txtDeviceNo = new javax.swing.JTextField();
        txtFaxNo = new javax.swing.JTextField();
        lblDOB = new javax.swing.JLabel();
        lblLinkedIn = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        txtIPAdd = new javax.swing.JTextField();
        lblSSN = new javax.swing.JLabel();
        txtVehicleNo = new javax.swing.JTextField();
        lblLicenseNo = new javax.swing.JLabel();
        txtSSNNo = new javax.swing.JTextField();
        btnSaveInfo = new javax.swing.JButton();
        lblDeviceNo = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtTeleNo = new javax.swing.JTextField();
        lblBioMetric = new javax.swing.JLabel();
        txtUniqueIdNo = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        lblHealthPlanNo = new javax.swing.JLabel();
        txtCertificateNo = new javax.swing.JTextField();
        lblMedRecNo = new javax.swing.JLabel();
        lblGeoData = new javax.swing.JLabel();
        txtBankAccNo = new javax.swing.JTextField();
        lblIPAdd = new javax.swing.JLabel();
        txtGeoData = new javax.swing.JTextField();
        txtMedicalNo = new javax.swing.JTextField();
        lblUniqueIdNo = new javax.swing.JLabel();
        lblPhotoId = new javax.swing.JLabel();
        lblFaxNo = new javax.swing.JLabel();
        lblVehNo = new javax.swing.JLabel();
        txtLinkedIn = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        lblAccNo = new javax.swing.JLabel();
        txtHealthPlanNo = new javax.swing.JTextField();
        lblNameError = new javax.swing.JLabel();
        lblSSNNOError = new javax.swing.JLabel();
        lblDOBError = new javax.swing.JLabel();
        lblTeleNoError = new javax.swing.JLabel();
        lblFaxNoError = new javax.swing.JLabel();
        lblEmailError = new javax.swing.JLabel();
        lblBankAccNoError = new javax.swing.JLabel();
        lblIPAddError = new javax.swing.JLabel();
        btnPhotoUpload = new javax.swing.JButton();
        jFileChooser1 = new javax.swing.JFileChooser();

        setMaximumSize(new java.awt.Dimension(33767, 33767));

        lblHeading.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblHeading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeading.setText("Create Profile");

        lblTeleNo.setText("Telephone No :");

        txtFaxNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFaxNoKeyReleased(evt);
            }
        });

        lblDOB.setText("Date Of Birth :");

        lblLinkedIn.setText("LinkedIn :");

        lblEmail.setText("Email Address :");

        txtIPAdd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtIPAddKeyReleased(evt);
            }
        });

        lblSSN.setText("Social Security Number :");

        lblLicenseNo.setText("Certificate/License Number :");

        txtSSNNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSSNNoKeyReleased(evt);
            }
        });

        btnSaveInfo.setText("Save");
        btnSaveInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveInfoActionPerformed(evt);
            }
        });

        lblDeviceNo.setText("Device Identifiers :");

        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNameKeyReleased(evt);
            }
        });

        txtTeleNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTeleNoKeyReleased(evt);
            }
        });

        lblBioMetric.setText("Biometric Identifiers :");

        lblName.setText("Name :");

        lblHealthPlanNo.setText("Health Plan Beneficiary Number :");

        lblMedRecNo.setText("Medical Record Number :");

        lblGeoData.setText("Geographic Data :");

        txtBankAccNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBankAccNoKeyReleased(evt);
            }
        });

        lblIPAdd.setText("Internet Protocol Address :");

        lblUniqueIdNo.setText("Unique Identifying Number :");

        lblPhotoId.setText("Full Face Photo :");

        lblFaxNo.setText("Fax Number :");

        lblVehNo.setText("Vehicle Identifiers :");

        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmailKeyReleased(evt);
            }
        });

        lblAccNo.setText("Bank Account Number :");

        lblNameError.setForeground(new java.awt.Color(255, 0, 0));

        lblSSNNOError.setForeground(new java.awt.Color(255, 0, 0));

        lblDOBError.setForeground(new java.awt.Color(255, 0, 0));

        lblTeleNoError.setForeground(new java.awt.Color(255, 0, 0));

        lblFaxNoError.setForeground(new java.awt.Color(255, 0, 0));

        lblEmailError.setForeground(new java.awt.Color(255, 0, 0));

        lblBankAccNoError.setForeground(new java.awt.Color(255, 0, 0));

        lblIPAddError.setForeground(new java.awt.Color(255, 0, 0));

        btnPhotoUpload.setText("Upload file");
        btnPhotoUpload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPhotoUploadActionPerformed(evt);
            }
        });

        jFileChooser1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFileChooser1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout allControlsPanelLayout = new javax.swing.GroupLayout(allControlsPanel);
        allControlsPanel.setLayout(allControlsPanelLayout);
        allControlsPanelLayout.setHorizontalGroup(
            allControlsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(allControlsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(allControlsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(allControlsPanelLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(allControlsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblUniqueIdNo)
                            .addComponent(lblPhotoId))
                        .addGap(18, 18, 18)
                        .addGroup(allControlsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSaveInfo)
                            .addComponent(txtUniqueIdNo, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPhotoUpload, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(allControlsPanelLayout.createSequentialGroup()
                        .addGroup(allControlsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblBioMetric)
                            .addComponent(lblIPAdd)
                            .addComponent(lblLinkedIn)
                            .addComponent(lblDeviceNo)
                            .addComponent(lblVehNo)
                            .addComponent(lblLicenseNo)
                            .addComponent(lblAccNo)
                            .addComponent(lblHealthPlanNo)
                            .addComponent(lblMedRecNo)
                            .addComponent(lblSSN)
                            .addComponent(lblEmail)
                            .addComponent(lblFaxNo)
                            .addComponent(lblTeleNo)
                            .addComponent(lblDOB)
                            .addComponent(lblGeoData)
                            .addComponent(lblName))
                        .addGap(18, 18, 18)
                        .addGroup(allControlsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(allControlsPanelLayout.createSequentialGroup()
                                .addGroup(allControlsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtName)
                                    .addComponent(txtGeoData)
                                    .addComponent(txtTeleNo)
                                    .addComponent(dateChooserDOB, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFaxNo)
                                    .addComponent(txtEmail)
                                    .addComponent(txtSSNNo)
                                    .addComponent(txtMedicalNo)
                                    .addComponent(txtHealthPlanNo)
                                    .addComponent(txtBankAccNo)
                                    .addComponent(txtCertificateNo)
                                    .addComponent(txtVehicleNo)
                                    .addComponent(txtDeviceNo)
                                    .addComponent(txtLinkedIn)
                                    .addComponent(txtIPAdd))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(allControlsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(allControlsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(lblIPAddError, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                                        .addComponent(lblEmailError, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblFaxNoError, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblTeleNoError, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblDOBError, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblNameError, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblBankAccNoError, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(lblSSNNOError, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jFileChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        allControlsPanelLayout.setVerticalGroup(
            allControlsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(allControlsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(allControlsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(allControlsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblName)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblNameError, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(allControlsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGeoData)
                    .addComponent(txtGeoData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(allControlsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(allControlsPanelLayout.createSequentialGroup()
                        .addGroup(allControlsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblDOB)
                            .addComponent(dateChooserDOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDOBError, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(allControlsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(allControlsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblTeleNo)
                                .addComponent(txtTeleNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblTeleNoError, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(allControlsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFaxNoError, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(allControlsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblFaxNo)
                                .addComponent(txtFaxNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(allControlsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEmail)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblEmailError, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(allControlsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(allControlsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblSSN)
                        .addComponent(txtSSNNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblSSNNOError, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(allControlsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMedRecNo)
                    .addComponent(txtMedicalNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(allControlsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHealthPlanNo)
                    .addComponent(txtHealthPlanNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(allControlsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(allControlsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblAccNo)
                        .addComponent(txtBankAccNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblBankAccNoError, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(allControlsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLicenseNo)
                    .addComponent(txtCertificateNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(allControlsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVehNo)
                    .addComponent(txtVehicleNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(allControlsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDeviceNo)
                    .addComponent(txtDeviceNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(allControlsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLinkedIn)
                    .addComponent(txtLinkedIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(allControlsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(allControlsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblIPAdd)
                        .addComponent(txtIPAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblIPAddError, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(allControlsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(allControlsPanelLayout.createSequentialGroup()
                        .addComponent(lblBioMetric)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jFileChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(allControlsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPhotoId)
                    .addComponent(btnPhotoUpload))
                .addGap(3, 3, 3)
                .addGroup(allControlsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUniqueIdNo)
                    .addComponent(txtUniqueIdNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSaveInfo)
                .addGap(80, 80, 80))
        );

        jScrollPane1.setViewportView(allControlsPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHeading, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 702, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHeading)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 932, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveInfoActionPerformed
        // TODO add your handling code here:
        if(txtName.getText().trim() != "" || txtGeoData.getText().trim()!= "" || txtTeleNo.getText().trim()!= "" || txtFaxNo.getText().trim()!=""||txtEmail.getText().trim()!= ""||  txtSSNNo.getText().trim()!= "")
        {
            Date d = new Date();
            lblDOBError.setText(d.toString());
            if(d.before(dateChooserDOB.getDate()))
            {
                lblDOBError.setText("Enter Valid Date");
            }
            else
            {
                lblDOBError.setText(null);
                profile.setName(txtName.getText());
                profile.setGeodata(txtGeoData.getText());
                SimpleDateFormat df =new SimpleDateFormat("MM-dd-yyy",Locale.getDefault());
                String date = df.format(dateChooserDOB.getDate());
                profile.setDob(date);
                if(txtTeleNo.getText().trim() != "")
                {
                    profile.setTeleNumber(Long.parseLong(txtTeleNo.getText()));
                }
                if(txtFaxNo.getText().trim() != "")
                {
                    profile.setFaxNo(Long.parseLong(txtFaxNo.getText()));
                }
                profile.setEmailId(txtEmail.getText());
                profile.setSsnNo(txtSSNNo.getText());
                if(txtMedicalNo.getText().trim() != "")
                {
                    profile.setMedRecNo(Long.parseLong(txtMedicalNo.getText()));
                }
                if(txtHealthPlanNo.getText().trim() != "")
                {
                    profile.setHealthPlanNo(Long.parseLong(txtHealthPlanNo.getText()));
                }
                if(txtBankAccNo.getText().trim() != "")
                {
                    profile.setBankAccNo(Long.parseLong(txtBankAccNo.getText()));
                }
                profile.setLicenseNo(txtCertificateNo.getText());
                profile.setLicenseNo(txtCertificateNo.getText());
                profile.setVehId(txtVehicleNo.getText());
                profile.setDeviceId(txtDeviceNo.getText());
                profile.setLinkedIn(txtLinkedIn.getText());
                profile.setIpAdd(txtIPAdd.getText());
                profile.setUniqueNo(txtUniqueIdNo.getText());
                if(photoFileName != "")
                {
                    profile.setPhotoFileName(photoFileName);
                }
                if(biometricFileName != "")
                {
                    profile.setBiometricFileName(biometricFileName);
                }
                JOptionPane.showMessageDialog(this, "Profile Saved");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Please Enter details.");
        }
    }//GEN-LAST:event_btnSaveInfoActionPerformed

    private void txtNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyReleased
        // TODO add your handling code here:
        if(txtName.getText().trim() != "")
        {
            Pattern pat = Pattern.compile("^[a-zA-Z\\s]+");
            Matcher matchName= pat.matcher(txtName.getText());
            if(!matchName.matches())
            {
               lblNameError.setText("Enter Valid Name");
            }
            else
            {
                lblNameError.setText(null);
            }
        }
    }//GEN-LAST:event_txtNameKeyReleased

    private void txtTeleNoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTeleNoKeyReleased
        // TODO add your handling code here:
        if(txtTeleNo.getText().trim() != "")
        {
            Pattern pat = Pattern.compile("^[0-9]{10}$");
            Matcher matchPhoneNo= pat.matcher(txtTeleNo.getText());
            if(!matchPhoneNo.matches())
            {
               lblTeleNoError.setText("Enter Valid Phone No");
            }
            else
            {
                lblTeleNoError.setText(null);
            }
        }
    }//GEN-LAST:event_txtTeleNoKeyReleased

    private void txtFaxNoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFaxNoKeyReleased
        // TODO add your handling code here:
        if(txtFaxNo.getText().trim() != "")
        {
            Pattern pat = Pattern.compile("^(\\+?\\d{1,}(\\s?|\\-?)\\d*(\\s?|\\-?)\\(?\\d{2,}\\)?(\\s?|\\-?)\\d{3,}\\s?\\d{3,})$");
            Matcher matchFaxNo= pat.matcher(txtFaxNo.getText());
            if(!matchFaxNo.matches())
            {
               lblFaxNoError.setText("Enter Valid Fax No");
            }
            else
            {
                lblFaxNoError.setText(null);
            }
        }  
    }//GEN-LAST:event_txtFaxNoKeyReleased

    private void txtEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyReleased
        // TODO add your handling code here:
        if(txtEmail.getText().trim() != "")
        {
            Pattern pat = Pattern.compile("^[A-Za-z0-9+_.-]+@(.+)$");
            Matcher matchEmailId= pat.matcher(txtEmail.getText());
            if(!matchEmailId.matches())
            {
               lblEmailError.setText("Enter Valid Email");
            }
            else
            {
                lblEmailError.setText(null);
            }
        }  
    }//GEN-LAST:event_txtEmailKeyReleased

    private void txtSSNNoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSSNNoKeyReleased
        // TODO add your handling code here:
        if(txtSSNNo.getText().trim() != "")
        {
            Pattern pat = Pattern.compile("^(?!000|666)[0-8][0-9]{2}-(?!00)[0-9]{2}-(?!0000)[0-9]{4}$");
            Matcher matchSSNNo= pat.matcher(txtSSNNo.getText());
            if(!matchSSNNo.matches())
            {
               lblSSNNOError.setText("Enter Valid Social Security Number");
            }
            else
            {
                lblSSNNOError.setText(null);
            }
        }
        else
        {
            lblNameError.setText(null);
        }
    }//GEN-LAST:event_txtSSNNoKeyReleased

    private void txtIPAddKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIPAddKeyReleased
        // TODO add your handling code here:
        if(txtIPAdd.getText().trim() != "")
        {
            Pattern pat = Pattern.compile("^(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\." +
                                          "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\." +
                                          "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\." +
                                          "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$");
            Matcher matchIPAdd= pat.matcher(txtIPAdd.getText());
            if(!matchIPAdd.matches())
            {
               lblIPAddError.setText("Enter Valid IP Address");
            }
            else
            {
                lblIPAddError.setText(null);
            }
        }  
    }//GEN-LAST:event_txtIPAddKeyReleased

    private void txtBankAccNoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBankAccNoKeyReleased
        // TODO add your handling code here:
        if(txtBankAccNo.getText().trim() != "")
        {
            Pattern pat = Pattern.compile("^[0-9]{7,14}$");
            Matcher matchBankAccNo= pat.matcher(txtBankAccNo.getText());
            if(!matchBankAccNo.matches())
            {
               lblBankAccNoError.setText("Enter Valid Bank Account Number");
            }
            else
            {
                lblBankAccNoError.setText(null);
            }
        }  
    }//GEN-LAST:event_txtBankAccNoKeyReleased

    private void btnPhotoUploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPhotoUploadActionPerformed
        // TODO add your handling code here:
        JFileChooser photoFileChooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("png","jpg","jpeg");
        photoFileChooser.addChoosableFileFilter(filter);
        int showOpenDialog = photoFileChooser.showOpenDialog(null);
        if(showOpenDialog == JFileChooser.APPROVE_OPTION)
        {
            File selectedImageFile = photoFileChooser.getSelectedFile();
            photoFileName = selectedImageFile.getAbsolutePath();
            JOptionPane.showMessageDialog(null,"File Selected :" + photoFileName );
        }
    }//GEN-LAST:event_btnPhotoUploadActionPerformed

    private void jFileChooser1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFileChooser1ActionPerformed
        // TODO add your handling code here:
        if (evt.getActionCommand().equals(javax.swing.JFileChooser.APPROVE_SELECTION)) 
        {
            JFileChooser filechooser = (JFileChooser) evt.getSource();
            FileNameExtensionFilter filter = new FileNameExtensionFilter("png","jpg","jpeg");
            filechooser.addChoosableFileFilter(filter);
            biometricFileName = filechooser.getSelectedFile().getAbsolutePath();
            JOptionPane.showMessageDialog(null,"File Selected :" + biometricFileName );
        } 
        else if (evt.getActionCommand().equals(javax.swing.JFileChooser.CANCEL_SELECTION)) 
        {
            biometricFileName = "";
            JOptionPane.showMessageDialog(null,"No File Selected");
        }
    }//GEN-LAST:event_jFileChooser1ActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel allControlsPanel;
    private javax.swing.JButton btnPhotoUpload;
    private javax.swing.JButton btnSaveInfo;
    private com.toedter.calendar.JDateChooser dateChooserDOB;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAccNo;
    private javax.swing.JLabel lblBankAccNoError;
    private javax.swing.JLabel lblBioMetric;
    private javax.swing.JLabel lblDOB;
    private javax.swing.JLabel lblDOBError;
    private javax.swing.JLabel lblDeviceNo;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEmailError;
    private javax.swing.JLabel lblFaxNo;
    private javax.swing.JLabel lblFaxNoError;
    private javax.swing.JLabel lblGeoData;
    private javax.swing.JLabel lblHeading;
    private javax.swing.JLabel lblHealthPlanNo;
    private javax.swing.JLabel lblIPAdd;
    private javax.swing.JLabel lblIPAddError;
    private javax.swing.JLabel lblLicenseNo;
    private javax.swing.JLabel lblLinkedIn;
    private javax.swing.JLabel lblMedRecNo;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblNameError;
    private javax.swing.JLabel lblPhotoId;
    private javax.swing.JLabel lblSSN;
    private javax.swing.JLabel lblSSNNOError;
    private javax.swing.JLabel lblTeleNo;
    private javax.swing.JLabel lblTeleNoError;
    private javax.swing.JLabel lblUniqueIdNo;
    private javax.swing.JLabel lblVehNo;
    private javax.swing.JTextField txtBankAccNo;
    private javax.swing.JTextField txtCertificateNo;
    private javax.swing.JTextField txtDeviceNo;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFaxNo;
    private javax.swing.JTextField txtGeoData;
    private javax.swing.JTextField txtHealthPlanNo;
    private javax.swing.JTextField txtIPAdd;
    private javax.swing.JTextField txtLinkedIn;
    private javax.swing.JTextField txtMedicalNo;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSSNNo;
    private javax.swing.JTextField txtTeleNo;
    private javax.swing.JTextField txtUniqueIdNo;
    private javax.swing.JTextField txtVehicleNo;
    // End of variables declaration//GEN-END:variables
}

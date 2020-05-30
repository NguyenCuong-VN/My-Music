package mymusic2;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import mymusic2.Controller.AddController;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cuong
 */
public class NewSinger extends javax.swing.JFrame {

    /**
     * Creates new form NewSong
     */
    public NewSinger() {
        initComponents();
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
        newSinger_tenCaSiLabel = new javax.swing.JLabel();
        newSinger_companyLabel = new javax.swing.JLabel();
        newSinger_countryLabel = new javax.swing.JLabel();
        newSinger_dateOfBirthLabel = new javax.swing.JLabel();
        newSinger_tenCaSiTextField = new javax.swing.JTextField();
        newSinger_companyTextField = new javax.swing.JTextField();
        newSinger_countryTextField = new javax.swing.JTextField();
        newSinger_dateOfBirthTextField = new javax.swing.JTextField();
        newSinger_okButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 40)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("New Singer");

        newSinger_tenCaSiLabel.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        newSinger_tenCaSiLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        newSinger_tenCaSiLabel.setText("Tên ca sĩ :");

        newSinger_companyLabel.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        newSinger_companyLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        newSinger_companyLabel.setText("Company :");

        newSinger_countryLabel.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        newSinger_countryLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        newSinger_countryLabel.setText("Country :");

        newSinger_dateOfBirthLabel.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        newSinger_dateOfBirthLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        newSinger_dateOfBirthLabel.setText("Date of Birth :");

        newSinger_tenCaSiTextField.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        newSinger_companyTextField.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        newSinger_countryTextField.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        newSinger_dateOfBirthTextField.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        newSinger_okButton.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        newSinger_okButton.setText("OK");
        newSinger_okButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                newSinger_okButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(newSinger_okButton, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(186, 186, 186))
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(newSinger_companyLabel)
                            .addComponent(newSinger_countryLabel)
                            .addComponent(newSinger_tenCaSiLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(newSinger_tenCaSiTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(newSinger_companyTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(newSinger_countryTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(newSinger_dateOfBirthLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(newSinger_dateOfBirthTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(119, 119, 119))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel1)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newSinger_tenCaSiLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newSinger_tenCaSiTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newSinger_companyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newSinger_companyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newSinger_countryTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newSinger_countryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newSinger_dateOfBirthTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newSinger_dateOfBirthLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(79, 79, 79)
                .addComponent(newSinger_okButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(90, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void newSinger_okButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newSinger_okButtonMouseClicked
        if(newSinger_tenCaSiTextField.getText().equals("")           
            || newSinger_countryTextField.getText().equals("")){
                JOptionPane.showMessageDialog(this, "Vui lòng điền đầy đủ thông tin");
        }
        else{
            try {
                boolean tmp= AddController.addSinger(newSinger_tenCaSiTextField.getText(), newSinger_companyTextField.getText(), newSinger_countryTextField.getText(), newSinger_dateOfBirthTextField.getText());
                if(tmp) JOptionPane.showMessageDialog(this, "ok !!");
                else JOptionPane.showMessageDialog(this, "Ca sĩ này đã tồn tại !!");
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(NewSinger.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_newSinger_okButtonMouseClicked

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel newSinger_companyLabel;
    private javax.swing.JTextField newSinger_companyTextField;
    private javax.swing.JLabel newSinger_countryLabel;
    private javax.swing.JTextField newSinger_countryTextField;
    private javax.swing.JLabel newSinger_dateOfBirthLabel;
    private javax.swing.JTextField newSinger_dateOfBirthTextField;
    private javax.swing.JButton newSinger_okButton;
    private javax.swing.JLabel newSinger_tenCaSiLabel;
    private javax.swing.JTextField newSinger_tenCaSiTextField;
    // End of variables declaration//GEN-END:variables
}
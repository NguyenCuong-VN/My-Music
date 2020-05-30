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
public class NewAuthor extends javax.swing.JFrame {

    /**
     * Creates new form NewSong
     */
    public NewAuthor() {
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
        newAuthor_tenNhacSiLabel = new javax.swing.JLabel();
        newAuthor_companyLabel = new javax.swing.JLabel();
        newAuthor_countryLabel = new javax.swing.JLabel();
        newAuthor_dateOfBirthLabel = new javax.swing.JLabel();
        newAuthor_tenNhacSTextField = new javax.swing.JTextField();
        newAuthor_companyTextField = new javax.swing.JTextField();
        newAuthor_countryTextField = new javax.swing.JTextField();
        newAuthor_dateOfBirthTextField = new javax.swing.JTextField();
        newAuthor_okButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 40)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("New Author");

        newAuthor_tenNhacSiLabel.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        newAuthor_tenNhacSiLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        newAuthor_tenNhacSiLabel.setText("Tên nhạc sĩ :");

        newAuthor_companyLabel.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        newAuthor_companyLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        newAuthor_companyLabel.setText("Company :");

        newAuthor_countryLabel.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        newAuthor_countryLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        newAuthor_countryLabel.setText("Country :");

        newAuthor_dateOfBirthLabel.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        newAuthor_dateOfBirthLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        newAuthor_dateOfBirthLabel.setText("Date of Birth :");

        newAuthor_tenNhacSTextField.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        newAuthor_companyTextField.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        newAuthor_countryTextField.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        newAuthor_dateOfBirthTextField.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        newAuthor_okButton.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        newAuthor_okButton.setText("OK");
        newAuthor_okButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                newAuthor_okButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(newAuthor_okButton, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(186, 186, 186))
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(newAuthor_companyLabel)
                            .addComponent(newAuthor_countryLabel)
                            .addComponent(newAuthor_tenNhacSiLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(newAuthor_tenNhacSTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(newAuthor_companyTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(newAuthor_countryTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(newAuthor_dateOfBirthLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(newAuthor_dateOfBirthTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                    .addComponent(newAuthor_tenNhacSiLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newAuthor_tenNhacSTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newAuthor_companyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newAuthor_companyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newAuthor_countryTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newAuthor_countryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newAuthor_dateOfBirthTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newAuthor_dateOfBirthLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(79, 79, 79)
                .addComponent(newAuthor_okButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(90, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void newAuthor_okButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newAuthor_okButtonMouseClicked
        if(newAuthor_tenNhacSTextField.getText().equals("")           
            || newAuthor_countryTextField.getText().equals("")){
                JOptionPane.showMessageDialog(this, "Vui lòng điền đầy đủ thông tin");
        }
        else{
            try {
                boolean tmp= AddController.addAuthor(newAuthor_tenNhacSTextField.getText(), newAuthor_companyTextField.getText(), newAuthor_countryTextField.getText(), newAuthor_dateOfBirthTextField.getText());
                if(tmp) JOptionPane.showMessageDialog(this, "ok !!");
                else JOptionPane.showMessageDialog(this, "Tác giả này đã tồn tại !!");
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(NewAuthor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_newAuthor_okButtonMouseClicked

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel newAuthor_companyLabel;
    private javax.swing.JTextField newAuthor_companyTextField;
    private javax.swing.JLabel newAuthor_countryLabel;
    private javax.swing.JTextField newAuthor_countryTextField;
    private javax.swing.JLabel newAuthor_dateOfBirthLabel;
    private javax.swing.JTextField newAuthor_dateOfBirthTextField;
    private javax.swing.JButton newAuthor_okButton;
    private javax.swing.JTextField newAuthor_tenNhacSTextField;
    private javax.swing.JLabel newAuthor_tenNhacSiLabel;
    // End of variables declaration//GEN-END:variables
}
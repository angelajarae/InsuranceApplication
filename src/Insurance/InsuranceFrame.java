/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Insurance;
import java.awt.CardLayout;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @angela
 */
public class InsuranceFrame extends javax.swing.JFrame {
    private Assurance[] _assurances=new Assurance[50];
    
    public InsuranceFrame() {
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

        buttonGroupInsurance = new javax.swing.ButtonGroup();
        jPanelNorth = new javax.swing.JPanel();
        jRadioButtonHousing = new javax.swing.JRadioButton();
        jRadioButtonMedicate = new javax.swing.JRadioButton();
        jLabelPolicy = new javax.swing.JLabel();
        jLabelName = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldPolicy = new javax.swing.JTextField();
        jTextFieldPremium = new javax.swing.JTextField();
        jTextFieldName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldPlan = new javax.swing.JTextField();
        jPanelCenter = new javax.swing.JPanel();
        jPanelHousing = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldLocation = new javax.swing.JTextField();
        jTextFieldValueLand = new javax.swing.JTextField();
        jTextFieldPercentage = new javax.swing.JTextField();
        jPanelMedicate = new javax.swing.JPanel();
        jLabelAge = new javax.swing.JLabel();
        jLabelHealth = new javax.swing.JLabel();
        jTextFieldAge = new javax.swing.JTextField();
        jTextFieldHealth = new javax.swing.JTextField();
        jPanelSouth = new javax.swing.JPanel();
        jButtonAdd = new javax.swing.JButton();
        jButtonShow = new javax.swing.JButton();
        jButtonSearch = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Insurance Application");

        buttonGroupInsurance.add(jRadioButtonHousing);
        jRadioButtonHousing.setSelected(true);
        jRadioButtonHousing.setText("Housing");
        jRadioButtonHousing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonHousingActionPerformed(evt);
            }
        });

        buttonGroupInsurance.add(jRadioButtonMedicate);
        jRadioButtonMedicate.setText("Medicate");
        jRadioButtonMedicate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMedicateActionPerformed(evt);
            }
        });

        jLabelPolicy.setText("Policy");

        jLabelName.setText("Name");

        jLabel3.setText("Premium");

        jLabel1.setText("Plan");

        javax.swing.GroupLayout jPanelNorthLayout = new javax.swing.GroupLayout(jPanelNorth);
        jPanelNorth.setLayout(jPanelNorthLayout);
        jPanelNorthLayout.setHorizontalGroup(
            jPanelNorthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNorthLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanelNorthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanelNorthLayout.createSequentialGroup()
                        .addGroup(jPanelNorthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelNorthLayout.createSequentialGroup()
                                .addComponent(jLabelPolicy, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(jTextFieldPolicy, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                            .addComponent(jRadioButtonHousing, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(jPanelNorthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelNorthLayout.createSequentialGroup()
                                .addComponent(jRadioButtonMedicate, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(88, 88, 88))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelNorthLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldPremium, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanelNorthLayout.createSequentialGroup()
                        .addGroup(jPanelNorthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelNorthLayout.createSequentialGroup()
                                .addComponent(jLabelName, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelNorthLayout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)))
                        .addGroup(jPanelNorthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldName, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
                            .addComponent(jTextFieldPlan))))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanelNorthLayout.setVerticalGroup(
            jPanelNorthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNorthLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanelNorthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonHousing)
                    .addComponent(jRadioButtonMedicate))
                .addGap(29, 29, 29)
                .addGroup(jPanelNorthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPolicy)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldPolicy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPremium, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanelNorthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelName)
                    .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanelNorthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldPlan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanelCenter.setLayout(new java.awt.CardLayout());

        jLabel6.setText("Location");

        jLabel7.setText("Value of Land");

        jLabel8.setText("Porcentage");

        javax.swing.GroupLayout jPanelHousingLayout = new javax.swing.GroupLayout(jPanelHousing);
        jPanelHousing.setLayout(jPanelHousingLayout);
        jPanelHousingLayout.setHorizontalGroup(
            jPanelHousingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHousingLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanelHousingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(6, 6, 6)
                .addGroup(jPanelHousingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelHousingLayout.createSequentialGroup()
                        .addComponent(jTextFieldValueLand, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldPercentage, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextFieldLocation))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanelHousingLayout.setVerticalGroup(
            jPanelHousingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHousingLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanelHousingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanelHousingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jTextFieldValueLand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPercentage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        jPanelCenter.add(jPanelHousing, "Housing");

        jLabelAge.setText("Age");

        jLabelHealth.setText("Health");

        javax.swing.GroupLayout jPanelMedicateLayout = new javax.swing.GroupLayout(jPanelMedicate);
        jPanelMedicate.setLayout(jPanelMedicateLayout);
        jPanelMedicateLayout.setHorizontalGroup(
            jPanelMedicateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMedicateLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabelAge)
                .addGap(52, 52, 52)
                .addComponent(jTextFieldAge, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabelHealth)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldHealth, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanelMedicateLayout.setVerticalGroup(
            jPanelMedicateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMedicateLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanelMedicateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAge)
                    .addComponent(jTextFieldAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelHealth)
                    .addComponent(jTextFieldHealth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(75, Short.MAX_VALUE))
        );

        jPanelCenter.add(jPanelMedicate, "Medicate");

        jButtonAdd.setText("Add");
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });

        jButtonShow.setText("Show");
        jButtonShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonShowActionPerformed(evt);
            }
        });

        jButtonSearch.setText("Search");
        jButtonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelSouthLayout = new javax.swing.GroupLayout(jPanelSouth);
        jPanelSouth.setLayout(jPanelSouthLayout);
        jPanelSouthLayout.setHorizontalGroup(
            jPanelSouthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSouthLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jButtonAdd)
                .addGap(49, 49, 49)
                .addComponent(jButtonShow)
                .addGap(50, 50, 50)
                .addComponent(jButtonSearch)
                .addContainerGap(78, Short.MAX_VALUE))
        );
        jPanelSouthLayout.setVerticalGroup(
            jPanelSouthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSouthLayout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(jPanelSouthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAdd)
                    .addComponent(jButtonShow)
                    .addComponent(jButtonSearch))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelNorth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanelCenter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanelSouth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelNorth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelCenter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanelSouth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButtonHousingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonHousingActionPerformed
        ((CardLayout)jPanelCenter.getLayout()).show(jPanelCenter,"Housing");
    }//GEN-LAST:event_jRadioButtonHousingActionPerformed

    private void jRadioButtonMedicateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMedicateActionPerformed
        ((CardLayout)jPanelCenter.getLayout()).show(jPanelCenter,"Medicate");
    }//GEN-LAST:event_jRadioButtonMedicateActionPerformed
    
    private void save(int policy, String name, double premium, String plan, int pos){
        if(jRadioButtonHousing.isSelected()){
            String location=jTextFieldLocation.getText();
            double valueLand=Double.parseDouble(jTextFieldValueLand.getText());
            double percentage=Double.parseDouble(jTextFieldPercentage.getText());
            _assurances[pos]=new AssuranceHousing(policy, name, premium, plan, location, valueLand, percentage);
        }
        else{
            int age=Integer.parseInt(jTextFieldAge.getText());
            String health=jTextFieldHealth.getText();
            _assurances[pos]=new AssuranceMedicate(policy, name, premium, plan, age,health);
        }
        _assurances[pos].calculateCoverage();
    }
    
    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        int policy = Integer.parseInt( jTextFieldPolicy.getText() );
        String name = jTextFieldName.getText();
        double premium = Double.parseDouble( jTextFieldPremium.getText() );
        String plan =jTextFieldPlan.getText();
        
        int pos=(policy % _assurances.length) +1;
        
        if(_assurances[pos]==null){
            save(policy,name,premium,plan,pos);
            JOptionPane.showMessageDialog(this, "Se agregó correctamente.");
            
        }
        else if(_assurances[pos].getPolicy()==policy){
            JOptionPane.showMessageDialog(this, "Ya se encuentra ingresado.");
        }
        else{
            int fil=pos+1;
            
            while(_assurances[fil].getPolicy()!=policy&&_assurances[fil]!=null&&fil!=pos){
                fil=fil+1;
                
                if(fil==_assurances.length+1){
                    fil=1;
                }
                
            }
            
            if(_assurances[fil]==null){
                save(policy,name,premium,plan,pos);
                JOptionPane.showMessageDialog(this, "Se agregó correctamente.");
                
            }
            else if(_assurances[fil].getPolicy()==policy){
                JOptionPane.showMessageDialog(this, "Ya se encuentra ingresado.");
            }
            else{
                JOptionPane.showMessageDialog(this, "Espacio agotado para agregar más elementos.");
            }
        }
    }//GEN-LAST:event_jButtonAddActionPerformed

    private void jButtonShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonShowActionPerformed
        StringBuilder cadena=new StringBuilder();
        
        for(int i=1;i<_assurances.length;i++){
            if(_assurances[i]!=null){
                cadena.append("\nPoliza: ").append(_assurances[i].getPolicy());
                cadena.append("\nNombre: ").append(_assurances[i].getName());
                cadena.append("\nPrima: ").append(_assurances[i].getPremium());
                cadena.append("\nPlan: ").append(_assurances[i].getPlan());
                
                if(_assurances[i] instanceof AssuranceHousing){
                    cadena.append("\nubicacion: ").append(((AssuranceHousing)_assurances[i]).getLocation());
                    cadena.append("\nPrecio: ").append(((AssuranceHousing)_assurances[i]).getValueLand());
                    cadena.append("\nPorcentaje: ").append(((AssuranceHousing)_assurances[i]).getPercentage());
                }
                else{
                    cadena.append("\nEdad: ").append(((AssuranceMedicate)_assurances[i]).getAge());
                    cadena.append("\nSalud: ").append(((AssuranceMedicate)_assurances[i]).getHealth());
                }
                cadena.append("\nCobertura: ").append(_assurances[i].getCoverage());
                cadena.append("\n");
            }
        }
        JOptionPane.showMessageDialog(this, cadena);
    }//GEN-LAST:event_jButtonShowActionPerformed

    private void jButtonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchActionPerformed
            int policy = Integer.parseInt( jTextFieldPolicy.getText() );
            int pos=policy % _assurances.length +1;
            boolean isFound=false;
            
            if(_assurances[pos].getPolicy()==policy){
                isFound=true;
            }
            else if(_assurances[pos].equals(null)){
                isFound=false;
            }
            else{
                int fil=pos+1;

                while(_assurances[fil].getPolicy()!=policy&&!_assurances[fil].equals(null)&&fil!=pos){
                    fil=fil+1;

                    if(fil==_assurances.length-1){
                        fil=1;
                    }

                }

                if(_assurances[pos].getPolicy()==policy){
                    isFound=true;
                    pos=fil;
                }
                else{
                    isFound=false;
                }
            }
            
            if(isFound){
                JOptionPane.showMessageDialog(this,
                "Poliza: "+ _assurances[pos].getPolicy() +
                "\nNombre: " + _assurances[pos].getName() +
                "\nPlan seguro: "+ _assurances[pos].getPlan()+ 
                "\nCobertura: "+ _assurances[pos].getCoverage(), 
                "Insurance Application",
                JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                JOptionPane.showMessageDialog(this, "No se encuentra.");
            }
    }//GEN-LAST:event_jButtonSearchActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InsuranceFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InsuranceFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InsuranceFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InsuranceFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InsuranceFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupInsurance;
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonSearch;
    private javax.swing.JButton jButtonShow;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelAge;
    private javax.swing.JLabel jLabelHealth;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelPolicy;
    private javax.swing.JPanel jPanelCenter;
    private javax.swing.JPanel jPanelHousing;
    private javax.swing.JPanel jPanelMedicate;
    private javax.swing.JPanel jPanelNorth;
    private javax.swing.JPanel jPanelSouth;
    private javax.swing.JRadioButton jRadioButtonHousing;
    private javax.swing.JRadioButton jRadioButtonMedicate;
    private javax.swing.JTextField jTextFieldAge;
    private javax.swing.JTextField jTextFieldHealth;
    private javax.swing.JTextField jTextFieldLocation;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JTextField jTextFieldPercentage;
    private javax.swing.JTextField jTextFieldPlan;
    private javax.swing.JTextField jTextFieldPolicy;
    private javax.swing.JTextField jTextFieldPremium;
    private javax.swing.JTextField jTextFieldValueLand;
    // End of variables declaration//GEN-END:variables
}

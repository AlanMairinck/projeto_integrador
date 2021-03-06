/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;
import model.Assets;
import model.DAO.AssetsDAO;
import model.DAO.WalletDAO;
import model.Wallet;
import util.UtilServices;

/**
 *
 * @author alanm
 */
public final class InsertAssetsUI extends javax.swing.JFrame {
    
    NumberFormat _nf;
    WalletDAO _wDAO;
    AssetsDAO _aDAO;
    Wallet _wallet;
    /**
     * Creates new form InsertAssetsUI
     */
    public InsertAssetsUI(Wallet w) {
        initComponents();
        this.loadComponents(w);
    }

    private InsertAssetsUI() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtDtBuy = new javax.swing.JFormattedTextField();
        txtNmAsset = new javax.swing.JTextField();
        txtQuantity = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        txtValue = new util.JMoneyField();

        jButton2.setText("jButton2");

        jButton3.setText("jButton3");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(650, 400));
        setPreferredSize(new java.awt.Dimension(650, 350));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 169, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 318, Short.MAX_VALUE)
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Ativo:");

        jLabel2.setText("Cota????o:");

        jLabel3.setText("Quantidade:");

        jLabel4.setText("Data de Compra:");

        txtNmAsset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNmAssetActionPerformed(evt);
            }
        });

        btnSave.setText("Salvar");
        btnSave.setMaximumSize(new java.awt.Dimension(75, 23));
        btnSave.setMinimumSize(new java.awt.Dimension(75, 23));
        btnSave.setPreferredSize(new java.awt.Dimension(75, 23));
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnCancel.setText("Cancelar");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDtBuy)
                            .addComponent(txtNmAsset)
                            .addComponent(txtValue, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                            .addComponent(txtQuantity))))
                .addGap(62, 62, 62))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtDtBuy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNmAsset, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCancel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNmAssetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNmAssetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNmAssetActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        backAssets();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        Assets asset = new Assets();
        
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date dt_buy;
            
        try {
            
            if(txtDtBuy.getText().isEmpty() || txtDtBuy.getText() == null || txtDtBuy.getText().equals("__/__/____") )
            {
                dt_buy = new Date();
            }
            else
            {
                if(!UtilServices.isValidDate(txtDtBuy.getText()))
                {
                JOptionPane.showMessageDialog(null,
                        "Data inv??lida.", //mensagem
                        "Data", // titulo da janela
                        JOptionPane.INFORMATION_MESSAGE);
                return;
                }
                dt_buy = formato.parse(txtDtBuy.getText());
            }    
            
            if(( txtNmAsset.getText().isEmpty() || txtNmAsset.getText() == null)
                    || (txtQuantity.getText().isEmpty() || txtQuantity.getText() == null)
                    || (txtValue.getText().equals("0,00")))
            {
                JOptionPane.showMessageDialog(null,
                        "Voc?? deve informar o nome, quantidade e valor de compra do ativo.\n"
                                + "Tente novamente.", //mensagem
                        "Ativo", // titulo da janela
                        JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            
            
            asset = this._aDAO.getByName(txtNmAsset.getText().toUpperCase());

            if(asset != null)
            {
                JOptionPane.showMessageDialog(null,
                        "Ativo j?? cadastrado. \n"
                                + "Atualize o mesmo pelo grid.", //mensagem
                        "Ativo", // titulo da janela
                        JOptionPane.INFORMATION_MESSAGE);
                
                return;
            }

            String cot = this.txtValue.getText();
            cot = cot.replace(".","").replace(",",".");
            BigDecimal cotacao = new BigDecimal(cot);
            int qtd = Integer.parseInt(txtQuantity.getText());

            asset = new Assets(
                                txtNmAsset.getText().toUpperCase(),
                                qtd,
                                cotacao,
                                cotacao.multiply(BigDecimal.valueOf(qtd)),
                                dt_buy,
                                dt_buy,
                                _wallet
                        );

            this._aDAO.insert(asset);

            this._wallet.setAmount_invested(this._wallet.getAmount_invested().add(cotacao.multiply(BigDecimal.valueOf(qtd))));

            this._wDAO.update(_wallet);

            JOptionPane.showMessageDialog(null,
                    "Ativo "+ asset.getNm_asset().toUpperCase() + " salvo com sucesso. \n", //mensagem
                    "Ativo", // titulo da janela
                    JOptionPane.INFORMATION_MESSAGE);

            this.backAssets();
        } catch (Exception e) {
            Logger.getLogger(InsertAssetsUI.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        this.backAssets();
    }//GEN-LAST:event_formWindowClosed
    
    private void backAssets()
    {
        AssetsTradeUI assetsUI = AssetsTradeUI.getInstance(_wallet);
        assetsUI.setEnabled(true);
        assetsUI.loadTable();
        this.dispose();
    }
    private void maskFields()
    {
        setLayout(null);

        MaskFormatter mascaraData = null;
             
        try
        {
            mascaraData = new MaskFormatter("##/##/####");
            mascaraData.setPlaceholderCharacter('_');
        }
        catch(ParseException excp) 
        {
            System.err.println("Erro na formata????o: " + excp.getMessage());
            System.exit(-1);
        }
        
        txtDtBuy.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(mascaraData));
    } 
    
     public void loadComponents(Wallet w)
    {
        this.setLocationRelativeTo(null);
        this._wDAO = new WalletDAO();
        this._nf = NumberFormat.getCurrencyInstance();
        this._aDAO = new AssetsDAO();
        this._wallet = w;
        //this.txtmValor.
        this.maskFields();
    }   
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
            java.util.logging.Logger.getLogger(InsertAssetsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InsertAssetsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InsertAssetsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InsertAssetsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InsertAssetsUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JFormattedTextField txtDtBuy;
    private javax.swing.JTextField txtNmAsset;
    private javax.swing.JTextField txtQuantity;
    private util.JMoneyField txtValue;
    // End of variables declaration//GEN-END:variables
}

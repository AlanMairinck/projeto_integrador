/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import model.Assets;
import model.DAO.AssetsDAO;
import model.Wallet;
import util.TableView;

/**
 *
 * @author alanm
 */
public class AssetsTradeUI extends javax.swing.JFrame {
    
    Wallet _wallet;
    //Trader _trader;
    AssetsDAO _aDAO;
    JButton btnAdd = new JButton("Adicionar");
    JButton btnRescue = new JButton("Resgate");
    NumberFormat _nfc;
    NumberFormat _nfp;
    List<Assets> _listAssets;
    private static AssetsTradeUI _principal;
    
    /**
     * Creates new form AssetsTradeUI
     */
    public AssetsTradeUI(Wallet w) {
        initComponents();
        this.loadComponents(w);
    }

    private AssetsTradeUI() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public static AssetsTradeUI getInstance(Wallet w)
    {
        if(_principal == null)
        {
            _principal = new AssetsTradeUI(w);
        }
        _principal._wallet = w;
        return _principal;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        lblNmWallet = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        lblNmTrader = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblAssets = new javax.swing.JTable();
        btnNew = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblAmount = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(650, 350));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblNmWallet.setText("jLabel1");

        btnBack.setText("Voltar");
        btnBack.setMaximumSize(new java.awt.Dimension(71, 23));
        btnBack.setMinimumSize(new java.awt.Dimension(71, 23));
        btnBack.setPreferredSize(new java.awt.Dimension(71, 23));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblNmTrader.setText("jLabel1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblNmTrader)
                .addGap(66, 66, 66)
                .addComponent(lblNmWallet, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNmWallet)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNmTrader))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tblAssets.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7"
            }
        ));
        tblAssets.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAssetsMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblAssets);

        btnNew.setText("Novo");
        btnNew.setMaximumSize(new java.awt.Dimension(71, 23));
        btnNew.setMinimumSize(new java.awt.Dimension(71, 23));
        btnNew.setPreferredSize(new java.awt.Dimension(71, 23));
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        jLabel1.setText("Total Investido:");

        lblAmount.setText("jLabel2");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 626, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblAmount)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblAmount)
                    .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblAssetsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAssetsMouseClicked
        int column = tblAssets.columnAtPoint(evt.getPoint());
        int row = tblAssets.rowAtPoint(evt.getPoint());
        
        //int option;
                
        if(row < tblAssets.getRowCount() && row >= 0 && column < tblAssets.getColumnCount() && column > 0)
        {
            Object value = tblAssets.getValueAt(row, column);
            int cod = (int)tblAssets.getModel().getValueAt(row, 0);
            String nm_asset = tblAssets.getModel().getValueAt(row, 1).toString().toUpperCase();
            
            Assets a = this._aDAO.getById(cod);
            if(value instanceof JButton)
            {
                ((JButton)value).doClick();
                JButton button = (JButton)value;
                switch(button.getName())
                {
                    case "add":
                        UpdateAssetsUI updateUI = new UpdateAssetsUI(a);
                        updateUI.setVisible(true);
                        this.setEnabled(false);
                        break;
//                    case "view":
//                        JOptionPane.showMessageDialog(null,
//                        "Btn View.\n", //mensagem
//                        "Carteira", // titulo da janela
//                        JOptionPane.INFORMATION_MESSAGE);
//                        break;
                    case "resc":
                        RescueAssetsUI rescueAssets = new RescueAssetsUI(a);
                        rescueAssets.setVisible(true);
                        this.setEnabled(false);
                        break;
                }
            }
        }
    }//GEN-LAST:event_tblAssetsMouseClicked

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        WalletTradeUI walletUI = new WalletTradeUI(this._wallet.getTrader());
        walletUI.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        // TODO add your handling code here:
        InsertAssetsUI insertAssets = new InsertAssetsUI(this._wallet);
        insertAssets.setVisible(true);
        this.setEnabled(false);
    }//GEN-LAST:event_btnNewActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        WalletTradeUI walletUI = new WalletTradeUI(_wallet.getTrader());
        walletUI.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_formWindowClosed
    
    public void loadTable()
    {
        this._listAssets = this._aDAO.getByWallet(this._wallet.getId_wallet());
        
        Object[] tColumns = {"Cod","Ativo","Quantidade","V.M","% Carteira","Del","Add"};
        Object[][] tRows = new Object[_listAssets.size()][tColumns.length];// {{};};
        //Object[] tColumnsList = null;// {"Carteira","Montante","","",""};
        BigDecimal amount = new BigDecimal("0");
        
        for(int i=0; i < _listAssets.size(); i++)
        {
            amount = amount.add(_listAssets.get(i).getVl_amountInvested());
            
            for(int j=1;j<=tColumns.length;j++)
            {
                int index = tColumns.length - j;
                switch(index)
                {
                    
                    case 0:
                        //COD
                        tRows[i][index]=_listAssets.get(i).getId_asset();
                        break;
                    case 1:
                        //NOME
                        tRows[i][index]=_listAssets.get(i).getNm_asset();
                        break;
                    case 2:
                        //QTD
                        tRows[i][index]= _listAssets.get(i).getQt_asset();
                        break;
                    case 3:
                        //P.M
                        tRows[i][index]= this._nfc.format(_listAssets.get(i).getVl_amountInvested().divide(BigDecimal.valueOf(_listAssets.get(i).getQt_asset()),2,RoundingMode.HALF_UP));
                        break;
                    case 4:
                        //%Carteira
                        tRows[i][index]= this._nfp.format(_listAssets.get(i).getVl_amountInvested().divide(_wallet.getAmount_invested(),2,RoundingMode.HALF_UP));
                        break;
//                    case 3:
//                        tRows[i][index]=btnView;
//                        break;
                    case 5:
                        tRows[i][index]=btnRescue;
                        break;
                    case 6:
                        tRows[i][index]=btnAdd;
                        break;
                }
            }
        }
        TableView.viewTable(tblAssets, tRows, tColumns);
        lblAmount.setText(this._nfc.format(amount));
    }
    
    public void loadComponents(Wallet w)
    {
        _principal = this;
        this.setLocationRelativeTo(null);
        this._wallet = w;
        this._aDAO = new AssetsDAO();
        this.btnAdd.setName("add");
        //this.btnView.setName("view");
        this.btnRescue.setName("resc");
        this.lblNmTrader.setText(this._wallet.getTrader().getNm_trader().toUpperCase() + " >");
        this.lblNmWallet.setText(_wallet.getNm_wallet().toUpperCase());
        
        
        this._nfc = NumberFormat.getCurrencyInstance();
        this._nfp = NumberFormat.getPercentInstance();
        this.loadTable();
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
            java.util.logging.Logger.getLogger(AssetsTradeUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AssetsTradeUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AssetsTradeUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AssetsTradeUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AssetsTradeUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnNew;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblAmount;
    private javax.swing.JLabel lblNmTrader;
    private javax.swing.JLabel lblNmWallet;
    private javax.swing.JTable tblAssets;
    // End of variables declaration//GEN-END:variables
}

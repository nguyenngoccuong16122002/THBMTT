/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package buoi2;

/**
 *
 * @author Cuong-Laptop
 */
public class playfail extends javax.swing.JFrame {

   
    char pf[][]={{'C','U','O','N','G'},
        {'M','H','Y','B','D'},
        {'E','F','R','I','K'},
        {'L','P','Q','S','T'},
        {'A','V','W','X','Z'},
        
    };
    /**
     * Creates new form playfail
     */
    public playfail() {
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
        jScrollPane2 = new javax.swing.JScrollPane();
        txtbm = new javax.swing.JTextArea();
        txtbr = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtkhoa = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        giaima = new javax.swing.JButton();
        btnmahoa = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ban ro");

        txtbm.setColumns(20);
        txtbm.setRows(5);
        jScrollPane2.setViewportView(txtbm);

        jLabel2.setText("khoa");

        jLabel3.setText("bang ma");

        giaima.setText("giai ma");
        giaima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                giaimaActionPerformed(evt);
            }
        });

        btnmahoa.setText("ma hoa");
        btnmahoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmahoaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(txtkhoa, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(txtbr, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnmahoa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(giaima)
                                .addGap(25, 25, 25)))))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtbr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtkhoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(giaima)
                    .addComponent(btnmahoa))
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
     private String timViTri(char a){
        for(int i=0;i<5;i++)
            for(int j=0;j<5;j++)
                if(pf[i][j]==a)
                    return i+""+j;
        return "";
                
    }
    String thayThe(char a,char b){
        String vta=timViTri(a);
        String vtb=timViTri(b);
        char x,y;
        if(vta.charAt(0)==vtb.charAt(0)){
            x=pf[vta.charAt(0)-'0'][((vta.charAt(1)-'0')+1)%5];
            y=pf[vtb.charAt(0)-'0'][((vtb.charAt(1)-'0')+1)%5];
            return x+""+y;
        }
        if(vta.charAt(1)==vtb.charAt(1)){
        x=pf[((vta.charAt(0)-'0')+1)%5][vta.charAt(1)-'0'];
        y=pf[((vtb.charAt(0)-'0')+1)%5][vtb.charAt(1)-'0'];
        return x+""+y;
        }
        x=pf[(vta.charAt(0)-'0')][vtb.charAt(1)-'0'];
        y=pf[(vtb.charAt(0)-'0')][vta.charAt(1)-'0'];
        
   return x+""+y;     
}
    private String mahoa(String banro){
int n=banro.length();
int i=0;
String banma="";
char a,b;
while(i<n){
    if(i==n-1){
        a=banro.charAt(i);
        b='X';
        i++;
    }else{
        a=banro.charAt(i);
        b=banro.charAt(i+1);
        if(a==b){
            b='X';
            i++;
        }else
            i+=2;
    }
    banma+=thayThe(a,b);
}
return banma;
}
    private void btnmahoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmahoaActionPerformed
        // TODO add your handling code here:
        String banro=this.txtbr.getText();
        banro=banro.toUpperCase();
        banro = banro.replace('J', 'I');
        String banma=mahoa(banro);
        this.txtbm.setText(banma);
    }//GEN-LAST:event_btnmahoaActionPerformed
 private String giaima(String banma){
    int n =banma.length();
    String banro="";
    char a,b;
    for(int i=0;i<n;i+=2){
        a=banma.charAt(i);
        b=banma.charAt(i+1);
        banro+=thayTheNguoc(a,b);
    }
    return banro;
    }
     String thayTheNguoc(char a,char b){
        String vta=timViTri(a);
        String vtb=timViTri(b);
        char x,y;
        if(vta.charAt(0)==vtb.charAt(0)){
            x=pf[vta.charAt(0)-'0'][((vta.charAt(1)-'0')-1+5)%5];
            y=pf[(vtb.charAt(0)-'0')][((vtb.charAt(1)-'0')-1+5)%5];
            return x+""+y;
        }
        if(vta.charAt(1)==vtb.charAt(1)){
            x=pf[((vta.charAt(0)-'0')-1+5)%5][vta.charAt(1)-'0'];
            y=pf[((vtb.charAt(0)-'0')-1+5)%5][(vtb.charAt(1)-'0')];
            return x+""+y;
        }
            x=pf[vta.charAt(0)-'0'][(vtb.charAt(1)-'0')];
            y=pf[(vtb.charAt(0)-'0')][(vta.charAt(1)-'0')];
            return x+""+y;
        
    }
    private void giaimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_giaimaActionPerformed
        // TODO add your handling code here:
         String banma=this.txtbm.getText();
        String banro=giaima(banma);
        int n =banro.length();
        String br="";
        for(int i=0;i<n-2;i+=2)
            if(banro.charAt(i)==banro.charAt(i+2))
                br+=banro.charAt(i);
        else
                br+=banro.charAt(i)+""+banro.charAt(i+1);
        if(banro.charAt(n-1)=='X')
            br+=banro.charAt(n-2);
        else 
            br+=banro.charAt(n-2);
        br+=banro.charAt(n-1);
        this.txtbr.setText(br);
    }//GEN-LAST:event_giaimaActionPerformed

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
            java.util.logging.Logger.getLogger(playfail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(playfail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(playfail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(playfail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new playfail().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnmahoa;
    private javax.swing.JButton giaima;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea txtbm;
    private javax.swing.JTextField txtbr;
    private javax.swing.JTextField txtkhoa;
    // End of variables declaration//GEN-END:variables
}
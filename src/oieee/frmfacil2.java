/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oieee;

import javax.swing.JOptionPane;
import static oieee.frmfacil.pontos;
import org.omg.CORBA.SystemException;

/**
 *
 * @author Leonardo
 */
public class frmfacil2 extends javax.swing.JFrame {

    /**
     * Creates new form frmfacil2
     */
    musica x = new musica();
   
    musica som;
    public static int sinalizador4;
    public static int sinalizador5;
    public static int sinalizador6;

    public musica getSom() {
        return som;
    }

    public void setSom(musica som) {
        this.som = som;
    }
    
    
    
    public frmfacil2() {
        initComponents();
       
        
    }

    public frmfacil2(musica som) {
        initComponents();
        
        setSom(som);
       
 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        checkbox1 = new java.awt.Checkbox();
        checkbox2 = new java.awt.Checkbox();
        checkbox3 = new java.awt.Checkbox();
        checkbox4 = new java.awt.Checkbox();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(700, 700));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("4) Complete a frase: \"Aqui nois constrói fibra, não é:\"");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(60, 30, 550, 25);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(70, 70, 260, 30);

        checkbox1.setLabel("A tampa");
        getContentPane().add(checkbox1);
        checkbox1.setBounds(70, 200, 71, 20);

        checkbox2.setLabel("Foi trollado");
        getContentPane().add(checkbox2);
        checkbox2.setBounds(70, 230, 87, 20);

        checkbox3.setLabel("A chave");
        getContentPane().add(checkbox3);
        checkbox3.setBounds(180, 200, 68, 20);

        checkbox4.setLabel("Desmaiou");
        getContentPane().add(checkbox4);
        checkbox4.setBounds(180, 230, 84, 20);

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Verificar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(300, 210, 120, 30);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/trapezio.jpg"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(130, 320, 100, 100);

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Cabeça");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(70, 430, 170, 30);

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Mão");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(260, 430, 170, 30);

        jButton4.setBackground(new java.awt.Color(0, 0, 0));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Trapézio Descendente");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(70, 490, 170, 30);

        jButton5.setBackground(new java.awt.Color(0, 0, 0));
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Dedo");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(260, 490, 170, 30);

        jButton6.setBackground(new java.awt.Color(0, 0, 0));
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Próximo");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(90, 613, 110, 50);

        jButton7.setBackground(new java.awt.Color(0, 0, 0));
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Desistir");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(230, 613, 110, 50);

        jButton8.setBackground(new java.awt.Color(0, 0, 0));
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("Verificar");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8);
        jButton8.setBounds(360, 70, 120, 30);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(60, 30, 540, 30);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("5) O que o Pivete mandou o JC pegar?");
        jPanel2.add(jLabel3);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("O que aconteceu com o JC?");
        jPanel2.add(jLabel4);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(60, 130, 400, 60);

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("6) Que parte do corpo é essa?");
        jPanel4.add(jLabel5);

        getContentPane().add(jPanel4);
        jPanel4.setBounds(60, 270, 320, 40);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/grande_1.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-20, 0, 900, 690);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        x.errou("naoconsegue.wav");
        JOptionPane.showMessageDialog(this, "Você terminou com: "+pontos+ " pontos");
        som.stop();
        this.dispose();
        frmmenu menu = new frmmenu();
        menu.setVisible(true);
        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        if(sinalizador4 == 0)
        {
        String texto;
        texto = jTextField1.getText();
        if ( "agua com musculo".equals(texto) || "água com músculo".equals(texto) || "AGUA COM MUSCULO".equals(texto)|| "ÁGUA COM MÚSCULO".equals(texto)|| "Água com musculo".equals(texto)|| "Água com músculo".equals(texto)){
             pontos = pontos+10;
             JOptionPane.showMessageDialog(null,"Acertou!!! "+pontos+ " pontos");
             jButton8.setEnabled(false);
             jTextField1.setEnabled(false);
             sinalizador4 = 1;
        }
        else
        {
             musica x = new musica();
             x.errou("errou.wav");
             JOptionPane.showMessageDialog(null, "Errou!!!!");
             sinalizador4 = 0;
        }
        
        }
        else
        {
        String texto;
        texto = jTextField1.getText();
        JOptionPane.showMessageDialog(null,"Você já respondeu essa pergunta, logo não tem pontuação.");
        jButton8.setEnabled(false);
        jTextField1.setEnabled(false);
        }
        
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(sinalizador5 == 0)
        {
        if (checkbox1.getState() && checkbox2.getState() && checkbox3.getState() && checkbox4.getState())
        {
            musica x = new musica();
            x.errou("errou.wav");
            JOptionPane.showMessageDialog(null, "Errou!!!!");
            sinalizador5 = 0;
        }
        else if (checkbox1.getState() && checkbox2.getState() && checkbox3.getState()){
            musica x = new musica();
            x.errou("errou.wav");
            JOptionPane.showMessageDialog(null, "Errou!!!!");
            sinalizador5 = 0;
        }
        else if (checkbox1.getState() && checkbox2.getState() && checkbox4.getState())
        {
            musica x = new musica();
            x.errou("errou.wav");
            JOptionPane.showMessageDialog(null, "Errou!!!!");
            sinalizador5 = 0;
        }
        else if (checkbox1.getState() && checkbox2.getState()){
            pontos = pontos+10;
            JOptionPane.showMessageDialog(null,"Acertou!!! "+pontos+ " pontos");
            checkbox1.setEnabled(false);
            checkbox2.setEnabled(false);
            checkbox3.setEnabled(false);
            checkbox4.setEnabled(false);
            jButton1.setEnabled(false);
            sinalizador5 = 1;
        }
        else
        {
            musica x = new musica();
            x.errou("errou.wav");
            JOptionPane.showMessageDialog(null, "Errou!!!!");
            sinalizador5 = 0;
        }
        }
        else{
            JOptionPane.showMessageDialog(null,"Você já respondeu essa pergunta, logo não tem pontuação.");
            checkbox1.setEnabled(false);
            checkbox2.setEnabled(false);
            checkbox3.setEnabled(false);
            checkbox4.setEnabled(false);
            jButton1.setEnabled(false);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        musica x = new musica();
        x.errou("errou.wav");
        JOptionPane.showMessageDialog(null, "Errou!!!!");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        musica x = new musica();
        x.errou("errou.wav");
        JOptionPane.showMessageDialog(null, "Errou!!!!");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        musica x = new musica();
        x.errou("errou.wav");
        JOptionPane.showMessageDialog(null, "Errou!!!!");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        if(sinalizador6 == 0)
        {
        pontos = pontos+10;
        JOptionPane.showMessageDialog(null,"Acertou!!! "+pontos+ " pontos");
        jButton2.setEnabled(false);
        jButton3.setEnabled(false);
        jButton5.setEnabled(false);
        jButton4.setEnabled(false);
        sinalizador6 =1;
        }
        else
        {
        JOptionPane.showMessageDialog(null,"Você já respondeu essa pergunta, logo não tem pontuação.");
        jButton2.setEnabled(false);
        jButton3.setEnabled(false);
        jButton5.setEnabled(false);
        jButton4.setEnabled(false);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        frmfacilfinal fim = new frmfacilfinal(som);
        fim.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(frmfacil2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmfacil2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmfacil2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmfacil2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmfacil2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Checkbox checkbox1;
    private java.awt.Checkbox checkbox2;
    private java.awt.Checkbox checkbox3;
    private java.awt.Checkbox checkbox4;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables


}

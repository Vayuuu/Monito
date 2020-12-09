package entradas;
public class Main extends javax.swing.JFrame {
  
    public Main() {
        initComponents();        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        character = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });
        jPanel1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPanel1KeyPressed(evt);
            }
        });
        jPanel1.setLayout(null);

        character.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/charater/front.png"))); // NOI18N
        character.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                characterKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                characterKeyTyped(evt);
            }
        });
        jPanel1.add(character);
        character.setBounds(190, 250, 60, 63);
        jPanel1.add(jLabel2);
        jLabel2.setBounds(260, 180, 30, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/charater/fondo.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, -10, 400, 410);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 400));

        pack();
    }// </editor-fold>

    private void jPanel1KeyPressed(java.awt.event.KeyEvent evt) {
    }//GEN-LAST:event_jPanel1KeyPressed

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        System.out.println("as");
    }//GEN-LAST:event_jPanel1MouseClicked

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        
        if (character.getX()>jPanel1.getWidth()) {
            character.setLocation(0, character.getY());
        }if (character.getX()<0) {
            character.setLocation(jPanel1.getWidth(), character.getY());
        }
        if (character.getY()>jPanel1.getHeight()) {
            character.setLocation(character.getX(), 0);
        }if (character.getY()<0) {
            character.setLocation(character.getX(), jPanel1.getHeight());
        }
        System.out.println(evt.getKeyCode());
        
        
        this.reinicioPatitas();
        switch (evt.getKeyChar()) {
            
            case 'a':
                character.setLocation(character.getX()-5, character.getY());
                if(patitas){                   
                    character.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/charater/left.png")));
                }else{
                    character.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/charater/left2.png")));
                 }
                break;
            case 'd':
                character.setLocation(character.getX()+5, character.getY());
                if(patitas){                   
                    character.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/charater/right.png")));
                }else{
                    character.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/charater/right2.png")));
                 }
                break;
            case 'w':
                character.setLocation(character.getX(), character.getY()-5);                           
                if(patitas){                   
                    character.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/charater/detras.png")));
                }else{
                    character.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/charater/detras2.png")));
                 }
                break;
            case 's':
                character.setLocation(character.getX(), character.getY()+5);
                if(patitas){                   
                    character.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/charater/front.png")));
                }else{
                    character.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/charater/front2.png")));
                 }
                break;
            default:
                break;
                
                
                
        }
        switch (evt.getKeyCode()) {
            case 37:
                character.setLocation(character.getX()-5, character.getY());
                if(patitas){                   
                    character.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/charater/left.png")));
                }else{
                    character.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/charater/left2.png")));
                 }
                break;
            case 39:
                character.setLocation(character.getX()+5, character.getY());
                if(patitas){                   
                    character.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/charater/right.png")));
                }else{
                    character.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/charater/right2.png")));
                 }
                break;
            case 38:
                character.setLocation(character.getX(), character.getY()-5);
                if(patitas){                   
                    character.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/charater/detras.png")));
                }else{
                    character.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/charater/detras2.png")));
                 }
                break;
            case 40:
                character.setLocation(character.getX(), character.getY()+5);
                if(patitas){                   
                    character.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/charater/front.png")));
                }else{
                    character.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/charater/front2.png")));
                 }
                break;
            default:
                break;
        }
    }//GEN-LAST:event_formKeyPressed

    private void characterKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_characterKeyTyped
        System.out.println(evt.getKeyChar());
    }//GEN-LAST:event_characterKeyTyped

    private void characterKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_characterKeyPressed

    }//GEN-LAST:event_characterKeyPressed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }
    
    private void reinicioPatitas(){
        patitas=!patitas;
     }    
    
    boolean patitas=false;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel character;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

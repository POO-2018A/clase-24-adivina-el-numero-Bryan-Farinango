package aleatorio;

import java.awt.Color;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author ESFOT
 */
public class GUINumeroAleatorio extends javax.swing.JFrame {

     Random numeroAleatorio = new Random();
     int numeroRespuesta = numeroAleatorio.nextInt(1000);
     int auxiliar = numeroRespuesta;

    /**
     * Creates new form GUINumeroAleatorio
     */
    public GUINumeroAleatorio() {
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

        PanelAdivinaNumero = new javax.swing.JPanel();
        labelJuego = new javax.swing.JLabel();
        labelNumero = new javax.swing.JLabel();
        labelIntentos = new javax.swing.JLabel();
        textNumero = new javax.swing.JTextField();
        textIntentos = new javax.swing.JTextField();
        buttonOk = new javax.swing.JButton();
        labelInformacion = new javax.swing.JLabel();
        buttonReiniciar = new javax.swing.JButton();
        labelRespuesta = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelJuego.setText("Estoy pensando en un numero de 1 al 1000");

        labelNumero.setText("¿Puedes adivinarlo?:");

        labelIntentos.setText("Intentos:");

        textIntentos.setEnabled(false);

        buttonOk.setText("Ok");
        buttonOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonOkActionPerformed(evt);
            }
        });

        buttonReiniciar.setText("Reinciar");
        buttonReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonReiniciarActionPerformed(evt);
            }
        });

        labelRespuesta.setText("Respuesta");

        javax.swing.GroupLayout PanelAdivinaNumeroLayout = new javax.swing.GroupLayout(PanelAdivinaNumero);
        PanelAdivinaNumero.setLayout(PanelAdivinaNumeroLayout);
        PanelAdivinaNumeroLayout.setHorizontalGroup(
            PanelAdivinaNumeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelAdivinaNumeroLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelInformacion)
                .addGap(143, 143, 143))
            .addGroup(PanelAdivinaNumeroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelAdivinaNumeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelAdivinaNumeroLayout.createSequentialGroup()
                        .addGroup(PanelAdivinaNumeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelJuego)
                            .addComponent(labelIntentos)
                            .addGroup(PanelAdivinaNumeroLayout.createSequentialGroup()
                                .addComponent(labelNumero)
                                .addGap(67, 67, 67)
                                .addGroup(PanelAdivinaNumeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textIntentos, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(PanelAdivinaNumeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(buttonReiniciar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonOk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(labelRespuesta))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelAdivinaNumeroLayout.setVerticalGroup(
            PanelAdivinaNumeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAdivinaNumeroLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(labelJuego)
                .addGap(18, 18, 18)
                .addGroup(PanelAdivinaNumeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNumero)
                    .addComponent(textNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonOk))
                .addGap(17, 17, 17)
                .addGroup(PanelAdivinaNumeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelIntentos)
                    .addComponent(textIntentos, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonReiniciar))
                .addGap(58, 58, 58)
                .addComponent(labelRespuesta)
                .addGap(23, 23, 23)
                .addComponent(labelInformacion)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelAdivinaNumero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelAdivinaNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 205, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonOkActionPerformed
        // TODO add your handling code here:
        String numero = textNumero.getText();
        int numeroToInt = Integer.parseInt(numero);
        
        if(numero.equals("")){
            int iconoAdvertencia = JOptionPane.WARNING_MESSAGE;
            JOptionPane.showMessageDialog(rootPane, "Debes ingresar un numero", "Advertencia", iconoAdvertencia);
        }else{
            
        if(numeroToInt > 1000 || numeroToInt < 1){
            int iconoError = JOptionPane.ERROR_MESSAGE;
            JOptionPane.showMessageDialog(rootPane, "Ese numero no es válido", "ERROR", iconoError);
        }else{
            if(auxiliar == numeroToInt){
                System.out.println("Si ese es");
                JOptionPane.showMessageDialog(rootPane, "Bien Jugado!", "Victoria", HEIGHT);
                textNumero.enable(false);
            }else{
            
                if(auxiliar == numeroToInt+3 || auxiliar == numeroToInt-3){
                    //this.getContentPane().setBackground(Color.BLUE);
                    PanelAdivinaNumero.setBackground(Color.BLUE);
                    labelRespuesta.setText("Estás cerca...");
                }else{
                     PanelAdivinaNumero.setBackground(Color.RED);
                     labelRespuesta.setText("Estás Muy lejos...");
                }
             System.out.println("No! ¡El numero era!: "+numeroRespuesta);
            }
            
            
    
        
                }
             }
    }//GEN-LAST:event_buttonOkActionPerformed

    private void buttonReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonReiniciarActionPerformed
        // TODO add your handling code here:
        
        textNumero.setText("");
        textNumero.enable(true);
        String numero = textNumero.getText();
     
       
    }//GEN-LAST:event_buttonReiniciarActionPerformed

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
            java.util.logging.Logger.getLogger(GUINumeroAleatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUINumeroAleatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUINumeroAleatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUINumeroAleatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUINumeroAleatorio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelAdivinaNumero;
    private javax.swing.JButton buttonOk;
    private javax.swing.JButton buttonReiniciar;
    private javax.swing.JLabel labelInformacion;
    private javax.swing.JLabel labelIntentos;
    private javax.swing.JLabel labelJuego;
    private javax.swing.JLabel labelNumero;
    private javax.swing.JLabel labelRespuesta;
    private javax.swing.JTextField textIntentos;
    private javax.swing.JTextField textNumero;
    // End of variables declaration//GEN-END:variables
}

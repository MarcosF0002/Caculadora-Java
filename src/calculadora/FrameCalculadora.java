/*
LINGUAGEM DE PROGRAMAÇÃO ORIENTADA A OBJETOS
TRABALHO 1: CALCULADORA
ALUNO: MARCOS FELIPE LOPES RODRIGUES GRR20211592
*/
package calculadora;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameCalculadora extends javax.swing.JFrame implements ActionListener {

    enum EstadoCalculadora{
    ENTRADA1, IGNORADO, OPERADOR, ENTRADA2, CALCULANDO
    }
    private EstadoCalculadora estadoCal = EstadoCalculadora.ENTRADA1;
    
    private int num1 = 0, num2 = 0;
    private char sinal = '+';

    
    private void digita (String caractere){
        display.setText(display.getText().concat(caractere));           
  }
             
    public FrameCalculadora() {
        initComponents();
        bt0.addActionListener(this);
        bt1.addActionListener(this);
        bt2.addActionListener(this);
        bt3.addActionListener(this);
        bt4.addActionListener(this);
        bt5.addActionListener(this);
        bt6.addActionListener(this);
        bt7.addActionListener(this);
        bt8.addActionListener(this);
        bt9.addActionListener(this);
        btC.addActionListener(this);
        btDiv.addActionListener(this);
        btMult.addActionListener(this);
        btSoma.addActionListener(this);
        btSub.addActionListener(this); 
        btResult.addActionListener(this);
    }
  
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        display = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        bt7 = new javax.swing.JButton();
        bt8 = new javax.swing.JButton();
        bt9 = new javax.swing.JButton();
        btSoma = new javax.swing.JButton();
        bt4 = new javax.swing.JButton();
        bt5 = new javax.swing.JButton();
        bt6 = new javax.swing.JButton();
        btSub = new javax.swing.JButton();
        bt1 = new javax.swing.JButton();
        bt2 = new javax.swing.JButton();
        bt3 = new javax.swing.JButton();
        btMult = new javax.swing.JButton();
        bt0 = new javax.swing.JButton();
        btResult = new javax.swing.JButton();
        btC = new javax.swing.JButton();
        btDiv = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        display.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        display.setForeground(new java.awt.Color(0, 0, 0));
        display.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        display.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(display)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(display, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setLayout(new java.awt.GridLayout(4, 4, 0, 2));

        bt7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        bt7.setForeground(new java.awt.Color(0, 0, 0));
        bt7.setText("7");
        jPanel2.add(bt7);

        bt8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        bt8.setForeground(new java.awt.Color(0, 0, 0));
        bt8.setText("8");
        jPanel2.add(bt8);

        bt9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        bt9.setForeground(new java.awt.Color(0, 0, 0));
        bt9.setText("9");
        jPanel2.add(bt9);

        btSoma.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btSoma.setForeground(new java.awt.Color(0, 0, 0));
        btSoma.setText("+");
        btSoma.setActionCommand("Soma");
        jPanel2.add(btSoma);

        bt4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        bt4.setForeground(new java.awt.Color(0, 0, 0));
        bt4.setText("4");
        jPanel2.add(bt4);

        bt5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        bt5.setForeground(new java.awt.Color(0, 0, 0));
        bt5.setText("5");
        jPanel2.add(bt5);

        bt6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        bt6.setForeground(new java.awt.Color(0, 0, 0));
        bt6.setText("6");
        jPanel2.add(bt6);

        btSub.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btSub.setForeground(new java.awt.Color(0, 0, 0));
        btSub.setText("-");
        btSub.setActionCommand("Sub");
        jPanel2.add(btSub);

        bt1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        bt1.setForeground(new java.awt.Color(0, 0, 0));
        bt1.setText("1");
        jPanel2.add(bt1);

        bt2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        bt2.setForeground(new java.awt.Color(0, 0, 0));
        bt2.setText("2");
        jPanel2.add(bt2);

        bt3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        bt3.setForeground(new java.awt.Color(0, 0, 0));
        bt3.setText("3");
        jPanel2.add(bt3);

        btMult.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btMult.setForeground(new java.awt.Color(0, 0, 0));
        btMult.setText("x");
        btMult.setActionCommand("mult");
        jPanel2.add(btMult);

        bt0.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        bt0.setForeground(new java.awt.Color(0, 0, 0));
        bt0.setText("0");
        jPanel2.add(bt0);

        btResult.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btResult.setForeground(new java.awt.Color(0, 0, 0));
        btResult.setText("=");
        btResult.setActionCommand("resultado");
        jPanel2.add(btResult);

        btC.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btC.setForeground(new java.awt.Color(0, 0, 0));
        btC.setText("C");
        btC.setActionCommand("limpa");
        jPanel2.add(btC);

        btDiv.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btDiv.setForeground(new java.awt.Color(0, 0, 0));
        btDiv.setText("/");
        btDiv.setActionCommand("div");
        jPanel2.add(btDiv);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void displayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_displayActionPerformed

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
            java.util.logging.Logger.getLogger(FrameCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new FrameCalculadora().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt0;
    private javax.swing.JButton bt1;
    private javax.swing.JButton bt2;
    private javax.swing.JButton bt3;
    private javax.swing.JButton bt4;
    private javax.swing.JButton bt5;
    private javax.swing.JButton bt6;
    private javax.swing.JButton bt7;
    private javax.swing.JButton bt8;
    private javax.swing.JButton bt9;
    private javax.swing.JButton btC;
    private javax.swing.JButton btDiv;
    private javax.swing.JButton btMult;
    private javax.swing.JButton btResult;
    private javax.swing.JButton btSoma;
    private javax.swing.JButton btSub;
    private javax.swing.JTextField display;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
                
        if((estadoCal == EstadoCalculadora.ENTRADA1)||(estadoCal == EstadoCalculadora.ENTRADA2)){
            if(e.getSource()==bt0)
                digita("0");
            
            if(e.getSource()==bt1)
                digita("1");
            
            if(e.getSource()==bt2)
                digita("2");
            
            if(e.getSource()==bt3)
                 digita("3");
            
            if(e.getSource()==bt4)
                 digita("4");
            
            if(e.getSource()==bt5)
                 digita("5");
            
            if(e.getSource()==bt6)
                 digita("6");
            
            if(e.getSource()==bt7)
                 digita("7");
            
            if(e.getSource()==bt8)
                 digita("8");
            
            if(e.getSource()==bt9)
                 digita("9");
            
            
            if((e.getSource()==btSub)||(e.getSource()==btSoma)||(e.getSource()==btMult)||(e.getSource()==btDiv)){              
                if(((e.getSource()==btMult)||(e.getSource()==btDiv))&&(display.getText().equals(""))){
                    display.setText("Erro");
                    estadoCal = EstadoCalculadora.IGNORADO;
                }
                else if((e.getSource()==btSoma)&&(display.getText().equals("")))
                    digita("+"); 
                
                else if((e.getSource()==btSub)&&(display.getText().equals("")))
                    digita("-");
                
                else     
                    estadoCal = EstadoCalculadora.OPERADOR;
                       
            }
            if(e.getSource()==btResult){
            estadoCal = EstadoCalculadora.CALCULANDO;
            num2 = Integer.parseInt(display.getText());
                if((sinal == '/')&&((num1 == 0) ||(num2 == 0)))
                    display.setText("Erro");
                
                if(sinal == '+')
                     display.setText(String.valueOf(num1 + num2));
                
                else if(sinal == '-')
                    display.setText(String.valueOf(num1 - num2));
                
                else if(sinal == 'x')
                    display.setText(String.valueOf(num1 * num2));
                
                else if(sinal == '/')
                    display.setText(String.valueOf(num1 / num2));
                 
                estadoCal = EstadoCalculadora.ENTRADA1;   
            }
                           
        }
               
        if(estadoCal == EstadoCalculadora.OPERADOR){ 
            
            if(e.getSource()==btSoma){
                 num1 = Integer.parseInt(display.getText());
                 display.setText("");
                 sinal = '+';
                 estadoCal = EstadoCalculadora.ENTRADA2;
            }
            if(e.getSource()==btSub){
                 num1 = Integer.parseInt(display.getText());
                 display.setText("");
                 sinal = '-';
                 estadoCal = EstadoCalculadora.ENTRADA2;
            }
            if(e.getSource()==btMult){
                 num1 = Integer.parseInt(display.getText());
                 display.setText("");
                 sinal = 'x';
                 estadoCal = EstadoCalculadora.ENTRADA2;
            }
            if(e.getSource()==btDiv){
                 num1 = Integer.parseInt(display.getText());
                 display.setText("");
                 sinal = '/';
                 estadoCal = EstadoCalculadora.ENTRADA2;
            } 
        } 
        if(e.getSource()==btC){
            display.setText("");
            estadoCal = EstadoCalculadora.ENTRADA1;
            }
         
        System.out.print("Action detectada: ");
        System.out.println(e.getActionCommand());
    }
}

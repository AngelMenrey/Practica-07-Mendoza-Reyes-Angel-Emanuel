import java.awt.event.KeyEvent;

public class FrmRegistrarLibro extends javax.swing.JFrame {

    PilaLibro pila;
    FrmMenu menu;
    
    public FrmRegistrarLibro(FrmMenu menu, PilaLibro pila) {
    initComponents();
    this.pila = pila;
    this.menu = menu;
    setLocationRelativeTo(null);    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        NOMBRELIBRO = new javax.swing.JTextField();
        NOMBREEDITORIAL = new javax.swing.JTextField();
        NOMBREAUTOR = new javax.swing.JTextField();
        NUMERODEPAGINAS = new javax.swing.JTextField();
        AGREGAR = new javax.swing.JButton();
        ELIMINAR = new javax.swing.JButton();
        REGRESAR = new javax.swing.JButton();
        TXT = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel1.setText("REGISTRAR LIBRO");

        jLabel2.setText("NOMBRE LIBRO");

        jLabel3.setText("EDITORIAL");

        jLabel4.setText("AUTOR");

        jLabel5.setText("NUMERO DE PAGINAS");

        NOMBRELIBRO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NOMBRELIBROActionPerformed(evt);
            }
        });

        NOMBREEDITORIAL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NOMBREEDITORIALActionPerformed(evt);
            }
        });

        NOMBREAUTOR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NOMBREAUTORActionPerformed(evt);
            }
        });

        NUMERODEPAGINAS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NUMERODEPAGINASActionPerformed(evt);
            }
        });
        NUMERODEPAGINAS.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NUMERODEPAGINASKeyTyped(evt);
            }
        });

        AGREGAR.setBackground(new java.awt.Color(51, 255, 51));
        AGREGAR.setText("AGREGAR");
        AGREGAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AGREGARActionPerformed(evt);
            }
        });

        ELIMINAR.setBackground(new java.awt.Color(255, 51, 0));
        ELIMINAR.setText("ELIMINAR");
        ELIMINAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ELIMINARActionPerformed(evt);
            }
        });

        REGRESAR.setBackground(new java.awt.Color(255, 255, 51));
        REGRESAR.setText("REGRESAR");
        REGRESAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REGRESARActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(NUMERODEPAGINAS))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(96, 96, 96)
                                .addComponent(NOMBREAUTOR, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(46, 46, 46)
                                .addComponent(NOMBRELIBRO, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(77, 77, 77)
                                .addComponent(NOMBREEDITORIAL, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(70, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AGREGAR)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ELIMINAR)
                        .addGap(50, 50, 50)
                        .addComponent(REGRESAR)
                        .addGap(30, 30, 30))))
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(TXT)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(NOMBRELIBRO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(NOMBREEDITORIAL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(NOMBREAUTOR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(NUMERODEPAGINAS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(TXT)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AGREGAR)
                    .addComponent(ELIMINAR)
                    .addComponent(REGRESAR))
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NUMERODEPAGINASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NUMERODEPAGINASActionPerformed
        
    }//GEN-LAST:event_NUMERODEPAGINASActionPerformed

    private void NUMERODEPAGINASKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NUMERODEPAGINASKeyTyped
    int tam = 5;
        
    char caracter = evt.getKeyChar();
        
    TXT.setVisible(false);
        
    if(caracter == KeyEvent.VK_ENTER){
    TXT.requestFocus();        
    }else if (!Character.isDigit(caracter)){
            getToolkit().beep();
            evt.consume();
            TXT.setVisible(true);
            TXT.setText("SOLO CAPTURAR NUMEROS");
        }
         if(NUMERODEPAGINAS.getText().length()>= tam && caracter != KeyEvent.VK_ENTER){
            getToolkit().beep();
            evt.consume();
            TXT.setVisible(true);
            TXT.setText("LIMITE MAXIMO 5 DIGITOS. ");
        
        }      
    }//GEN-LAST:event_NUMERODEPAGINASKeyTyped

    private void AGREGARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AGREGARActionPerformed
       String nombreLibro = NOMBRELIBRO.getText();
       String nombreEditorial = NOMBREEDITORIAL.getText();
       String nombreAutor = NOMBREAUTOR.getText();
       int numPag = Integer.parseInt(this.NUMERODEPAGINAS.getText());
       
       Libro libro = new Libro();
       
       libro.setNom_libro(nombreLibro);
       libro.setEditorial(nombreEditorial);
       libro.setAutor(nombreAutor);
       libro.setNum_paginas(numPag);
       
       pila.push(libro);
       TXT.setVisible(true);
       TXT.setText("SE REGISTRO");      
    }//GEN-LAST:event_AGREGARActionPerformed

    private void REGRESARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REGRESARActionPerformed
    this.dispose();
    menu.setVisible(true);
    }//GEN-LAST:event_REGRESARActionPerformed

    private void ELIMINARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ELIMINARActionPerformed
    String m = pila.pop();
    TXT.setVisible(true);
    TXT.setText(m);
    }//GEN-LAST:event_ELIMINARActionPerformed

    private void NOMBRELIBROActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NOMBRELIBROActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NOMBRELIBROActionPerformed

    private void NOMBREEDITORIALActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NOMBREEDITORIALActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NOMBREEDITORIALActionPerformed

    private void NOMBREAUTORActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NOMBREAUTORActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NOMBREAUTORActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new FrmRegistrarLibro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AGREGAR;
    private javax.swing.JButton ELIMINAR;
    private javax.swing.JTextField NOMBREAUTOR;
    private javax.swing.JTextField NOMBREEDITORIAL;
    private javax.swing.JTextField NOMBRELIBRO;
    private javax.swing.JTextField NUMERODEPAGINAS;
    private javax.swing.JButton REGRESAR;
    private javax.swing.JLabel TXT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}

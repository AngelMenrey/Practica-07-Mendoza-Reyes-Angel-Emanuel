
import javax.swing.table.DefaultTableModel;

public class FrmMostrarPrestamo extends javax.swing.JFrame {
    
    FrmMenu menu;
    PilaPrestamo pila = new PilaPrestamo();
    public FrmMostrarPrestamo(FrmMenu menu, PilaPrestamo pila) {
    initComponents();
    setLocationRelativeTo(null);
    this.menu = menu;
   
        Prestamo arregloprePrestamo[]= new Prestamo[pila.getCantnodos()];
        arregloprePrestamo = pila.recorrerPila();
        DefaultTableModel modelo = new  DefaultTableModel();
        
        String [] cabecera = {"fecha_inicio", "fecha_final", "nombre_empleado" ,"comisionporlibro"};
        modelo.setColumnIdentifiers(cabecera);
        Object [] datos  = new Object[4];
        
        for (int i=0; i<pila.getCantnodos(); i++){
         datos[0] = arregloprePrestamo[i].getFecha_inicio();
         datos[1] = arregloprePrestamo[i].getFecha_final();
         datos[2] = arregloprePrestamo[i].getNombre_empleado();
         datos[3]= arregloprePrestamo[i].getComisionporlibro();
         modelo.addRow(datos);
        }
        JTable_.setModel(modelo);

    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        LIMPIAR = new javax.swing.JButton();
        REGRESAR = new javax.swing.JButton();
        JTable = new javax.swing.JScrollPane();
        JTable_ = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel1.setText("DATOS PRESTAMO");

        LIMPIAR.setBackground(new java.awt.Color(0, 204, 204));
        LIMPIAR.setText("LIMPIAR");
        LIMPIAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LIMPIARActionPerformed(evt);
            }
        });

        REGRESAR.setBackground(new java.awt.Color(255, 51, 0));
        REGRESAR.setText("REGRESAR");
        REGRESAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REGRESARActionPerformed(evt);
            }
        });

        JTable_.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        JTable.setViewportView(JTable_);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(LIMPIAR, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(114, 114, 114)
                                .addComponent(jLabel1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(REGRESAR))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(JTable, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(JTable, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LIMPIAR)
                    .addComponent(REGRESAR))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LIMPIARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LIMPIARActionPerformed
     JTable_.clearSelection();
    }//GEN-LAST:event_LIMPIARActionPerformed

    private void REGRESARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REGRESARActionPerformed
    this.dispose();
    menu.setVisible(true);
    }//GEN-LAST:event_REGRESARActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new FrmMostrarPrestamo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane JTable;
    private javax.swing.JTable JTable_;
    private javax.swing.JButton LIMPIAR;
    private javax.swing.JButton REGRESAR;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}

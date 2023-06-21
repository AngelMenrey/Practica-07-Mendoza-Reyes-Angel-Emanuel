import java.awt.Image;
import java.awt.Toolkit;
import java.util.List;
import javax.swing.ImageIcon;
import java.awt.Cursor;
import java.awt.Point;


public class FrmMenu extends javax.swing.JFrame {
   
    private PilaLibro pilaLibro = new PilaLibro();
    private PilaPrestamo pilaPrestamo = new PilaPrestamo();
    private PilaAlumno pilaAlumno = new PilaAlumno();
    public FrmMenu() {
    initComponents();
    setLocationRelativeTo(null);
    
    ImageIcon img = new ImageIcon("src/Imagenes/alumno.png");
    Cursor c;
    Toolkit tk = Toolkit.getDefaultToolkit();
    c = tk.createCustomCursor(img.getImage(),new Point(1,1) , null);
    setCursor(c);
    Malumnos.setCursor(c);
    
    ImageIcon img1 = new ImageIcon("src/Imagenes/Libro.png");
    Cursor c1;
    Toolkit tk1 = Toolkit.getDefaultToolkit();
    c1 = tk1.createCustomCursor(img1.getImage(),new Point(1,1) , null);
    setCursor(c1);
    Mlibros.setCursor(c1);
    
    
    ImageIcon img2 = new ImageIcon("src/Imagenes/Prestamo.png");
    Cursor c2;
    Toolkit tk2 = Toolkit.getDefaultToolkit();
    c2 = tk2.createCustomCursor(img2.getImage(),new Point(1,1) , null);
    setCursor(c2);
    Mprestamos.setCursor(c2);
    
    
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        SALIR = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        Malumnos = new javax.swing.JMenu();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        Mlibros = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        Mprestamos = new javax.swing.JMenu();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenuItem3.setText("jMenuItem3");

        jMenuItem4.setText("jMenuItem4");

        jMenuItem5.setText("jMenuItem5");

        jMenuItem6.setText("jMenuItem6");

        jMenuItem7.setText("jMenuItem7");

        jMenuItem8.setText("jMenuItem8");

        jMenuItem9.setText("jMenuItem9");

        jMenuItem10.setText("jMenuItem10");

        jMenuItem14.setText("jMenuItem14");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel1.setText("BIENVENIDO AL REGISTRO DE DATOS DE LA BIBLIOTECA");

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setForeground(new java.awt.Color(204, 255, 204));

        SALIR.setBackground(new java.awt.Color(255, 0, 0));
        SALIR.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        SALIR.setText("SALIR");
        SALIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SALIRActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(204, 204, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\CETI COLOMOS 1 SEMESTRE\\TERCER SEMESTRE 3\\Programacion Orientada a Eventos (POE)\\Projects POE\\Practica 11 Mendoza Reyes Angel Emanuel\\src\\Imagenes\\biblioteca.png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(219, 219, 219)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SALIR)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(219, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(SALIR, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jMenuBar1.setBackground(new java.awt.Color(255, 204, 0));

        Malumnos.setText("ALUMNOS");
        Malumnos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Malumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MalumnosActionPerformed(evt);
            }
        });

        jMenuItem12.setBackground(new java.awt.Color(0, 255, 0));
        jMenuItem12.setText("REGISTRAR");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        Malumnos.add(jMenuItem12);

        jMenuItem13.setBackground(new java.awt.Color(255, 153, 0));
        jMenuItem13.setText("MOSTRAR");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        Malumnos.add(jMenuItem13);

        jMenuBar1.add(Malumnos);

        Mlibros.setText("LIBROS");
        Mlibros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MlibrosActionPerformed(evt);
            }
        });

        jMenuItem11.setBackground(new java.awt.Color(51, 255, 51));
        jMenuItem11.setText("REGISTRAR");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        Mlibros.add(jMenuItem11);

        jMenuItem15.setBackground(new java.awt.Color(255, 153, 51));
        jMenuItem15.setText("MOSTRAR");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        Mlibros.add(jMenuItem15);

        jMenuBar1.add(Mlibros);

        Mprestamos.setText("PRESTAMOS");

        jMenuItem17.setBackground(new java.awt.Color(0, 255, 0));
        jMenuItem17.setText("REGISTRAR");
        jMenuItem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem17ActionPerformed(evt);
            }
        });
        Mprestamos.add(jMenuItem17);

        jMenuItem16.setBackground(new java.awt.Color(255, 153, 0));
        jMenuItem16.setText("MOSTRAR");
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        Mprestamos.add(jMenuItem16);

        jMenuBar1.add(Mprestamos);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MlibrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MlibrosActionPerformed

    }//GEN-LAST:event_MlibrosActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        FrmMostrarLibro frmMostrarLibro = new FrmMostrarLibro(this, pilaLibro);
        this.setVisible(false);
        frmMostrarLibro.setVisible(true);
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
       FrmRegistrarLibro frmRegistrarLibro = new FrmRegistrarLibro(this, pilaLibro);
       this.setVisible(false);
       frmRegistrarLibro.setVisible(true);
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void SALIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SALIRActionPerformed
    this.dispose();
    }//GEN-LAST:event_SALIRActionPerformed

    private void MalumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MalumnosActionPerformed
  
    }//GEN-LAST:event_MalumnosActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
      FrmMostrarAlumno frmMostrarAlumno = new FrmMostrarAlumno(this, pilaAlumno);
      this.setVisible(false);
      frmMostrarAlumno.setVisible(true);
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem17ActionPerformed
     FrmRegistrarPrestamo frmRegistrarPrestamo = new FrmRegistrarPrestamo(this, pilaPrestamo);
     this.setVisible(false);
     frmRegistrarPrestamo.setVisible(true);
    }//GEN-LAST:event_jMenuItem17ActionPerformed

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
     FrmMostrarPrestamo frmMostrarPrestamo = new FrmMostrarPrestamo(this, pilaPrestamo);
     this.setVisible(false);
     frmMostrarPrestamo.setVisible(true);
    }//GEN-LAST:event_jMenuItem16ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
      FrmRegistrarAlumno frmRegistrarAlumno= new FrmRegistrarAlumno(this, pilaAlumno);
      this.setVisible(false);
      frmRegistrarAlumno.setVisible(true);
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Malumnos;
    private javax.swing.JMenu Mlibros;
    private javax.swing.JMenu Mprestamos;
    private javax.swing.JButton SALIR;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

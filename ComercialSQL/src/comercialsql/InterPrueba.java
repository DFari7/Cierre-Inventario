package comercialsql;

import javax.swing.JComboBox;
import javax.swing.JFrame;


import javax.swing.JOptionPane;
public class InterPrueba extends javax.swing.JFrame {

    /**
     * Creates new form InterPrueba
     */
    public InterPrueba() {
        initComponents();
                
        SaldoFinaltxt.setEnabled(false);
        ComboSt.setEnabled(false);
        
        MProductos mostrarPro = new MProductos();
        mostrarPro.mostrarProducto(jTable1);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Codigotxt = new javax.swing.JTextField();
        SaldoInicialtxt = new javax.swing.JTextField();
        Ingresostxt = new javax.swing.JTextField();
        Egresostxt = new javax.swing.JTextField();
        Ajustestxt = new javax.swing.JTextField();
        SaldoFinaltxt = new javax.swing.JTextField();
        Costotxt = new javax.swing.JTextField();
        Preciotxt = new javax.swing.JTextField();
        Descripciontxt = new javax.swing.JTextField();
        AgregarProd = new javax.swing.JButton();
        UpdateProd = new javax.swing.JButton();
        EliminiarProd = new javax.swing.JButton();
        ComboUni = new javax.swing.JComboBox<>();
        ComboSt = new javax.swing.JComboBox<>();
        ImagenSubir = new javax.swing.JButton();
        imagMostrar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        Saldofisicotxt = new javax.swing.JTextField();
        CierreBoton = new javax.swing.JButton();
        verAjustesBoton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        imagenLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("COLADA MORADA");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos de productos"));

        jLabel1.setText("Codigo:");

        jLabel2.setText("Unidad de medida:");

        jLabel3.setText("Saldo inicial:");

        jLabel4.setText("Ingresos:");

        jLabel5.setText("Egresos:");

        jLabel6.setText("Ajustes:");

        jLabel7.setText("Saldo final:");

        jLabel8.setText("Costo:");

        jLabel9.setText("Precio:");

        jLabel10.setText("Status:");

        jLabel11.setText("Descripcion:");

        Codigotxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CodigotxtActionPerformed(evt);
            }
        });

        SaldoInicialtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaldoInicialtxtActionPerformed(evt);
            }
        });

        Ingresostxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresostxtActionPerformed(evt);
            }
        });

        Descripciontxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DescripciontxtActionPerformed(evt);
            }
        });

        AgregarProd.setText("Agregar");
        AgregarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarProdActionPerformed(evt);
            }
        });

        UpdateProd.setText("Modificar");
        UpdateProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateProdActionPerformed(evt);
            }
        });

        EliminiarProd.setText("Eliminar");
        EliminiarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminiarProdActionPerformed(evt);
            }
        });

        ComboUni.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "kg", "lt", "gr", "ml", "un" }));
        ComboUni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboUniActionPerformed(evt);
            }
        });

        ComboSt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ACT", "INA" }));

        ImagenSubir.setText("Subir Imagen");
        ImagenSubir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImagenSubirActionPerformed(evt);
            }
        });

        imagMostrar.setText("Mostrar Imagen");
        imagMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imagMostrarActionPerformed(evt);
            }
        });

        jLabel12.setText("Saldo Fisico: ");

        Saldofisicotxt.setText("0");

        CierreBoton.setText("Cierre de Inventario");
        CierreBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CierreBotonActionPerformed(evt);
            }
        });

        verAjustesBoton.setText("Ver Ajustes");
        verAjustesBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verAjustesBotonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(53, 53, 53)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Codigotxt, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                                .addComponent(Costotxt)
                                .addComponent(Preciotxt)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(SaldoInicialtxt)
                                        .addComponent(Ingresostxt)
                                        .addComponent(Egresostxt)
                                        .addComponent(Ajustestxt)
                                        .addComponent(SaldoFinaltxt)
                                        .addComponent(ComboUni, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addComponent(Descripciontxt, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE))))
                        .addComponent(ComboSt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CierreBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(ImagenSubir)
                                .addGap(18, 18, 18)
                                .addComponent(imagMostrar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(AgregarProd)
                                .addGap(18, 18, 18)
                                .addComponent(UpdateProd)
                                .addGap(18, 18, 18)
                                .addComponent(EliminiarProd)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(verAjustesBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Saldofisicotxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel12))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Codigotxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(ComboUni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(SaldoInicialtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Ingresostxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Egresostxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(Ajustestxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(SaldoFinaltxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(Costotxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(Preciotxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(ComboSt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(Descripciontxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(Saldofisicotxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(verAjustesBoton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AgregarProd)
                    .addComponent(UpdateProd)
                    .addComponent(EliminiarProd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ImagenSubir)
                    .addComponent(imagMostrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CierreBoton)
                .addGap(12, 12, 12))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista de productos"));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        imagenLabel.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 890, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(imagenLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(292, 292, 292))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(imagenLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IngresostxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresostxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IngresostxtActionPerformed

    private void AgregarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarProdActionPerformed
        // TODO add your handling code here:
        MProductos insertProductos = new MProductos();
        insertProductos.insertarProducto(Codigotxt, Descripciontxt, ComboUni, SaldoInicialtxt, Ingresostxt, Egresostxt, Ajustestxt, Costotxt, Preciotxt, ComboSt);
        insertProductos.mostrarProducto(jTable1);
        Codigotxt.setText("");
        SaldoInicialtxt.setText("");
        Ingresostxt.setText("");
        Egresostxt.setText("");
        Ajustestxt.setText("");
        SaldoFinaltxt.setText("");
        Costotxt.setText("");
        Preciotxt.setText("");
        Descripciontxt.setText("");
    }//GEN-LAST:event_AgregarProdActionPerformed

    private void CodigotxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CodigotxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CodigotxtActionPerformed

    private void DescripciontxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DescripciontxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DescripciontxtActionPerformed

    private void EliminiarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminiarProdActionPerformed
        // TODO add your handling code here:
        MProductos deleteProductos = new MProductos();
        deleteProductos.deleteProducto(Codigotxt,ComboSt);
        deleteProductos.mostrarProducto(jTable1);
        Codigotxt.setText("");
        SaldoInicialtxt.setText("");
        Ingresostxt.setText("");
        Egresostxt.setText("");
        Ajustestxt.setText("");
        SaldoFinaltxt.setText("");
        Costotxt.setText("");
        Preciotxt.setText("");
        Descripciontxt.setText("");
    }//GEN-LAST:event_EliminiarProdActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        MProductos insertProductos = new MProductos();
        insertProductos.seleccion(jTable1, Codigotxt, ComboUni, SaldoInicialtxt, Ingresostxt, Egresostxt, Ajustestxt, SaldoFinaltxt, Costotxt, Preciotxt, ComboSt, Descripciontxt);
        //Codigotxt.setEnabled(false);
    }//GEN-LAST:event_jTable1MouseClicked

    private void UpdateProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateProdActionPerformed
        // TODO add your handling code here:
        int result = JOptionPane.showConfirmDialog(null, "Confirme","Confi",JOptionPane.OK_CANCEL_OPTION);
        if(result == JOptionPane.OK_OPTION){
            MProductos updateProductos = new MProductos();
        updateProductos.modificarProducto(Codigotxt, ComboUni, SaldoInicialtxt, Ingresostxt, Egresostxt, Ajustestxt, SaldoFinaltxt, Costotxt, Preciotxt, ComboSt, Descripciontxt,Saldofisicotxt);
        updateProductos.mostrarProducto(jTable1);
        Codigotxt.setText("");
        SaldoInicialtxt.setText("");
        Ingresostxt.setText("");
        Egresostxt.setText("");
        Ajustestxt.setText("");
        SaldoFinaltxt.setText("");
        Costotxt.setText("");
        Preciotxt.setText("");
        Descripciontxt.setText("");
        }
        /*MProductos updateProductos = new MProductos();
        updateProductos.modificarProducto(Codigotxt, ComboUni, SaldoInicialtxt, Ingresostxt, Egresostxt, Ajustestxt, SaldoFinaltxt, Costotxt, Preciotxt, ComboSt, Descripciontxt,Saldofisicotxt);
        updateProductos.mostrarProducto(jTable1);
        Codigotxt.setText("");
        SaldoInicialtxt.setText("");
        Ingresostxt.setText("");
        Egresostxt.setText("");
        Ajustestxt.setText("");
        SaldoFinaltxt.setText("");
        Costotxt.setText("");
        Preciotxt.setText("");
        Descripciontxt.setText("");*/
    }//GEN-LAST:event_UpdateProdActionPerformed

    private void ComboUniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboUniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboUniActionPerformed

    private void SaldoInicialtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaldoInicialtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SaldoInicialtxtActionPerformed

    private void ImagenSubirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImagenSubirActionPerformed
        // TODO add your handling code here:
        MProductos imagenProductos = new MProductos();
        imagenProductos.subirImagenProducto(Codigotxt, imagenProductos.seleccionarArchivo());
    }//GEN-LAST:event_ImagenSubirActionPerformed

    private void imagMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imagMostrarActionPerformed
        // TODO add your handling code here:
        MProductos mostrarImagen = new MProductos();
        mostrarImagen.mostrarImagenProducto(Codigotxt, imagenLabel);
    }//GEN-LAST:event_imagMostrarActionPerformed

    private void CierreBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CierreBotonActionPerformed
        // TODO add your handling code here:
        int result = JOptionPane.showConfirmDialog(null,"Seguro desea realizar un cierre de inventario","Confirmacion",JOptionPane.OK_CANCEL_OPTION);
        if(result == JOptionPane.OK_OPTION){
            MProductos cierre = new MProductos();
            cierre.cierreInventario(jTable1);
            cierre.mostrarProducto(jTable1);
        }
        /*MProductos cierre = new MProductos();
        cierre.cierreInventario(jTable1);
        cierre.mostrarProducto(jTable1);*/
    }//GEN-LAST:event_CierreBotonActionPerformed

    private void verAjustesBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verAjustesBotonActionPerformed
        // TODO add your handling code here:
        InterTabla tablaAjustes = new InterTabla();
        tablaAjustes.setVisible(true);
    }//GEN-LAST:event_verAjustesBotonActionPerformed

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
            java.util.logging.Logger.getLogger(InterPrueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterPrueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterPrueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterPrueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterPrueba().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarProd;
    private javax.swing.JTextField Ajustestxt;
    private javax.swing.JButton CierreBoton;
    private javax.swing.JTextField Codigotxt;
    private javax.swing.JComboBox<String> ComboSt;
    private javax.swing.JComboBox<String> ComboUni;
    private javax.swing.JTextField Costotxt;
    private javax.swing.JTextField Descripciontxt;
    private javax.swing.JTextField Egresostxt;
    private javax.swing.JButton EliminiarProd;
    private javax.swing.JButton ImagenSubir;
    private javax.swing.JTextField Ingresostxt;
    private javax.swing.JTextField Preciotxt;
    private javax.swing.JTextField SaldoFinaltxt;
    private javax.swing.JTextField SaldoInicialtxt;
    private javax.swing.JTextField Saldofisicotxt;
    private javax.swing.JButton UpdateProd;
    private javax.swing.JButton imagMostrar;
    private javax.swing.JLabel imagenLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton verAjustesBoton;
    // End of variables declaration//GEN-END:variables
}

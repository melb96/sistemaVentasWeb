/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.sistemaventasweb.gui;

import com.mycompany.sistemaventasweb.clases.Disco;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author melb
 */
public class GUIPage extends javax.swing.JFrame {

    /**
     * Creates new form GUIPage
     */
    
    DefaultTableModel modelo;
    private List<Disco> listaDiscos;
    private int selectedRow = -1;
    int xMouse, yMouse;
    
    public GUIPage() {
        
        
        initComponents();
        
        rdbGrupo.add(rdbRock);rdbGrupo.add(rdbPop);rdbGrupo.add(rdbTechno);rdbGrupo.add(rdbCumbia);rdbGrupo.add(rdbReggaeton);rdbGrupo.add(rdbOtro);
        
        //Setear titulos de tabla
        String [] titulos = {"Nombre","Interprete","Genero","Precio"};
        modelo = new DefaultTableModel(null,titulos);
        tblDiscos.setModel(modelo);
        
        listaDiscos = new ArrayList<>();
        
        defaultCampos();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rdbGrupo = new javax.swing.ButtonGroup();
        bgPanel = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        btnIrCarrito = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnAgrCarrito = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnForo = new javax.swing.JButton();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        lblRightBg = new javax.swing.JLabel();
        lblInfoDisco = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        btnExit = new javax.swing.JPanel();
        exitTxt = new javax.swing.JLabel();
        btnCerrarSesion = new javax.swing.JPanel();
        lblTxtCerrarSesion = new javax.swing.JLabel();
        lblCerrarSesion = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDiscos = new javax.swing.JTable();
        lblListaDiscos = new javax.swing.JLabel();
        txtNombreDisco = new javax.swing.JTextField();
        txtInterprete = new javax.swing.JTextField();
        rdbRock = new javax.swing.JRadioButton();
        rdbPop = new javax.swing.JRadioButton();
        rdbTechno = new javax.swing.JRadioButton();
        rdbCumbia = new javax.swing.JRadioButton();
        rdbReggaeton = new javax.swing.JRadioButton();
        rdbOtro = new javax.swing.JRadioButton();
        lblElegirGenero = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        txtPrecio = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        lblUser = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        bgPanel.setBackground(new java.awt.Color(255, 255, 255));
        bgPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLogo.setIcon(new javax.swing.ImageIcon("/home/melb/NetBeansProjects/sistemaVentasWeb/src/main/java/com/mycompany/sistemaventasweb/resources/disco3.png")); // NOI18N
        bgPanel.add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 40, -1, -1));

        btnEliminar.setBackground(new java.awt.Color(255, 102, 153));
        btnEliminar.setFont(new java.awt.Font("Roboto Slab", 1, 13)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(0, 0, 0));
        btnEliminar.setIcon(new javax.swing.ImageIcon("/home/melb/NetBeansProjects/sistemaVentasWeb/src/main/java/com/mycompany/sistemaventasweb/resources/iconos/basura.png")); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        bgPanel.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 210, 110, -1));

        btnIrCarrito.setBackground(new java.awt.Color(255, 102, 153));
        btnIrCarrito.setFont(new java.awt.Font("Roboto Slab", 1, 10)); // NOI18N
        btnIrCarrito.setForeground(new java.awt.Color(0, 0, 0));
        btnIrCarrito.setIcon(new javax.swing.ImageIcon("/home/melb/NetBeansProjects/sistemaVentasWeb/src/main/java/com/mycompany/sistemaventasweb/resources/iconos/carrito-de-compras.png")); // NOI18N
        btnIrCarrito.setText("Ir al Carrito");
        btnIrCarrito.setMaximumSize(new java.awt.Dimension(105, 24));
        btnIrCarrito.setMinimumSize(new java.awt.Dimension(105, 24));
        bgPanel.add(btnIrCarrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 210, 110, 30));

        btnAgregar.setBackground(new java.awt.Color(255, 102, 153));
        btnAgregar.setFont(new java.awt.Font("Roboto Slab", 1, 13)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(0, 0, 0));
        btnAgregar.setIcon(new javax.swing.ImageIcon("/home/melb/NetBeansProjects/sistemaVentasWeb/src/main/java/com/mycompany/sistemaventasweb/resources/iconos/mas.png")); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        bgPanel.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 130, 110, -1));

        btnAgrCarrito.setBackground(new java.awt.Color(255, 102, 153));
        btnAgrCarrito.setFont(new java.awt.Font("Roboto Slab", 1, 9)); // NOI18N
        btnAgrCarrito.setForeground(new java.awt.Color(0, 0, 0));
        btnAgrCarrito.setIcon(new javax.swing.ImageIcon("/home/melb/NetBeansProjects/sistemaVentasWeb/src/main/java/com/mycompany/sistemaventasweb/resources/iconos/carrito-de-compra-anadir.png")); // NOI18N
        btnAgrCarrito.setText("CD al Carrito");
        bgPanel.add(btnAgrCarrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 130, 110, 30));

        btnModificar.setBackground(new java.awt.Color(255, 102, 153));
        btnModificar.setFont(new java.awt.Font("Roboto Slab", 1, 12)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(0, 0, 0));
        btnModificar.setIcon(new javax.swing.ImageIcon("/home/melb/NetBeansProjects/sistemaVentasWeb/src/main/java/com/mycompany/sistemaventasweb/resources/iconos/lapiz.png")); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        bgPanel.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 170, 110, -1));

        btnForo.setBackground(new java.awt.Color(255, 102, 153));
        btnForo.setFont(new java.awt.Font("Roboto Slab", 1, 13)); // NOI18N
        btnForo.setForeground(new java.awt.Color(0, 0, 0));
        btnForo.setIcon(new javax.swing.ImageIcon("/home/melb/NetBeansProjects/sistemaVentasWeb/src/main/java/com/mycompany/sistemaventasweb/resources/iconos/usuarios-alt.png")); // NOI18N
        btnForo.setText("Ir al foro");
        btnForo.setMaximumSize(new java.awt.Dimension(105, 24));
        btnForo.setMinimumSize(new java.awt.Dimension(105, 24));
        bgPanel.add(btnForo, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 170, 110, -1));

        btnAceptar.setBackground(new java.awt.Color(255, 102, 153));
        btnAceptar.setFont(new java.awt.Font("Roboto Slab", 1, 13)); // NOI18N
        btnAceptar.setForeground(new java.awt.Color(0, 0, 0));
        btnAceptar.setIcon(new javax.swing.ImageIcon("/home/melb/NetBeansProjects/sistemaVentasWeb/src/main/java/com/mycompany/sistemaventasweb/resources/iconos/controlar.png")); // NOI18N
        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        bgPanel.add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 410, 110, -1));

        btnCancelar.setBackground(new java.awt.Color(255, 102, 153));
        btnCancelar.setFont(new java.awt.Font("Roboto Slab", 1, 13)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(0, 0, 0));
        btnCancelar.setIcon(new javax.swing.ImageIcon("/home/melb/NetBeansProjects/sistemaVentasWeb/src/main/java/com/mycompany/sistemaventasweb/resources/iconos/cruz.png")); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        bgPanel.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 450, 110, -1));

        lblRightBg.setIcon(new javax.swing.ImageIcon("/home/melb/NetBeansProjects/sistemaVentasWeb/src/main/java/com/mycompany/sistemaventasweb/resources/bgImagen.jpg")); // NOI18N
        lblRightBg.setText("jLabel1");
        bgPanel.add(lblRightBg, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 0, 140, 500));

        lblInfoDisco.setFont(new java.awt.Font("Roboto Slab", 1, 18)); // NOI18N
        lblInfoDisco.setForeground(new java.awt.Color(255, 102, 153));
        lblInfoDisco.setText("INFORMACION DISCO");
        bgPanel.add(lblInfoDisco, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        header.setBackground(new java.awt.Color(255, 255, 255));
        header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerMouseDragged(evt);
            }
        });
        header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerMousePressed(evt);
            }
        });

        btnExit.setBackground(new java.awt.Color(255, 255, 255));

        exitTxt.setFont(new java.awt.Font("FreeMono", 1, 24)); // NOI18N
        exitTxt.setForeground(new java.awt.Color(255, 102, 153));
        exitTxt.setText("X");
        exitTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnExitLayout = new javax.swing.GroupLayout(btnExit);
        btnExit.setLayout(btnExitLayout);
        btnExitLayout.setHorizontalGroup(
            btnExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnExitLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(exitTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(16, 16, 16))
        );
        btnExitLayout.setVerticalGroup(
            btnExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnExitLayout.createSequentialGroup()
                .addComponent(exitTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        btnCerrarSesion.setBackground(new java.awt.Color(255, 255, 255));
        btnCerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCerrarSesionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCerrarSesionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCerrarSesionMouseExited(evt);
            }
        });

        lblTxtCerrarSesion.setFont(new java.awt.Font("Roboto Slab", 1, 10)); // NOI18N
        lblTxtCerrarSesion.setForeground(new java.awt.Color(255, 102, 153));
        lblTxtCerrarSesion.setText("LogOut");

        lblCerrarSesion.setIcon(new javax.swing.ImageIcon("/home/melb/NetBeansProjects/sistemaVentasWeb/src/main/java/com/mycompany/sistemaventasweb/resources/iconos/salida.png")); // NOI18N

        javax.swing.GroupLayout btnCerrarSesionLayout = new javax.swing.GroupLayout(btnCerrarSesion);
        btnCerrarSesion.setLayout(btnCerrarSesionLayout);
        btnCerrarSesionLayout.setHorizontalGroup(
            btnCerrarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnCerrarSesionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTxtCerrarSesion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCerrarSesion)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnCerrarSesionLayout.setVerticalGroup(
            btnCerrarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnCerrarSesionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btnCerrarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(btnCerrarSesionLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(lblTxtCerrarSesion)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 543, Short.MAX_VALUE)
                .addComponent(btnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(144, 144, 144))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        bgPanel.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 40));

        tblDiscos.setBackground(new java.awt.Color(255, 255, 255));
        tblDiscos.setFont(new java.awt.Font("Roboto Slab", 1, 14)); // NOI18N
        tblDiscos.setForeground(new java.awt.Color(255, 102, 153));
        tblDiscos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblDiscos.setToolTipText("");
        tblDiscos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDiscosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDiscos);

        bgPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 640, 250));

        lblListaDiscos.setFont(new java.awt.Font("Roboto Slab", 1, 18)); // NOI18N
        lblListaDiscos.setForeground(new java.awt.Color(255, 102, 153));
        lblListaDiscos.setText("LISTA DE DISCOS");
        bgPanel.add(lblListaDiscos, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, -1, -1));

        txtNombreDisco.setBackground(new java.awt.Color(255, 255, 255));
        txtNombreDisco.setFont(new java.awt.Font("Roboto Slab", 1, 13)); // NOI18N
        txtNombreDisco.setForeground(new java.awt.Color(204, 204, 204));
        txtNombreDisco.setText("Ingrese nombre de disco");
        txtNombreDisco.setBorder(null);
        txtNombreDisco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtNombreDiscoMousePressed(evt);
            }
        });
        bgPanel.add(txtNombreDisco, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 180, 20));

        txtInterprete.setBackground(new java.awt.Color(255, 255, 255));
        txtInterprete.setFont(new java.awt.Font("Roboto Slab", 1, 13)); // NOI18N
        txtInterprete.setForeground(new java.awt.Color(204, 204, 204));
        txtInterprete.setText("Ingrese interprete de disco");
        txtInterprete.setBorder(null);
        txtInterprete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtInterpreteMousePressed(evt);
            }
        });
        bgPanel.add(txtInterprete, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 180, -1));

        rdbRock.setText("Rock");
        bgPanel.add(rdbRock, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        rdbPop.setText("Pop");
        bgPanel.add(rdbPop, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, -1, -1));

        rdbTechno.setText("Techno");
        bgPanel.add(rdbTechno, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, -1, -1));

        rdbCumbia.setText("Cumbia");
        bgPanel.add(rdbCumbia, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, -1, -1));

        rdbReggaeton.setText("Reggaeton");
        bgPanel.add(rdbReggaeton, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, -1, -1));

        rdbOtro.setText("Otro");
        bgPanel.add(rdbOtro, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, -1, -1));

        lblElegirGenero.setFont(new java.awt.Font("Roboto Slab", 1, 14)); // NOI18N
        lblElegirGenero.setForeground(new java.awt.Color(255, 102, 153));
        lblElegirGenero.setText("Seleccionar genero:");
        bgPanel.add(lblElegirGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));
        bgPanel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 180, 20));
        bgPanel.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 180, 20));

        txtPrecio.setBackground(new java.awt.Color(255, 255, 255));
        txtPrecio.setFont(new java.awt.Font("Roboto Slab", 1, 13)); // NOI18N
        txtPrecio.setForeground(new java.awt.Color(204, 204, 204));
        txtPrecio.setText("Ingrese el precio del disco");
        txtPrecio.setBorder(null);
        txtPrecio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtPrecioMousePressed(evt);
            }
        });
        bgPanel.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));
        bgPanel.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 180, 20));

        lblUser.setFont(new java.awt.Font("Roboto Black", 1, 13)); // NOI18N
        lblUser.setForeground(new java.awt.Color(255, 102, 153));
        lblUser.setIcon(new javax.swing.ImageIcon("/home/melb/NetBeansProjects/sistemaVentasWeb/src/main/java/com/mycompany/sistemaventasweb/resources/iconos/usuario.png")); // NOI18N
        lblUser.setText("Bienvenido!");
        bgPanel.add(lblUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 60, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Metodo para recuperar datos de interface
    
    public Disco recuperarDatosGUI(){
        
        Disco objDisco = new Disco();
        
        double precio = (txtPrecio.getText().isEmpty()) ?0: Double.parseDouble(txtPrecio.getText());
        
        objDisco.setTitulo(txtNombreDisco.getText());
        objDisco.setInterprete(txtInterprete.getText());
        
        if (rdbRock.isSelected()) {
            objDisco.setGenero("Rock");
        }else if (rdbPop.isSelected()) {
            objDisco.setGenero("Pop");
        }else if (rdbTechno.isSelected()) {
            objDisco.setGenero("Techno");
        }else if(rdbCumbia.isSelected()){
            objDisco.setGenero("Cumbia");
        }else if(rdbReggaeton.isSelected()){
            objDisco.setGenero("Reggaeton");
        }else objDisco.setGenero("Otro");
        
        objDisco.setPrecio(precio);
        
        return objDisco;
        
    }
    
    //Metodo default campos
    
    public void defaultCampos(){
        
        btnAgregar.setEnabled(true);
        btnModificar.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnAceptar.setEnabled(false);
        btnCancelar.setEnabled(false);
        txtNombreDisco.setEditable(false);
        txtInterprete.setEditable(false);
        txtPrecio.setEditable(false);
        if (rdbRock.isSelected()) {
           rdbRock.setSelected(false);
        }else if (rdbPop.isSelected()) {
            rdbPop.setSelected(false);
        }else if (rdbTechno.isSelected()) {
            rdbTechno.setSelected(false);
        }else if(rdbCumbia.isSelected()){
            rdbCumbia.setSelected(false);
        }else if(rdbReggaeton.isSelected()){
            rdbReggaeton.setSelected(false);
        }else if (rdbOtro.isSelected()) {
            rdbOtro.setSelected(false);
        }
        rdbRock.setEnabled(false);rdbPop.setEnabled(false);rdbTechno.setEnabled(false);rdbCumbia.setEnabled(false);rdbReggaeton.setEnabled(false);rdbOtro.setEnabled(false);
    }
    
    //Metodo para mostrar botones segun tipo de usuario
    
    public void mostrarBotonesAdmin(){
        btnAgregar.setVisible(true);
        btnModificar.setVisible(true);
        btnEliminar.setVisible(true);
        btnAceptar.setVisible(true);
        btnCancelar.setVisible(true);
        btnAgrCarrito.setVisible(false);
        btnForo.setVisible(false);
        btnIrCarrito.setVisible(false);
    }
    
    public void mostrarBotonesUser(){
        btnAgregar.setVisible(false);
        btnModificar.setVisible(false);
        btnEliminar.setVisible(false);
        btnAceptar.setVisible(false);
        btnCancelar.setVisible(false);
        btnAgrCarrito.setVisible(true);    
        btnForo.setVisible(true);
        btnIrCarrito.setVisible(true);
    }


    //Metodo agregar Datos
    
    public void agregarDatos(){
        
    Disco objDisco = recuperarDatosGUI();
        
    if (listaDiscos != null && modelo != null) {
        listaDiscos.add(objDisco);
        modelo.addRow(new Object[]{objDisco.getTitulo(), objDisco.getInterprete(), objDisco.getGenero(), objDisco.getPrecio()});
    } else {
        System.err.println("Error: listaDiscos o modelo no está inicializado.");
    }  

    }
    
    //Metodo modificar Datos
    
    public void modificarDatos(){
        
            if (selectedRow != -1) {
            
            Disco objDisco = recuperarDatosGUI();
            
            listaDiscos.set(selectedRow, objDisco);
            modelo.setValueAt(objDisco.getTitulo(), selectedRow, 0);
            modelo.setValueAt(objDisco.getInterprete(), selectedRow, 1);
            modelo.setValueAt(objDisco.getGenero(), selectedRow, 2);
            modelo.setValueAt(objDisco.getPrecio(), selectedRow, 3);
            limpiarCampos();
            defaultCampos();
            selectedRow = -1;
        } else {
            JOptionPane.showMessageDialog(rootPane, "Seleccione un disco para modificar", "Error", JOptionPane.ERROR_MESSAGE);
        }  
        
    }

    //Metodo eliminar Datos
    
    public void eliminarDatos(){
        
     if (selectedRow != -1) {
         
            listaDiscos.remove(selectedRow);
            modelo.removeRow(selectedRow);
            limpiarCampos();
            selectedRow = -1;
        } else {
            JOptionPane.showMessageDialog(rootPane, "Seleccione un disco para eliminar", "Error", JOptionPane.ERROR_MESSAGE);
        }       
        
    }

    //Metodo limpiar campos
    
    public void limpiarCampos(){
        
        txtNombreDisco.setText("");
        txtInterprete.setText("");
        txtPrecio.setText("");
        defaultFieldNombre();
        defaultFieldInterprete();
        defaultFieldPrecio();
        defaultCampos();
        
    }
    
    //Metodo text field Nombre
    
    public void defaultFieldNombre(){
        if(txtNombreDisco.getText().equals("Ingrese nombre de disco")){
            txtNombreDisco.setText("");
            txtNombreDisco.setForeground(Color.black);
        }
        if(txtInterprete.getText().isEmpty()) {
            txtInterprete.setText("Ingrese interprete de disco");
            txtInterprete.setForeground(new Color (204,204,204));
        }
        if(txtPrecio.getText().isEmpty()){
            txtPrecio.setText("Ingrese el precio del disco");
            txtPrecio.setForeground(new Color (204,204,204));           
        }    
    }
    
    //Metodo text field Interprete
    
    public void defaultFieldInterprete(){
        
        if(txtInterprete.getText().equals("Ingrese interprete de disco")){
            txtInterprete.setText("");
            txtInterprete.setForeground(Color.black);
        }
        if(txtNombreDisco.getText().isEmpty()) {
            txtNombreDisco.setText("Ingrese nombre de disco");
            txtNombreDisco.setForeground(new Color (204,204,204));
        }
        if(txtPrecio.getText().isEmpty()){
            txtPrecio.setText("Ingrese el precio del disco");
            txtPrecio.setForeground(new Color (204,204,204));           
        }
        
    }
    
    //Metodo text field Precio
    
    public void defaultFieldPrecio(){
        
        if(txtPrecio.getText().equals("Ingrese el precio del disco")){
            txtPrecio.setText("");
            txtPrecio.setForeground(Color.black);
        }
        if(txtNombreDisco.getText().isEmpty()) {
            txtNombreDisco.setText("Ingrese nombre de disco");
            txtNombreDisco.setForeground(new Color (204,204,204));
        }
        if(txtInterprete.getText().isEmpty()){
            txtInterprete.setText("Ingrese interprete de disco");
            txtInterprete.setForeground(new Color (204,204,204));           
        }
        
    }
    
    //Metodos para mostrar mensaje de bienvenida a admin y user
    
    public void definirUsuarioAdmin(){
        
        lblUser.setText("¡Bienvenido Admin!");
        
    }
    
    public void definirUsuarioComun(){
        
        lblUser.setText("¡Bienvenido User!");
        
    }

    //Boton salir
    
    private void exitTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitTxtMouseClicked

    private void exitTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseEntered
        btnExit.setBackground(Color.red);
        exitTxt.setForeground(Color.white);
    }//GEN-LAST:event_exitTxtMouseEntered

    private void exitTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseExited
        btnExit.setBackground(Color.white);
        exitTxt.setForeground(new Color(255, 102, 153));
    }//GEN-LAST:event_exitTxtMouseExited

    //Header - movimientos
    
    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse,y - yMouse);
    }//GEN-LAST:event_headerMouseDragged

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headerMousePressed

    //Text fields - para que muestre la leyenda ingresada y limpie al setear
    
    private void txtNombreDiscoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreDiscoMousePressed
        defaultFieldNombre();
    }//GEN-LAST:event_txtNombreDiscoMousePressed

    private void txtInterpreteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtInterpreteMousePressed
        defaultFieldInterprete();
    }//GEN-LAST:event_txtInterpreteMousePressed

    private void txtPrecioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPrecioMousePressed
        defaultFieldPrecio();
    }//GEN-LAST:event_txtPrecioMousePressed

    //Boton Agregar
    
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
    
        txtNombreDisco.setEditable(true);
        txtInterprete.setEditable(true);
        txtPrecio.setEditable(true);
        btnAceptar.setEnabled(true);
        btnCancelar.setEnabled(true);
        rdbRock.setEnabled(true);rdbPop.setEnabled(true);rdbTechno.setEnabled(true);rdbCumbia.setEnabled(true);rdbReggaeton.setEnabled(true);rdbOtro.setEnabled(true);
        
    }//GEN-LAST:event_btnAgregarActionPerformed

    //Boton aceptar
    
    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        if(btnAgregar.isEnabled()){
        agregarDatos();}
        else if (btnModificar.isEnabled()){
            modificarDatos();
        }
        defaultCampos();
    }//GEN-LAST:event_btnAceptarActionPerformed

    //Boton cancelar
    
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_btnCancelarActionPerformed

    //Metodo para tomar datos de lista y cargarlos en los campos
    
    private void tblDiscosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDiscosMouseClicked
        
        if(evt.getClickCount() == 1){
          
         JTable receptor = (JTable)evt.getSource();
         selectedRow = receptor.getSelectedRow();
         
         txtNombreDisco.setText(receptor.getModel().getValueAt(selectedRow, 0).toString());
         txtNombreDisco.setForeground(Color.black);
         txtInterprete.setText(receptor.getModel().getValueAt(selectedRow, 1).toString());
         txtInterprete.setForeground(Color.black);
         
         if(receptor.getModel().getValueAt(receptor.getSelectedRow(), 2).toString().equals("Rock")){
           rdbRock.setSelected(true);
         }else if(receptor.getModel().getValueAt(receptor.getSelectedRow(), 2).toString().equals("Pop")){
           rdbPop.setSelected(true);
         }else if(receptor.getModel().getValueAt(receptor.getSelectedRow(), 2).toString().equals("Techno")){
           rdbTechno.setSelected(true);
         }else if(receptor.getModel().getValueAt(receptor.getSelectedRow(), 2).toString().equals("Cumbia")){
           rdbCumbia.setSelected(true);
         }else if(receptor.getModel().getValueAt(receptor.getSelectedRow(), 2).toString().equals("Reggaeton")){
           rdbReggaeton.setSelected(true);
         }else if(receptor.getModel().getValueAt(receptor.getSelectedRow(), 2).toString().equals("Otro")){
           rdbOtro.setSelected(true);
         }
        
         txtPrecio.setText(receptor.getModel().getValueAt(selectedRow, 3).toString());
         txtPrecio.setForeground(Color.black);
         
         btnModificar.setEnabled(true);
         btnEliminar.setEnabled(true);
         btnAgregar.setEnabled(false);
         btnCancelar.setEnabled(true);
        
        }
        
    }//GEN-LAST:event_tblDiscosMouseClicked

    //Boton modificar
    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        txtNombreDisco.setEditable(true);
        txtInterprete.setEditable(true);
        txtPrecio.setEditable(true);
        btnAceptar.setEnabled(true);
        btnCancelar.setEnabled(true);
        rdbRock.setEnabled(true);rdbPop.setEnabled(true);rdbTechno.setEnabled(true);rdbCumbia.setEnabled(true);rdbReggaeton.setEnabled(true);rdbOtro.setEnabled(true);
    }//GEN-LAST:event_btnModificarActionPerformed

    //Boton eliminar
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        eliminarDatos();
    }//GEN-LAST:event_btnEliminarActionPerformed

    //Boton cerrar sesion
    private void btnCerrarSesionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarSesionMouseEntered
        btnCerrarSesion.setBackground(Color.red);
        lblTxtCerrarSesion.setForeground(Color.white);
    }//GEN-LAST:event_btnCerrarSesionMouseEntered

    private void btnCerrarSesionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarSesionMouseExited
        btnCerrarSesion.setBackground(Color.white);
        lblTxtCerrarSesion.setForeground(new Color(255, 102, 153));
    }//GEN-LAST:event_btnCerrarSesionMouseExited

    private void btnCerrarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarSesionMouseClicked
        this.setVisible(false);
        GUILogIn iLogIn = new GUILogIn();
        iLogIn.setVisible(true);
    }//GEN-LAST:event_btnCerrarSesionMouseClicked

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
            java.util.logging.Logger.getLogger(GUIPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIPage().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bgPanel;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnAgrCarrito;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JPanel btnCerrarSesion;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JPanel btnExit;
    private javax.swing.JButton btnForo;
    private javax.swing.JButton btnIrCarrito;
    private javax.swing.JButton btnModificar;
    private javax.swing.JLabel exitTxt;
    private javax.swing.JPanel header;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblCerrarSesion;
    private javax.swing.JLabel lblElegirGenero;
    private javax.swing.JLabel lblInfoDisco;
    private javax.swing.JLabel lblListaDiscos;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblRightBg;
    private javax.swing.JLabel lblTxtCerrarSesion;
    private javax.swing.JLabel lblUser;
    private javax.swing.JRadioButton rdbCumbia;
    private javax.swing.ButtonGroup rdbGrupo;
    private javax.swing.JRadioButton rdbOtro;
    private javax.swing.JRadioButton rdbPop;
    private javax.swing.JRadioButton rdbReggaeton;
    private javax.swing.JRadioButton rdbRock;
    private javax.swing.JRadioButton rdbTechno;
    private javax.swing.JTable tblDiscos;
    private javax.swing.JTextField txtInterprete;
    private javax.swing.JTextField txtNombreDisco;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}

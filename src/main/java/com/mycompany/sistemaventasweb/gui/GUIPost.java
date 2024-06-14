/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.sistemaventasweb.gui;

import com.mycompany.sistemaventasweb.clases.Post;
import java.awt.Color;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author melb
 */
public class GUIPost extends javax.swing.JFrame {

    /**
     * Creates new form GUIForo
     */
    
    int xMouse, yMouse;
    private List<Post> listaPosts;
    DefaultTableModel modelo;
    private int selectedRow = -1;
    GUIPage iPage = new GUIPage();
    
    public GUIPost() {
        initComponents();
        
        //Setear titulos de tabla
        String [] titulos = {"Titulo","Autor","Disco","Contenido"};
        modelo = new DefaultTableModel(null,titulos);
        tblPosts.setModel(modelo);
        
        listaPosts = new ArrayList<>();
        
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

        bgPanel = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnPublicar = new javax.swing.JButton();
        btnForo = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        lblRightBg = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        btnExit = new javax.swing.JPanel();
        exitTxt = new javax.swing.JLabel();
        btnCerrarSesion = new javax.swing.JPanel();
        lblTxtCerrarSesion = new javax.swing.JLabel();
        lblCerrarSesion = new javax.swing.JLabel();
        btnHome = new javax.swing.JPanel();
        lblHome = new javax.swing.JLabel();
        lblTituloPost = new javax.swing.JLabel();
        lblNuevoPost1 = new javax.swing.JLabel();
        lblNuevoPost = new javax.swing.JLabel();
        txtTituloPost = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        txtAutorPost = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        txtDiscoPost = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaPost = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPosts = new javax.swing.JTable();
        lblListaPosts = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        bgPanel.setBackground(new java.awt.Color(255, 255, 255));
        bgPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLogo.setIcon(new javax.swing.ImageIcon("/home/melb/NetBeansProjects/sistemaVentasWeb/src/main/java/com/mycompany/sistemaventasweb/resources/disco3.png")); // NOI18N
        bgPanel.add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 40, -1, -1));

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
        bgPanel.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 260, 110, -1));

        btnPublicar.setBackground(new java.awt.Color(255, 102, 153));
        btnPublicar.setFont(new java.awt.Font("Roboto Slab", 1, 13)); // NOI18N
        btnPublicar.setForeground(new java.awt.Color(0, 0, 0));
        btnPublicar.setIcon(new javax.swing.ImageIcon("/home/melb/NetBeansProjects/sistemaVentasWeb/src/main/java/com/mycompany/sistemaventasweb/resources/iconos/controlar.png")); // NOI18N
        btnPublicar.setText("Publicar");
        btnPublicar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPublicarMouseClicked(evt);
            }
        });
        bgPanel.add(btnPublicar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 220, 110, -1));

        btnForo.setBackground(new java.awt.Color(255, 102, 153));
        btnForo.setFont(new java.awt.Font("Roboto Slab", 1, 13)); // NOI18N
        btnForo.setForeground(new java.awt.Color(0, 0, 0));
        btnForo.setIcon(new javax.swing.ImageIcon("/home/melb/NetBeansProjects/sistemaVentasWeb/src/main/java/com/mycompany/sistemaventasweb/resources/iconos/usuarios-alt.png")); // NOI18N
        btnForo.setText("Ir al foro");
        btnForo.setMaximumSize(new java.awt.Dimension(105, 24));
        btnForo.setMinimumSize(new java.awt.Dimension(105, 24));
        btnForo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnForoActionPerformed(evt);
            }
        });
        bgPanel.add(btnForo, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 170, 110, -1));

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

        lblRightBg.setIcon(new javax.swing.ImageIcon("/home/melb/NetBeansProjects/sistemaVentasWeb/src/main/java/com/mycompany/sistemaventasweb/resources/bgImagen.jpg")); // NOI18N
        lblRightBg.setText("jLabel1");
        bgPanel.add(lblRightBg, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 0, 140, 500));

        lblUser.setFont(new java.awt.Font("Roboto Black", 1, 13)); // NOI18N
        lblUser.setForeground(new java.awt.Color(255, 102, 153));
        lblUser.setIcon(new javax.swing.ImageIcon("/home/melb/NetBeansProjects/sistemaVentasWeb/src/main/java/com/mycompany/sistemaventasweb/resources/iconos/usuario.png")); // NOI18N
        lblUser.setText("Bienvenido!");
        bgPanel.add(lblUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 60, -1, -1));

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

        btnHome.setBackground(new java.awt.Color(255, 255, 255));
        btnHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHomeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnHomeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnHomeMouseExited(evt);
            }
        });

        lblHome.setIcon(new javax.swing.ImageIcon("/home/melb/NetBeansProjects/sistemaVentasWeb/src/main/java/com/mycompany/sistemaventasweb/resources/iconos/hogar.png")); // NOI18N

        javax.swing.GroupLayout btnHomeLayout = new javax.swing.GroupLayout(btnHome);
        btnHome.setLayout(btnHomeLayout);
        btnHomeLayout.setHorizontalGroup(
            btnHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 37, Short.MAX_VALUE)
            .addGroup(btnHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnHomeLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lblHome)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        btnHomeLayout.setVerticalGroup(
            btnHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(btnHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnHomeLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lblHome)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 500, Short.MAX_VALUE)
                .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(144, 144, 144))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCerrarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        bgPanel.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 40));

        lblTituloPost.setFont(new java.awt.Font("Roboto Slab", 1, 24)); // NOI18N
        lblTituloPost.setForeground(new java.awt.Color(255, 102, 153));
        lblTituloPost.setText("¡POSTEA TU OPINION!");
        bgPanel.add(lblTituloPost, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, -1, -1));

        lblNuevoPost1.setFont(new java.awt.Font("Roboto Slab", 1, 14)); // NOI18N
        lblNuevoPost1.setForeground(new java.awt.Color(255, 102, 153));
        lblNuevoPost1.setText("Escribe tu opinion:");
        bgPanel.add(lblNuevoPost1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, -1, -1));

        lblNuevoPost.setFont(new java.awt.Font("Roboto Slab", 1, 18)); // NOI18N
        lblNuevoPost.setForeground(new java.awt.Color(255, 102, 153));
        lblNuevoPost.setText("Nuevo Post");
        bgPanel.add(lblNuevoPost, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, -1));

        txtTituloPost.setBackground(new java.awt.Color(255, 255, 255));
        txtTituloPost.setFont(new java.awt.Font("Roboto Slab", 1, 13)); // NOI18N
        txtTituloPost.setForeground(new java.awt.Color(204, 204, 204));
        txtTituloPost.setText("Ingrese titulo del post");
        txtTituloPost.setBorder(null);
        txtTituloPost.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtTituloPostMouseClicked(evt);
            }
        });
        bgPanel.add(txtTituloPost, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 180, 20));
        bgPanel.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 180, 20));

        txtAutorPost.setBackground(new java.awt.Color(255, 255, 255));
        txtAutorPost.setFont(new java.awt.Font("Roboto Slab", 1, 13)); // NOI18N
        txtAutorPost.setForeground(new java.awt.Color(204, 204, 204));
        txtAutorPost.setText("Ingrese nombre del autor");
        txtAutorPost.setBorder(null);
        txtAutorPost.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtAutorPostMouseClicked(evt);
            }
        });
        bgPanel.add(txtAutorPost, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 180, -1));
        bgPanel.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 180, 20));

        txtDiscoPost.setBackground(new java.awt.Color(255, 255, 255));
        txtDiscoPost.setFont(new java.awt.Font("Roboto Slab", 1, 13)); // NOI18N
        txtDiscoPost.setForeground(new java.awt.Color(204, 204, 204));
        txtDiscoPost.setText("Ingrese nombre del disco");
        txtDiscoPost.setBorder(null);
        txtDiscoPost.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtDiscoPostMouseClicked(evt);
            }
        });
        bgPanel.add(txtDiscoPost, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 180, -1));
        bgPanel.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 180, 20));

        txtAreaPost.setBackground(new java.awt.Color(255, 255, 255));
        txtAreaPost.setColumns(20);
        txtAreaPost.setForeground(new java.awt.Color(255, 102, 153));
        txtAreaPost.setRows(5);
        txtAreaPost.setBorder(null);
        jScrollPane1.setViewportView(txtAreaPost);

        bgPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 360, 110));

        tblPosts.setBackground(new java.awt.Color(255, 255, 255));
        tblPosts.setFont(new java.awt.Font("Roboto Slab", 1, 14)); // NOI18N
        tblPosts.setForeground(new java.awt.Color(255, 102, 153));
        tblPosts.setModel(new javax.swing.table.DefaultTableModel(
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
        tblPosts.setToolTipText("");
        tblPosts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPostsMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblPosts);

        bgPanel.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 610, 200));

        lblListaPosts.setFont(new java.awt.Font("Roboto Slab", 1, 18)); // NOI18N
        lblListaPosts.setForeground(new java.awt.Color(255, 102, 153));
        lblListaPosts.setText("LISTA DE POSTS");
        bgPanel.add(lblListaPosts, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, -1, -1));

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

    //Seteamos campos por defecto
    public void defaultCampos(){
        
        btnAgregar.setEnabled(true);
        btnForo.setEnabled(true);
        btnPublicar.setEnabled(false);
        btnCancelar.setEnabled(false);
        txtTituloPost.setEditable(false);
        txtAutorPost.setEditable(false);
        txtDiscoPost.setEditable(false);
        txtAreaPost.setEditable(false);
        
    }
    
    //Definimos el mensaje de bienvenida, dependiendo tipo de usuario
    public void definirUsuarioComun(){
        
        lblUser.setText("¡Bienvenido User!");
        
    }   
    
    //Metodo text field Titulo
    
    public void defaultFieldTitulo(){
        if(txtTituloPost.getText().equals("Ingrese titulo del post")){
            txtTituloPost.setText("");
            txtTituloPost.setForeground(Color.black);
        }
        if(txtAutorPost.getText().isEmpty()) {
            txtAutorPost.setText("Ingrese nombre del autor");
            txtAutorPost.setForeground(new Color (204,204,204));
        }
        if(txtDiscoPost.getText().isEmpty()){
            txtDiscoPost.setText("Ingrese nombre del disco");
            txtDiscoPost.setForeground(new Color (204,204,204));           
        }    
    }
    
    //Metodo text field Autor
    
    public void defaultFieldAutor(){
        
        if(txtAutorPost.getText().equals("Ingrese nombre del autor")){
            txtAutorPost.setText("");
            txtAutorPost.setForeground(Color.black);
        }
        if(txtDiscoPost.getText().isEmpty()) {
            txtDiscoPost.setText("Ingrese nombre del disco");
            txtDiscoPost.setForeground(new Color (204,204,204));
        }
        if(txtTituloPost.getText().isEmpty()){
            txtTituloPost.setText("Ingrese titulo del post");
            txtTituloPost.setForeground(new Color (204,204,204));           
        }
        
    }
    
    //Metodo text field Precio
    
    public void defaultFieldDisco(){
        
        if(txtDiscoPost.getText().equals("Ingrese nombre del disco")){
            txtDiscoPost.setText("");
            txtDiscoPost.setForeground(Color.black);
        }
        if(txtAutorPost.getText().isEmpty()) {
            txtAutorPost.setText("Ingrese nombre del autor");
            txtAutorPost.setForeground(new Color (204,204,204));
        }
        if(txtTituloPost.getText().isEmpty()){
            txtTituloPost.setText("Ingrese titulo del post");
            txtTituloPost.setForeground(new Color (204,204,204));           
        }
        
    }
    
    //Metodo limpiar campos
    
    public void limpiarCampos(){
        
        txtTituloPost.setText("");
        txtAreaPost.setText("");
        txtAutorPost.setText("");
        txtDiscoPost.setText("");
        defaultFieldTitulo();
        defaultFieldAutor();
        defaultFieldDisco();
        defaultCampos();
        
    }
    
    //Tomamos los datos ingresados en la interface
    public Post recuperarDatosGUI(){
        
        String titulo = txtTituloPost.getText();
        String autor = txtAutorPost.getText();
        String discoPost = txtDiscoPost.getText();
        String contenido = txtAreaPost.getText();
        
        return new Post(titulo, autor, discoPost, contenido);
        
    }
    
     public List<Post> getPosts() {
        return listaPosts;
    }
    
     //metodo para crear Post
    public void agregarPost(){
       
        Post objPost = recuperarDatosGUI();
               
        if (listaPosts != null && modelo != null) {
        listaPosts.add(objPost);
        modelo.addRow(new Object[]{objPost.getTitulo(), objPost.getAutor(), objPost.getDiscoPost(), objPost.getContenido()});
        guardarDatosEnArchivo();
    } else {
        System.err.println("Error: listaDiscos o modelo no está inicializado.");
    } 
        
    }
  
    //Metodo para cargar los datos en la tabla, usamos metodo para cargar los datos desde el archivo .dat
    
    public void cargarDatos(){
        
        cargarDatosDesdeArchivo();
        modelo.setRowCount(0); // Limpiar tabla
        for (Post post : listaPosts) {
            modelo.addRow(new Object[]{post.getTitulo(), post.getAutor(), post.getDiscoPost(), post.getContenido()});
        }
        
    }
    
    //Metodo para guardar y cargar los datos en el archivo.dat
    
    public void guardarDatosEnArchivo() {
    
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("posts.dat"))) {
        oos.writeObject(listaPosts);
        }catch (IOException e) {
        e.printStackTrace();
    
        }
    
    }
    
    public void cargarDatosDesdeArchivo() {
    
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("posts.dat"))) {
        listaPosts = (List<Post>) ois.readObject();
    } catch (IOException | ClassNotFoundException e) {
        e.printStackTrace();
    }
}
  
    
    private void exitTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseClicked
        guardarDatosEnArchivo();
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

    private void btnCerrarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarSesionMouseClicked
        this.setVisible(false);
        guardarDatosEnArchivo();
        GUILogIn iLogIn = new GUILogIn();
        iLogIn.setVisible(true);
    }//GEN-LAST:event_btnCerrarSesionMouseClicked

    private void btnCerrarSesionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarSesionMouseEntered
        btnCerrarSesion.setBackground(Color.red);
        lblTxtCerrarSesion.setForeground(Color.white);
    }//GEN-LAST:event_btnCerrarSesionMouseEntered

    private void btnCerrarSesionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarSesionMouseExited
        btnCerrarSesion.setBackground(Color.white);
        lblTxtCerrarSesion.setForeground(new Color(255, 102, 153));
    }//GEN-LAST:event_btnCerrarSesionMouseExited

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse,y - yMouse);
    }//GEN-LAST:event_headerMouseDragged

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headerMousePressed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed

        limpiarCampos();
        defaultCampos();
        
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed

        btnPublicar.setEnabled(true);
        btnCancelar.setEnabled(true);
        btnForo.setEnabled(false);
        txtTituloPost.setEditable(true);
        txtAutorPost.setEditable(true);
        txtDiscoPost.setEditable(true);
        txtAreaPost.setEditable(true);
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnForoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnForoActionPerformed
        this.setVisible(false);
        GUIForo iForo = new GUIForo();
        iForo.setVisible(true);
        iForo.definirUsuarioComun();
        guardarDatosEnArchivo();
        cargarDatos();
    }//GEN-LAST:event_btnForoActionPerformed

    private void txtTituloPostMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTituloPostMouseClicked
       defaultFieldTitulo();
    }//GEN-LAST:event_txtTituloPostMouseClicked

    private void txtAutorPostMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAutorPostMouseClicked
        defaultFieldAutor();
    }//GEN-LAST:event_txtAutorPostMouseClicked

    private void txtDiscoPostMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDiscoPostMouseClicked
        defaultFieldDisco();
    }//GEN-LAST:event_txtDiscoPostMouseClicked

    private void tblPostsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPostsMouseClicked

        if(evt.getClickCount() == 1){

            JTable receptor = (JTable)evt.getSource();
            selectedRow = receptor.getSelectedRow();

            txtTituloPost.setText(receptor.getModel().getValueAt(selectedRow, 0).toString());
            txtTituloPost.setForeground(Color.black);
            txtAutorPost.setText(receptor.getModel().getValueAt(selectedRow, 1).toString());
            txtAutorPost.setForeground(Color.black);
            txtDiscoPost.setText(receptor.getModel().getValueAt(selectedRow, 2).toString());
            txtDiscoPost.setForeground(Color.black);
            txtAreaPost.setText(receptor.getModel().getValueAt(selectedRow, 3).toString());
            txtDiscoPost.setForeground(Color.black);
            
            btnAgregar.setEnabled(false);
            btnCancelar.setEnabled(true);
            btnForo.setEnabled(false);

            }
   
    }//GEN-LAST:event_tblPostsMouseClicked

    private void btnPublicarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPublicarMouseClicked
        agregarPost();
        defaultCampos();
        limpiarCampos();
    }//GEN-LAST:event_btnPublicarMouseClicked

    private void btnHomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeMouseEntered
        btnHome.setBackground(Color.red);
    }//GEN-LAST:event_btnHomeMouseEntered

    private void btnHomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeMouseExited
        btnHome.setBackground(Color.white);
    }//GEN-LAST:event_btnHomeMouseExited

    private void btnHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeMouseClicked
        this.setVisible(false);
        iPage.setVisible(true);
        if(lblUser.getText().equals("¡Bienvenido User!")){
            iPage.definirUsuarioComun();
            iPage.mostrarBotonesUser();
            iPage.cargarDatos();
        }
    }//GEN-LAST:event_btnHomeMouseClicked

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
            java.util.logging.Logger.getLogger(GUIPost.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIPost.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIPost.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIPost.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIPost().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bgPanel;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JPanel btnCerrarSesion;
    private javax.swing.JPanel btnExit;
    private javax.swing.JButton btnForo;
    private javax.swing.JPanel btnHome;
    private javax.swing.JButton btnPublicar;
    private javax.swing.JLabel exitTxt;
    private javax.swing.JPanel header;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lblCerrarSesion;
    private javax.swing.JLabel lblHome;
    private javax.swing.JLabel lblListaPosts;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblNuevoPost;
    private javax.swing.JLabel lblNuevoPost1;
    private javax.swing.JLabel lblRightBg;
    private javax.swing.JLabel lblTituloPost;
    private javax.swing.JLabel lblTxtCerrarSesion;
    private javax.swing.JLabel lblUser;
    private javax.swing.JTable tblPosts;
    private javax.swing.JTextArea txtAreaPost;
    private javax.swing.JTextField txtAutorPost;
    private javax.swing.JTextField txtDiscoPost;
    private javax.swing.JTextField txtTituloPost;
    // End of variables declaration//GEN-END:variables
}

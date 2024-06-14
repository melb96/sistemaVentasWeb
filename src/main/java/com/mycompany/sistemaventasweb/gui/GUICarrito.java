/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.sistemaventasweb.gui;

import com.mycompany.sistemaventasweb.clases.Carrito;
import com.mycompany.sistemaventasweb.clases.Disco;
import java.awt.Color;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author melb
 */
public class GUICarrito extends javax.swing.JFrame {

    /**
     * Creates new form GUICarrito
     */
    
    DefaultTableModel modelo;
    private List<Disco> listaCarrito;
    private int selectedRow = -1;
    int xMouse, yMouse;
    GUIPage iPage = new GUIPage();
    Carrito cCarrito = new Carrito();
    
    public GUICarrito() {
        
        initComponents();
        
        //Setear titulos de tabla
        String [] titulos = {"Nombre","Interprete","Genero","Precio"};
        modelo = new DefaultTableModel(null,titulos);
        tblCarrito.setModel(modelo);
        
        listaCarrito = new ArrayList<>();
        defaultCampos();
        
    }
    
    //metodo para setear los campos por defecto
    public void defaultCampos(){
        
        txtNombreDisco.setEditable(false);
        txtInterprete.setEditable(false);
        txtPrecio.setEditable(false);
        rdbRock.setEnabled(false);rdbPop.setEnabled(false);rdbTechno.setEnabled(false);rdbCumbia.setEnabled(false);rdbReggaeton.setEnabled(false);rdbOtro.setEnabled(false);
        btnComprar.setEnabled(true);
        btnEliminar.setEnabled(false);
        btnCancelar.setEnabled(false);

    }
    
    //metodo para definir mensaje de bienvenida
        public void definirUsuarioComun(){
        
        lblUser.setText("¡Bienvenido User!");
        
    }  
        //Metodo para agregar elemento al carrito, se ejecuta desde la guipage
    
    public void agregarCarrito(Disco disco){
       
        cargarDatosDesdeArchivo();
        listaCarrito.add(disco);
        contarElementosCarrito();
        sumarTotal();
        guardarDatosEnArchivo();
        actualizarTabla();
        JOptionPane.showMessageDialog(rootPane, "Producto agregado con exito");
        
    }
    
    //metodo para eliminar elemento del carrito
    public void eliminarElementoCarrito(int indice) {
    if (indice >= 0 && indice < listaCarrito.size()) {
        listaCarrito.remove(indice);
        contarElementosCarrito();
        sumarTotal();
        guardarDatosEnArchivo();
        actualizarTabla();
    } else {
        JOptionPane.showMessageDialog(this, "Selecciona un disco para eliminar.", "Error", JOptionPane.ERROR_MESSAGE);
    }
}
   
    //metodo para contar los elementos del carrito
    public void contarElementosCarrito(){
        
         if (listaCarrito != null) {
             
             cCarrito.setTotalProductos((listaCarrito.size()));
             
             lblProductos.setText(String.valueOf(cCarrito.getTotalProductos()));
             
        } 
         
    }
    
    //metodo para sumar el total de la compra
    public void sumarTotal(){
        
        if (listaCarrito != null) {
            
            double total = 0;
            for (Disco disco : listaCarrito) {
                total += disco.getPrecio();
            }
            cCarrito.setTotalCompra(total);
            lblTotal.setText(String.format("%.2f", cCarrito.getTotalCompra()));
            
        } 
        
    }
        

     //Metodo para guardar y cargar los datos en el archivo.dat
    
    public void guardarDatosEnArchivo() {
    
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("carrito.dat"))) {
        oos.writeObject(listaCarrito);
        }catch (IOException e) {
        e.printStackTrace();
    
        }
    
    }
    
    public void cargarDatosDesdeArchivo() {
    try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("carrito.dat"))) {
        listaCarrito = (List<Disco>) ois.readObject();
    } catch (IOException | ClassNotFoundException e) {
        e.printStackTrace();
        listaCarrito = new ArrayList<>();
    }
    
}
    
    //metodo para actualizar la tabla
    
        public void actualizarTabla() {
        modelo.setRowCount(0); // Limpiar tabla
        for (Disco disco : listaCarrito) {
            modelo.addRow(new Object[]{disco.getNombre(), disco.getInterprete(), disco.getGenero(), disco.getPrecio()});
        }
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
    
    //Metodo para generar el archivo de factura, pdf me fue muy dificil, opte por .txt
    
        public void generarArchivoTexto(String medioPago) {
        // Nombre del archivo de texto
        String nombreArchivo = "compra_" + obtenerFechaHoraActual() + ".txt";

        try (FileWriter writer = new FileWriter(nombreArchivo)) {
            // Obtener datos del carrito
            List<Disco> discos = listaCarrito;
            double totalCompra = cCarrito.getTotalCompra();

            // Escribir datos en el archivo de texto
            writer.write("Detalle de Compra\n\n");

            for (Disco disco : discos) {
                writer.write("Nombre: " + disco.getNombre() + "\n");
                writer.write("Interprete: " + disco.getInterprete() + "\n");
                writer.write("Genero: " + disco.getGenero() + "\n");
                writer.write("Precio: $" + String.format("%.2f", disco.getPrecio()) + "\n\n");
            }

            writer.write("Total de la Compra: $" + String.format("%.2f", totalCompra) + "\n");
            writer.write("Medio de Pago: " + medioPago + "\n");

            JOptionPane.showMessageDialog(this, "Compra realizada. Se ha generado el archivo: " + nombreArchivo, "Compra Exitosa", JOptionPane.INFORMATION_MESSAGE);

        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al generar el archivo de texto.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

        //Metodo para obtener fecha y hora del momento
    private String obtenerFechaHoraActual() {
        DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd_HHmmss");
        Date date = new Date();
        return dateFormat.format(date);
    }
    
    //Metodo para limpiar carrito
    
    public void limpiarCarrito() {
    listaCarrito.clear();  // Vaciar la lista del carrito
    modelo.setRowCount(0);  // Limpiar la tabla en la GUI
    cCarrito.setTotalProductos(0);  // Resetear el total de productos
    cCarrito.setTotalCompra(0.0);  // Resetear el total de la compra
    lblProductos.setText("0");  // Actualizar el campo de texto de productos
    lblTotal.setText("0.00");  // Actualizar el campo de texto del total
    guardarDatosEnArchivo();  // Guardar el estado vacío del carrito en el archivo
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
        lblLogo = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        btnComprar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        lblRightBg = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        btnHome = new javax.swing.JPanel();
        lblHome = new javax.swing.JLabel();
        btnExit = new javax.swing.JPanel();
        exitTxt = new javax.swing.JLabel();
        btnCerrarSesion = new javax.swing.JPanel();
        lblTxtCerrarSesion = new javax.swing.JLabel();
        lblCerrarSesion = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        lblListaDiscos = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCarrito = new javax.swing.JTable();
        lblInfoDisco = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        btnAgrCarrito = new javax.swing.JButton();
        lblInfoDisco1 = new javax.swing.JLabel();
        txtNombreDisco = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        txtInterprete = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        lblElegirGenero = new javax.swing.JLabel();
        rdbRock = new javax.swing.JRadioButton();
        rdbPop = new javax.swing.JRadioButton();
        rdbTechno = new javax.swing.JRadioButton();
        rdbCumbia = new javax.swing.JRadioButton();
        rdbReggaeton = new javax.swing.JRadioButton();
        rdbOtro = new javax.swing.JRadioButton();
        txtPrecio = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        lblProductos = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLogo.setIcon(new javax.swing.ImageIcon("/home/melb/NetBeansProjects/sistemaVentasWeb/src/main/java/com/mycompany/sistemaventasweb/resources/disco3.png")); // NOI18N
        jPanel1.add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 40, -1, -1));

        btnEliminar.setBackground(new java.awt.Color(255, 102, 153));
        btnEliminar.setFont(new java.awt.Font("Roboto Slab", 1, 13)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(0, 0, 0));
        btnEliminar.setIcon(new javax.swing.ImageIcon("/home/melb/NetBeansProjects/sistemaVentasWeb/src/main/java/com/mycompany/sistemaventasweb/resources/iconos/basura.png")); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarMouseClicked(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 180, 110, 30));

        btnComprar.setBackground(new java.awt.Color(255, 102, 153));
        btnComprar.setFont(new java.awt.Font("Roboto Slab", 1, 12)); // NOI18N
        btnComprar.setForeground(new java.awt.Color(0, 0, 0));
        btnComprar.setIcon(new javax.swing.ImageIcon("/home/melb/NetBeansProjects/sistemaVentasWeb/src/main/java/com/mycompany/sistemaventasweb/resources/iconos/carrito-de-compras.png")); // NOI18N
        btnComprar.setText("Comprar");
        btnComprar.setMaximumSize(new java.awt.Dimension(105, 24));
        btnComprar.setMinimumSize(new java.awt.Dimension(105, 24));
        btnComprar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnComprarMouseClicked(evt);
            }
        });
        jPanel1.add(btnComprar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 140, 110, 30));

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
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 444, 110, 30));

        lblRightBg.setIcon(new javax.swing.ImageIcon("/home/melb/NetBeansProjects/sistemaVentasWeb/src/main/java/com/mycompany/sistemaventasweb/resources/bgImagen.jpg")); // NOI18N
        lblRightBg.setText("jLabel1");
        jPanel1.add(lblRightBg, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 0, 140, 500));

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
            .addGap(0, 42, Short.MAX_VALUE)
            .addGroup(btnHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnHomeLayout.createSequentialGroup()
                    .addGap(0, 10, Short.MAX_VALUE)
                    .addComponent(lblHome)
                    .addGap(0, 13, Short.MAX_VALUE)))
        );

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 500, Short.MAX_VALUE)
                .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(144, 144, 144))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 40));

        lblUser.setFont(new java.awt.Font("Roboto Black", 1, 13)); // NOI18N
        lblUser.setForeground(new java.awt.Color(255, 102, 153));
        lblUser.setIcon(new javax.swing.ImageIcon("/home/melb/NetBeansProjects/sistemaVentasWeb/src/main/java/com/mycompany/sistemaventasweb/resources/iconos/usuario.png")); // NOI18N
        lblUser.setText("Bienvenido!");
        jPanel1.add(lblUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 60, -1, -1));

        lblListaDiscos.setFont(new java.awt.Font("Roboto Slab", 1, 18)); // NOI18N
        lblListaDiscos.setForeground(new java.awt.Color(255, 102, 153));
        lblListaDiscos.setText("LISTA DE CARRITO");
        jPanel1.add(lblListaDiscos, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, -1, -1));

        tblCarrito.setBackground(new java.awt.Color(255, 255, 255));
        tblCarrito.setFont(new java.awt.Font("Roboto Slab", 1, 14)); // NOI18N
        tblCarrito.setForeground(new java.awt.Color(255, 102, 153));
        tblCarrito.setModel(new javax.swing.table.DefaultTableModel(
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
        tblCarrito.setToolTipText("");
        tblCarrito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCarritoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCarrito);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 640, 250));

        lblInfoDisco.setFont(new java.awt.Font("Roboto Slab", 1, 18)); // NOI18N
        lblInfoDisco.setForeground(new java.awt.Color(255, 102, 153));
        lblInfoDisco.setText("INFORMACION COMPRA");
        jPanel1.add(lblInfoDisco, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, -1, -1));

        jLabel1.setFont(new java.awt.Font("Roboto Slab", 1, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 153));
        jLabel1.setText("Cantidad de productos seleccionados:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, -1, -1));

        jLabel2.setFont(new java.awt.Font("Roboto Slab", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 153));
        jLabel2.setText("Total de compra:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 150, 100, 10));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 120, 100, 10));

        btnAgrCarrito.setBackground(new java.awt.Color(255, 102, 153));
        btnAgrCarrito.setFont(new java.awt.Font("Roboto Slab", 1, 12)); // NOI18N
        btnAgrCarrito.setForeground(new java.awt.Color(0, 0, 0));
        btnAgrCarrito.setIcon(new javax.swing.ImageIcon("/home/melb/NetBeansProjects/sistemaVentasWeb/src/main/java/com/mycompany/sistemaventasweb/resources/iconos/carrito-de-compra-anadir.png")); // NOI18N
        btnAgrCarrito.setText("Al carrito");
        btnAgrCarrito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgrCarritoMouseClicked(evt);
            }
        });
        jPanel1.add(btnAgrCarrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 130, 110, 30));

        lblInfoDisco1.setFont(new java.awt.Font("Roboto Slab", 1, 18)); // NOI18N
        lblInfoDisco1.setForeground(new java.awt.Color(255, 102, 153));
        lblInfoDisco1.setText("INFORMACION DISCO");
        jPanel1.add(lblInfoDisco1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

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
        jPanel1.add(txtNombreDisco, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 180, 20));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 180, 20));

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
        jPanel1.add(txtInterprete, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 180, -1));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 180, 20));

        lblElegirGenero.setFont(new java.awt.Font("Roboto Slab", 1, 14)); // NOI18N
        lblElegirGenero.setForeground(new java.awt.Color(255, 102, 153));
        lblElegirGenero.setText("Seleccionar genero:");
        jPanel1.add(lblElegirGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        rdbRock.setText("Rock");
        jPanel1.add(rdbRock, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        rdbPop.setText("Pop");
        jPanel1.add(rdbPop, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, -1, -1));

        rdbTechno.setText("Techno");
        jPanel1.add(rdbTechno, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, -1, -1));

        rdbCumbia.setText("Cumbia");
        jPanel1.add(rdbCumbia, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, -1, -1));

        rdbReggaeton.setText("Reggaeton");
        jPanel1.add(rdbReggaeton, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, -1, -1));

        rdbOtro.setText("Otro");
        jPanel1.add(rdbOtro, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, -1, -1));

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
        jPanel1.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 180, 20));

        lblProductos.setFont(new java.awt.Font("Roboto Slab", 1, 13)); // NOI18N
        lblProductos.setForeground(new java.awt.Color(255, 102, 153));
        jPanel1.add(lblProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 100, 100, -1));

        lblTotal.setFont(new java.awt.Font("Roboto Slab", 1, 13)); // NOI18N
        lblTotal.setForeground(new java.awt.Color(255, 102, 153));
        jPanel1.add(lblTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 130, 100, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    //metodo para que cuando se haga click en la tabla muestre los datos en la interface
    private void tblCarritoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCarritoMouseClicked

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
       
                btnComprar.setEnabled(false);
                btnEliminar.setEnabled(true);
                btnCancelar.setEnabled(true);

            }

    }//GEN-LAST:event_tblCarritoMouseClicked

    //boton cancelar
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        defaultCampos();
    }//GEN-LAST:event_btnCancelarActionPerformed
    //boton home
    private void btnHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeMouseClicked
        this.setVisible(false);
        iPage.setVisible(true);
        if(lblUser.getText().equals("¡Bienvenido User!")){
            iPage.definirUsuarioComun();
            iPage.mostrarBotonesUser();
            iPage.cargarDatos();
        }
    }//GEN-LAST:event_btnHomeMouseClicked

    private void btnHomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeMouseEntered
        btnHome.setBackground(Color.red);
    }//GEN-LAST:event_btnHomeMouseEntered

    private void btnHomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeMouseExited
        btnHome.setBackground(Color.white);
    }//GEN-LAST:event_btnHomeMouseExited

    private void btnAgrCarritoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgrCarritoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgrCarritoMouseClicked

    private void txtNombreDiscoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreDiscoMousePressed
        defaultFieldNombre();
    }//GEN-LAST:event_txtNombreDiscoMousePressed

    private void txtInterpreteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtInterpreteMousePressed
        defaultFieldInterprete();
    }//GEN-LAST:event_txtInterpreteMousePressed

    private void txtPrecioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPrecioMousePressed
        defaultFieldPrecio();
    }//GEN-LAST:event_txtPrecioMousePressed

    //boton eliminar
    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked
            int filaSeleccionada = tblCarrito.getSelectedRow();
    if (filaSeleccionada >= 0) {
        eliminarElementoCarrito(filaSeleccionada);
    } else {
        JOptionPane.showMessageDialog(this, "Selecciona un disco para eliminar.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnEliminarMouseClicked
    //metodo para seleccionar metodo de pago, es solo seleccionar. no influye en el precio
    private void btnComprarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnComprarMouseClicked
        // Mostrar JOptionPane para elegir medio de pago
        String[] opcionesPago = {"Efectivo", "Tarjeta"};
        String medioPago = (String) JOptionPane.showInputDialog(this, "Selecciona el medio de pago:", "Medio de Pago", JOptionPane.PLAIN_MESSAGE, null, opcionesPago, opcionesPago[0]);

        // Generar archivo de texto con los datos del carrito y total de compra
        generarArchivoTexto(medioPago);
        limpiarCarrito();
    }//GEN-LAST:event_btnComprarMouseClicked

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
            java.util.logging.Logger.getLogger(GUICarrito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUICarrito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUICarrito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUICarrito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUICarrito().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgrCarrito;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JPanel btnCerrarSesion;
    private javax.swing.JButton btnComprar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JPanel btnExit;
    private javax.swing.JPanel btnHome;
    private javax.swing.JLabel exitTxt;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel lblCerrarSesion;
    private javax.swing.JLabel lblElegirGenero;
    private javax.swing.JLabel lblHome;
    private javax.swing.JLabel lblInfoDisco;
    private javax.swing.JLabel lblInfoDisco1;
    private javax.swing.JLabel lblListaDiscos;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblProductos;
    private javax.swing.JLabel lblRightBg;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblTxtCerrarSesion;
    private javax.swing.JLabel lblUser;
    private javax.swing.JRadioButton rdbCumbia;
    private javax.swing.JRadioButton rdbOtro;
    private javax.swing.JRadioButton rdbPop;
    private javax.swing.JRadioButton rdbReggaeton;
    private javax.swing.JRadioButton rdbRock;
    private javax.swing.JRadioButton rdbTechno;
    private javax.swing.JTable tblCarrito;
    private javax.swing.JTextField txtInterprete;
    private javax.swing.JTextField txtNombreDisco;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}

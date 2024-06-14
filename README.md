<h1 align="center">TP Nº 4 - SISTEMA VENTAS DISCOS WEB</h1>

<h2 align="center">Luna Bazán, Mateo</h2>

<p align="center"> Este es un proyecto ABMS desarrollado en Java utilizando el IDE NetBeans. Su finalidad es permitir agregar, modificar y eliminar discos musicales; También permitir a un usuario comprar estos discos.</p>

<h3> Notas </h3>

Para iniciar sesion, hay dos caminos. Uno para iniciar como administrador, habilitando los botones de Agregar, Modificar y Eliminar los discos; Otro commo User, permitiendo seleccionar los discos cargados para sumarlos al carrito y/o agregar un comentario en el foro.

Funciones para crear usuario admin y user:

```shell

   public Usuario adminUsuario(){
            
       return new Usuario("admin", "admin@email.com", "admin", "administrador");

    }

```
```shell

   public Usuario normalUsuario(){
       
       return new Usuario("user", "user@email.com", "password", "usuario");
       
   }

```
Al no utilizar una base de datos, se hizo uso de la función FileInputStream y FileOutputStream para guardar y cargar los datos ingresados en un archivo .dat. (se replica para discos.dat; posts.dat y carrito.dat)

```shell

    public void guardarDatosEnArchivo() {
    
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("discos.dat"))) {
        oos.writeObject(listaDiscos);
        }catch (IOException e) {
        e.printStackTrace();
    
        }
    
    }

```

```shell

    public void cargarDatosDesdeArchivo() {

    try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("discos.dat"))) {
        listaDiscos = (List<Disco>) ois.readObject();
    } catch (IOException | ClassNotFoundException e) {
        e.printStackTrace();
    }

}

```

Para generar la factura, se exporta en un archivo .txt con el siguiente metodo:

```shell
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
```
Para seleccionar el medio de pago, tenemos el siguiente metodo:

```shell


    private void btnComprarMouseClicked(java.awt.event.MouseEvent evt) {                                        
        // Mostrar JOptionPane para elegir medio de pago
        String[] opcionesPago = {"Efectivo", "Tarjeta"};
        String medioPago = (String) JOptionPane.showInputDialog(this, "Selecciona el medio de pago:", "Medio de Pago", JOptionPane.PLAIN_MESSAGE, null, opcionesPago, opcionesPago[0]);

        // Generar archivo de texto con los datos del carrito y total de compra
        generarArchivoTexto(medioPago);
    }   
```

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
Al no utilizar una base de datos, se hizo uso de la función FileInputStream y FileOutputStream para guardar y cargar los datos ingresados en un archivo .dat.

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



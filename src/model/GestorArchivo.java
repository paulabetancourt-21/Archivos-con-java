package model;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class GestorArchivo {
    private File archivo;

    public GestorArchivo(String nombreArchivo) {
        this.archivo = new File(nombreArchivo);
    }

    public void crearArchivo() {
        if (!archivo.exists()) {
            try {
                archivo.createNewFile();
                System.out.println(archivo.getName() + " ha sido creado.");
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        } else {
            System.out.println("El archivo " + archivo.getName() + " ya existe");
        }
    }

    public void mostrarInformacion() {
        System.out.println("¿Se puede leer? " + archivo.canRead());
        System.out.println("¿Se puede escribir? " + archivo.canWrite());
        System.out.println("¿Se puede ejecutar? " + archivo.canExecute());
        System.out.println("¿Es un directorio? " + archivo.isDirectory());

        Date fecha = new Date(archivo.lastModified());
        System.out.println("Fecha de modificación: " + fecha);

        System.out.println("Tamaño del archivo: " + archivo.length() + " bytes");
        System.out.println("Ubicación: " + archivo.getAbsolutePath());
    }
}


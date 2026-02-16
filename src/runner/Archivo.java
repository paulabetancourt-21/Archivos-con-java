package runner;

import model.GestorArchivo;

public class Archivo {

    public static void main(String[] args) {
        GestorArchivo gestor = new GestorArchivo("miarchivo.txt");

        gestor.crearArchivo();
        gestor.mostrarInformacion();
    }
}


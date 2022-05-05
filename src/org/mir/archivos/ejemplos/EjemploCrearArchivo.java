package org.mir.archivos.ejemplos;

import org.mir.archivos.ejemplos.servicio.ArchivoServicio;

public class EjemploCrearArchivo {
    public static void main(String[] args) {
        String nombreArchivo = "C:\\JAVACODE\\Data\\java02.txt";

        ArchivoServicio service = new ArchivoServicio();
        service.crearArchivo2(nombreArchivo);
    }
}

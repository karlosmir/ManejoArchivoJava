package org.mir.archivos.ejemplos;

import org.mir.archivos.ejemplos.servicio.ArchivoServicio;

public class EjemploLeerArchivo {
    public static void main(String[] args) {
        String nombreArchivo = "C:\\JAVACODE\\Data\\java.txt";
        ArchivoServicio servicio = new ArchivoServicio();

        System.out.println(servicio.leerArchivo(nombreArchivo));
    }
}

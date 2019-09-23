import java.io.*;

public class Main {
    public static void main(String[] args) {
        /**
         * Creacion de directorios o archivos
         * ---------------------------------------------------------------
         * Establece el nombre del ARCHIVO "boom"
         * */
        File nombreArchivo = new File("C:\\Users\\Matias\\Desktop\\GestorArchivos\\BOOM.txt");
        /**
         * Crea el ARCHIVO con el nombre dado a "nombreArchivo"
         * COMENTARIO: No crea el archivo si existe un directorio con el mismo nombre
         * */
        try {
            nombreArchivo.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        /**
         * Borra el ARCHIVO con el nombre dado a "nombreArchivo"
         * */
        //nombreArchivo.delete();
        /**
         * Crea un directorio (o carpeta) con el nombre del ARCHIVO dado a "nombreArchivo"
         * COMENTARIO: No crea un directorio si existe un archivo con el mismo nombre
         * */
        nombreArchivo.mkdir();
        /**
         * Imprime la ruta absoluta del ARCHIVO con el nombre dado a "nombreArchivo"
         * COMENTARIO: getPath(); otorga la ruta relativa de dicho Archivo
         * */
        System.out.println(nombreArchivo.getPath());
        /**
         * Imprime un boolean que dice si el ARCHIVO con el nombre dado a "nombreArchivo" existe
         * */
        System.out.println(nombreArchivo.exists());
        /**
         * Imprime un boolean que dice si el ARCHIVO con el nombre dado a "nombreArchivo" puede ser escrito
         * */
        System.out.println(nombreArchivo.canWrite());
        /**
         * Imprime un boolean que dice si el ARCHIVO con el nombre dado a "nombreArchivo" puede ser leido
         * */
        System.out.println(nombreArchivo.canRead());
        /**
         * Imprime un boolean que dice si el ARCHIVO con el nombre dado a "nombreArchivo" es un archivo
         * */
        System.out.println(nombreArchivo.isFile());
        /**
         * Imprime un boolean que die si el ARCHIVO con el nombre dado a "nombreArchivo" es un directorio
         * */
        System.out.println(nombreArchivo.isDirectory());
        /**
         * Devuelve una array con los ficheros contenidos en el directorio
         * COMENTARIO: Para imprimirlo es necesario hacer un ciclo for.
         * */
        nombreArchivo.listFiles();
        /**
         * Devuelve la longitud del archivo
         * COMENTARIO: Util para utilizar en conjunto con el metodo "listFiles() en el ciclo for"
         * */
        nombreArchivo.length();

        /**
         * Escritura de archivos
         * ------------------------------------------
         * Establece en que archivo se añadiran o eliminaran caracteres
         * */
        try {
            FileWriter fw = new FileWriter(nombreArchivo);
            /**
             * Escribe en el archivo lo que le pongamos
             * */
            fw.write("Esto es lo que hemos escrito");
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        /**
         * Lectura de datos
         * -------------------------------
         * Establece que archivo sera leido
         * COMENTARIO: Requiere
         * */
        try {
            FileReader fr = new FileReader(nombreArchivo);
            /**
             *
             * */
            String linea = String.valueOf(fr.read());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}

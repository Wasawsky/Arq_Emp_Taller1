
package edu.escuelaing.arep.taller1.app;

import java.io.*;

/**
 * Lectura y escritura de archivos externos
 */
public class FileHandler {

    private File file;
    
    /**
     * Constructor que permite la implementacion del archivo externo
     * @param file Destino o direccion de origen
     */
    public FileHandler(String file){
        this.file=openFile(file);
    }

    /**
     * Permite encontrar el archivo deseado
     * @param fileAddress la direccion del archivo
     * @return El archivo deseado
     */
    public static File openFile(String fileAddress){
        File file = new File(fileAddress);
        return file;
    }

    /**
     * Retorna la LinkedList con los datos almacenados
     * @param list la LinkedList a llenar
     * @throws IOException
     */
    public LinkedList getNumberLines(LinkedList list) throws IOException {
        InputStream in = new FileInputStream(file);
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String line;
        while ((line = br.readLine()) != null) {
            list.add(Double.parseDouble(line));
        }
        in.close();
        br.close();
        return list;
    }
}
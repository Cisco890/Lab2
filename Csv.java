import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Csv {

    public List<List<String>> leerArchivoCSV(String nombreArchivo) {
        List<List<String>> datos = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                List<String> fila = parsearLineaCSV(linea);
                if (fila != null) {
                    datos.add(fila);
                } else {
                    System.err.println("Error: línea incorrecta en el archivo CSV: " + linea);
                }
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo CSV: " + e.getMessage());
        }

        return datos;
    }

    private List<String> parsearLineaCSV(String linea) {
        List<String> campos = new ArrayList<>();
        String[] valores = linea.split("\\|"); // Separador en el formato dado

        if (valores.length == 5) { // Ajusta la longitud según tu formato
            for (String valor : valores) {
                campos.add(valor.trim());
            }
            return campos;
        } else {
            return null; // La línea no cumple con el formato esperado
        }
    }
}

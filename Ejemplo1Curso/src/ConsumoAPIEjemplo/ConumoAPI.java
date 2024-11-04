package ConsumoAPIEjemplo;

import java.io.File;
import java.io.FileInputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.json.JSONObject;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class ConumoAPI {

    public static void main(String[] args) {
    /*
        try{

            //Solicitar una peticions
        URL url =new URL("https://jsonplaceholder.typicode.com/users");
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.connect();

            //comprobar si la peticcion es correcta?
        int responseCode = conn.getResponseCode();
        if(responseCode != 200)
            {
                throw new RuntimeException ("Ocurrio un error : " + responseCode);

            }
            else
            {
                 // Abrir un scaner que lea el flujo de datos
                StringBuilder informationString = new StringBuilder();
                Scanner scanner = new Scanner(url.openStream());

                while (scanner.hasNext()){
                    informationString.append(scanner.nextLine());

                }

                scanner.close();

                // luego mostrar la informacion por consola

                System.out.println(informationString);

            }

        } catch (Exception e){
            e.printStackTrace();
        }
     */
    /*
        try {
            // Especificar la ruta del archivo XML en tu PC
            File file = new File("C:/Users/brigi/OneDrive/Escritorio/ejemplo.txt");

            // Comprobar si el archivo existe
            if (!file.exists()) {
                throw new RuntimeException("El archivo no existe en la ruta especificada.");
            }

            // Abrir el archivo para leer
            FileInputStream fis = new FileInputStream(file);
            Scanner scanner = new Scanner(fis);

            // Leer el contenido del archivo XML
            StringBuilder informationString = new StringBuilder();
            while (scanner.hasNext()) {
                informationString.append(scanner.nextLine()).append("\n");
            }

            // Cerrar el scanner
            scanner.close();

            // Mostrar la información por consola
            System.out.println(informationString.toString());

        } catch (Exception e) {
            e.printStackTrace();
        }
    */
        try {
            // Especificar la ruta del archivo XML
            File file = new File("C:/Users/brigi/OneDrive/Escritorio/usuarios2.xml");
            // Usamos la clase File para especificar la ruta del archivo XML. Esto permite que el
            // programa sepa desde dónde debe leer el contenido.


            // Comprobar si el archivo existe
            if (!file.exists()) {
                throw new RuntimeException("El archivo no existe en la ruta especificada.");
            }
            //Comprobación: Si el archivo no existe en la ruta indicada, se lanza una excepción.
            // Esto es útil para asegurarse de que el archivo está disponible antes de continuar.


            // Crear el DocumentBuilderFactory
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            //DocumentBuilderFactory: Esta clase crea una instancia de un parser de XML.
            // Es el punto de inicio para poder trabajar con archivos XML.
            DocumentBuilder builder = factory.newDocumentBuilder();
            //DocumentBuilder: Es la clase que realiza el parsing del archivo XML,
            // es decir, convierte el archivo en una estructura que Java puede entender (un Document).


            // Parsear el archivo XML
            Document document = builder.parse(file);
            // El método parse() toma el archivo XML y lo convierte en un Document (una estructura
            //  de árbol que representa el contenido del archivo XML).
            //En este paso, el archivo XML completo es leído y estructurado, pero todavía no hemos
            // extraído ningún contenido.

            // Obtener el contenido dentro de la etiqueta <json>
            NodeList nodeList = document.getElementsByTagName("json");
            String jsonString = nodeList.item(0).getTextContent().trim();
            //getElementsByTagName("json"): Busca todas las etiquetas <json> dentro del documento XML. En este caso, se asume
            // que solo hay una, pero podrías tener más si tu XML lo requiere.
            //item(0): Como estamos buscando la primera (y única) ocurrencia de la etiqueta <json>, usamos el índice 0.
            //getTextContent(): Extrae el texto dentro de la etiqueta <json>. Este texto es el contenido JSON que estaba
            // dentro de las etiquetas <json>...</json>.
            //trim(): Se usa para eliminar cualquier espacio en blanco innecesario al principio o al final del texto extraído.




            // Convertir el contenido extraído (String) en un JSONObject
            JSONObject jsonObject = new JSONObject(jsonString);
            //Una vez que has extraído el contenido JSON como un String, puedes crear un objeto JSONObject a partir de ese string.
            //JSONObject: Es una clase de la librería org.json que permite trabajar con datos en formato JSON. En este paso, Java
            // entiende el contenido JSON como un objeto que puede manipular.

            // Mostrar el JSON por consola
            System.out.println(jsonObject.toString(4));
            //toString(4): Convierte el objeto JSONObject en una cadena de texto con una sangría de 4 espacios,
            // para que sea legible cuando se imprime en la consola.
            //En este punto, ya puedes trabajar con el objeto JSON, acceder a sus campos y procesar la información como necesites.

        } catch (Exception e) {
            e.printStackTrace();
        }

    }



}

package ConsumoAPIEjemplo;

import org.json.JSONArray;
import org.json.JSONObject;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.ArrayList;
import java.util.List;


public class ComsumoAPI2 {

           public static void main(String[] args) {

            try {
                // Especificar la ruta del archivo XML en tu PC
                File file = new File("C:/Users/brigi/OneDrive/Escritorio/ejemplo.xml");

                // Comprobar si el archivo existe
                if (!file.exists()) {
                    throw new RuntimeException("El archivo no existe en la ruta especificada.");
                }

                // Leer el archivo XML
                DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
                DocumentBuilder builder = factory.newDocumentBuilder();
                Document document = builder.parse(file);

                // Normalizar el documento XML
                document.getDocumentElement().normalize();

                // Extraer el contenido del nodo <json>
                Element jsonElement = (Element) document.getElementsByTagName("json").item(0);
                String jsonContent = jsonElement.getTextContent().trim();

                // Parsear el contenido JSON extraído
                JSONObject jsonObject = new JSONObject(jsonContent);
                JSONArray usuariosArray = jsonObject.getJSONArray("usuario");

                // Crear una lista para guardar los objetos Usuario
                List<Usuario> usuarios = new ArrayList<>();

                // Recorrer el JSONArray y añadir los usuarios a la lista
                for (int i = 0; i < usuariosArray.length(); i++) {
                    JSONObject usuarioJSON = usuariosArray.getJSONObject(i);
                    Usuario usuario = new Usuario(
                            usuarioJSON.getInt("id"),
                            usuarioJSON.getString("nombre"),
                            usuarioJSON.getString("email")
                    );
                    usuarios.add(usuario);
                }

                // Mostrar los usuarios en la consola
                for (Usuario usuario : usuarios) {
                    System.out.println(usuario);
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
}



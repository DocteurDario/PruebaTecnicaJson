package ConsumoAPIEjemplo;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.File;
import java.io.FileInputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;

public class ConsumoJson {
    public static void main(String[] args) {

    try {
        // Especificar la ruta del archivo JSON
        File file = new File("C:/Users/brigi/OneDrive/Escritorio/usuarios2.json");

        // Comprobar si el archivo existe
        if (!file.exists()) {
            throw new RuntimeException("El archivo no existe en la ruta especificada.");
        }

        // Leer el archivo JSON usando un Scanner
        FileInputStream fis = new FileInputStream(file);
        Scanner scanner = new Scanner(fis, StandardCharsets.UTF_8.name());

        // Construir el contenido en una String
        StringBuilder jsonString = new StringBuilder();
        while (scanner.hasNext()) {
            jsonString.append(scanner.nextLine());
        }

        // Cerrar el scanner
            scanner.close();

        // Convertir el contenido del archivo a un JSONObject
             JSONObject jsonObject = new JSONObject(jsonString.toString());

        // Obtener el arreglo de usuarios
            JSONArray usuarios = jsonObject.getJSONArray("usuarios");

        // Crear un ArrayList para almacenar los usuarios
            ArrayList<Usuario> listaUsuarios = new ArrayList<>();

        // Recorrer el JSONArray y agregar los usuarios al ArrayList
        for (int i = 0; i < usuarios.length(); i++) {
                JSONObject usuarioJson = usuarios.getJSONObject(i);

            // Extraer los valores del JSON
                int id = usuarioJson.getInt("id");
                String nombre = usuarioJson.getString("nombre");
                String email = usuarioJson.getString("email");

                // Crear un objeto Usuario y agregarlo al ArrayList
                Usuario usuario = new Usuario(id, nombre, email);
                listaUsuarios.add(usuario);
            }

        // Mostrar los usuarios en el ArrayList
            for (Usuario usuario : listaUsuarios) {
                System.out.println(usuario);
                System.out.println(usuario.getNombre());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
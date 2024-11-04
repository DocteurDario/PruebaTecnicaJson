import javax.swing.*;


public class Entrada_Ejemplo2 {

    public static void main(String[] args) {
        String nombre_usuario = JOptionPane.showInputDialog(" Introduce tu nombre, por favor");

        int edad= Integer.parseInt(JOptionPane.showInputDialog("Ingrse su edad: "));
        edad++;
        System.out.println( nombre_usuario + "Su edad: "+ (edad));
    }
}

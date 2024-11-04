import java.util.Scanner;

public class Entrada_ejemplo1 {


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println(" Introduce tu nombre : ");

        String nombre_usuario = entrada.nextLine();

        System.out.println("Introduce edad, por favor: ");

        int edad = entrada.nextInt();

        System.out.println( " El nombre es : " + nombre_usuario + "y su edad : "+edad );

    }
}

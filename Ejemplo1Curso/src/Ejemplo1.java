public class Ejemplo1 {
    public static void main(String[] args) {

        int a;
        int b;

        b=10;
        a=5;

        System.out.println( b+ b);

        final double apulgadas = 2.54;

        double cm = 6;
        double resultado = cm/apulgadas;

        System.out.println( " En " + cm + " cm hay " + resultado + " pulgadas");

        String alumno1, alumno2;
        alumno1 = "David";
        alumno2 = "david";

        System.out.println(alumno1.equals(alumno2));
        System.out.println(alumno1.equalsIgnoreCase(alumno2));
    }

}

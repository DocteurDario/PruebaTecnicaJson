import javax.swing.*;


public class Entrada_Numeros {
    public static void main(String[] args) {
       /* double x=10000.0;

        String num1= JOptionPane.showInputDialog("Ingresa unnúmero :");

        Double num2 = Double.parseDouble(num1);

        System.out.printf("%1.2f", Math.sqrt(num2/3));
        System.out.println(" ");
        System.out.printf("%1.4f", Math.sqrt(num2/3));

        */
        //int aleatorio = (int)(Math.random()*100);
        //System.out.println(aleatorio);
        int[] matriz = new int[80];

        for(int i = 0 ; i < matriz.length; i++ )
        {
            matriz [i] = (int)Math.round(Math.random()*100);
        }

        for (int elemento : matriz)
        {
         System.out.println(elemento);
        }

    }
}

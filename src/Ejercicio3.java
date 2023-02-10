import java.util.Scanner;

public class Ejercicio3 { //¿Qué hace?

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor1, valor2;
        String cadena1;
        final double CST = 49.78;

        System.out.println("Introduzca un valor: ");
        valor1 = sc.nextInt();
        System.out.println("Introduzca otro valor: ");
        valor2 = sc.nextInt();
        cadena1 = "Test";
        System.out.println(cadena1 + " , valor2 = " + valor2);
        System.out.println(valor1 + " # " + CST);
    }

}

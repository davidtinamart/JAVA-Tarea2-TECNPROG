import java.util.Scanner;

public class Ejercicio4 { // Velocidad media

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double distancia, tiempo, velocidad;

        System.out.println("Introduzca la distancia recorrida (km).");
        distancia = sc.nextDouble();
        System.out.println("Introduzca el tiempo del recorrido (min).");
        tiempo = sc.nextDouble();
        velocidad = (distancia / tiempo) * 60;
        System.out.println("Se ha desplazado a una velocidad de " + velocidad + " km/h.");
    }
}
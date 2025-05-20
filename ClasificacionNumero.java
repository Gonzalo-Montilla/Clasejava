import java.util.Scanner;

public class ClasificacionNumero {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Ingrese un número: ");
        double number = scanner.nextDouble();


        if (number > 0) {
            System.out.println("El número " + number + " es positivo.");
        } else if (number < 0) {
            System.out.println("El número " + number + " es negativo.");
        } else {
            System.out.println("El número es cero.");
        }


        scanner.close();
    }
}
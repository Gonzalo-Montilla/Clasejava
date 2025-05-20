import java.util.Scanner;

public class MayorOigualQue {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Ingrese el primer número: ");
        double number1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double number2 = scanner.nextDouble();


        if (number1 > number2) {
            System.out.println(number1 + " es mayor que " + number2 + ".");
        } else if (number1 < number2) {
            System.out.println(number2 + " es mayor que " + number1 + ".");
        } else {
            System.out.println("Los números " + number1 + " y " + number2 + " son iguales.");
        }


        scanner.close();
    }
}
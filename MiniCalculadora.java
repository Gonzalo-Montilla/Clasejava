import java.util.Scanner;

public class MiniCalculadora {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Ingrese el primer número: ");
        var num1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        var num2 = scanner.nextDouble();


        System.out.print("Ingrese el operador (+, -, *, /): ");
        char operator = scanner.next().charAt(0);


        double result;


        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + result);
                break;

            case '-':
                result = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + result);
                break;

            case '*':
                result = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + result);
                break;

            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println(num1 + " / " + num2 + " = " + result);
                } else {
                    System.out.println("Error: No se puede dividir por cero.");
                }
                break;

            default:
                System.out.println("Error: Operador inválido. Por favor use +, -, *, o /.");
                break;
        }


        scanner.close();
    }
}
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);

        // le o primeiro numero
        System.out.print("Digite o primeiro numero: ");
        double a = leitor.nextDouble();

        // le o segundo numero
        System.out.print("Digite o segundo numero: ");
        double b = leitor.nextDouble();

         // faz as contas
        System.out.println("Soma: " + (a + b));
        System.out.println("Subtração: " + (a - b));
        System.out.println("Multiplicação: " + (a * b));
        System.out.println("Divisão: " + (a / b));
        System.out.println("Resto: " + (a % b));
    }
}
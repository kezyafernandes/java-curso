import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        // lê um texto
        System.out.print("Qual seu nome? ");
        String nome = leitor.nextLine();

        // lê um número inteiro
        System.out.print("Qual sua idade? ");
        int idade = leitor.nextInt();

        // mostra o resultado
        System.out.println("Olá, " + nome + "! Você tem " + idade + " anos.");
    }
}
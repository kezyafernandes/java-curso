public class Metodos {
    public static void main(String[] args) {
        int resultado = soma(5, 3);
        System.out.println("Soma: " + resultado);

        saudacao("Ana");
    }

    static int soma(int a, int b) {
        return a + b;
    }

    static void saudacao(String nome) {
        System.out.println("Ola, " + nome + "!");
    }
}

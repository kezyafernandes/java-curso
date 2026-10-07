import java.util.Scanner;

public class Agenda {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Contato[] contatos = new Contato[10];
        int total = 0;
        int opcao = 0;

        while (opcao != 5) {
            System.out.println();
            System.out.println("=== AGENDA ===");
            System.out.println("1 - Adicionar contato");
            System.out.println("2 - Listar contatos");
            System.out.println("3 - Buscar contato");
            System.out.println("4 - Remover contato");
            System.out.println("5 - Sair");
            System.out.print("Escolha: ");
            opcao = leitor.nextInt();
            leitor.nextLine();

            if (opcao == 1) {
                if (total >= 10) {
                    System.out.println("Agenda cheia!");
                } else {
                    Contato c = new Contato();
                    System.out.print("Nome: ");
                    c.nome = leitor.nextLine();
                    System.out.print("Telefone: ");
                    c.telefone = leitor.nextLine();

                    contatos[total] = c;
                    total++;
                    System.out.println("Contato adicionado!");
                }
            } else if (opcao == 2) {
                if (total == 0) {
                    System.out.println("Agenda vazia.");
                } else {
                    for (int i = 0; i < total; i++) {
                        System.out.println((i + 1) + ". " + contatos[i].nome + " - " + contatos[i].telefone);
                    }
                }
            } else if (opcao == 3) {
                System.out.print("Nome para buscar: ");
                String busca = leitor.nextLine();
                boolean achou = false;

                for (int i = 0; i < total; i++) {
                    if (contatos[i].nome.equals(busca)) {
                        System.out.println("Achei: " + contatos[i].nome + " - " + contatos[i].telefone);
                        achou = true;
                    }
                }

                if (!achou) {
                    System.out.println("Contato nao encontrado.");
                }
            } else if (opcao == 4) {
                System.out.print("Nome para remover: ");
                String busca = leitor.nextLine();
                int posicao = -1;

                for (int i = 0; i < total; i++) {
                    if (contatos[i].nome.equals(busca)) {
                        posicao = i;
                    }
                }

                if (posicao == -1) {
                    System.out.println("Contato nao encontrado.");
                } else {
                    for (int i = posicao; i < total - 1; i++) {
                        contatos[i] = contatos[i + 1];
                    }
                    total--;
                    System.out.println("Contato removido!");
                }
            } else if (opcao == 5) {
                System.out.println("Ate logo!");
            } else {
                System.out.println("Opcao invalida!");
            }
        }
    }
}

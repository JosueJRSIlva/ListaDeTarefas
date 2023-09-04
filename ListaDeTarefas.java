import java.util.ArrayList;
import java.util.Scanner;

public class ListaDeTarefas {
    public static void main(String[] args) {
        ArrayList<String> tarefas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int escolha;

        do {
            System.out.println("===== Lista de Tarefas =====");
            System.out.println("1. Adicionar Tarefa");
            System.out.println("2. Listar Tarefas Pendentes");
            System.out.println("3. Marcar Tarefa como Concluída");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            escolha = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (escolha) {
                case 1:
                    System.out.print("Digite a tarefa a ser adicionada: ");
                    String tarefa = scanner.nextLine();
                    tarefas.add(tarefa);
                    System.out.println("Tarefa adicionada com sucesso!");
                    break;
                case 2:
                    System.out.println("Tarefas Pendentes:");
                    for (int i = 0; i < tarefas.size(); i++) {
                        System.out.println(i + ". " + tarefas.get(i));
                    }
                    break;
                case 3:
                    System.out.print("Digite o número da tarefa concluída: ");
                    int numeroTarefa = scanner.nextInt();
                    scanner.nextLine(); // Limpar o buffer
                    if (numeroTarefa >= 0 && numeroTarefa < tarefas.size()) {
                        tarefas.remove(numeroTarefa);
                        System.out.println("Tarefa marcada como concluída!");
                    } else {
                        System.out.println("Número de tarefa inválido!");
                    }
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (escolha != 4);

        scanner.close();
    }
}

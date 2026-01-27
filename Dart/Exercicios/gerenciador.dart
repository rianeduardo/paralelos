import 'dart:io';

void main() {
  List<String> tarefas = [];
  bool rodando = true;

  print("--- Lista de Tarefas ---");

  while (rodando) {
    print("\nO que deseja fazer?");
    print("1. Adicionar tarefa");
    print("2. Ver tarefas");
    print("3. Remover tarefa");
    print("4. Sair");
    stdout.write("Opção: ");

    String? opcao = stdin.readLineSync();

    switch (opcao) {
      case '1':
        stdout.write("Digite a nova tarefa: ");
        String? novaTarefa = stdin.readLineSync();
        if (novaTarefa != null && novaTarefa.isNotEmpty) {
          tarefas.add(novaTarefa);
          print("Tarefa adicionada!");
        }
        break;

      case '2':
        print("\n--- Suas Tarefas ---");
        if (tarefas.isEmpty) {
          print("A lista está vazia.");
        } else {
          for (int i = 0; i < tarefas.length; i++) {
            print("${i + 1}. ${tarefas[i]}");
          }
        }
        break;

      case '3':
        stdout.write("Digite o número da tarefa para remover: ");
        int? indice = int.tryParse(stdin.readLineSync() ?? "");
        if (indice != null && indice > 0 && indice <= tarefas.length) {
          String removida = tarefas.removeAt(indice - 1);
          print("Tarefa '$removida' removida.");
        } else {
          print("Número inválido.");
        }
        break;

      case '4':
        rodando = false;
        print("Saindo...");
        break;

      default:
        print("Opção inválida.");
    }
  }
}

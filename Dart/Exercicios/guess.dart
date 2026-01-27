import 'dart:io';
import 'dart:math';

void main() {
  Random random = Random();
  int numeroSecreto = random.nextInt(101);
  int tentativas = 0;
  int? palpite;

  print("--- Jogo de Adivinhação ---");
  print("Tente adivinhar o número entre 0 e 100!");

  do {
    stdout.write("Digite seu palpite: ");
    String? input = stdin.readLineSync();

    if (input != null && input.isNotEmpty) {
      palpite = int.tryParse(input);

      if (palpite != null) {
        tentativas++;
        if (palpite < numeroSecreto) {
          print("O número secreto é MAIOR que $palpite.");
        } else if (palpite > numeroSecreto) {
          print("O número secreto é MENOR que $palpite.");
        }
      } else {
        print("Por favor, digite um número válido.");
      }
    }
  } while (palpite != numeroSecreto);

  print(
    "\nParabéns! Você acertou o número $numeroSecreto em $tentativas tentativas.",
  );
}

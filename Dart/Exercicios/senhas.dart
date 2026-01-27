import 'dart:io';
import 'dart:math';

void main() {
  print("--- Gerador de Senhas ---");

  stdout.write("Quantos caracteres deve ter a senha? ");
  int tamanho = int.parse(stdin.readLineSync()!);

  const letrasMin = "abcdefghijklmnopqrstuvwxyz";
  const letrasMai = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
  const numeros = "0123456789";
  const especiais = "@#%&*!_";

  String caracteresPermitidos = letrasMin + letrasMai + numeros + especiais;
  String senha = "";

  Random random = Random();

  for (int i = 0; i < tamanho; i++) {
    int indice = random.nextInt(caracteresPermitidos.length);
    senha += caracteresPermitidos[indice];
  }

  print("\nSua nova senha é: $senha");
}

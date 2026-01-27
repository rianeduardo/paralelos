import 'dart:io';

void main() {
  print("--- Conversor de Temperaturas ---");
  print("1. Celsius para Fahrenheit");
  print("2. Fahrenheit para Celsius");
  stdout.write("Escolha uma opção (1 ou 2): ");

  String? opcao = stdin.readLineSync();

  if (opcao == '1') {
    stdout.write("Digite a temperatura em Celsius: ");
    double c = double.parse(stdin.readLineSync()!);
    double f = c * 1.8 + 32;
    print("$c°C equivale a ${f.toStringAsFixed(1)}°F");
  } else if (opcao == '2') {
    stdout.write("Digite a temperatura em Fahrenheit: ");
    double f = double.parse(stdin.readLineSync()!);
    double c = (f - 32) / 1.8;
    print("$f°F equivale a ${c.toStringAsFixed(1)}°C");
  } else {
    print("Opção inválida.");
  }
}

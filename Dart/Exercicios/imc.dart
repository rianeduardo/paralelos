import 'dart:io';
import 'dart:math';

void main() {
  print("--- Calculadora de IMC ---");

  stdout.write("Digite seu peso (kg): ");
  double peso = double.parse(stdin.readLineSync()!);

  stdout.write("Digite sua altura (m): ");
  double altura = double.parse(stdin.readLineSync()!);

  double imc = peso / pow(altura, 2);

  print("\nSeu IMC é: ${imc.toStringAsFixed(2)}");

  if (imc < 18.5) {
    print("Classificação: Abaixo do peso");
  } else if (imc >= 18.5 && imc < 24.9) {
    print("Classificação: Peso normal");
  } else if (imc >= 25 && imc < 29.9) {
    print("Classificação: Sobrepeso");
  } else {
    print("Classificação: Obesidade");
  }
}

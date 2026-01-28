import 'conta.dart';

void main() {
  ContaBancaria minhaConta = ContaBancaria("Rian WorldSkills", 100);

  print("Saldo inicial: ${minhaConta.saldo}");

  minhaConta.depositar(50.0);
  minhaConta.sacar(200.0);
  minhaConta.sacar(20.0);
}

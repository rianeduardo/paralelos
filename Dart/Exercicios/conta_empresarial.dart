import 'conta.dart';

class ContaEmpresarial extends ContaBancaria {
  double chequeEspecial;

  ContaEmpresarial(String titular, double saldo, this.chequeEspecial)
    : super(titular, saldo);

  @override
  void sacar(double valor) {
    double saldoDisponivel = saldo + chequeEspecial;
    if (saldoDisponivel >= valor) {
      saldo = saldo - valor;
      print("Saque feito! Saldo atual: R\$ $saldo");
    } else {
      print(
        "Erro! Você não possui esta quantia em sua conta $titular.\nSaldo atual: R\$ $saldo\nValor saque: R\$ $valor",
      );
    }
  }
}

class ContaBancaria {
  String titular;
  double saldo;

  ContaBancaria(this.titular, this.saldo);

  void depositar(double valor) {
    print("Depositando R\$ $valor...");
    saldo = saldo + valor;
    print("Depositado! Saldo atual: R\$ $saldo");
  }

  void sacar(double valor) {
    if (saldo >= valor) {
      saldo = saldo - valor;
      print("Saque feito! Saldo atual: R\$ $saldo");
    } else {
      print(
        "Erro! Você não possui esta quantia em sua conta $titular.\nSaldo atual: R\$ $saldo\nValor saque: R\$ $valor",
      );
    }
  }
}

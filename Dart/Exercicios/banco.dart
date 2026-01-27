class ContaBancaria {
  String titular;
  double saldo;

  ContaBancaria(this.titular, this.saldo);

  void depositar(double valor) {
    saldo += valor;
    print("Depósito de R\$ ${valor.toStringAsFixed(2)} realizado com sucesso.");
  }

  void sacar(double valor) {
    if (valor <= saldo) {
      saldo -= valor;
      print("Saque de R\$ ${valor.toStringAsFixed(2)} realizado.");
    } else {
      print(
        "Saldo insuficiente para saque de R\$ ${valor.toStringAsFixed(2)}.",
      );
    }
  }

  void exibirSaldo() {
    print("Conta de $titular | Saldo atual: R\$ ${saldo.toStringAsFixed(2)}");
  }
}

void main() {
  print("--- Sistema Bancário ---");

  var minhaConta = ContaBancaria("Rian Eduardo", 100.00);

  minhaConta.exibirSaldo();
  minhaConta.depositar(50.00);
  minhaConta.sacar(200.00);
  minhaConta.sacar(30.00);
  minhaConta.exibirSaldo();
}

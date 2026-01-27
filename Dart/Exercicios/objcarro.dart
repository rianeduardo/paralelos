class Carro {
  String modelo;
  int velocidade = 0;

  Carro(this.modelo);

  void acelerar(int aumento) {
    velocidade += aumento;
    print("$modelo acelerou! Velocidade atual: $velocidade km/h");
  }

  void frear(int reducao) {
    velocidade -= reducao;
    if (velocidade < 0) {
      velocidade = 0;
    }
    print("$modelo freou. Velocidade atual: $velocidade km/h");
  }

  void desligar() {
    velocidade = 0;
    print("$modelo foi desligado.");
  }
}

void main() {
  print("--- Simulador de Carro ---");

  Carro meuCarro = Carro("Audi R8");

  meuCarro.acelerar(20);
  meuCarro.acelerar(40);
  meuCarro.frear(10);
  meuCarro.frear(100);
  meuCarro.desligar();
}

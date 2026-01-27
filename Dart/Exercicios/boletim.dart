// Sem input por enquanto

class Aluno {
  String nome;
  List<double> notas = [];

  Aluno(this.nome);

  void adicionarNota(double nota) {
    if (nota >= 0 && nota <= 10) {
      notas.add(nota);
      print("Nota $nota adicionada para $nome.");
    } else {
      print("Nota inválida. Insira um valor entre 0 e 10.");
    }
  }

  double calcularMedia() {
    if (notas.isEmpty) return 0.0;
    double soma = notas.reduce((a, b) => a + b);
    return soma / notas.length;
  }

  bool estaAprovado() {
    return calcularMedia() >= 7.0;
  }
}

void main() {
  print("--- Sistema Escolar ---");

  Aluno aluno1 = Aluno("Maria");

  aluno1.adicionarNota(8.5);
  aluno1.adicionarNota(6.0);
  aluno1.adicionarNota(9.0);

  double media = aluno1.calcularMedia();
  print("\nMédia final de ${aluno1.nome}: ${media.toStringAsFixed(1)}");

  if (aluno1.estaAprovado()) {
    print("Situação: APROVADO");
  } else {
    print("Situação: REPROVADO");
  }
}

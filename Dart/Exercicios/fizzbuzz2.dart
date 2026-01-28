void main() {
  for (int i = 0; i <= 100; i++) {
    String resultado = analisarNumero(i);
    print(resultado);
  }
}

String analisarNumero(int numero) {
  if (numero % 3 == 0 && numero % 5 == 0) {
    return "FizzBuzz";
  } else if (numero % 3 == 0) {
    return "Fizz";
  } else if (numero % 5 == 0) {
    return "Buzz";
  } else {
    return numero.toString();
  }
}

package java;

import java.util.*;

public class Forca {
    public static void cls() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void add(Scanner sc, ArrayList<String> list) {
        cls();
        System.out.print("Digite a quantidade de palavras que você deseja cadastrar: ");
        int size = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < size; i++) {
            cls();
            System.out.print("N°" + (i + 1) + " | Digite a palavra: ");
            String hangman = sc.nextLine();
            list.add(hangman.toUpperCase());
        }
    }

    public static void jogar(Scanner sc, ArrayList<String> list) {
        if (list.isEmpty()) {
            System.out.println("Nenhuma palavra cadastrada. Pressione ENTER para voltar.");
            sc.nextLine();
            return;
        }

        Random rand = new Random();
        String palavra = list.get(rand.nextInt(list.size()));
        Set<Character> letrasTentadas = new HashSet<>();
        int erros = 0;
        int maxErros = 6;

        while (true) {
            cls();
            System.out.println("Erros: " + erros + " de " + maxErros);
            System.out.print("Palavra: ");

            boolean ganhou = true;
            for (int i = 0; i < palavra.length(); i++) {
                char c = palavra.charAt(i);
                if (c == ' ') {
                    System.out.print("  ");
                } else if (letrasTentadas.contains(c)) {
                    System.out.print(c + " ");
                } else {
                    System.out.print("_ ");
                    ganhou = false;
                }
            }

            System.out.println();

            if (ganhou) {
                System.out.println("\nVocê venceu! A palavra era: " + palavra);
                break;
            }

            if (erros >= maxErros) {
                System.out.println("\nVocê perdeu! A palavra era: " + palavra);
                break;
            }

            System.out.print("\nDigite uma letra: ");
            String input = sc.nextLine().toUpperCase();

            if (input.length() > 0) {
                char letra = input.charAt(0);
                if (!letrasTentadas.contains(letra)) {
                    letrasTentadas.add(letra);
                    if (palavra.indexOf(letra) == -1) {
                        erros++;
                    }
                }
            }
        }
        System.out.println("Pressione ENTER para continuar...");
        sc.nextLine();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> palavras = new ArrayList<>();

        while (true) {
            cls();
            System.out.println("=== JOGO DA FORCA ===");
            System.out.println("1. Cadastrar Palavras");
            System.out.println("2. Jogar");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");

            try {
                int opcao = sc.nextInt();
                sc.nextLine();

                if (opcao == 1) {
                    add(sc, palavras);
                } else if (opcao == 2) {
                    jogar(sc, palavras);
                } else if (opcao == 3) {
                    break;
                }
            } catch (Exception e) {
                sc.nextLine();
            }
        }
        sc.close();
    }
}
package java;

import java.util.ArrayList;
import java.util.Scanner;

public class Produto {
    public String nome;
    public double preco;
    public int estoque;

    public Produto(String nome, double preco, int estoque) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Produto: " + nome + " | Preço: R$" + preco + " | Estoque: " + estoque;
    }

    public static void limparTela() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void registrar(ArrayList<Produto> lista, Scanner sc) {
        limparTela();
        System.out.print("Registre o nome do produto: ");
        String nome = sc.nextLine();
        System.out.print("Registre o preço do produto: ");
        double preco = sc.nextDouble();
        System.out.print("Registre o estoque do produto: ");
        int estoque = sc.nextInt();
        sc.nextLine();
        Produto p = new Produto(nome, preco, estoque);
        lista.add(p);
        System.out.print("Produto registrado: '" + nome + "'");
        System.out.print("\n\nENTER para continuar...");
        sc.nextLine();
    }

    public static void pesquisar(ArrayList<Produto> lista, Scanner sc) {
        limparTela();
        int num = 0;
        System.out.println(
                "=-=-= Menu =-=-=\n\nN: Pesquisa por nome\nC: Cancelar\n\n================");
        System.out.print("\nEscolha uma opção: ");
        String op = sc.nextLine().toLowerCase();

        if (op.equals("n")) {
            boolean achou = false;
            System.out.print("\n\nDigite o nome a ser pesquisado (Cuidado com caractéres especiais): ");
            String search = sc.nextLine().toLowerCase();
            for (Produto p : lista) {
                if (p.getNome().toLowerCase().contains(search)) {
                    achou = true;
                    num = lista.indexOf(p);
                    break;
                }
            }
            if (achou == true) {
                limparTela();
                System.out.println(
                        "Encontrado!\n\n=-=-= Menu =-=-=\n\nE: Editar\nR: Remover\nC: Cancelar\n\n================");
                System.out.print("\nEscolha uma opção: ");
                String ops = sc.nextLine().toLowerCase();

                if (ops.equals("e")) {
                    limparTela();
                    System.out.print("Digite o nome do novo produto: ");
                    String nomeNovo = sc.nextLine();
                    System.out.print("Digite o preço do novo estoque: ");
                    double precoNovo = sc.nextDouble();
                    System.out.print("Digite o estoque do novo produto: ");
                    int estoqueNovo = sc.nextInt();
                    sc.nextLine();
                    Produto pNovo = new Produto(nomeNovo, precoNovo, estoqueNovo);
                    lista.set(num, pNovo);
                    limparTela();
                    System.out.print("Sucesso! O produto foi substituído.\n\nENTER para continuar...");
                    sc.nextLine();
                } else if (ops.equals("r")) {
                    lista.remove(num);
                    limparTela();
                    System.out.print("Sucesso! O produto foi removido.\n\nENTER para continuar...");
                    sc.nextLine();
                } else if (ops.equals("c")) {
                    return;
                } else {
                    limparTela();
                    System.out.println(
                            "ERRO! Selecione uma opção válida dentre as presentadas. \n\nENTER para continuar...");
                    sc.nextLine();

                }
            }
        } else if (op.equals("c")) {
            return;
        } else {
            limparTela();
            System.out.print("ERRO! Selecione uma opção válida dentre as presentadas.\n\nENTER para continuar...");
            sc.nextLine();
        }
    }

    public static void main(String[] args) {
        ArrayList<Produto> lista = new ArrayList<Produto>();
        Scanner sc = new Scanner(System.in);
        boolean run = true;
        while (run == true) {
            limparTela();
            System.out.println(
                    "=-=-= Menu =-=-=\n\nR: Registro\nP: Pesquisa\nE: Exibir\nC: Cancelar\n\n================");
            System.out.print("\nEscolha uma opção: ");
            String op = sc.nextLine().toLowerCase();

            if (op.equals("r")) {
                registrar(lista, sc);
            } else if (op.equals("p")) {
                pesquisar(lista, sc);
            } else if (op.equals("e")) {
                limparTela();
                for (Produto p : lista) {
                    System.out.println(p);
                }
                System.out.print("\n\nENTER para continuar...");
                sc.nextLine();
            } else if (op.equals("c")) {
                break;
            } else {
                limparTela();
                System.out.print("ERRO! Selecione uma opção válida dentre as presentadas.\n\nENTER para continuar...");
                sc.nextLine();
            }
        }
    }
}
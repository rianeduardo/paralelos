import java.util.Scanner;

public class Ex {
    public static void main(String[] args){
        boolean inCourse = true;
        Scanner inp = new Scanner(System.in);
        String order = "";
        double price = 0;
        System.out.println("Digite seu nome para começar o atendimento:");
        String name = inp.nextLine();
        System.out.println("Ótimo "+name+"! É muito bom ter você como nosso cliente.\n\n");
        System.out.println("Cardápio da casa:\n1: X-Burguer | Pão, carne, queijo, molho da casa | R$20.00\n2: Batata-frita | Acompanha salada e pãos ao azeite e orégano | R$25.00\n3: Refrigerantes | Pepsi, Coca, Fanta, Tônica | R$8.00\n\n");
        while(inCourse == true){
            System.out.println("Digite o número do seu pedido: ");
            int orderA = inp.nextInt();
            inp.nextLine();
            switch (orderA) {
                case 1:
                    order = order + "X-Burguer. ";
                    price = price + 20.00;
                    break;
                case 2:
                    order = order + "Batata-frita. ";
                    price = price + 25.00;
                    break;
                case 3:
                    System.out.println("Cardápio de bebidas\n1: Coca-Cola\n2: Pepsi\n3: Tônica\n4: Fanta\n5: Guaraná Antártica\n*TODOS* tem o mesmo valor. (R$8.00)");
                    price = price + 8.00;
                    int drinks = inp.nextInt();
                    inp.nextLine();
                    switch (drinks) {
                        case 1:
                            order = order + "Coca-Cola. ";
                            break;
                        case 2:
                            order = order + "Pepsi. ";
                            break;
                        case 3:
                            order = order + "Tônica. ";
                            break;
                        case 4:
                            order = order + "Fanta. ";
                            break;
                        case 5:
                            order = order + "Guaraná Antártica. ";
                            break;
                        default:
                            System.out.println("ERRO! Selecione uma opção válida.");
                            break;
                    }
                    break;
                default:
                    System.out.println("ERRO! Selecione uma opção válida.");
                    break;
            }
            boolean confirm = false;
            while(confirm == false){
            System.out.println("\n\nDeseja pedir algo a mais? (S/n)");
            String cont = inp.nextLine();
            if(cont.equalsIgnoreCase("n")){
                inCourse = false;
                confirm = true;
            }
            else if(cont.equalsIgnoreCase("s")) {
                inCourse = true;
                confirm = true;
            }
            else {
                System.out.println("ERRO! Selecione uma opção válida.");
            }
        }
        }
                for(int i = 0; i < 50; i++){
            System.out.println(" ");
        }
        System.out.println("Ótimo! "+name+".\nPedido: "+order+"\nPreço total: "+price);
        inp.close();
    }
}
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] Args) {
        Scanner Entrada = new Scanner(System.in);
        Produto produto = new Produto();
        int op;
        int req = 0;
        int info = 0;
        int remove = 0;

        String resposta;

        ArrayList<String> produtos = new ArrayList<>();

        do {
            System.out.println("\n" + //
                    "Bem vindo ao Hub central do Market Place, o que você deseja hoje ?");
            System.out.println(" ");
            System.out.println("1 - Criar um produto");
            System.out.println("2 - Alterar um produto");
            System.out.println("3 - Excluir um produto");
            System.out.println("4 - Listar todos os produtos");
            System.out.println("5 - Sair");
            op = Entrada.nextInt();
            Entrada.nextLine();

            switch (op) {
                case 1:
                    System.out.println("Digite onde se encontra seu imóvel:");
                    String endereco = Entrada.nextLine().trim();

                    System.out.println("O imóvel está à venda? ");
                    resposta = Entrada.nextLine().toLowerCase();
                    boolean avenda = resposta.equals("sim") || resposta.equals("true");

                    String preco = null;
                    if (avenda) {
                        System.out.println("Digite quanto você está cobrando:");
                        preco = Entrada.nextLine().trim();
                    }

                    System.out.println("O imóvel é novo? (sim/não)");
                    resposta = Entrada.nextLine().trim().toLowerCase();
                    boolean nova = resposta.equals("sim") || resposta.equals("true");

                    System.out.println("Informe qual é o seu imóvel (ex: Casa, Apartamento etc..)");
                    String imovel = Entrada.nextLine().trim();

                    
                    Produto novoProduto = new Produto(imovel, endereco, preco, avenda, nova);
                    produtos.add(Produto.index(novoProduto.getEndereco(), novoProduto.getImovel(), novoProduto.isAvenda(),
                                    novoProduto.isNova(), novoProduto.getPreco()));

                    req++;
                    break;
                case 2:
                    if (req == 0) {
                        System.out.println(
                                "Err! Parece que você está tentando alterar sem ao menos ter criado um objeto!");
                    } else {
                        System.out.println("Listando todos objetos...");
                        for (int i = 0; i < produtos.size(); i++) {
                            System.out.println("\n[\n Index: " + i + "\n" + produtos.get(i) + "\n ]\n");
                            ;
                        }
                        System.out.println("Qual objeto você quer alterar?");
                        info = Entrada.nextInt();
                        if (info<produtos.size() || info>produtos.size() ) {
                            System.out.println(
                                "Err! Parece que você está tentando colocar um index inexistente");
                            break;
                        }else{
                            
                        Entrada.nextLine();
                        System.out.println("Digite onde se encontra seu imóvel:");
                        produto.setEndereco(Entrada.nextLine().trim());

                        System.out.println("O imóvel está a venda?");
                        resposta = Entrada.nextLine().toLowerCase();

                        if (resposta.equals("sim") || resposta.equals("true")) {
                            produto.setAvenda(true);
                        } else {
                            produto.setAvenda(false);
                        }

                        if (produto.isAvenda()) {
                            System.out.println("Digite quanto você está cobrando:");
                            produto.setPreco(Entrada.nextLine().trim());
                        }

                        System.out.println("O imóvel é novo?");
                        resposta = Entrada.nextLine().trim().toLowerCase();

                        if (resposta.equals("sim") || resposta.equals("true")) {
                            produto.setNova(true);
                        } else {
                            produto.setNova(false);
                        }

                        System.out.println("Informe qual é o seu imóvel (ex: Casa, Apartamento etc..)");
                        produto.setImovel(Entrada.nextLine().trim());
                        produtos.set(info, Produto.index(produto.getEndereco(), produto.getImovel(), produto.isAvenda(),
                                produto.isNova(), produto.getPreco()));
                        }
                    }

                    break;
                case 3:
                    if (req == 0 && produtos.size() <= 0) {
                        System.out.println(
                                "Err! Parece que você está tentando excluir sem ao menos ter criado um objeto!");
                    } else {
                        System.out.println("Listando todos objetos...");
                        for (int i = 0; i < produtos.size(); i++) {

                            System.out.println("\n[\n Index: " + i + "\n" + produtos.get(i) + "\n ]\n");
                        }

                        System.out.println("Qual produto você deseja remover? (utilize o index para remover)");
                        remove = Entrada.nextInt();
                        if (remove > produtos.size() || remove < 0) {
                            System.out.println("Você digitou um número que não está no index");
                        } else {
                            produtos.remove(remove);
                            System.out.println("Lista removida, formulários restantes:");
                            for (int i = 0; i < produtos.size(); i++) {
                                System.out.println("\n[\n Index: " + i + "\n" + produtos.get(i) + "\n ]\n");
                            }
                        }
                    }
                    break;

                case 4:
                    if (req == 0) {
                        System.out.println(
                                "Err! Parece que você está tentando listar sem ao menos ter criado um objeto!");
                        break;

                    } else {
                        for (int i = 0; i < produtos.size(); i++) {
                            System.out.println("\n[\n Index: " + i + "\n" + produtos.get(i) + "\n ]\n");
                        }
                        System.out.println("Pressione Enter para continuar...");
                        Entrada.nextLine();
                    }
                    break;
                case 5:
                    System.out.println("Saindo do programa!");
                    break;
                default:
                    System.out.println("Digite uma das opções acima!");
                    break;

            }
        } while (op != 5);
    }
}
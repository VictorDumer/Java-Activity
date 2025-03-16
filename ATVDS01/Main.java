import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] Args){
        Scanner Entrada = new Scanner(System.in);
        int op;
        int req=0;
        int info=0;
        int remove=0;

        String preco, resolve, resposta;
        String resultado="";
        String endereco,imovel;
        boolean avenda= false;
        boolean nova = false;

        ArrayList<String> produtos = new ArrayList<>();
        
        do{
        System.out.println("\n" + //
                        "Bem vindo ao Hub central do Market Place, o que você deseja hoje ?");
        System.out.println(" ");
        System.out.println("1 - Criar um produto");
        System.out.println("2 - Excluir um produto");
        System.out.println("3 - Listar todos os produtos");
        System.out.println("4 - Sair");
        op = Entrada.nextInt();
        resolve= Entrada.nextLine();

            switch (op) {
                case 1:
                
                System.out.println("Digite onde se encontra seu imóvel:");
                endereco= Entrada.nextLine();
                
                    System.out.println("O imóvel está a venda?");
                    resposta = Entrada.nextLine().toLowerCase();

                    if (resposta.equals("sim") || resposta== "true") {
                        avenda=true;
                    }else{
                        avenda=false;
                    }

                if (avenda) {
                    System.out.println("Digite quanto você está cobrando:");
                    preco = Entrada.nextLine();

                }else{
                    preco=null;
                }
                System.out.println("O imóvel é novo?");
                resposta = Entrada.nextLine().trim().toLowerCase();
                
                if (resposta.equals("sim") || resposta== "true") {
                    nova=true;
                }else{
                    nova=false;
                }
                
                System.out.println("Informe se o seu imóvel é uma casa ou apartamento:");
                imovel = Entrada.nextLine();

                Produto novoProduto = new Produto(info,imovel, endereco, preco, avenda, nova);
                produtos.add(novoProduto.index(info,endereco, imovel, avenda, nova, preco));
                
                info=produtos.size();
                req++;
                
                break;
             case 2:
                if (req==0) {
                    System.out.println("Err! Parece que você está tentando excluir sem ao menos ter criado um objeto!");                  
                }else{
                    System.out.println("Listando todos objetos...");
                    System.out.println(produtos);
                    System.out.println("Qual produto você deseja remover? (utilize o index para remover)");
                    remove= Entrada.nextInt();
                    if (remove>produtos.size() || remove<0) {
                        System.out.println("Você digitou um número que não está no index");
                    }else{
                        produtos.remove(remove);
                        System.out.println("Lista removida, formulários restantes:");
                        System.out.println(produtos);
                    }
                }
             break;
             case 3:
                if (req==0) {
                    System.out.println("Err! Parece que você está tentando listar sem ao menos ter criado um objeto!");                  
                break;

                }else{
                    System.out.println(produtos);
                    System.out.println("Pressione Enter para continuar...");
                    Entrada.nextLine();
                }
                break;
               
             case 4:
             
             break;
             default:
             System.out.println("Digite uma das opções acima!");
             break;
             
            }
        }while(op!=4);
        }  
    }
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] Args){
        Scanner Entrada = new Scanner(System.in);
        int op; 
        Produto produtos = new Produto ();
        System.out.println("Bem vindo ao Market Place, o que você deseja hoje ?");
        System.out.println(" ");
        System.out.println("1 - Criar um produto");
        System.out.println("2 - Excluir um produto");
        System.out.println("3 - Listar todos os produtos");
        System.out.println("4 - Sair");
        op = Entrada.nextInt();
        
        switch (op) {
            case 1:
                System.out.println("Digite onde se encontra seu imóvel?");
                String endereco= Entrada.nextLine();

                System.out.println("O imóvel está a venda?");
                boolean avenda = Entrada.nextBoolean();

                if (avenda) {
                    
                    System.out.println("Digite quanto você está cobrando");
                    boolean preco= Entrada.nextBoolean();

                }
                System.out.println("O imóvel é novo?");
                boolean nova = Entrada.nextBoolean();


                System.out.println("Informe qual é seu imóvel?");
                String imovel = Entrada.nextLine();


                
                
                break;
             case 2:
                
                break;
             case 3:
                
            break;
        
            case 4:

            break;
            default:
                break;
        }
        }  
    }
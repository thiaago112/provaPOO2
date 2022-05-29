import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);

        List<Produtos> listaDeProdutos = new ArrayList<>();

        String nomeProduto;
        boolean encontrei = false;
        Produtos prodBuscando = null;
        int posicao = 0;

        String opcao;

        do{
            limparTela();
            System.out.println("********************");
            System.out.println("*****BEM VINDO******");
            System.out.println("********************");
            System.out.println("1 - INCLUIR PRODUTO ");
            System.out.println("2 - CONSULTAR PRODUTO ");
            System.out.println("3 - LISTAGEM DE PRODUTOS ");
            System.out.println("4 - VENDAS POR PERÍODO - DETALHADO ");
            System.out.println("5 - REALIZAR VENDA ");
            System.out.println("0 - SAIR ");
            opcao = scanner.next();

            scanner.nextLine();

            switch (opcao){
                case "1": 
                Produtos produtos = new Produtos();
            
            System.out.println("CADASTRO DE PRODUTOS");
            System.out.println("CÓDIGO DO PRODUTO: ");
            produtos.setCodigo(scanner.nextInt());
            System.out.println("NOME DO PRODUTO: ");
            produtos.setNome(scanner.next());
            System.out.println("VALOR DO PRODUTO: ");
            produtos.setValor(scanner.nextInt());
            System.out.println("QUANTIDADE EM ESTOQUE: ");
            produtos.setQuantidadeEstoque(scanner.nextInt());

            listaDeProdutos.add(produtos);
            break;

            case "2":
                System.out.println("PESQUISE PELO PRODUTO DESEJADO:  ");
                nomeProduto = scanner.nextLine();

                encontrei = false;
                prodBuscando = null;

                for (Produtos itemProdutos : listaDeProdutos){
                    if (itemProdutos.getNome().equalsIgnoreCase(nomeProduto)){
                        encontrei = true;
                        prodBuscando = itemProdutos;
                    }
                }

                if (encontrei){
                    System.out.println("PRODUTO ENCONTRADO:  " +prodBuscando);
                } else {
                    System.out.println("PRODUTO NAO ENCONTRADO, FAVOR BUSCAR NOVAMENTE");
                }

                System.out.println("PRESSIONE ENTER PARA CONTINUAR  ");
                scanner.nextLine();
                break;

            case "3":
            System.out.println("LISTA DE PRODUTOS");
            if (listaDeProdutos.isEmpty()){
                System.out.println("NENHUM PRODUTO NA LISTA");

            }else {
                for (Produtos itemProdutos : listaDeProdutos ){
                    System.out.println(itemProdutos);
                }
            }

            System.out.println("PRESSIONE ENTER PARA CONTINUAR ");
            scanner.nextLine();
            break;

            case "4":

            // Não concluí esta opção ainda, tive dificuldades
            System.out.println("****OPÇÃO EM DESENVOLVIMENTO****");
            System.out.println("****PRESSIONE ENTER PARA CONTINUAR****");
            scanner.nextLine();
            break;

            case "5":
                System.out.println("INFORME O PRODUTO VENDIDO:  ");
                nomeProduto = scanner.nextLine();

                encontrei = false;
                prodBuscando = null;

                for (Produtos itemProdutos : listaDeProdutos){
                    if (itemProdutos.getNome().equalsIgnoreCase(nomeProduto)){
                        encontrei = true;
                        prodBuscando = itemProdutos;
                    }
                }

                if (encontrei){
                    listaDeProdutos.remove(prodBuscando);
                    System.out.println("VENDA REALIZADA, PRODUTO REMOVIDO DO ESTOQUE ");
                } else { 
                    System.out.println( "PRODUTO NÃO ENCONTRADO ");
                }

                System.out.println("Pressione ENTER para continuar...");
                    scanner.nextLine();    
                    break;


            case "0":

            System.out.println("ENCERRANDO.....");
            break;

            default:
                System.out.println("OPÇÃO INVÁLIDA");

                System.out.println("pressione enter para continuar...");
                scanner.nextLine();
                break;

        }

    } while ( !opcao.equals( "0"));

}

    private static void limparTela() {
        for (int i = 0; i < 20; i++) {
            System.out.println();
        }
    }
}

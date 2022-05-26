import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    private static Produtos[] produtos = new Produtos[100];
    private static int numeroProdutos = 0;
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        
        
           
        boolean continuarExecutando = true;
        do {
            try {
                imprimirMenu();
                int opcao = lerOpcao();
                continuarExecutando = executarOpcao(opcao);
            } catch (Exception e) {
                System.out.println("Ocorreu um erro durante a operação: " + e.getMessage());
                continuarExecutando = true;
            }
        } while (continuarExecutando);
    }
    
        

        private static boolean executarOpcao(int opcao) throws Exception {
            switch (opcao) {
                case 1: {
                    cadastrarProduto();
                    break;
                }
                /*case 2: {
                    consultarProduto();
                    break;
                }
                case 3: {
                    listarProdutos();
                    break;
                }
                case 4: {
                    vendaPeriodo();
                    break;
                }
                case 5: {
                    realizarVenda();
                    break;
                }*/
                case 0: {
                    System.out.println(" ENCERRANDO... ");
                    return false;
                }
        
            }
            return true;
            
        }
        
        private static void adicionarProdutoNaLista(Produtos[] produtos2){
           
            for (int i = 0; i < produtos2.length; i++) {
                numeroProdutos++;
                
            }
            
           }  
            



        private static void cadastrarProduto() throws InputMismatchException{
            System.out.println(" CADASTRO DE PRODUTOS ");
            System.out.println("CÓDIGO: ");
            int codigo = scanner.nextInt();
            System.out.println(" NOME: ");
            String nome = scanner.nextLine();
            System.out.println(" VALOR: ");
            double valor = scanner.nextDouble();
            System.out.println(" QUANTIDADE: ");
            int quantidadeEstoque = scanner.nextInt();

            Produtos produto = new Produtos(codigo, nome, valor, quantidadeEstoque);
            adicionarProdutoNaLista(produtos);


        }



    

        private static void imprimirMenu() {
        System.out.println("********************");
        System.out.println("*    BEM VINDO   *");
        System.out.println("********************");
        System.out.println("1 - INCLUIR PRODUTO ");
        System.out.println("2 - CONSULTAR PRODUTO ");
        System.out.println("3 - LISTAGEM DE PRODUTOS ");
        System.out.println("4 - VENDAS POR PERÍODO - DETALHADO ");
        System.out.println("5 - REALIZAR VENDA ");
        System.out.println("0 - SAIR ");
        }

        private static boolean validarOpcaoMenu(int opcao) {
            return (opcao >= 1 && opcao <= 9);
        }

        

        private static int lerOpcao() {
            int opcao = 0;
            do {
                System.out.println("Selecione a opção desejada: ");
                try {
                    opcao = Integer.parseInt(scanner.nextLine());
                    if (!validarOpcaoMenu(opcao)) {
                        System.out.println("Opção inválida!");
                    }
                } catch (Exception e) {
                    System.out.println("Opção inválida!");
                    scanner.nextLine();
                }
            } while (!validarOpcaoMenu(opcao));
    
            return opcao;
        }
}




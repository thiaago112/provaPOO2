import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
           
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
                case 2: {
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
                }
                case 0: {
                    System.out.println(" SAINDO DO SISTEMA... ");
                    return false;
                }
        
            }
            return true;
            
        }

    
        


    }

    private static boolean executarOpcao(int opcao) {
        return false;
    }

    private static void imprimirMenu() {
    }

    private static int lerOpcao() {
        return 0;
    }



/*

System.out.println("********************");
        System.out.println("    BEM VINDO   ");
        System.out.println("********************");
        System.out.println("1 - INCLUIR PRODUTO ");
        System.out.println("2 - CONSULTAR PRODUTO ");
        System.out.println("3 - LISTAGEM DE PRODUTOS ");
        System.out.println("4 - VENDAS POR PERÍODO - DETALHADO ");
        System.out.println("5 - REALIZAR VENDA ");
        System.out.println("0 - SAIR ");


*/
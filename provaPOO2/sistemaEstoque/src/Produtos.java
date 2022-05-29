public class Produtos {

    private int codigo;
    private String nome;
    private double valor;
    private int quantidadeEstoque;
    public int length;
    
public Produtos(){

}



public Produtos(int codigo, String nome, double valor, int quantidadeEstoque){
    this.codigo = codigo;
    this.nome = nome;
    this.valor = valor;
    this.quantidadeEstoque = quantidadeEstoque;
}

public int getQuantidadeEstoque() {
    return quantidadeEstoque;
}

public void setQuantidadeEstoque(int quantidadeEstoque) {
    this.quantidadeEstoque = quantidadeEstoque;
}

public double getValor() {
    return valor;
}

public void setValor(double valor) {
    this.valor = valor;
}

public String getNome() {
    return nome;
}

public void setNome(String nome) {
    this.nome = nome;
}

public int getCodigo() {
    return codigo;
}

public void setCodigo(int codigo) {
    this.codigo = codigo;
}



@Override
public String toString() {
    return "Produtos  [Código: " + codigo + " - Nome: " + nome + " - Valor: " + valor + " - Estoque: " + quantidadeEstoque + "]";
}



}

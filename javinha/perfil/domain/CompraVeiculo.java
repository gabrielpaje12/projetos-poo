package perfil.domain;
public class CompraVeiculo {

    private int ano;
    private double preco;

    public CompraVeiculo(int ano, double preco) {
     
        this.ano = ano;
        this.preco = preco;
    }

    public void Imprime() {
      

        System.out.println("Ano: " + ano);
        System.out.println("Preço: " + preco);
    }

    public int getAno() {
        return ano;
    }

    public double getPreco() {
        return preco;
    }

}

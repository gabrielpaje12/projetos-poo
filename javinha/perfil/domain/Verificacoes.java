package perfil.domain;

public class Verificacoes {

    public static void VerificaCompra(perfilPessoa perfil, CompraVeiculo compra) {
        if (perfil.getSalario() < compra.getPreco()) {
            System.out.println("A pessoa não pode comprar o veículo.");
        } else {
            System.out.println("A pessoa pode comprar o veículo.");
        }
    }

    public static double CalcularResto(perfilPessoa perfil, CompraVeiculo compra) {
        return perfil.getSalario() - compra.getPreco();
    }

    public static double CalcularCredito(perfilPessoa perfil, CompraVeiculo compra) {
        if (perfil.getSalario() < compra.getPreco()) {
            System.out.println("Voce vai ficar devendo: " + CalcularResto(perfil, compra));
        } else {
            System.out.println("Voce vai ficar com um credito de: " + CalcularResto(perfil, compra));
        }
        return 0;
    }

    public static void Imprime(perfilPessoa perfil, CompraVeiculo compra) {

        CalcularCredito(perfil, compra);

    }
}

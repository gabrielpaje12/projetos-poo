package perfil.test;

import perfil.domain.Carro;
import perfil.domain.CompraVeiculo;
import perfil.domain.Verificacoes;
import perfil.domain.perfilPessoa;
public class CarroTest {
    public static void main(String[] args) {
        Carro carro1 = new Carro("BMW", 270, 250);
        Carro carro2 = new Carro("GTR", 320 , 250);
        Carro carro3 = new Carro("Fusca", 150 , 250);
        perfilPessoa perfil = new perfilPessoa("Gabriel", 19, 200000);
        CompraVeiculo compraveiculo1 = new CompraVeiculo(2022, 90000);
        CompraVeiculo compraveiculo2 = new CompraVeiculo(1999, 300000);
        CompraVeiculo compraveiculo3 = new CompraVeiculo(1995, 150000);
        Verificacoes verificacoes = new Verificacoes();
        perfil.Imprime();
        carro1.Imprime();
        compraveiculo1.Imprime();
        System.out.println("-------------------------");
        System.out.println("Verificando compra para " + perfil.getNome() + "...");
        verificacoes.VerificaCompra(perfil, compraveiculo1);
        verificacoes.Imprime(perfil, compraveiculo1);

        carro2.Imprime();
        compraveiculo2.Imprime();   
         System.out.println("-------------------------");
        System.out.println("Verificando compra para " + perfil.getNome() + "...");
        verificacoes.VerificaCompra(perfil, compraveiculo2);
        verificacoes.Imprime(perfil, compraveiculo2);

        carro3.Imprime();
        compraveiculo3.Imprime();
         System.out.println("-------------------------");
        System.out.println("Verificando compra para " + perfil.getNome() + "...");
        verificacoes.VerificaCompra(perfil, compraveiculo3);
        verificacoes.Imprime(perfil, compraveiculo3);
    }
   

}


package perfil.domain;
public class Carro {
    private String nome;
    private double VelocidadeMaxima; 
    private  static double  VelocidadeLimite = 250;

 public void Imprime (){
    System.out.println("-------------------------------------");
    System.out.println("Nome: " + nome);
    System.out.println("Velocidade Maxima: " + this.VelocidadeMaxima);
    System.out.println("Velocidade Limite: " + Carro.VelocidadeLimite);
    VelocidadeMax();
 }



public  void VelocidadeMax() {
    if (VelocidadeMaxima > VelocidadeLimite) {
        System.out.println("A velocidade máxima do carro " + nome + " excede o limite permitido.");
        return;

    }else {
        System.out.println("A velocidade máxima do carro " + nome + " está dentro do limite permitido.");
    }
    
}

    public Carro(String nome, double VelocidadeMaxima, double VelocidadeLimite) {
        this.nome = nome;
        this.VelocidadeMaxima = VelocidadeMaxima;
        Carro.VelocidadeLimite = VelocidadeLimite;
    }

    public String getNome() {
        return nome;
    }

    public double getVelocidadeMaxima() {
        return VelocidadeMaxima;
    }

    public double getVelocidadeLimite() {
        return VelocidadeLimite;
    }
}

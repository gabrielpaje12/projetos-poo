package perfil.domain;


public class perfilPessoa {
    private String nome;
    private int idade;
    private double salario;


    public perfilPessoa(String nome, int idade, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

   
  public void Imprime (){
    System.out.println("-------------------------------------");
    System.out.println("Nome: " + nome);
    System.out.println("Idade: " + idade);
    System.out.println("Salario: " + salario);
  }
public String getNome() {
    return nome;
}
public int getIdade() {
    return idade;
}
public double getSalario() {
    return salario;
}
}
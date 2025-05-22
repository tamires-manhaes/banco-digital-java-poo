public class Cliente {
  private String nome;
  private String cpf;
  private String email;
  private Conta conta;

  public Cliente(String nome, String cpf, String email) {
     this.nome = nome;
     this.cpf = cpf;
     this.email = email;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  protected void criarConta(Cliente cliente, Conta conta) {
    this.conta = conta;
  }
}

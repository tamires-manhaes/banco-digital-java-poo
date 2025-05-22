import java.util.ArrayList;
import java.util.List;

public class Banco {
  private String nome;
  private List<Conta> contas;

  public Banco(String nome){
    this.nome = nome;
    this.contas = new ArrayList<>();

  }

  public String getNome() {
    return nome;
  }

  public List<Conta> getContas() {
    return contas;
  }

  public void addConta(Conta conta){
    this.contas.add(conta);
  }

  public void listarContas(){
    this.contas.forEach(conta -> {
      System.out.println("========== Conta ==========");
      System.out.println(String.format("Titular: %s",conta.getCliente().getNome()));
      System.out.println(String.format("Numero: %s",conta.getNumero()));
      System.out.println(String.format("Agencia: %s",conta.getAgencia()));
      System.out.println(String.format("Saldo: %.2f",conta.getSaldo()));

    });
  }
}

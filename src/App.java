import java.util.Scanner;

public class App {
  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o numero da conta: ");
    String numeroConta = scanner.nextLine();
    System.out.println("Digite o saldo inicial: ");
    double saldoInicial = scanner.nextDouble();

    ContaBancaria conta = new ContaBancaria(numeroConta, saldoInicial);

    boolean continuar = true;

    while (continuar) {
      System.out.println("\nEscolha uma operação: ");
      System.out.println("1. Depositar");
      System.out.println("2. Sacar");
      System.out.println("3. Ver Saldo");
      System.out.println("4. Sair");

      int opcao = scanner.nextInt();

      switch (opcao) {
        case 1:
          System.out.print("Digite o valor do depósito: ");
          double valorDeposito = scanner.nextDouble();
          conta.depositar(valorDeposito);
          break;
        case 2:
          System.out.print("Digite o valor do saque: ");
          double valorSaque = scanner.nextDouble();
          conta.sacar(valorSaque);
          break;
        case 3:
          System.out.println("Saldo atual: R$" + conta.getSaldo());
          break;
        case 4:
          continuar = false;
          break;
        default:
          System.out.println("Opção inválida.");
      }
    }
    scanner.close();
  }
}

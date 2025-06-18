import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ContaTerminal {

    public static void main(String[] args) {

        String nome;
        String agencia;
        int numeroConta;
        float saldo;

        Scanner scan = new Scanner(System.in);

        System.out.println("Bem vindo ao criador de contas do banco!");
        System.out.print("Insira seu nome: ");
        nome = scan.nextLine();
        System.out.print("Insira o numero da sua agencia: ");
        agencia = scan.nextLine();
        System.out.print("Insira o numero da sua conta: ");
        numeroConta = scan.nextInt();
        System.out.print("Insira o saldo da sua conta: ");
        saldo = scan.nextFloat();

        System.out.println("Olá "+ nome + ", obrigado por criar uma conta em nosso banco," +
                " sua agência é "+ agencia +" conta "+ numeroConta +" e seu saldo de "+ saldo +" já está disponível para saque\".");

    }
}
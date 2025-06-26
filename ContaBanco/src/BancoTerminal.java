import java.util.Scanner;

public class BancoTerminal {

    private final static String BemVindo = "Olá e Bem Vindo!";

    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        System.out.println(BemVindo);
        System.out.println("Por favor, informe seu nome completo!");
        var nome = sc.nextLine();

        System.out.println("Por favor, informe o numero da agencia");
        var agencia = sc.nextLine();

        System.out.println("Por favor, informe o numero da conta");
        var numero = sc.nextInt();

        System.out.println("Por favor, informe seu Salário");
        var Saldo = sc.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %s já está disponível para saque", nome, agencia, numero, Saldo);

    }
}
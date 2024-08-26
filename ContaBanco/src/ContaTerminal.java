import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args)
     {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome: ");
        String nome = scanner.next();
        
        System.out.println("Digite seu sobreNome: ");
        String sobreNome = scanner.next();

        System.out.println("Digite número da conta: ");
        int numeroConta = scanner.nextInt();

        System.out.println("Digite número da Agência: ");
        String numeroAgencia = scanner.next();

        System.out.println("Informe valor de deposito: ");
        double valorDeposito = scanner.nextDouble();


        System.out.println("Olá " + nome +" "+ sobreNome + ", obrigado por criar uma conta em nosso banco");
        System.out.println("Sua agência é " + numeroAgencia);
        System.out.println("Número da Conta " + numeroConta);
        System.out.println("Saldo de R$" + valorDeposito + " já está disponível para saque");

    }
}
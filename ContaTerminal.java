import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // todo: conhecer e inportar a classe scaner 
        Scanner scanner=new Scanner(System.in).useLocale(Locale.US);




        // exibir as mensagens para o nosso usuario 
        System.out.println("por favor digite o numero :");
        int numero = scanner.nextInt();

        System.out.println("qual é a sua agencia ?");
        String agencia = scanner.next();

        System.out.println(" qual é seu nome ?");
        String nome = scanner.next();

        System.out.println("seu saldo atual ");
        Double saldo = scanner.nextDouble();
    


         // exibir a mensagem da conta criada
        

         System.out.println("Olá " + nome   );
         System.out.println("obrigado por criar uma conta em nosso banco , sua agencia é " + agencia);
         System.out.println("conta   " + numero);
         System.out.println("e seu saldo de :" + saldo ); System.out.println("ja esta disponivel para saque ");

        





    }
}

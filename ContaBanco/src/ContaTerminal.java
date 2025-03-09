import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        String nome;
        int agencia;
        int conta;
        double saldo = 200;
        Scanner ler = new Scanner(System.in);


        System.out.println("Olá! Para iniciarmos seu cadastro precisaremos de alguns dados. Vamos lá?" );
        System.err.println("Infomer seu nome!");
            nome = ler.nextLine();
        System.err.println("Legal " + nome + " Agora, informe uma agência!");

        System.out.println("Ok! Agora informe um número de conta.");
            conta = ler.nextInt();

        System.out.println("Agora informe o número da agência" );
            agencia = ler.nextInt();   
            
        System.out.println("Sua conta foi criada com sucesso, " + nome + ". Sua agência é, " + agencia +
         ", sua conta " + conta + " e seu saldo inicial para saque é de: " +  saldo );
         ler.close();
    }
}
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        //Solicitação de leitura dos dados do usuário       
        System.out.println("Por favor, digite o número da Agência: ");
        String agencia = scan.nextLine();

        System.out.println("Por favor, digite o número da Conta: ");
        int numero = scan.nextInt();
        scan.nextLine();
        // Consumir a quebra de linha

        System.out.println("Por favor, digit o nome do cliente: ");
        String nomeCliente = scan.nextLine();

        System.out.println("Por favor, digite o saldo da Conta: ");
        double saldo = scan.nextDouble();

        // Mensagem final com os dados inseridos pelo usuário

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ",conta " + numero +  " e seu saudo R$ " + saldo + " Já está disponivel para saque. ");

        scan.close();



    }
}
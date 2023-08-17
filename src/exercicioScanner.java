import java.util.Scanner;

public class exercicioScanner {
    public static void main(String[] args) {
        Scanner capturaTexto = new Scanner(System.in);

        System.out.println("Digite seu nome ");
        String nome = capturaTexto.nextLine();

        System.out.println("Digite sua idade");
        int idade = capturaTexto.nextInt();

        capturaTexto.nextLine();

        System.out.println("Digite seu investimento");
        double valor = capturaTexto.nextDouble();

        capturaTexto.nextLine();

        System.out.println("Digite o mes");
        String mesDeposito = capturaTexto.nextLine();

      System.out.println("O usuário " + nome + " tem " + idade + " anos de idade e irá investir o valor de " + valor + " no mês de ");

      capturaTexto.close();
    }
}

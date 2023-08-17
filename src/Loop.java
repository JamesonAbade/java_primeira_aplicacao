import java.sql.SQLOutput;
import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner capturaTeclado = new Scanner(System.in); //Biblioteca API que captura interação do teclado
        double mediaAvaliacao = 0;
        double nota = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite a sua avaliação para este filme");
            nota = capturaTeclado.nextDouble();
            mediaAvaliacao += nota;
        }
        
        System.out.println("Diga sua avaliação para o filme ");
        double avaliacao = capturaTeclado.nextDouble();
        
    }

}

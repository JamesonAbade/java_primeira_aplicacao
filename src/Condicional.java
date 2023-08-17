import java.sql.SQLOutput;

public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2022;
        boolean incluiNoPlano = false;
        double notaDoFilme = 8.1;
        String tipoPlano = "Plus";

        if(anoDeLancamento >= 2022){
            System.out.println("Lançamentos que os clientes estão curtindo");
        }
        else{
            System.out.println("Filme retrô que vale a pena assistir!");
        }
        if (incluiNoPlano || tipoPlano.equals("Plus")){
            System.out.println("Filme Liberado");
        }else {
            System.out.println("Deve pagar a locação");
        }

    }
}

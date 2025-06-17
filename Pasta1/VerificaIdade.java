/*
Receba uma idade como entrada
Se idade for maior que 18 Imprima "Adulto"
Senão imprima "Ainda nao é Adulto"
 */

public class VerificaIdade {
    public static void main(String[] args) {
        int idade = 19;
        // ==,!=, >, >=, <, <=
        if (idade > 18) {
            System.out.println("Adulto");
        } else {
            System.out.println("Nao é Adulto");
        }
    }
}

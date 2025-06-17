/*
Dado um determinado número inteiro
imprim se ele é ímpar ou par
Resto da divisão por 2 se for par sempre vai ser 0
senao vai ser ímpar
 */
public class ImparOuPar {
    public static void main(String[] args) {
        // + - / %
        int num = 153;
        if (num % 2 == 0){
            System.out.println(num + " É Par");
        }else{
            System.out.println(num + " É Ímpar");
        }
    }
}

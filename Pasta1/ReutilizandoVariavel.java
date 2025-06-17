/* Crie umna variavel que ira guarda o valor de um salário.
calcule a porcentagem dese salário , sendo os valores da porcentagem:
*30%,*15%, *5%
A cada vez que vocêcalcular guarde o resultado em uma variavel
Imprima o resultado e reutiliza a variavel que guarda o resultado para o novo calculo.
 */
/*
public class ReutilizandoVariavel {
    public static void main(String[] args) {
        float salario = 5000.00F;
        float porcentagem1 = 30;
        float porcentagem2 = 15;
        float porcentagem3 = 5;
        double resultadoPorcentagem = salario * (porcentagem1 / 100);
        double resultadoPorcentagem2 = salario * (porcentagem2 / 100);
        double resultadoPorcentagem3 = salario * (porcentagem3 / 100);
        System.out.println("O valor da porcentagem sobre o salário é: " + resultadoPorcentagem);
        System.out.println("O valor da porcentagem sobre o salário é: " + resultadoPorcentagem2);
        System.out.println("O valor da porcentagem sobre o salário é: " + resultadoPorcentagem3);
    }
}
 */
public class ReutilizandoVariavel {
    public static void main(String[] args) {
        double salario = 5000.00;
        double resultado = salario * 0.3;
        System.out.println("30% eh: "+resultado);
        resultado = salario * 0.15;
        System.out.println("15% eh: "+resultado);
        resultado = salario * 0.05;
        System.out.println("5% eh: "+resultado);
    }
}

/* Crie uma classe que calcule uma determinada porcentagem de um dado salário
 *Criar uma classe
 * Aceitar um valor de entreda para  salário
 * Definir o valor da porcentagem
 * Calcular a porcentagem
 */

/*public class PorcentagemSalario {
    public static void main(String[] args) {
        int salario = 1200;
        int porcentagemSalario = 100 / 30;
        int valorPorcentagem = salario / porcentagemSalario;
        System.out.println("O valor da porcentagem sobre salario eh:" + valorPorcentagem);
    }
}
 */
public class PorcentagemSalario {
    public static void main(String[] args) {
        float salario = 1200.00F;
        float porcentagemSalario = 30L;
        double valorPorcentagem = salario * (porcentagemSalario / 100);
        System.out.println("O valor da porcentagem sobre salario eh:" + valorPorcentagem);

    }
}


/*
Até 2.428,80              0%
De 2.428,81 até 2.826,65  7.5%
De 2.826,66 até 3.751,05  15%
De 3.751,06 até 4.664,68  22.5%
Acima de 4.664,68         27.5%
 */

public class TabelaImpostoDeRenda {
    public static void main(String[] args) {
        double salario = 13428.80;
        if (salario <= 2428.80) {
            System.out.println("Isento");
        } else if (salario >= 2428.81 && salario <= 2826.65) {
            System.out.println("Imposto de 7.5%" + (salario * 0.075));
        } else if (salario >= 2826.66 && salario <= 3751.05) {
            System.out.println("Imposto de 15% " + (salario * 0.15));
        } else if (salario >= 3751.06 && salario <= 4664.68) {
            System.out.println("Imposto de 22.5% " + (salario * 0.225));
        } else {
            System.out.println("Imposto de 27.5% " + (salario * 0.227));
        }
    }
}

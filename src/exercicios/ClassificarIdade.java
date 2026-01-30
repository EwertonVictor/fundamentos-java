package exercicios;

import java.util.Scanner;

public class ClassificarIdade {
    public static void main(String[] args) {
        // pacote "Scanner" utilizado para ler entrada de dados, arquivos, ou arquivos
        Scanner sc = new Scanner(System.in); //

        System.out.print("Informe sua idade: ");
        int idade = sc.nextInt(); // nexInt() → Lê um valor inteiro

        if (idade < 18) {
            System.out.printf("%nIdade: %d%nClassificação: Menor de idade%n", idade);
        } else if (idade > 18 && idade <= 64) {
            System.out.printf("%nIdade: %d%nClassificação: Adulto%n", idade);
        } else {
            System.out.printf("%nIdade: %d%nClassificação: Idoso%n", idade);
        }

        sc.close();
    }
}

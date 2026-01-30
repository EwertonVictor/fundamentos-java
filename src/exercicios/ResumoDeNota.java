package exercicios;

import java.util.Scanner;

public class ResumoDeNota {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("1ª Nota: ");
        int n1 = sc.nextInt();

        System.out.print("2ª Nota: ");
        int n2 = sc.nextInt();

        System.out.print("3ª Nota: ");
        int n3 = sc.nextInt();

        int soma = n1 + n2 + n3; // calcula a soma das 3 notas
        int media = soma / 3;
        int resto = soma % 2;

        System.out.printf("%nSoma: %d%nMédia: %d%nResto: %d", soma, media, resto);

        sc.close();
    }
}

package exercicios;

import java.util.Scanner;

public class ContagemRegressiva {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        if (numero < 0) System.out.println("Número inválido");

        while (numero >= 0) {
            System.out.println(numero);
            numero --;
        }

        sc.close();
    }
}

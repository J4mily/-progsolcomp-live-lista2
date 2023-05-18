import java.util.Scanner;

public class Exercicio21 {
    /*Nome do Aluno: Franciely Jamily Queiroz Pereira
* RA: 13523113789
* Nome do Programa:imprima todos os números pares de 1 a 100 e imprima somente o valor total da soma (utilize while).
* Descrição: 21. Escreva um programa que, dado um número positivo digitado pelo o usuário mostre a tabuada de todos os 
números de 1 até o número digitado. (utilize for)
* Data: 16/05/2023 */     

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número positivo: ");
        int numero = scanner.nextInt();

        if (numero <= 0) {
            System.out.println("O número digitado não é válido. Por favor, digite um número positivo.");
            scanner.close();
            return;
        }

        for (int i = 1; i <= numero; i++) {
            System.out.println("Tabuada do " + i + ":");

            for (int j = 1; j <= 10; j++) {
                int resultado = i * j;
                System.out.println(i + " x " + j + " = " + resultado);
            }

            System.out.println();
        }

        scanner.close();
    }
}
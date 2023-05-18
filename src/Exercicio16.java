import java.util.Scanner;

public class Exercicio16 {
/*Nome do Aluno: Franciely Jamily Queiroz Pereira
* RA: 13523113789
* Nome do Programa:imprima todos os números pares de 1 a 100 e imprima somente o valor total da soma (utilize while).
* Descrição: 16. Faça um programa que solicite ao usuário que digite um
número até que ele digite um número menor que 0 (utilize while)
* Data: 16/05/2023 */  

public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int numero = 0;
    while (numero >= 0) {
        System.out.print("Digite um número (digite um número negativo para sair): ");
        numero = input.nextInt();
    }
    System.out.println("Programa encerrado.");
    input.close();
}


}
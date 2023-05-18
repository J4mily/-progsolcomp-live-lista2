import java.util.Scanner;

public class Exercicio04 {
  /*Nome do Aluno: Franciely Jamily Queiroz Pereira
* RA: 13523113789
* Nome do Programa: par ou ímpar, positivo ou negativo.
* Descrição: 3. . Faça um programa que leia um número inteiro e mostre uma mensagem indicando se este 
número é par ou ímpar e se é positivo ou negativo.
* Data: 16/05/2023 */   

public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
  
  System.out.print("Digite um número inteiro: ");
  int numero = scanner.nextInt();
  
  if (numero % 2 == 0) {
      System.out.println("O número é par.");
  } else {
      System.out.println("O número é ímpar.");
  }
  
  if (numero >= 0) {
      System.out.println("O número é positivo.");
  } else {
      System.out.println("O número é negativo.");
  }
  
  scanner.close();
}



}
 
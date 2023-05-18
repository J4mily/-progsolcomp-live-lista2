import java.util.Scanner;

/*Nome do Aluno: Franciely Jamily Queiroz Pereira
* RA: 13523113789
* Nome do Programa: Maior número. 
* Descrição: 1. Faça um programa que leia dois números A e B e escreva o maior dele.
* Data: 16/05/2023 */   

public class Exercicio01 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite dois números para saber o maior: ");
        int A = s.nextInt();
        int B = s.nextInt();

        if (A > B) {
            System.out.println("> O maior número é o " + A + ".");
        } else {
            System.out.println("> O maior número é o " + B + ".");
        }

        s.close();
    }
}
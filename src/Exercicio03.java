/*Nome do Aluno: Franciely Jamily Queiroz Pereira
* RA: 13523113789
* Nome do Programa: “São múltiplos” ou “Não são múltiplos”.
* Descrição: 3. Elabore um programa que lê dois valores A e B e os escreve com a mensagem: “São múltiplos” ou “Não são múltiplos”.
* Data: 16/05/2023 */   

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o valor de A: ");
        int a = scanner.nextInt();
        
        System.out.print("Digite o valor de B: ");
        int b = scanner.nextInt();
        
        if (a % b == 0 || b % a == 0) {
            System.out.println("São múltiplos");
        } else {
            System.out.println("Não são múltiplos");
        }
        
        scanner.close();
    }

}

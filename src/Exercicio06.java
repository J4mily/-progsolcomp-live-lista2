import java.util.Scanner;

public class Exercicio06 {
/*Nome do Aluno: Franciely Jamily Queiroz Pereira
* RA: 13523113789
* Nome do Programa: imprimir o conceito de um aluno.
* Descrição: 6. Faça um programa para imprimir o conceito de um aluno. O
conceito é calculado em função da nota do aluno que varia de 0
a 100. As faixas da correlação são mostradas abaixo:
Nota Conceito
0 a 49 Insuficiente
50 a 64 Regular
65 a 84 Bom
85 100 Ótimo
* Data: 16/05/2023 */    
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite a nota do aluno (0 a 100): ");
    int nota = scanner.nextInt();

    String conceito;

    if (nota >= 0 && nota <= 49) {
        conceito = "Insuficiente";
    } else if (nota >= 50 && nota <= 64) {
        conceito = "Regular";
    } else if (nota >= 65 && nota <= 84) {
        conceito = "Bom";
    } else if (nota >= 85 && nota <= 100) {
        conceito = "Ótimo";
    } else {
        conceito = "Nota inválida";
    }

    System.out.println("Conceito do aluno: " + conceito);

    scanner.close();
}



}

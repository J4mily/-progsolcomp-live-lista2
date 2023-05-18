import java.util.Scanner;

public class Exercicio19 {
/*Nome do Aluno: Franciely Jamily Queiroz Pereira
* RA: 13523113789
* Nome do Programa:imprima todos os números pares de 1 a 100 e imprima somente o valor total da soma (utilize while).
* Descrição:  19. Um determinado gás duplica seu volume a cada segundo. Dada um volume inicial, em centímetros cúbicos, digitado pelo
usuário faça um programa que determine o tempo necessário para que esse volume se torne maior que 1000 centímetros cúbicos.
(utilize while)
* Data: 16/05/2023 */  

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite o volume inicial do gás em centímetros cúbicos: ");
    int volumeInicial = scanner.nextInt();
    scanner.close();

    int volumeAtual = volumeInicial;
    int tempo = 0;

    while (volumeAtual <= 1000) {
        volumeAtual *= 2;
        tempo++;
    }

    System.out.println("O volume se tornará maior que 1000 cm³ em " + tempo + " segundos.");
}

}


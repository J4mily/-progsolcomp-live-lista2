import java.util.Scanner;

public class Exercicio20 {
/*Nome do Aluno: Franciely Jamily Queiroz Pereira
* RA: 13523113789
* Nome do Programa:imprima todos os números pares de 1 a 100 e imprima somente o valor total da soma (utilize while).
* Descrição: 20. Escreva um programa que, dada a carga máxima de um elevador e a quantidade máxima de pessoas digitadas pelo
usuário, leia o peso de cada pessoa, também digitada pelo usuário, que entra no elevador até que a carga máxima seja
atingida ou o número máximo de pessoas seja atingido (utilize do /while).
* Data: 16/05/2023 */   

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite a carga máxima do elevador em quilogramas: ");
    int cargaMaxima = scanner.nextInt();

    System.out.print("Digite a quantidade máxima de pessoas: ");
    int quantidadeMaximaPessoas = scanner.nextInt();

    int cargaAtual = 0;
    int pessoas = 0;

    do {

        int cont = 1;
        System.out.print("Digite o peso da pessoa "+ cont++ + " em quilogramas: ");
        int peso = scanner.nextInt();

        cargaAtual += peso;
        pessoas++;

        if (cargaAtual >= cargaMaxima || pessoas >= quantidadeMaximaPessoas) {
            break;
        }
    } while (true);

    System.out.println("O elevador atingiu a carga máxima de " + cargaMaxima + "kg ou o número máximo de pessoas de " + quantidadeMaximaPessoas);
    System.out.println("Foram carregadas " + pessoas + " pessoas.");
    scanner.close();
}
}

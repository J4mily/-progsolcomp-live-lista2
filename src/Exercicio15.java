public class Exercicio15 {
/*Nome do Aluno: Franciely Jamily Queiroz Pereira
* RA: 13523113789
* Nome do Programa:imprima todos os números pares de 1 a 100 e imprima somente o valor total da soma (utilize while).
* Descrição: 15. Faça um programa que preencha com zeros todas as posições
de uma matriz com 10 linha e 10 colunas.
* Data: 16/05/2023 */  

public static void main(String[] args) {
    int[][] matriz = new int[10][10];
    
    for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz[i].length; j++) {
            matriz[i][j] = 0;
        }
    }
    
    System.out.println("Matriz preenchida com zeros:");
    for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz[i].length; j++) {
            System.out.print(matriz[i][j] + " ");
        }
        System.out.println();
    }
}

}

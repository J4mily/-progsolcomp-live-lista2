public class Exercicio14 {
/*Nome do Aluno: Franciely Jamily Queiroz Pereira
* RA: 13523113789
* Nome do Programa: Preencha com zeros todas as posições de um vetor de tamanho 50
* Descrição: 14. Faça um programa que preencha com zeros todas as posições
de um vetor de tamanho 50
* Data: 16/05/2023 */ 

public static void main(String[] args) {
    int[] vetor = new int[50];
    
    for (int i = 0; i < vetor.length; i++) {
        vetor[i] = 0;
    }
    
    System.out.println("Vetor preenchido com zeros:");
    for (int i = 0; i < vetor.length; i++) {
        System.out.print(vetor[i] + " ");
    }
}


}

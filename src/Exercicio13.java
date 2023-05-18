public class Exercicio13 {
/*Nome do Aluno: Franciely Jamily Queiroz Pereira
* RA: 13523113789
* Nome do Programa:imprima todos os números pares de 1 a 100 e imprima somente o valor total da soma (utilize while).
* Descrição: 13. Faça um programa que some os números de 1 a 100 e imprima
somente o valor total da soma (utilize while).
* Data: 16/05/2023 */  

public static void main(String[] args) {
    int numero = 1;
    int soma = 0;
    
    while (numero <= 100) {
        soma += numero;
        numero++;
    }
    
    System.out.println("A soma dos números de 1 a 100 é: " + soma);
}

}

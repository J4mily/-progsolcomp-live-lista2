public class Exercicio12 {
/*Nome do Aluno: Franciely Jamily Queiroz Pereira
* RA: 13523113789
* Nome do Programa: Faça um programa que imprima todos os números pares de 1 a 100 na ordem inversa.
* Descrição:12. Faça um programa que exiba todos os números pares a
partir de 0 até que encontre um múltiplo de 7 (utilize do/while)

* Data: 16/05/2023 */   

public static void main(String[] args) {
    int numero = 0;
    
    do {
        if (numero % 2 == 0) {
            System.out.println(numero);
        }
        numero += 2;
    } while (numero % 7 != 0);
}
}

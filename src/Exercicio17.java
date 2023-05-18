public class Exercicio17 {
/*Nome do Aluno: Franciely Jamily Queiroz Pereira
* RA: 13523113789
* Nome do Programa: Imprima os múltiplos negativos de 7, superiores a -1000.
* Descrição: 17. Faça um programa que imprima os múltiplos negativos de 7,
superiores a -1000. (utilize do / while)
* Data: 16/05/2023 */  

public static void main(String[] args) {
    int numero = -7;

    do {
        System.out.println(numero);
        numero -= 7;
    } while (numero >= -1000);
}


}

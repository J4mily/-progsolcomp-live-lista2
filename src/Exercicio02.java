import java.util.Scanner;

/*Nome do Aluno: Franciely Jamily Queiroz Pereira
* RA: 13523113789
* Nome do Programa: Receba como entrada três valores A, B e C e os imprima em ordem crescente.
* Descrição: 2. Construa um programa que receba como entrada três valores A, B e C e os imprima em ordem crescente.
* Data: 16/05/2023 */   
public class Exercicio02 {
    public static void main(String[] args) throws Exception {

        Scanner s = new Scanner(System.in);
        System.out.println("Digite três números para saber o maior: ");
        double A = s.nextDouble();
        double B = s.nextDouble();
        double C = s.nextDouble();
        s.close();

        if (A > B && A > C && B > C) {

            System.out.println(C);
            System.out.println(B);
            System.out.println(A);

        } else if (B > A && B > C && A > C) {

            System.out.println(C);
            System.out.println(A);
            System.out.println(B);

        } else if (A > B && A > C && C > B) {

            System.out.println(B);
            System.out.println(C);
            System.out.println(A);

        } else if (B > A && B > C && C > A) {

            System.out.println(A);
            System.out.println(C);
            System.out.println(B);

        } else if (C > A && C > B && A > B) {

            System.out.println(B);
            System.out.println(A);
            System.out.println(C);

        } else if (C > A && C > B && B > A) {

            System.out.println(A);
            System.out.println(B);
            System.out.println(C);

        }
    }
}

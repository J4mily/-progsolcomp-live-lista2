import java.util.Scanner;

public class Exercicio08 {
      /*Nome do Aluno: Franciely Jamily Queiroz Pereira
* RA: 13523113789
* Nome do Programa: lê um número entre 1 e 12, correspondendo a um dos meses do ano onde o mês 1 é Janeiro e 12 é dezembro.
* Descrição: 8. Crie um programa que lê um número entre 1 e 12, correspondendo
a um dos meses do ano onde o mês 1 é Janeiro e 12 é dezembro.
Ao final, o programa deve imprimir uma mensagem identificando,
com base no número digitado, o nome do mês e a estação.
Exemplo para o mês 1: "Mês: Janeiro – Estação: Verão"
* Data: 16/05/2023 */   
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.print("Digite um número entre 1 e 12: ");
int numeroMes = scanner.nextInt();

String nomeMes;
String estacao;

switch (numeroMes) {
    case 1:
        nomeMes = "Janeiro";
        estacao = "Verão";
        break;
    case 2:
        nomeMes = "Fevereiro";
        estacao = "Verão";
        break;
    case 3:
        nomeMes = "Março";
        estacao = "Outono";
        break;
    case 4:
        nomeMes = "Abril";
        estacao = "Outono";
        break;
    case 5:
        nomeMes = "Maio";
        estacao = "Outono";
        break;
    case 6:
        nomeMes = "Junho";
        estacao = "Inverno";
        break;
    case 7:
        nomeMes = "Julho";
        estacao = "Inverno";
        break;
    case 8:
        nomeMes = "Agosto";
        estacao = "Inverno";
        break;
    case 9:
        nomeMes = "Setembro";
        estacao = "Primavera";
        break;
    case 10:
        nomeMes = "Outubro";
        estacao = "Primavera";
        break;
    case 11:
        nomeMes = "Novembro";
        estacao = "Primavera";
        break;
    case 12:
        nomeMes = "Dezembro";
        estacao = "Verão";
        break;
    default:
        nomeMes = "Inválido";
        estacao = "Inválido";
}

System.out.println("Mês: " + nomeMes + " - Estação: " + estacao);

scanner.close();
}

}

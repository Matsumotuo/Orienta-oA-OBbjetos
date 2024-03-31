import java.util.Scanner;

public class MainCalculadora {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int opcao = 0;
        while (opcao != 5) {
            Calculadora calculadora = new Calculadora(0, 0);

            System.out.println("--Calculadora--\n");
            System.out.println("Escolha uma opção:");
            System.out.println("[1]Adição");
            System.out.println("[2]Subtração");
            System.out.println("[3]Divisão");
            System.out.println("[4]Multiplicação");
            System.out.println("[5]Sair");
            opcao = Integer.parseInt(scanner.nextLine());

            if (opcao != 5) {
                System.out.print("Digite o 1° numero: ");
                calculadora.num1 = Integer.parseInt(scanner.nextLine());

                System.out.print("Digite o 2° numero: ");
                calculadora.num2 = Integer.parseInt(scanner.nextLine());

            }

            System.out.print("\n");
            switch (opcao) {
                case 01:
                    calculadora.resultado = Calculadora.Soma(calculadora.num1, calculadora.num2);
                    System.out.println("Resultado da Soma: " + calculadora.resultado);
                    System.out.print("\n");
                    break;
                case 02:
                    calculadora.resultado = Calculadora.Subtraição(calculadora.num1, calculadora.num2);
                    System.out.println("Resultado da Subtração: " + calculadora.resultado);
                    System.out.print("\n");
                    break;
                case 03:
                    calculadora.resultado = Calculadora.Divisao(calculadora.num1, calculadora.num2);
                    System.out.println("Resultado da Divisão: " + calculadora.resultado);
                    System.out.print("\n");
                    break;
                case 04:
                    calculadora.resultado = Calculadora.Multiplicacao(calculadora.num1, calculadora.num2);
                    System.out.println("Resultado da Multiplicação: " + calculadora.resultado);
                    System.out.print("\n");
                    break;
                case 05:
                    System.out.print("...programa sendo encerrado...");
                    break;

                default:
                    System.out.println("Opção invalida");
                    break;
            }

        }
    }
}

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) throws Exception {

        double resultado = 0;
        Scanner leitura = new Scanner(System.in);


        System.out.println("Digite o primeiro valor");
        double valor1 = leitura.nextDouble();

        Scanner bosta = new Scanner(System.in);
        System.out.print("""
                        Para somar digite +
                        Para subtrair digite -
                        Para multiplicar digite *
                        Para dividir digite /
                        """);
        String operador = bosta.nextLine();


        System.out.println("Digite o segundo valor");
        double valor2 = leitura.nextDouble();
        switch (operador) {
            case "+":
                resultado = valor1 + valor2;
                break;
            case "-":
                resultado = valor1 - valor2;
                break;
            case "*":
            case "x":
                resultado = valor1 * valor2;
                break;
            case "/":
                if (valor1 == 0 && valor2 == 0)
                {
                    System.out.println("Valores zerados.");
                    return;
                }

                if (valor1 == 0 || valor2 == 0){
                    System.out.println("Não pode ocorrer divisão onde um dos valores está zerado.");
                    return;
                }

                resultado = valor1 / valor2;
                break;
            default:
                System.out.println("Operação inválida");
        }

        System.out.println("O resultado da operação é: " + resultado);




    }
}
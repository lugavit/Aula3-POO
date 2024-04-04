import java.util.Scanner;

public class somandoPossibilidades {
    public static void main(String[] args){
        /*Criando scanner para ler a entrada*/
        Scanner input = new Scanner(System.in);

        int num1;
        int num2;
        int num3;
        int num4;
        int sum;

        /*Lendo os numeros da entrada*/
        System.out.print("Primeiro número: ");
        num1 = input.nextInt();

        System.out.print("Segundo número: ");
        num2 = input.nextInt();

        System.out.print("Terceiro número: ");
        num3 = input.nextInt();

        System.out.print("Quarto número: ");
        num4 = input.nextInt();

        /* Somando Todas as combinações*/
        System.out.println("Todas as possibilidades de soma:");

        sum = num1 + num2;
        System.out.printf("Primeiro + Segundo = %d%n",sum);

        sum = num1 + num3;
        System.out.printf("Primeiro + Terceiro = %d%n",sum);

        sum = num1 + num4;
        System.out.printf("Primeiro + Quarto = %d%n",sum);

        sum = num2 + num3;
        System.out.printf("Segundo + Terceiro = %d%n",sum);

        sum = num2 + num4;
        System.out.printf("Segundo + Quarto = %d%n",sum);

        sum = num3 + num4;
        System.out.printf("Terceiro + Quarto = %d%n",sum);

        /* Multiplicando Todas as combinações*/
        System.out.println("/nTodas as possibilidades de multiplicação:");

        sum = num1 * num2;
        System.out.printf("Primeiro * Segundo = %d%n",sum);

        sum = num1 * num3;
        System.out.printf("Primeiro * Terceiro = %d%n",sum);

        sum = num1 * num4;
        System.out.printf("Primeiro * Quarto = %d%n",sum);

        sum = num2 * num3;
        System.out.printf("Segundo * Terceiro = %d%n",sum);

        sum = num2 * num4;
        System.out.printf("Segundo * Quarto = %d%n",sum);

        sum = num3 * num4;
        System.out.printf("Terceiro * Quarto = %d%n",sum);
    }
}
import java.util.Scanner;
public class raioCirculo {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        double raio;
        double circunferencia;

        System.out.print("Digite o raio do círculo: ");
        raio = input.nextInt();
        circunferencia = 2 * Math.PI * raio;

        System.out.printf("A circunferencia do círculo é: %.2f",circunferencia);

    }
}

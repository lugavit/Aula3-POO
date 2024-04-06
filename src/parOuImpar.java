import java.util.Scanner;
public class parOuImpar {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] minhaLista = new int[10];
        int conta = 0;
        int somaPares = 0;
        int somaImpar = 0;

        for (int i = 0; i < 10; i++) {
            System.out.printf("Digite o %dº número: ", i + 1);
            minhaLista[i] = input.nextInt();
            conta = minhaLista[i] % 2;
            if (conta == 0) {
                somaPares += minhaLista[i];
                System.out.println("Este número é par!");
            } else {
                somaImpar += minhaLista[i];
                System.out.println("Este número é impar!");
            }
        }
        System.out.printf("A soma dos pares digitados é: %d %n",somaPares);
        System.out.printf("A soma dos impares digitados é: %d %n",somaImpar);
    }
}
import java.util.Scanner;

public class calculoLitros {
    public static void main(String[] args){
        /* iniciando leitor de teclado */
        Scanner input = new Scanner(System.in);

        int tempoG; int velMedia; int distPerc; int qtdLitros;

        /*Receber valores do usuario*/
        System.out.print("Digite o tempo gasto na viagem: ");
        tempoG = input.nextInt();

        System.out.print("Digite a velocidade média: ");
        velMedia = input.nextInt();

        distPerc = tempoG * velMedia;

        qtdLitros = distPerc / 12; /*12km por litro, passado no exercicio*/

        System.out.println("Resumo da sua Viagem!");
        System.out.printf("Você viajou a um velocidade média de %d Km\n", velMedia);
        System.out.printf("Demorou %d horas para percorrer %d KM\n",tempoG,distPerc);
        System.out.printf("Utilizou %d litros de gasolina.",qtdLitros);
    }
}

import java.util.Scanner;
public class indicePoluicao {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double indicePol = 0.0;
        String querSair;
        String sair;

        String[] grupoUm = new String[10];
        String[] grupoDois = new String[5];
        String[] grupoTres = new String[3];

        do{
            System.out.print("Digite o indice de poluição: ");
            while (!input.hasNextDouble()) {
                System.out.println("That's not a valid number!");
                input.next(); // discard the invalid input
            }
            indicePol = input.nextDouble();


            if (indicePol >= 0.3 || indicePol <= 0.5){
                for (int i = 0; i < grupoUm.length; i++) {
                    System.out.printf("Empresa %d Suspender atividades!%n",i+1); /*ideal seria usar nome de empresa no array*/
                }
                System.out.println("Grupo 1 notificado!");
            }
            if (indicePol >= 0.4 || indicePol <= 0.5) {
                for (int i = 0; i < grupoDois.length; i++) {
                    System.out.printf("Empresa %d Suspender atividades!%n",i+1);
                }
                System.out.println("Grupo 2 notificado!");
            }
            if (indicePol >= 0.5 && indicePol < 0.6){
                for (int i = 0; i < grupoTres.length; i++) {
                    System.out.printf("Empresa %d Suspender Atividades!%n",i+1);
                }
                System.out.println("Grupo 3 notificado!");
            }
            else if (indicePol < 0.3 || indicePol > 0.5){
                System.out.println("Indice de poluição aceitavel!");
            }

            System.out.print("Deseja encerrar o programa? [S/N] ");
            querSair = input.next();
            sair = querSair.toUpperCase();
            /*System.out.println(sair);*/

            }while(!sair.equals("S"));
    }
}


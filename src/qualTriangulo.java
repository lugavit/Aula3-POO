import java.util.Scanner;
public class qualTriangulo {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        /*Coordenadas dos lados do triangulo*/
        System.out.print("Digite x da primeira coordenada: ");
        int cordx1 = input.nextInt();
        System.out.print("Digite y da primeira coordenada: ");
        int cordy1 = input.nextInt();
        System.out.print("Digite x da segunda coordenada: ");
        int cordx2 = input.nextInt();
        System.out.print("Digite y da segunda coordenada: ");
        int cordy2 = input.nextInt();
        System.out.print("Digite x da terceira coordenada: ");
        int cordx3 = input.nextInt();
        System.out.print("Digite y da terceira coordenada: ");
        int cordy3 = input.nextInt();



        /*Precisamos usar pitagoras para descobrir a distancia entre
        os pontos de coordenadas informados para sabermos qual o
        tamanho do lado do triangulo. d=√((x_2-x_1)²+(y_2-y_1)²)
         */
        double lado1 = Math.sqrt(Math.pow((cordx1 - cordx2),2)+Math.pow(cordy1 - cordy2,2));
        double lado2 = Math.sqrt(Math.pow((cordx2 - cordx3),2)+Math.pow(cordy2 - cordy3,2));
        double lado3 = Math.sqrt(Math.pow((cordx3 - cordx1),2)+Math.pow(cordy3 - cordy1,2));
        System.out.println("Lado1 = "+lado1);
        System.out.println("Lado2 = "+lado2);
        System.out.println("lado3 = "+lado3);

        if (lado1 == lado2 && lado3 == lado1) {
            System.out.println("Este triangulo é EQUILÁTERO!");
        }

        else if (lado3 == lado2 || lado2 == lado1 || lado1 == lado3) {
            System.out.println("Este triangulo é ISÓSCELES!");
        }
        else {
            System.out.println("Este triangulo é Escaleno!");
        }
    }
}

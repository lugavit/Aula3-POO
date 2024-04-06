import java.util.Scanner;
public class converterTemp {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        int tempCelsius = 0;
        int fahrenheit = 0;

        System.out.print("Digite a temperatura em Celsius: ");
        tempCelsius = input.nextInt();

        fahrenheit = (9 * tempCelsius + 160)/5;

        System.out.printf("A temperatura em Fahrenheit é: %dºF %n", fahrenheit);

    }
}

/*import java.util.Scanner;
public class converterTemp {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        int tempFahren = 0;
        int celsius = 0;

        System.out.print("Digite a temperatura em Fahrenheit: ");
        tempFahren = input.nextInt();

        celsius = (tempFahren - 32)* 5/9;

        System.out.printf("A temperatura em Celsius é: %dºC %n", celsius);

    }
}*/

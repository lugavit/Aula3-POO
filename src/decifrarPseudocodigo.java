public class decifrarPseudocodigo {
    public static void main(String[] args){
        int a = 2;
        int b = -3;
        int c = 4;
        int d = 7;
        String hoje = "hoje";

        double delta = b*b -4*a*c;
        boolean j = hoje.equals("HOJE");
        int media = (a+b+c+d)/4;
        int media2 = a+b+c+d/4;
        double result = a%d/5;
        double resultado = (a % d)/5;
        int x = (a+b)-5*c;
        int x2 = a+b-10*c;
        boolean y = a > 8 && b+c > d;
        boolean z = a > 3*2 || b + c == d;

        System.out.println("delta: " + delta);
        System.out.println("j: " + j);
        System.out.println("media: " + media);
        System.out.println("media2: " + media2);
        System.out.println("result: " + result);
        System.out.println("resultado: " + resultado);
        System.out.println("x: " + x);
        System.out.println("x2: " + x2);
        System.out.println("y: " + y);
        System.out.println("z: " + z);
    }
}

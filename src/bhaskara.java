public class bhaskara {
    public static void main (String[] args){
        float a = 1;
        float b = 1;
        float c = 1;
        double resultadoP = (-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) /2;
        double resultadoN = (-b - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) /2;

        System.out.println(resultadoP);
        System.out.println(resultadoN);
    }
}

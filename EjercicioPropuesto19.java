import java.util.Scanner;
public class EjercicioPropuesto19 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        double lado;
        System.out.println("Ingrese el valor del lado del triangulo equilatero: ");
        lado=entrada.nextDouble();
        double perimetro=lado+lado+lado;
        double altura=(Math.sqrt(3)/2)*lado;
        double area=(lado*altura)/2;
        System.out.println("El perimetro del triangulo es: "+perimetro);
        System.out.println("La altura del triangulo es: "+altura);
        System.out.println("El area del triangulo es: "+area);
    }
}

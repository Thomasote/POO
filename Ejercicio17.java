import java.util.Scanner;

public class Ejercicio17 {

    double radio;
    double area;
    double longitud;

    public void calcular() {

        area = Math.PI * radio * radio;
        longitud=2 * Math.PI * radio;
    }

    public void mostrar() {

        System.out.println("Area del circulo: " + area);
        System.out.println("Longitud de la circunferencia: "+longitud);
    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Ejercicio17 circulo=new Ejercicio17();

        System.out.print("Ingrese el radio: ");
        circulo.radio = teclado.nextDouble();

        circulo.calcular();
        circulo.mostrar();
    }
}

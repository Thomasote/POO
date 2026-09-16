import java.util.Scanner;

public class Ejercicio14 {

    double numero;
    double cuadrado;
    double cubo;

    public void calcular() {

        cuadrado= numero * numero;
        cubo = numero * numero * numero;
    }

    public void mostrar() {

        System.out.println("El cuadrado es: "+cuadrado);
        System.out.println("El cubo es: " + cubo);
    }

    public static void main(String[] args) {

        Scanner teclado=new Scanner(System.in);

        Ejercicio14 ejercicio = new Ejercicio14();

        System.out.print("Ingrese un numero: ");
        ejercicio.numero=teclado.nextDouble();

        ejercicio.calcular();
        ejercicio.mostrar();
    }
}

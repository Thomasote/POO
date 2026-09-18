import java.util.Scanner;

public class Ejercicio4 {

    double juan;
    double alberto;
    double ana;
    double mama;

    public void calcularEdades() {
        alberto = juan * 2 / 3;
        ana=juan * 4 / 3;
        mama = juan + alberto + ana;
    }

    public void mostrarEdades() {
        System.out.println("Edad de Juan: " + juan);
        System.out.println("Edad de Alberto: "+ alberto);
        System.out.println("Edad de Ana: " + ana);
        System.out.println("Edad de la mama: "+mama);
    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Ejercicio4 edades=new Ejercicio4();

        System.out.print("Ingrese la edad de Juan: ");
        edades.juan = teclado.nextDouble();

        edades.calcularEdades();
        edades.mostrarEdades();
    }
}

public class Ejercicio5 {

    double suma;
    double x;
    double y;

    public void calcular() {

        suma=0;
        x = 20;

        suma = suma+x;

        y=40;

        x = x + y*y;

        suma=suma + x/y;
    }

    public void mostrar() {
        System.out.println("El valor de la suma es: " + suma);
    }

    public static void main(String[] args) {

        Ejercicio5 ejercicio = new Ejercicio5();

        ejercicio.calcular();
        ejercicio.mostrar();
    }
}

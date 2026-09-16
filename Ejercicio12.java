public class Ejercicio12 {

    double horas=48;
    double valorHora = 5000;
    double porcentaje=0.125;

    double salarioBruto;
    double retencion;
    double salarioNeto;

    public void calcularSalario() {

        salarioBruto = horas * valorHora;
        retencion= salarioBruto * porcentaje;
        salarioNeto = salarioBruto-retencion;
    }

    public void mostrar() {

        System.out.println("Salario bruto: " + salarioBruto);
        System.out.println("Retencion: "+retencion);
        System.out.println("Salario neto: " + salarioNeto);
    }

    public static void main(String[] args) {

        Ejercicio12 empleado = new Ejercicio12();

        empleado.calcularSalario();
        empleado.mostrar();
    }
}

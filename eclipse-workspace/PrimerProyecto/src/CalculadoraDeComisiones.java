import java.util.Scanner;
public class CalculadoraDeComisiones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        double ventas;
        double comision = 0;
        System.out.print("Ingrese la cifra de ventas: ");
        ventas = scanner.nextDouble();
        if (ventas > 10000) {
            comision = ventas * 0.30;
        } else if (ventas >= 5001 && ventas <= 9999) {
            comision = ventas * 0.20;
        } else if (ventas >= 1001 && ventas <= 4999) {
            comision = ventas * 0.10;
        } else if (ventas < 1000) {
            comision = 0;
        }//else
        System.out.println("La comisión es: $" + comision);
        scanner.close();

	}

}

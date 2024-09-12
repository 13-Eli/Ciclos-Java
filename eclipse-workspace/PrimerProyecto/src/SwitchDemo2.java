import java.util.Scanner;
public class SwitchDemo2 {

		public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Escribe el número del mes: ");
	        int month = sc.nextInt();
	        //Aquí se diferencia de DEMO
	        String monthString = switch (month) {
	        case 1 ->"Enero";
	        case 2 ->"Febrero";
	        case 3 ->"Marzo";
	        case 4 ->"Abril";
	        case 5 ->"Mayo";
	        case 6 ->"Junio";
	        case 7 ->"Julio";
	        case 8 ->"Agosto";
	        case 9 ->"Septiembre";
	        case 10 ->"Octubre";
	        case 11 ->"Noviembre";
	        case 12 ->"Diciembre";
	        default ->"Mes incorrecto";
	          
};//switch
System.out.println(monthString);
sc.close();
             }
	}


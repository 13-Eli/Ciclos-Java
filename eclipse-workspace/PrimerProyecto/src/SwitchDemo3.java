import java.util.Scanner;

public class SwitchDemo3 {
	public static void main(String[] args) {
		// Me da los días del mes
		  Scanner sc = new Scanner(System.in);
	        System.out.print("Escribe el número del mes: ");
	        int month = sc.nextInt(); 
	      String days;
			//Switch que compare el número del mes
	      //y regrese el número de ese mes
	        switch (month) {
	        case 1:
	        case 3:
	        case 5:
	        case 7:
	        case 8:
	        case 10:
	        case 12:
	          days = "31";
	          break;
	        case 4:
	        case 6:
	        case 9:
	        case 11:
	          days = "30";
	          break;
	        case 2:
	          days = "28/29";
	          break;
	        default:
	          days = "Mes incorrecto";
	          break;
}
System.out.println(days);
sc.close();
          
           }
	}


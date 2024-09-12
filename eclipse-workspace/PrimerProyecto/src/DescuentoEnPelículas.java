import java.util.Scanner;
public class DescuentoEnPelículas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.print("¿Qué edad tienes?: ");
		    Scanner in = new Scanner(System.in);
		    byte edad = in.nextByte();
		    float ticket = 7.0F;

		    if (edad < 5) {
		        ticket = ticket - (ticket * 0.60F);
		    } else if (edad > 60) {
		        ticket = ticket - (ticket * 0.55F);
		    } else {
		        System.out.print("¿Cuántos boletos deseas?");
		        short cantidad = in.nextShort();
		        if (cantidad >= 2) {
		            ticket = (cantidad * ticket);
		            ticket = ticket - (ticket * 0.30F);
		        }
		    }
		    System.out.println("El costo total del ticket es: " + ticket);
	}

}

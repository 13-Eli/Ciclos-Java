import java.util.Scanner;

public class LeerTeclado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("Escribe un número:");
		    Scanner sc = new Scanner(System.in);
		  //está instrucción lee el número del teclado al momento de correr lo coloco en la parte de abajo
		    int num = sc.nextInt();
		   System.out.println("Tu número es: " + num);
		
		    //Leer y escribir un double
		  
		   System.out.println("Escribe un número decimal:");
	        double numDecimal = sc.nextDouble();
	        System.out.println("Tu número decimal es: " + numDecimal);
	         
		    
		//Leer y escribir un String    
	        System.out.println("Escribe una palabra:");
	        String palabra = sc.next();  // Lee una palabra (String)
	        System.out.println("La palabra que escribiste es: " + palabra);  // Imprime la palabra
	      
	        
	        sc.close();//con esto cierro el sc
	}//main
	
	
	
}//class LeerTeclado

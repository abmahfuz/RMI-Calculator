/**
 *
 * @author Chayti
 */
// Program for server application 
import java.rmi.*; 
import java.rmi.registry.*; 
public class Server { 
	public static void main(String[] args) throws Exception 
	{ 

		// Create an object of the interface 
		// implementation class 
		Impl obj = new Impl(); 

		// Binds the remote object by the name ADD 
		Naming.rebind("Trigonometry", obj); 

		System.out.println("Server Started"); 
	} 
}

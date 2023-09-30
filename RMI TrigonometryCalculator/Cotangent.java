

/**
 *
 * @author Chayti
 */

// Creating a Tan interface 
import java.rmi.Remote; 
import java.rmi.RemoteException;
public interface Cotangent extends Remote { 
	// Declaring the method prototype 
	public double cot(double y) throws RemoteException; 
}

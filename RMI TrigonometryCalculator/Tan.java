

/**
 *
 * @author Chayti
 */

// Creating a Tan interface 
import java.rmi.Remote; 
import java.rmi.RemoteException;
public interface Tan extends Remote { 
	// Declaring the method prototype 
	public double tan(double y) throws RemoteException; 
}


/**
 *
 * @author Chayti
 */

// Creating a Asin interface 
import java.rmi.Remote; 
import java.rmi.RemoteException;
public interface Asin extends Remote { 
	// Declaring the method prototype 
	public double asin(double y) throws RemoteException; 
}


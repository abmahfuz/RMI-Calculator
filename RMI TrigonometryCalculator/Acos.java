
/**
 *
 * @author Chayti
 */

// Creating a Acos interface 
import java.rmi.Remote; 
import java.rmi.RemoteException;
public interface Acos extends Remote { 
	// Declaring the method prototype 
	public double acos(double y) throws RemoteException; 
}


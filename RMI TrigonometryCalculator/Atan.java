
/**
 *
 * @author Chayti
 */

// Creating a Atan interface 
import java.rmi.Remote; 
import java.rmi.RemoteException;
public interface Atan extends Remote { 
	// Declaring the method prototype 
	public double atan(double y) throws RemoteException; 
}


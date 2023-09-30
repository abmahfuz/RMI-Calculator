

/**
 *
 * @author Chayti
 */

// Creating a Cos interface 
import java.rmi.Remote; 
import java.rmi.RemoteException;
public interface Cosec extends Remote { 
	// Declaring the method prototype 
	public double cosec(double y) throws RemoteException; 
}

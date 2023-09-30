
/**
 *
 * @author Chayti
 */

// Creating a Sin interface 
import java.rmi.Remote; 
import java.rmi.RemoteException;
public interface Sin extends Remote { 
	// Declaring the method prototype 
	public double sin(double y) throws RemoteException; 
}


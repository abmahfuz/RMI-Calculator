/**
 *
 * @author Chayti
 */

// Creating a Cos interface 
import java.rmi.Remote; 
import java.rmi.RemoteException;
public interface Cos extends Remote { 
	// Declaring the method prototype 
	public double cos(double y) throws RemoteException; 
}

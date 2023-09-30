/**
 *
 * @author Chayti
 */

// Creating a Sec interface 
import java.rmi.Remote; 
import java.rmi.RemoteException;
public interface Sec extends Remote { 
	// Declaring the method prototype 
	public double sec(double y) throws RemoteException; 
}


/**
 *
 * @author Chayti
 */

// Java program to implement the sin, cos, tan, sec, cosec, cot, asin, acos, atan

import java.rmi.*; 
import java.rmi.server.*; 

public class Impl extends UnicastRemoteObject 
	implements Sin, Cos, Tan, Sec, Cosec, Cotangent, 
                   Asin, Acos, Atan{ 

	// Default constructor to throw RemoteException 
	// from its parent constructor 
	public Impl() throws Exception { super(); } 

	// Implementation of the sin, cos, tan, sec, cosec, cot, asin, acos, 
        // atan, asec, acosec, acot, sinh, cosh, tanh, sech, cosech, coth
        @Override
	public double sin(double y) { return Math.sin(y); } 
        @Override
	public double cos(double y) { return Math.cos(y); } 
        @Override
	public double tan(double y) { return Math.tan(y); } 
        @Override
	public double sec(double y) { return 1 / Math.cos(y); } 
        @Override
	public double cosec(double y) { return 1 / Math.sin(y); }
        @Override
	public double cot(double y) { return 1 / Math.tan(y); }
        
        @Override
	public double asin(double y) { return Math.toDegrees( Math.asin(Math.sin(y))); } 
        @Override
	public double acos(double y) { return Math.toDegrees( Math.acos(Math.cos(y))); } 
        @Override
	public double atan(double y) { return Math.toDegrees( Math.atan(Math.tan(y))); } 
}

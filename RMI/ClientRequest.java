//program for client application 
import java.rmi.*; 
public class ClientRequest 
{ 
	public static void main(String args[]) 
	{ 
		String answer,value="Department"; 
		try
		{ 
			// lookup method to find reference of remote object 
			Search access = 
				(Search)Naming.lookup("rmi://localhost:1900"+ 
									"/csecou"); 
			answer = access.query(value); 
			System.out.println("CSE " + value + 
							" " + answer+" Comilla University"); 
		} 
		catch(Exception ae) 
		{ 
			System.out.println(ae); 
		} 
	} 
} 

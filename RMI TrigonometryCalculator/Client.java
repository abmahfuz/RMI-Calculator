
// Program for client application 
import java.rmi.*; 
import java.util.*; 
public class Client { 
	public static void main(String[] args) throws Exception 
	{ 
		Scanner sc = new Scanner(System.in); 
		while (true) { 
			// User Menu 
			System.out.println( 
				"\n1.Sine\n2.Cosine\n3.Tangent\n4.Sec\n5.Cosec\n6.Cotangent"
                              + "\n7.Arc sine\n8.Arc cosine\n9.Arc tangent\n10.Exit"); 
			System.out.println("Enter the option:"); 
			int opt = sc.nextInt(); 
			if (opt == 10) { 
				break; 
			} 
			System.out.println( "Enter the degree:"); 
                        
                        //take degree
			double a = sc.nextDouble(); 
			
                        //convert degree to radian
			double b = Math.toRadians(a);  
			double n; 
			switch (opt) { 
			case 1: 
				// lookup method to find reference of remote 
				// object 
				Sin obj  = (Sin)Naming.lookup("Trigonometry"); 
				n = obj.sin(b); 
				System.out.println("sin(" + a + ") = " + n); 
				break; 
			case 2: 
				Cos obj1  = (Cos)Naming.lookup("Trigonometry"); 
				n = obj1.cos(b); 
				System.out.println("cos(" + a + ") = " + n); 
				break; 
			case 3: 
				Tan obj2  = (Tan)Naming.lookup("Trigonometry"); 
				n = obj2.tan(b); 
				System.out.println("tan(" + a + ") = " + n); 
				break; 
			case 4: 
				Sec obj3  = (Sec)Naming.lookup("Trigonometry"); 
				n = obj3.sec(b); 
				System.out.println("sec(" + a + ") = " + n); 
				break; 
                        case 5: 
				Cosec obj4  = (Cosec)Naming.lookup("Trigonometry"); 
				n = obj4.cosec(b); 
				System.out.println("cosec(" + a + ") = " + n); 
				break;
                        case 6: 
				Cotangent obj5  = (Cotangent)Naming.lookup("Trigonometry"); 
				n = obj5.cot(b); 
				System.out.println("cot(" + a + ") = " + n); 
				break;
                        case 7:  
				Asin obj6  = (Asin)Naming.lookup("Trigonometry"); 
				n = obj6.asin(b); 
				System.out.println("Inverse of sin(" + a + ") = " + n); 
				break; 
			case 8: 
				Acos obj7  = (Acos)Naming.lookup("Trigonometry"); 
				n = obj7.acos(b); 
				System.out.println("Inverse of cos(" + a + ") = " + n); 
				break; 
			case 9: 
				Atan obj8  = (Atan)Naming.lookup("Trigonometry"); 
				n = obj8.atan(b); 
				System.out.println("Inverse of tan(" + a + ") = " + n); 
				break; 
			} 
		} 
	} 
}

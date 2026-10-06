
public class Sobrecarga {

	
	static int max(int a, int b) {
		System.out.println("int");
		/*if (a>b) {
			return a;
		}
		else
			return b;
		*/
		
		return (a > b) ? a : b;
		
	}

	static long max(long a, long b)  {
		System.out.println("long");
		/*if (a>b) {
			return a;
		}
		else
			return b;
		*/
		return (a > b) ? a : b;
		
	}
	
	static float max(float a, float b) {
		System.out.println("float");
		/*if (a>b) {
			return a;
		}
		else
			return b;
		*/
		return (a > b) ? a : b;
		
	}

	static double max(double a, double b) {
		System.out.println("double");
		/*if (a>b) {
			return a;
		}
		else
			return b;
		*/
		return (a > b) ? a : b;
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 20;
		int b = 100;
		System.out.println(max(a, b));
		System.out.println(max(b, b));
		System.out.println(max(a, b));
		System.out.println(max(a, b));
	}

}

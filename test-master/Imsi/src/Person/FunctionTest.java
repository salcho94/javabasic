package Person;

public class FunctionTest {
public static void main(String[]args) {
			int a=10,b=20;
			int result  = add(a,b);
			System.out.println(result);
			 result  = bagi(a,b);
			 System.out.println(result);
		     result  = go(a,b);
		     System.out.println(result);
			double na = nanugi(a,b);
			System.out.println(na);
}			
		static int add(int a, int b) {
			int result = a+b;
			return result;
		}
		static int bagi(int a, int b) {
			int result = a-b;
			return result;
		}
		static double nanugi(double a,double b ) {
			double na=a/b;
			return na;
		}
		static int go(int a , int b) {
			int result = a*b;
			return result;
		}
}
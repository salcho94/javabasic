import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.println("더하기 할 숫자 두개를  입력하세요");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
	
		int sum = n1+n2;
		if(sum%2 == 0) {
			System.out.println("당첨!");
			
		}else if(sum%2 == 1) {
			System.out.println("꽝! 다음기회에....");
		}

	}

}

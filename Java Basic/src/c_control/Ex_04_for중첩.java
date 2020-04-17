package c_control;

public class Ex_04_for중첩 {

	public static void main(String[] args) {

		//*****
		for(int j=0;j<5;j++) {

			for(int i=0;i<j;i++) {
				System.out.print(" ");// 줄이다
			}
			for(int i=0;i<5-j;i++){
				System.out.print("*");//갯수다
			}
			System.out.println();
		}
		//1a~z까지 출력해주세요 한줄로 

		//			for(int i=0;i<26;i++) {
		//				for(char ch='A';ch<='A'+i ;ch++) 
		//					System.out.print(ch);
		//				System.out.println();
		//				for (; ch<='A'+i ;ch++) 
		//				System.out.println();






	}



}



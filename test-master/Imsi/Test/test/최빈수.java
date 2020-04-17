package test;

public class 최빈수 {

	public static void main(String[] args) {
		int[] a = {1,2,1,3,1,4,2,1,2,3,1};
		int[] mode = new int[13];


		for(int i=0;i< 10 ;i++) {
			mode[a[i]]++;

		}
		int moden = 0;
		int modev = 0;
		for (int i = 0; i < 10; i++) {
			if (modev < mode[i]) {
				modev = mode[i];
				moden = i;
			}
		}
		 System.out.println("최빈수는:"+moden+"  "+"횟수는 :"+modev);
	}
}
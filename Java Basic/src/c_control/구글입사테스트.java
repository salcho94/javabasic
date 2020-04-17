//*  문제가 어려운 것이 아니라 구글입사시험이라는 편견이 있었다.
// *
// * 문제  : 8의 숫자 세기(구글입사문제)
// *
// 1부터 10,000까지 8이라는 숫자가 총 몇번 나오는가?
// 8이 포함되어 있는 숫자의 갯수를 카운팅 하는 것이 아니라 8이라는 숫자를 모두 카운팅 해야 한다.
// (※ 예를들어 8808은 3, 8888은 4로 카운팅 해야 합니다)
// 결과 : 4000
package c_control;

public class 구글입사테스트 {
   public static void main(String[] args) {
      int cnt=0;//결과 수를 저장할 변수를 하나 만든다.
      for(int i=1; i<=10000; i++)//for조건문을 이용하여 i 라는 변수에 1-10000까지의 숫자를 출력한다
      {
         int temp=i;//변수에 위에서나온 i 변수를 대입해준다 
         boolean b = true;//논리형 변수boolean/b에 true를 대입한다.
         while(b) //조건값 b변수를 while문에 대입해준다
         {
            if(temp%10 == 8) cnt++;// 만일 temp를 10으로 나눈 나머지값이 8이라면 cnt변수에 1을 더하시오
            if(temp<10) b= false; //만일 temp변수가 10 보다 작다면 그때는 b변수의 값이 거짓이됩니다 //문장이 닫힌다
            temp/=10;//temp나누기 10을한다
         }
      }
      System.out.println(cnt);//변수 cnt의 값을 출력한다
   }
}
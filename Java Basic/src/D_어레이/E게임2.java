package D_어레이;

import java.util.Scanner;
import java.util.StringTokenizer;

public class E게임2 {

   public static void main(String[] args) {
      int[]baseball=new int[3];
      int[]answer = new int[3];
      
      int strike=0, ball=0;
      
      //1.임의의 수를 3개를 baseball배열에 저장
      //   중복수 배제(###)
      for(int i=0;i<baseball.length;i++) {
            baseball[i]=(int)(Math.random()*10);
            if(i != 0) {
               boolean compare=true;
               while(compare) {
                  if(baseball[i]==baseball[i-1]) {
                     baseball[i]=(int)(Math.random()*10);
                  }else {
                     break;
                  }
               }
            }
            System.out.println(baseball[i]) ;
         }
          
   
      //2.사용자 입력값 받아서 asnwer에 각각의 숫자를 저장
      Scanner sc = new Scanner(System.in);   //sc라는 가상의 통로를 만들어서
      System.out.print("숫자입력->");
      for(int i=0; i<3; i++) {
         answer[i]=sc.nextInt();
         
      }
            
      //3. 값비교   
      for(int i=0; i<3; i++) {   //baseball만 비교
         for(int j=0; j<3; j++) {
            if(baseball[i] == answer[j]) {   //같은 값을 찾음
               if( i == j) {
                  strike++;
               }else {
                  ball++;
               }
            }
            
         }//end for-j
         
      }//end for-i
      
      //4. Strike와 ball 출력
      
      System.out.println("Strike : " + strike + " / ball : " + ball);
            
         
      
   }
   }


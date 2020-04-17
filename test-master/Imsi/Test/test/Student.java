package test;
import javax.swing.JOptionPane;



/*식 당 예 제 */

public class WhileTest3홍현지{



public static void main(String[] args){

//  ** 짱구 식당 **

// 1. 김치찌개 - 5,000원

// 2. 된장찌개 - 5,500원

// 3. 부대찌개 - 9,000원

// 4. 청국장   - 6,000원

// 5. 주문 종료

// --->영수증 프로그램



String bill = "총 금액 : 원";

while(true){ // 무한루프

String menu = " *** 짱 구 식 당 ***\n";

menu += "1. 김치찌개 - 5,000원\n";

menu +="2. 된장찌개 - 5,500원\n";

menu +="3. 부대찌개 - 9,000원\n";

menu +="4. 청국장   - 6,000원\n";

menu +="5. 주문 종료\n";



int menuBun = 0;  // do{} 안에있는 변수는 지역변수라 밖에다 선언해야함

//1~5번외에 다른거 골랐을 때!!!



do{ 

menuBun = Integer.paresInt(JOptionPane.showInputDialog(menu));



menu="1~4번 중에서 선택하세요, 5번은 취소 입니다.";



//if( 1~5번 중에 고르면 나가기)

//if(1<=menuBun && menuBun<=5) 

    // break;

}while(!(1<=menuBun && menuBun<=5));



if(menuBun==5){

    System.out.println("주문을 종료합니다.");

    break;

   }



int danga = 0;

int person = 0;

switch(menuBun){

case 1: 

System.out.println("선택한 메뉴는 김치찌개입니다.");

danga = 5000;



person = Integer.parseInt(JOptionPane.showInputDialog("몇 인분이요?"));

int add = Integer.parseInt(JOptionPane.showInputDialog("추가 메뉴 : 라면사리는 +1000원, 추가 할까요? 1.예 2.아니오"));



if(add==1){

bill="** 짱구 식당 **\n ◎영수증\n";

bill+="김치찌개 단가 "+danga+"원\n";

bill+="수량 : "+person+"개\n";

bill+="중간금액 "+(danga*person)+"원\n";

bill+="추가 "+1000+"원 총금액 "+((danga*person)+1000);

}

else{

bill="** 짱구 식당 **\n ◎영수증\n";

bill+="김치찌개 단가 "+danga+"원\n";

}

break;



case 2: case 2:

    //2. 된장찌개 - 5,500원

    //   공기밥 + 1000원    추가 : 1.아니오   [2.추가(1번을 누르면 계속 추가)  3. 중지]

    //  추가된 횟수까지 더해서  bill지가 완성돼야 한다.

    break;

   case 3:

    //3. 부대찌개 - 9000원  인원수, + 추가 해서 bill지 만들기

    //   1. 만두사리 - 500원  2. 라면 1000원  3. 쫄면  500원  4.모듬 4000원

    break;

   

   case 4: //[옵션] - 자유주제

    //4. 청국장 - 6000원 

    //1. 공기밥 메뉴

    //2. 추가메뉴  1) 올갱이 +1000  2)두부 +500원 3)콩 +100원

    

    break;

   }

   

  }

  //영수증 보여주기


  

  



	
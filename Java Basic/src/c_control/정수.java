package c_control;
import java.util.Scanner;
public class 정수 {
public static void main(String[] args) {
int A = 0;int B = 0;int C = 0;
Scanner sc = new Scanner(System.in);
System.out.println("세 정수 ABC를 공백으로 구분하여 입력하세요");
A = sc.nextInt();
B = sc.nextInt();
C = sc.nextInt(); //세 정수 입력
int mid = A>B?(A>C?(B>C?B:C):A): (A>C?A:(B>C?C:B));
System.out.println(mid);
}
}


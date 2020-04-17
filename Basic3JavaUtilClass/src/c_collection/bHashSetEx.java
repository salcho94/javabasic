package c_collection;
import java.util.HashSet;

public class bHashSetEx 
{
	public static void main(String[] args)
	{
		HashSet set = new HashSet();// 추가하는함수는 add
		set.add("rabbit");//순서가 뒤죽박죽 이구 중복의 제거가 실행되었다 
		set.add("zebra");
		set.add("fox");
		set.add("zebra");
		set.add("elephant");
		set.add("elephant");	
		
		System.out.println( set );		
	}
}

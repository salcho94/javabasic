package c_collection;

import java.util.ArrayList;
import java.util.Collections;

public class aArrayListEx2 {
	public static void main(String[] args) 
		{// ArrayList담을때 String지정해주면 확실하다.
		ArrayList<String>  list = new ArrayList<String>(4);//데이터가 4개라도 알아서 확장함
		list.add("rabbit");  
		list.add("zebra");
		list.add("squirrel");
		list.add("fox");
		list.add("lion");
		list.add("elephant");
		// 노랜표시 없애려면 generics 지정  
		//<> 이것이 generics
		
//	    for(String date:list) { 이것이 향샹된 for문이다  사용가능할때는 이러한 자료구조에generics까지 있어야 사용가능 
//	    	System.out.println(data);
//	    }
//		
		
		for(int i=0;i<list.size();i++) {
			String data = (String)list.get(i);// get함수는 무조껀 object형으로 return 우리가 알아서 형변환 해줘야 합니다.
			System.out.println();
		}
	}
}

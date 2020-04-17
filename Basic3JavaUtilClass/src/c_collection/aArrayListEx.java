// 동적인 배열을 처리하기위해서 : ArrayList
package c_collection;
import java.util.ArrayList;

class aArrayListEx
{
	public static void main(String[] args) 
	{
		ArrayList data = dataSet();//객수가 몇개인지 모를때 써야지
			for(int i=0;i<data.size();i++) {
				System.out.println(data.get(i));
			}
			
		// dataSet() 안의 변수 값들을 여기서 출력한다면??
		
	}

	static ArrayList dataSet()// 배열의 갯수를 지정해서 알아서 출력되게 만드는 것
	{
		String	name = "김태희";
		int		age = 31;
		double	height = 162.3;
		ArrayList data = new ArrayList();
		data.add(name);
		data.add(age);
		data.add(height);
		
		return data;



	}
}

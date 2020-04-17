/*wrapper class=자료형 관련 클래스
 * Byte/short 
 * Character
 * Integer/ Long
 * Float/Double
 * 형변환 관련하여 만들어진 클래스
 * ex) 
 * String -> int형
 * Integer.parseInt();
 * "" +10 -> "10" 문자열 플러스 숫자는 문자열이 돼 이것은 편법
 * 	String.valueof(10) -> "10" 이것이 정식 
 * 
 *  */

package c_collection;
import java.util.ArrayList;

class aArrayListEx0
{
	public static void main(String[] args) //출력이 깔끔하게 돼는 이유는 오브젝트로배열만들어서 됨
	{
		Object[]data = dataSet();
		
		
		for(int i=0;i<data.length;i++) {
			System.out.println(data[i]);
		}
		
		// dataSet() 안의 변수 값들을 여기서 출력한다면??
		
	}

	static Object[] dataSet()// 배열의 갯수를 어떻게잡을까? 그것이알고싶다
	{
		String	name = "김태희";
		int		age = 31;
		double	height = 162.3;

		Object[] data = new Object[3];//배열 적게잡으면 프로그램 안돌아
		data[0] = name;
		data[1] = new Integer(age);//int 기본형 INTEGER클래스
		data[2] = new Double(height);// double ->Double
		 
		return data;
	}
}

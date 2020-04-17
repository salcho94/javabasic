package test;


//배열을 사용한 방법 
public class Favonachi2 {

	public static void main(String[] args) {
		
		
		
int []arr = new int[100];
        
        arr[1] = 1;
        
        arr[2] = 1;
        
        
        for (int j = 3; j < 15; j++) {
            
            arr[j] = arr[j-1] + arr[j-2];
            
            
        }
        
        for (int j = 1; j < 15; j++) {
            
            
            System.out.print(arr[j]+" ");
            
            
        }
        
    }
 
}
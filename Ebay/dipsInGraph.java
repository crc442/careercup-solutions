// Given graph below, and the Y-axis co-ordinates in and array, find the lowest point of every dip in the graph. 
// (I know graph looks horrible but i tried my best)


// 70	                           /
// 60	                      /\/
// 50	                    /
// 40	       /\        /
// 30	     /    \    /
// 20	 /\/        \/
// 10	/
// Array is : 0 10 20 10 30 40 50 40 30 20 10 20 30 40 50 60 50 60 70 
// Result List : 0 10 10 50

public class Yolo {

	public static void main (String[] args) throws java.lang.Exception
	{
		int [] y = new int[] {0 ,10 ,20 ,10 ,30 ,40 ,50 ,40 ,30 ,20 ,10 ,20 ,30 ,40 ,50 ,60 ,50 ,60,70 };
		findit(y);
	}

	public static void findit(int a[]) {
		boolean upFlag = false;

		for(int i = 0, n = a.length; i< n; i++){
			if(a[i+1] > a[i] && !(upFlag)){
				System.out.println(a[i]);
				upFlag = true;
			}
			
			if(a[i+1] < a[i]){
				upFlag = false;
			}
		}
	}
	
}

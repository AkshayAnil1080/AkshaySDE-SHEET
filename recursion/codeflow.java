package basics;

public class codeflow {
 public static void main(String[] args) {
	fun(3);
}
 static void fun(int n)
 {
	 if(n==0)   // base cases . to stop the recursion
		 return;
	 
	 System.out.println(n); //
	 fun(n-1);
	 System.out.println(n);
 }
}

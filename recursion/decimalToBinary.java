package basics;

public class decimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fun(10);
	}
	static void fun(int n)
	
	{
		if(n==0) return;
		
		fun(n/2);
		System.out.println(n%2);
	}

}

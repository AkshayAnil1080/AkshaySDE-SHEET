package basics;

public class printNto1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fun(5);
	}
	static void fun(int n)
	{
		if(n==0)
			return;
		
		System.out.println(n);
		fun(n-1);
	}

}

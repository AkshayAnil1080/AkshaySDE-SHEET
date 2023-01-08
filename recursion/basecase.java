package basics;

public class basecase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fun(3);
	}
	static void fun(int n)
	{
		if(n==0)
			return;  // recurion stop 
		
		System.out.println(n);
		fun(n-1);
	}

}

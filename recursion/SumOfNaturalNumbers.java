package basics;

public class SumOfNaturalNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fun(5));
	}
	static int fun(int n)
	{
		if(n==0)
			return 0;
		
		return n + fun(n-1);
	}
}

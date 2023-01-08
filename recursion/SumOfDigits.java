package basics;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(sod(253));
		System.out.println(fun(253));
	}
	static int fun(int n)  //recursive
	{
		if(n==0) return 0;
		
//		 return n%10 + fun(n/10);  // Tail recursive (faster)
		 return fun(n/10) + n%10;// non tail recursive
	}
	static int sod(int n)  // iterative
	{
		int sum=0;
		while(n>0)
		{
			sum+=n%10;
			n=n/10;
		}
		return sum;
	}

}

//advanced info
//merger sort - recur fro partion then merge -Ntr - 
//QuickSort - recursion is last step - TR - faster

//In left, root, right TR
//pre  root, left, right TR
//post left, right, root - NTR
//So if req to find sum of tree use pre or in

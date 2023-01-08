package basics;

public class palindromeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abbcbb";
		System.out.println(isPalin(str));
		System.out.println(fun(str,0,str.length()-1));
	}
	
	static boolean fun(String str, int st, int e) //rec
	{
		if(st>=e) return true;
		
		return ((str.charAt(st)== str.charAt(e)) 
				&& fun(str,st+1,e-1));
	}
	static boolean isPalin(String str) // itr
	{
		int l=0;int h=str.length()-1;
		while(l<=h)
		{
			if(str.charAt(l)!= str.charAt(h))
				return false;
			
			l++; h--;
		}
		return true;
	}

}

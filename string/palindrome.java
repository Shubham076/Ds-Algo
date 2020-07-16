package string;

public class palindrome {
	public static void main(String[] args) {
		
		String s="NAMAN";
		String p="Shubham";
		System.out.println(palindrome(s));
		System.out.println(palindrome(p));
		
		
		
	}
	
	public static boolean palindrome(String s)
	{
		int start=0;
		int end=s.length()-1;
		while(start<end)
		{
			if(s.charAt(start)!=s.charAt(end)) return false;
			start++;
			end--;
		} return true;
		
	}
	
}

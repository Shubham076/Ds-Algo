package string;

public class string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String c="hello";
		
		System.out.println(c.length());
		System.out.println(c.charAt(3));
		System.out.println(c.substring(1,3));
		System.out.println(c.substring(2));
		
		
		///concatenate two strings means joining or linking two strings
		
		String a="Shubham";
		String b=" Dogra";
		System.out.println(a+b);
		System.out.println(a.concat(b));
//		
//		//TO FIND THE STARTING INDEX OF A SUBSTRING;
//		System.out.println(a.indexOf("ubh"));
//		System.out.println(a.indexOf("UBH"));
//
//		///starts with function
//		System.out.println(b.startsWith(" Do"));
//		System.out.println(b.startsWith("do"));
//		
		//to compare two strings
		System.out.println(a.equals(a));
		
		for(int i=0;i<c.length();i++)
		{
			System.out.println(c.charAt(i));
		}
		
	
	System.out.println("---------------");
	//uppercase a string
	String str="shubham";
	System.out.printf("%S",str+"\n");
	
	System.out.println("---------------");
	
	///move to next line
	System.out.printf(str+"%n"+b+"\n");
        
	System.out.println("---------------");
	
	
	///format string to n characters or shift right
	System.out.printf("%-20s",str+"\n");
	

	System.out.printf("%10s",str);
	}
	    
}

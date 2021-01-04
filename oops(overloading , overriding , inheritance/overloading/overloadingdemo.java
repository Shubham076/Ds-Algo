package stacksandqueues.overloading;

public class overloadingdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sum(2,3));
		System.out.println(sum(2,3,4));
		System.out.println(sum(2.1,5.6));
		
		System.out.println(sum(1,5,7,7,8));
	}
	public static int sum(int a,int b)
	{
		return a+b;
	}
	
	public static int sum(int a,int b,int c)
	{
		return (a+b+c);
	}
	public static double sum(double a,double b)
	{
		return (a+b);
	}
	
	///no function contain more than 2 variable arguments
	// in case of more than 2 arguments variable one is declared at last;
	//a variable arguments is nothing but a array
	public static int sum(int...args)
	{   int sum=0;
		for(int val:args)
		{
			sum+=val;
		}
		return sum;
	}
}

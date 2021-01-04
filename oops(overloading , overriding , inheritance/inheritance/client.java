package stacksandqueues.inheritance;

public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//case 1 when reference and instance both are of parent
		parent obj=new parent();
		
		obj.fun();
		System.out.println(obj.d);
		System.out.println(obj.d1);
		
		System.out.println("-------------");
	
		//case 2 when reference and instance variable are of child
		child c=new child();
		System.out.println(c.d2);
		
		System.out.println("-------------");
		
		//case 3 when reference is of parent and instance is of child
		parent obj1=new child();
		System.out.println(obj1.d);
		System.out.println(obj1.d1);
		System.out.println(((child)obj1).d2);
		obj1.fun();
		
		System.out.println("-------------");
		
		//case4 when reference is of child and instance is of parent
		//child c1=new parent(); not possible in java...!
		
	}

}

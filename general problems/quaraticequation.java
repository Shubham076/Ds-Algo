import java.util.Scanner;
public class quaraticequation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		 int a = scn.nextInt();
		 int b = scn.nextInt();
		 int c = scn.nextInt();
		 scn.close();
		 int D = b * b - 4 * a * c;
		 
		 int x,y;
		 if(D >= 0){	 
			D = (int)Math.sqrt(D);
			x = (-b + D) / 2 * a;
			y = (-b - D) / 2 * a;
			System.out.println("First root is: " + x);
			System.out.print("Second root is: " + y);
		 }
		 

	}

}

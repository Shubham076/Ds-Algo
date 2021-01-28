import java.util.Scanner;
public class fibonacci {

	public static void main(String[] args) {
		int fn = 0,sn = 1,counter = 0,next;
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		s.close();
	while(counter < N) {
		next = fn + sn;
		fn = sn;
		sn = next;
		counter++;
		
	}System.out.println(fn);

	}

}

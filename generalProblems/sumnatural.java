import java.util.Scanner;

public class sumnatural {

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int N = s.nextInt();
	s.close();
	
	int sum = 0,i = 1;
	while(i <= N) {
		sum = sum + i;
		i++;
	}
	System.out.println(sum);
	}

}

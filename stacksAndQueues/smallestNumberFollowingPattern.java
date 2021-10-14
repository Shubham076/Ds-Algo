import java.util.*;
class smallestNumberFollowingPattern{
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		Stack<Integer> s = new Stack<>();

		int num = 1;
		for(int i = 0; i < str.length(); i++){
			char c = str.charAt(i);
			if(c == 'd'){
				s.push(num);
				num++;
			}
			else{
				s.push(num);
				num++;
				while(s.size() > 0){
					System.out.print(s.pop());
				}
			}
		}
		s.push(num);
		while(s.size() >  0){
			System.out.print(s.pop());
		}
	}
}
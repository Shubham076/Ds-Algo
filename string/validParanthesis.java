// print whether paranthesis is valid or not
class validParanthesis{
	// this algo is valid for one type of brackets
	public static void main(String[] args){
		String s = "()(())";
		 int count = 0 ;

        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) == '('){
                count++;
            }
            else{
                count--;
            }
            if(count < 0){
                System.out.println("false");
                return;
            }
        }
        System.out.println(count == 0);
	}
}
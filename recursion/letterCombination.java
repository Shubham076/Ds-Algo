import java.util.ArrayList;

public class letterCombination {

  static String[] digits2letters = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","xyzw"};


    public static void main(String[] args) {

       System.out.println(printCombination("23"));
    
    //     String s = "23";

    //    ArrayList<String> result = new ArrayList<>();
    //     result.add("");
        
    //     for(int i = 0 ;  i <s.length() ; i++){

    //         result =  combinations(digits2letters[s.charAt(i) - '0'], result);
    //      }
 
    //      System.out.println(result);

    }

    // recursion

    public static ArrayList<String> printCombination(String str){

        if( str.length() == 0){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        char ch = str.charAt(0);
        String ros = str.substring(1);

        ArrayList<String> rres = printCombination(ros);
        ArrayList<String> myres = new ArrayList<>();

        String letters = digits2letters[ch - '0'];

        for(int i= 0; i < letters.length() ; i++){

            char c = letters.charAt(i);

            for(String s : rres){
                myres.add(c + s);
            }
        }

        return myres;
    }


    // iterative
    public static ArrayList<String> combinations(String letters , ArrayList<String> res){

        ArrayList<String> newResult = new ArrayList<>();

        for(int i = 0; i < letters.length() ; i++){

            for(String str:res){

                newResult.add(str+letters.charAt(i));
            }
        }

        return newResult;
    }
    
}
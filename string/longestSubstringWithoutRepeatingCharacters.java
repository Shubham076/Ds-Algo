import java.util.HashSet;
class Main{
    public static void main(String[] args){
        String s = "abcabcbb";

        int i = 0 , j = 0;
        int max = 0;
        HashSet<Character> set = new HashSet<>();

        while(j < s.length()){
            char ch = s.charAt(j);
            if(!set.contains(ch)){
                set.add(ch);
                j++;
                max = Math.max(max , set.size());
            }
            else{
                set.remove(s.charAt(i++));
            }
        }

        System.out.println(max);
    }
}
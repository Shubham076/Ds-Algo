public class activitySelection {
    public static void main(String[] args){
        int s[] = {1, 3, 0, 5, 8, 5};
        int e[] = {2, 4, 6, 7, 9, 9}; 
        int i = 0;

        System.out.println(i);
        for(int j = 1; j < s.length; j++){
            if(s[j] >= e[i]){
                System.out.println(j);
                i = j;
            }
        }
    }
}

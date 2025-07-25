import java.util.*;

public class subtract2arrays {
    public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr1 = new int[n];

    for(int i = 0; i < n; i++){
        arr1[i] = scn.nextInt();
    }
    
    int m = scn.nextInt();
    int[] arr2 = new int[m];
        for(int i = 0; i < m; i++){
        arr2[i] = scn.nextInt();
    }
    // m > n
    int[] ans = new int[m];
    
    int i = arr1.length - 1;
    int j = arr2.length - 1;
    int k = ans.length - 1;
    int carry = 0;
    
    while(k >= 0){
        int d1 = arr2[j--] + carry;
        int d2 = i >= 0  ? arr1[i] : 0;
        int diff = 0;
        if(d1 >= d2){
            diff = d1 - d2;
            carry = 0;
        }
        else {
            carry = -1;
            diff = d1 + 10 - d2;
        }
        ans[k--] = diff;
        i--;
    }
    
    int x = 0;
    while(x < ans.length){
        if(ans[x] == 0)
            x++;
        else
            break;
    }
    
    while(x < ans.length){
        System.out.println(ans[x++]);
    }
 }
}

import java.util.*;
public class add2arrays {


public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr1 = new int[n];
    scn.close();

    for(int i = 0; i < n; i++){
        arr1[i] = scn.nextInt();
    }
    
    int m = scn.nextInt();
    int[] arr2 = new int[m];
        for(int i = 0; i < m; i++){
        arr2[i] = scn.nextInt();
    }
    
    int[] ans = new int[n > m ? n : m];
    
    int i = arr1.length - 1;
    int j = arr2.length - 1;
    int k = ans.length - 1;
    int carry = 0;
    
    while(i >= 0 || j >= 0 || carry > 0){
        int sum = carry;
        
        if(i >= 0)
            sum += arr1[i--];
        if(j >= 0)
            sum += arr2[j--];
        
        ans[k--] = sum % 10;
        carry = sum / 10;
    }
    
    for(int x : ans){
        System.out.println(x);
    }
 }
}


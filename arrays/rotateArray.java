import java.util.*;

public class rotateArray {

  public static void display(int[] a){
    StringBuilder sb = new StringBuilder();

    for(int val: a){
      sb.append(val + " ");
    }
    System.out.println(sb);
  }
  
    public static void reverse(int[] arr , int start , int end){
    while(start < end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        
        start++;
        end--;
        
    }
  }

  public static void rotate(int[] a, int k){

	  k = k % a.length;
        
      if(k < 0)
        k = k  + a.length;
    
    //part one 
    reverse(a , 0 , a.length - k - 1);
    
    // part two
    reverse(a , a.length -  k , a.length - 1);
    
    // reverse entire array
    reverse(a , 0 , a.length - 1);

}

public static void main(String[] args) throws Exception {
   Scanner scn = new Scanner(System.in);
   int n = scn.nextInt();
   int[] a = new int[n];
   for(int i = 0; i < n; i++){
       a[i] = scn.nextInt();
   }

   int k = scn.nextInt();
   scn.close();

    rotate(a, k);
    display(a);
 }

}


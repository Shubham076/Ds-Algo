import java.util.Scanner;
import java.util.Stack;
class largestAreaHistogram{
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < arr.length; i++){
			arr[i] = scn.nextInt();
		}
		area(arr);
	}

	public static void area(int[] heights){
		int n = heights.length;
        int[] sl = new int[n];  //next smaller on the left 
        int[] sr = new int[n];  //next smaller on the right
        
        sl[0] = -1;
        sr[n - 1] = n;
        Stack<Integer> st = new Stack<>();
        st.push(0);
        
        //next smaller element on the right
        for(int i = 1; i < heights.length; i++){
            
            while(st.size() > 0 && heights[i] < heights[st.peek()]){
                int idx = st.pop();
                sr[idx] = i;
            }
            
            st.push(i);
        }
        
        while(st.size() > 0){
            int idx = st.pop();
            sr[idx] = n;
        }
        
        st = new Stack<>();
        st.push(n - 1);
        for(int i = n - 2; i >= 0; i--){
            while(st.size() > 0 && heights[i] < heights[st.peek()]){
                int idx = st.pop();
                sl[idx] = i;
            }
            st.push(i);
        }
        
        while(st.size() > 0){
            int idx = st.pop();
            sl[idx] = -1;
        }
        
        int ans = 0;
        for(int i = 0 ; i < heights.length; i++){
            int width = sr[i] - sl[i] - 1;
            int height = heights[i];
            int area = height * width;
            ans  = Math.max(area, ans);
        }
        return ans;
	}
}
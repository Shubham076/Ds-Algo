import java.util.*;

public class shellRotate {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] a = new int[n][m];
        for(int i = 0; i<n; i++)
        {
        	for(int j = 0; j< m; j++)
        	{
        		a[i][j] = scn.nextInt();
        	}
        }
        
        int s = scn.nextInt();
        int r = scn.nextInt();
        
        rotateShell(a,s,r);
        display(a);
        
	}

    public static void display(int[][] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr[0].length; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static void rotateShell(int[][] a, int s, int r)
    {
    	int[] oned = fillOnedFromShell(a,s);
    	rotate(oned,r);
    	fillShellFromOned(a,s,oned); 
    }
    
    public static void rotate(int[] oned, int r)
    {
    	r = r % oned.length;
    	if(r < 0)
    	{
    		r = r + oned.length;
    	}
    	
    	reverse(oned,0 , oned.length - r -1);
    	reverse(oned, oned.length - r, oned.length - 1 );
    	reverse(oned, 0, oned.length-1);
    	
    }
    
    public static void reverse(int[] oned, int l , int r) 
    {
    	while(l < r)
    	{
    		int temp = oned[l];
    		oned[l] = oned[r];
    		oned[r] = temp;
    		l++; 
    		r--;
    	}
    }
    
    public static int[] fillOnedFromShell(int[][] a, int s)
    {
    	int minr = s - 1;
    	int minc = s - 1;
    	int maxr = a.length - s;
    	int maxc = a[0].length - s;
    	int sz = 2 * (maxr - minr + maxc - minc);
    
    	int[] oned = new int[sz];
    	
    	int idx = 0;
    	for(int i = minr, j = minc; i <= maxr; i++)
    	{
    		oned[idx] = a[i][j];
    		idx++;
    	}
    	minc++;
    	
    	for(int i = maxr, j = minc; j <= maxc; j++)
    	{
    		oned[idx] = a[i][j];
    		idx++;
    	}
    	maxr--;
    	
    	for(int i = maxr, j = maxc; i>= minr; i--)
    	{
    		oned[idx] = a[i][j]; 
    		idx++;
    	}
    	maxc--;
    	
    	for(int i = minr, j = maxc; j>= minc; j--)
    	{
    		oned[idx] = a[i][j]; 
    		idx++;
    	}
    	return oned;
    	
    }
    
    public static void fillShellFromOned(int[][] a, int s, int[] oned)
    {
    	int minr = s - 1;
    	int minc = s - 1;
    	int maxr = a.length - s;
    	int maxc = a[0].length - s;
    	
    	int idx = 0;
    		for(int i = minr, j = minc; i<= maxr; i++)
    	{
    		a[i][j] = oned[idx];
    		idx++;
    	}
    	minc++;
    	
    	for(int i = maxr, j = minc; j <= maxc; j++)
    	{
    		a[i][j] = oned[idx];
    		idx++;
    	}
    	maxr--;
    	
    	for(int i = maxr, j = maxc; i>= minr; i--)
    	{
    		a[i][j] = oned[idx];
    		idx++;
    	}
    	maxc--;
    	
    	for(int i = minr, j = maxc; j>= minc; j--)
    	{
    		a[i][j] = oned[idx]; 
    		idx++;
    	}
    
    }

}
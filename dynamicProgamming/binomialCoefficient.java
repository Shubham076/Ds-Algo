class binomialCoefficient{
    public static void main(String[] args) {
        int n = 5, k = 2; 
        System.out.println("Value of C("+n+","+k+") is " + binomialCoeff(n, k)); 
    }

    public static int min(int a, int b) 
    { 
    return (a < b) ?  a: b;  
    }
  

  public static int binomialCoeff(int n, int k) 
    { 
    int C[][] = new int[n + 1][k + 1];  
      
        // Calculate  value of Binomial Coefficient in bottom up manner 
    for (int i = 0; i <= n; i++) 
    { 
        for (int j = 0; j <= min(i, k); j++) 
        { 
            // Base Cases 
            if (j == 0 || j == i) 
                C[i][j] = 1; 
       
            // Calculate value using previously stored values 
            else
                C[i][j] = C[i - 1][j - 1] + C[i - 1][j]; 
          } 
     }
     
     System.out.println("-------------------------");

     for(int i = 0; i < C.length ; i++){
         for(int j = 0; j < C[0].length; j++){
             System.out.print(C[i][j] + " ");
         }
         System.out.println();
     }

     System.out.println("-----------------------");
       
    return C[n][k]; 
    } 
}
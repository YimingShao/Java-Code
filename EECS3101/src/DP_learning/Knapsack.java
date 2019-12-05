package DP_learning;


public class Knapsack {
	static int max(int a, int b) { return (a > b)? a : b; } 
    
	   // Returns the maximum value that can be put in a knapsack of capacity W 
	    static int knapSack(int W, int wt[], int val[], int n) 
	    { 

	     int K[][] = new int[n+1][W+1]; 
	       
	     // Build table K[][] in bottom up manner 
	     for (int i = 0; i <= n; i++) 
	     { 
	         for (int w = 0; w <= W; w++) 
	         { 
	             if (i==0 || w==0) 
	                  K[i][w] = 0; 
	             else if (wt[i-1] <= w) 
	                   K[i][w] = max(val[i-1] + K[i-1][w-wt[i-1]],  K[i-1][w]); 
	             else
	                   K[i][w] = K[i-1][w]; 
	         } 
	      } 
	      for(int i=0;i<=n;i++) {
	    	  System.out.println();
	    	  for(int j=0; j<=W;j++) {
	    		  System.out.print(K[i][j]+"\t");
	    	  }
	      }
	      return K[n][W]; 
	    } 
	  
	    
	    // Driver program to test above function 
	    public static void main(String args[]) 
	    { 
	        int val[] = new int[]{6, 10, 12}; 
	    int wt[] = new int[]{1, 2, 3};
	    int  W = 5; 
	    int n = val.length; 
	    System.out.println(knapSack(W, wt, val, n)); 
	    } 
	/*This code is contributed by Rajat Mishra */
		
}

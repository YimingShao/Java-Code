package DP_learning;

public class Least_Common_Subsequence {
	
	public static int lcs(char[] X, char[] Y) {
		int x = X.length;
		int y = Y.length;
		int c[][] = new int[x+1][y+1];
		
		for(int i=0;i<x;i++) {
			System.out.println();
			for(int j=0;j<y;j++) {
				if(i==0||j==0) {
					c[i][j]=0;
				}else if(X[i]==Y[j]) {
					c[i][j]=c[i-1][j-1]+1;
				}else {
					c[i][j]=max(c[i-1][j], c[i][j-1]);
				}
				System.out.print(c[i][j]);
			}
			
		}
		return c[x-1][y-1];
	}
	
	public static int max(int a, int b) {
		return (a>b)?a:b;
	}
	
	public static void main(String[] args) {
		
		String s1="0ACGGTTA";
		String s2="0CGTAT";
		
		char[] X=s1.toCharArray(); 
	    char[] Y=s2.toCharArray(); 
	  
	    System.out.println("Length of LCS is" + " " + 
	                                  lcs( X, Y )); 
		
	}
}

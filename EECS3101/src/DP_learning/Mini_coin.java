package DP_learning;


public class Mini_coin {
	
	public static int Mini_coin(int a[], int n) {
		int A[] = new int[n+1];
//		for(int i=0; i<=n;i++) {
//			A[i]=Integer.MAX_VALUE;
//		}
		
		for(int i=0; i<a.length+1; i++) {
			for (int j=0; j<=n; j++) {
				if(i==0) {
					A[j]=Integer.MAX_VALUE;
				}else if(j==0) {
					A[j]=0;
				}else {
					if(j>=a[i-1]) {
						A[j]=min(A[j], 1+A[j-a[i-1]]);
					}
				}
			}
		}
	
		for(int i=0; i<=n; i++) {		
			System.out.print(A[i]+"\t");
		}
		return 0;

	}
	
	public static int min(int a, int b) {
		if (a > b) {
			return b;
		}else {
			return a;
		}
	}
	public static void main(String arg[]) {
		int a[] = new int[] {1,5,6,9};
		int n = 11;
		Mini_coin(a, n);
	}

}

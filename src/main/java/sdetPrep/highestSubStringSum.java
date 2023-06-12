package sdetPrep;

public class highestSubStringSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {-2,1,-3,4,-1,2,1,-5,4};
		
		System.out.println("Max sum of sub array : "+maxSubArraySumGeneric(a));
	}
	
	static public int maxSubArraySumGeneric(int a[]) {
		int maxSum = 0;
		
		for(int i=0;i<a.length;i++) {
			int sum =0;
			//System.out.println("Sum init : "+sum);
			for(int j=i;j<a.length;j++) {
				sum = sum + a[j];
				//System.out.println("Sum:"+sum+" + a[j]:"+a[j]+" = Sum:"+sum);
				if(maxSum < sum) {
					maxSum = sum;
				}
			}
		}
		
		return maxSum;
	}

}

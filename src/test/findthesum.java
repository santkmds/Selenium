package test;

public class findthesum {

	
		public static void main(String args[]){

		int [] arr = {4,2,3,5,1,6,0,8,7,4,1,3};
		int sum=6;
		getPairSumAs6(arr,sum);
		}
		public static void getPairSumAs6(int [] arr,int sum){
		//int count=0;
		for(int i=0; i<arr.length;i++)
		    for(int j=i+1;j<arr.length;j++)
		         if((arr[i]+arr[j])==sum){
		           // count++;

		//System.out.print(count);

		System.out.println(arr[i] + " + "+arr[j] + " = 6");

		}

		}

		}
	

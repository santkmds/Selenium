package test;

import java.util.Arrays;
import java.util.Collections;

public class SortDsc {
	public static void main(String[] args) {
		String arr[]= {"aaa","ccc","bbb","ttt","ddd"};
		
		System.out.println("Acending order");
		Arrays.parallelSort(arr);
		System.out.println(Arrays.toString(arr));

		Arrays.sort(arr,Collections.reverseOrder());
		System.out.println("Descending order===");
		System.out.println(Arrays.toString(arr));
		
	}
}

//output
//[ttt, ddd, ccc, bbb, aaa]

//Acending order
//[aaa, bbb, ccc, ddd, ttt]
//Descending order===
//[ttt, ddd, ccc, bbb, aaa]



package TestsAndExamples;

import java.util.HashMap;
import java.util.LinkedList;

import Permute.Int.PermutationGeneratorInt;
import Permute.Object.PermutationGeneratorObject;
import Permute.String.PermutationGeneratorString;
import Permute.String.PermutationRecieverString;

public class Examples {


	public static void main(String[] args) {

		/**
		 * Print a few string combinations
		 */
		
		System.out.println("printing some simple String permutaitons");
		System.out.println();
		String [] testString1=new String[]{"alpha ","beta "};
		String [] testString2=new String[]{"a","b","c"};
		
		PermutationRecieverString prs=new StringPrinting();
		
		PermutationGeneratorString.permute(prs, testString1);
		System.out.println();
		PermutationGeneratorString.permute(prs, testString2);
		System.out.println();
		
		/**
		 * try to guess an integer combination
		 */
		
		System.out.println("bruteforcing a lock combinaiton 321654987");
		IntegerLock lock=new IntegerLock(321654987);
		PermutationGeneratorInt.permute(lock,new int[]{1,2,3,4,5,6,7,8,9});
		
		System.out.println("is lock opened ? "+lock.isOpened());
		System.out.println();
		
		/**
		 * bench how many objects permutations can be made
		 */
		
		Object [] randomObjects=new Object[]{new LinkedList(),new HashMap(),"abcd","123",1,2,3,new LinkedList(),new LinkedList(),new LinkedList(),1,2,3};
		System.out.println("permutationg "+randomObjects.length+" elements, that is n! combinaitons ( 13! = "+factorial(randomObjects.length)+" )");
		
		long startTime=System.currentTimeMillis();
		PermutationGeneratorObject.permute(new DoNothing(), randomObjects);
		long endTime=System.currentTimeMillis();
		System.out.print("time taken ");
		System.out.println((endTime-startTime)+" ms");
		System.out.printf("wow that is %d billions per second, so much void empty funciton calls",((long)(factorial(randomObjects.length)/((endTime-startTime)/1000.0))/1000000000));
		
	}
	
	public static long factorial(long n){
		if (n <= 1)
			return 1;
		else
			return n * factorial(n-1);
	}
}

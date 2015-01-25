////////////////////////////////////////////////////////////////////////////////
//  Course:   CSC 151 Spring 2014
// 
//  Project:  Lab02
//  File:     CounterTest.java
//  
//  Name:     Hillary Paul
//  Email:    hpaul@waketech.edu
////////////////////////////////////////////////////////////////////////////////

/**
 * This program is used to test the Counter class.  It constructs the a counter 
 * using both constructors provided by the Counter class.
 *
 * <p/> Bugs: No known bugs
 * 
 * @author hpaul
 *
 */
public class CounterTester
{

	/**
	 * This program is used to test the Counter class and does not expect any
	 * command line arguments. 
	 *
	 * @param args
	 */
	public static void main(String[] args)
	{
		
		Counter counter = new Counter(1);  //create a new counter with a step value of 1
		
		counter.increase(); //add 1
		System.out.println("Expected Count: 1 -----> Actual Count: " + counter.getCount());
		
		counter.increase(); //add 1
		System.out.println("Expected Count: 2 -----> Actual Count: " + counter.getCount());
		
		counter.decrease(); //subtract 1
		System.out.println("Expected Count: 1 -----> Actual Count: " + counter.getCount());
		
		
		counter = new Counter(10); //create a new counter with a step value of 10
		System.out.println("Expected Count: 0 -----> Actual Count: " + counter.getCount());
		
		counter.increase(); //add 10
		System.out.println("Expected Count: 10 ----> Actual Count: " + counter.getCount());
		
		counter.decrease(); //subtract 10
		System.out.println("Expected Count: 0 -----> Actual Count: " + counter.getCount());
		
		counter.decrease(); //subtract 10
		System.out.println("Expected Count: -10 -----> Actual Count: " + counter.getCount());
		
	}

}

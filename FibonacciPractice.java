public class FibonacciPractice {

	/* Method 1 ( Use recursion ) 
	 * 
	 * Time Complexity: T(n) = T(n-1) + T(n-2) which is exponential.
	 * 
	 * Extra Space: O(n) if we consider the function call stack size, otherwise O(1).
	 * 
	 */
	
	static int fib1(int n) {
		if (n <= 1) {
			return n;
		}
		return fib1(n-1) + fib1(n-2);
	}
	
	
	/* Method 2 ( Use Dynamic Programming ) 
	 * 
	 * Time Complexity: O(n)
	 *
	 * Extra Space: O(n)
	 * 
	 */
	
	static int fib2(int n) {
		// Array to store Fibonacci numbers. 
		int arr[] = new int[n+1];
		int i;
      
		// 0th and 1st number of the series are 0 and 1
		arr[0] = 0;
		arr[1] = 1;
     
		for (i = 2; i <= n; i++) {
			// Add the previous 2 numbers in the series and store it
			arr[i] = arr[i-1] + arr[i-2];
		}
	    	return arr[n];
	}
	
	/* Method 3 ( Space Optimized Method 2 )
	 * 
	 * We can optimize the space used in method 2 by storing the previous two numbers
	 * only because that is all we need to get the next Fibonacci number in series.
	 * 
	 * Time Complexity: O(n)
	 * 
	 * Extra Space: O(1)
	 * 
	 */

    static int fib3(int n) {
        int a = 0, b = 1, c;
        if (n == 0) {
            return a;
        }
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
	
	
		
	public static void main (String args[]) {
		int n = 9;
		System.out.println("Method 1: " + fib1(n));
		
		System.out.println("Method 2: " + fib2(n));
		
		System.out.println("Method 3: " + fib3(n));
	}
}

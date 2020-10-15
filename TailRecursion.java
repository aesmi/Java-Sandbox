// Java Code for Tail Recursion 

class TailRecursion { 
	
	// A tail recursive function 
    // to calculate factorial
    //a is our accumulator argument
	static int factTR(int n, int a) 
	{ 
		if (n == 0) 
			return a; 
        //we multiply out accumulator to accumulate its value as we traverse the call stack
		return factTR(n - 1, n * a); 
	} 
	
	// A wrapper over factTR 
	static int fact(int n) 
	{ 
		return factTR(n, 1); 
	} 

	// Driver code 
	static public void main (String[] args) 
	{ 
		System.out.println(fact(5)); 
	} 
} 

// This code is contributed by Smitha. 

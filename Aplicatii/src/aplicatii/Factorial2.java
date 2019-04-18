/*
 * Copyright (c) 2004 David Flanagan.  All rights reserved.
 * This code is from the book Java Examples in a Nutshell, 3nd Edition.
 * It is provided AS-IS, WITHOUT ANY WARRANTY either expressed or implied.
 * You may study, use, and modify it for any non-commercial purpose,
 * including teaching and use in open-source projects.
 * You may distribute it non-commercially as long as you retain this notice.
 * For a commercial use license, or to purchase the book, 
 * please visit http://www.davidflanagan.com/javaexamples3.
 */
package aplicatii;
/**
 * This class shows a recursive method to compute factorial.  This method
 * calls itself repeatedly based on the formula: n! = n * (n-1)!
 **/
public class Factorial2 {
    public static long factorial(long x) {
	if (x < 0) throw new IllegalArgumentException("x must be >= 0");
        if (x <= 1) return 1;              // Stop recursing here
        else return x * factorial(x-1);    // Recurse by calling ourselves
    }
}

Enter file contents here
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

       int testNum = 16;
       int[] testCases, resultCases;
	int totalCases;

       Scanner in = new Scanner(System.in);
       System.out.println("Enter test number");

       testNum = in.nextInt();
	if (testnum > 15 || testNum.isNull())
		 System.out.println("Out of range.. gtfo");exit(0);

       testCases = new int[testNum];
	resultCases = new int[testNum];
       int i = 0;
       while(in.hasNextInt()) {
           testCases[i] = in.nextInt();
           i++;
       }
	if ()
	while(testNum < 16 && testCases.isNotNull()) {
		resultCases = getAnswerForSolution(testCases);
	}
    }
    
    int[] getAnswerForSolution(testCases) {
	}
}

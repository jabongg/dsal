package com.datastructures.arrays.java;

import java.util.Scanner;
/**
 * A thief trying to escape from a jail has to cross N walls each with varying heights. He climbs X feet every time. But, due to the slippery nature of those walls, every times he slips back by Y feet.  Now the task is to calculate the total number of jumps required to cross all walls and escape from the jail.

Input:
The first line of input contains an integer T denoting the no of test cases. Then T test cases follow. Each test case contains two space separated integers X, Y, N. Then in the next line are N space separated values denoting the heights ( Ht[] ) of the walls.

Output:
For each test case in a new line print the total number of jumps.

Constraints:
1<=T<=100
1<= N, X, Y <=100
1<= Ht[] <=1000

Example:
Input:
2
10 1 1
5
4 1 5
6 9 11 4 5 

Output:
1
12
 * @author jang
 *
 */
public class ThiefTryingToEscape {

	public static void main (String[] args)
	 {
	 //code
	 
	 Scanner scan = new Scanner(System.in);
	 int T = scan.nextInt();
   	 for (int t = 0; t < T; t++) {
   	     int X = scan.nextInt();
   	     int Y = scan.nextInt();
   	     
   	     int N = scan.nextInt();
   	     
   	     int[] height = new int[N];
   	     for (int i = 0; i < N; i++) {
   	         height[i] = scan.nextInt();
   	     }  
   	     
   	     int jumpCount = getJumpCount(height, N, X, Y);
   	     System.out.println(jumpCount);
   	 }
	 }
	 
	 public static int getJumpCount(int[] height, int n, int x, int y) {
	     int jumpCount = 0;
	     int jumpValue = x - y;
	     for (int i = 0; i < n; i++) {
	         while(!(height[i] > 0 && height[i] < jumpValue)) {
	             	       height[i] = height[i] - jumpValue;
	             	       jumpCount++;
	         }
	     }
	     return jumpCount;
	 }
}

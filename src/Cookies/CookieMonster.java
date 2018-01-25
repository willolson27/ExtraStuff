package Cookies;

import java.util.Stack;

public class CookieMonster {

	int[] max;
	static int[][] arr = 
		{{ 1,  3,  0 , 5, -1,  7, -1, -1,  0,  4,  2,  1}, 
		{-1,  3,  2,  1, -1,  4, -1,  5,  3, -1,  1,  0},
		 {5,  4,  8, -1,  3,  2,  2, -1, 4, -1,  0,  0},
		 {2,  1,  0,  4,  1, -1,  8,  0,  2, -1,  2,  5},
		 {1, 4,  0,  1, -1,  0,  3,  2,  2,  4,  1,  4},
		 {0,  1,  4,  1,  1,  6,  1,  4,  5,  2,  1,  0},
		 {3,  2,  5,  2,  0,  7, -1,  2,  1,  0, -1,  3},
		 {0, -1,  4, -1, -1,  3,  5,  1,  4,  2, 1,  2},
		 {5,  4,  8, -1,  3,  2,  2, -1,  4, -1,  0,  0},
		 {2,  1,  0,  4,  1, -1,  8,  0,  2, -1,  2,  5},
		 {1,  3,  0,  5, -1,  7, -1, -1,  0,  4,  2,  1},
		 {0,  0,  3,  1,  5,  2,  1,  5,  4,  1,  3,  3}};

	
	Stack stack = new Stack<int[]>();
	
	public int[] getNext(int[] location) {
		
		int sum = location[2];
		int xpos = location[0];
		int ypos = location[1];
		if (arr[])
		else if (xpos >= ypos) {
			xpos ++;	
		}
		else if (ypos > xpos)
			
		
		return new int[xpos, ypos, sum];
	}
	
	public static void main(String[] args) {
		
	//	max = arr[arr.length -1][arr.length - 1];
		
	

	}

}

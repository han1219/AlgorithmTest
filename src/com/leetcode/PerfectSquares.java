package com.leetcode;

import java.util.Arrays;

public class PerfectSquares {

	public static int numSquares(int n) {
		int[] record = new int[n + 1];
		for (int i = 1; i <= n; ++i) {
			record[i] = i;
			for (long j = (int) Math.sqrt(i); j * j * (record[i] - 1) >= i; --j) {
				record[i] = Math.min(record[(int) (i - j * j)] + 1, record[i]);
			}
		}
		System.out.println(Arrays.toString(record));
		return record[n];
	}

	public static int solution(int n) {
		int[] num = new int[1];
		num[0] = 0;
		// if()
		int tmp = (int) Math.floor(Math.sqrt(n));
		for (int i = tmp; i > 1; i--) {
			int m = i * i;
			if (n % m == 0) {
				return n / m;
			}
		}
		return sumNum(n, num);
	}

	public static int sumNum(int n, int[] num) {
		int tmp = (int) Math.floor(Math.sqrt(n));
		int sqr = tmp * tmp;
		num[0]++;
		n = n - sqr;
		System.out.print(sqr + "  ");
		if (n > 0) {
			sumNum(n, num);
		}
		return num[0];
	}

	public static void main(String[] args) {
//		System.err.println(solution(19));
		numSquares(19);
	}
}

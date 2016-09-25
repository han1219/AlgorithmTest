package com.leetcode;

public class UglyNumber {
	public static boolean isUgly(int num) {
		if (num <= 0)
			return false;
		int tmp = num;
		int[] pri = { 2, 3, 5 };
		for (int p : pri) {
			while (tmp % p == 0)
				tmp=(tmp / p);
		}
		if(tmp==1)
		return true;
		else {
			return false;
		}
	}

	public static boolean isPrimeNum(int num) {
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(isUgly(14));
	}
}

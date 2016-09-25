package com.sort;

import java.util.Arrays;

import javax.sound.midi.MidiChannel;

public class Shellsort {
	public static void Sort(int []t ){
		int mid = (int) Math.ceil(t.length / 2);
		int key = 0;
		while (mid > 0) {
			for (int i = 0; i < mid; i += 1) {
				for (int j = i; j < t.length; j += mid) {
					key = t[j];
					int n;
					for (n = j - mid; n >= 0 && t[n] > key; n -= mid)
						t[n + mid] = t[n];
					t[n + mid] = key;
				}
			}
			mid=(int) Math.ceil(mid/2);
		}
	}
	public static void main(String[]args){
		int [] tmp={57,68,59,52,72,28,96,33,24,19};
		Sort(tmp);
		System.out.println(Arrays.toString(tmp));
	}
}

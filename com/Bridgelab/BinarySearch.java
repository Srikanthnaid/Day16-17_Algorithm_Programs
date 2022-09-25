package com.Bridgelab;

import java.util.Arrays;

public class BinarySearch {
	public static void main(String[] args) {
		String[] words = { "Srikanth", "Hari", "Anil", "Shekar", "Sravani" };
		Arrays.sort(words);
		System.out.println(Arrays.toString(words));

		int index, left = 0;

		int right = words.length - 1;
		while (true) {
			int mid = (left + right) / 2;
			if (words[mid].compareTo("Srikanth") == 0) {
				System.out.println("Index of your word Srikanth is : " + mid);
				break;
			} else if (words[mid].compareTo("Srikanth") > 0) {
				System.out.println("Index of your word Srikanth is : " + (mid - 1));
				break;
			} else {
				System.out.println("Index of your word Srikanth is : " + (mid + 1));
				break;
			}
		}
	}
}

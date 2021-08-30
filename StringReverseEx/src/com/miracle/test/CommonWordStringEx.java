package com.miracle.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommonWordStringEx {

	public static List<String> findCommonWords(String input1,String input2) {
		String words1[] = input1.trim().split("\\s+");
		String words2[] = input2.trim().split("\\s+");
		List<String>list1 = new ArrayList<>(Arrays.asList(words1));
		List<String>list2 = Arrays.asList(words2);
		list1.retainAll(list2);
		return list1;
		}

		public static void main(String[] args) {
		System.out.println(findCommonWords("chirasmita is singing","debasmita is sin  	 ging"));
		}

		}



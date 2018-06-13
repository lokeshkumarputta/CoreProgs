package com.elife.corejavaprogs;

import java.util.HashMap;
import java.util.Map;

public class DuplicateOccurProg {

	public static void main(String[] args) {

		String str = "re re ra i jr rrrr ar";
		duplicateWordCountProg(str);

	}

	public static void duplicateWordCountProg(String str) {

		str = str.replace(" ", "");
		int count = 0;
		Map<Character, Integer> map = new HashMap<>();
		Character rptChar = null;
		for (int i = 0; i < str.length(); i++) {
			Character ch = str.charAt(i);

			if (map.containsKey(ch)) {
				map.put(ch, i + 1);
			} else {
				map.put(ch, 1);
			}

		}
		for (int i = str.length() - 1; i >= 0; i--) {
			if (map.get(str.charAt(i)) > 1) {
				count++;
				rptChar = str.charAt(i);

			}
		}
		System.out.println("count is ::" + count);
		System.out.println("Repeated char ::" + rptChar);

	}
}

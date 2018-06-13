package com.elife.corejavaprogs;
import java.io.IOException;

public class TryCatchFinallyReturnTest {
	public static void main(String[] args) {
		/*
		 * System.out.println("m(s)"); System.out.println(m("abc"));
		 */
		// aaabbbcccccddddaabbcc
		System.out.println(methohd1());

	}

	public static int methohd1() {
		try {
			System.out.println("try block");
//			 System.exit(0);
			return 1;
		} catch (Exception e) {
			System.out.println("IN Catch block");
			return 2;
		} finally {
			System.out.println("In Finally");
//			 return 3;
		}
//		 return 0;
	}
}

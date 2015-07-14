package com.jm.util;

import java.util.Collection;

public class EmptyChecker {

	public static boolean isEmpty(String s) {
		return s == null || s.isEmpty();
	}

	public static boolean isEmpty(Collection<?> collection) {
		return collection == null || collection.isEmpty();
	}

	public static boolean isEmpty(Object object) {
		return object == null;
	}
}

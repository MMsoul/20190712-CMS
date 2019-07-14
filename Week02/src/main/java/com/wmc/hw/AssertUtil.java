package com.wmc.hw;

import java.util.Collection;
import java.util.Map;

/**
 * @author 黄小枸
 *
 */
public class AssertUtil {

	/**
	 * 1.断言为真
	 */
	public static void isTrue(boolean exp, String message) {
		if (!exp) {
			throw new AssertException(message);
		}
	}

	/**
	 * 2.断言为假
	 */
	public static void isFalse(boolean exp, String message) {
		if (exp) {
			throw new AssertException(message);
		}
	}

	/**
	 * 3.断言对象不能为空
	 */
	public static void isNotNull(Object exp, String message) {
		if (exp == null) {
			throw new AssertException(message);
		}
	}

	public static void isNotNull2(String exp, String message) {
		if (exp == null || exp.length() == 0) {
			throw new AssertException(message);
		}
	}

	/**
	 * 4.断言对象为空
	 */
	public static void isNull(Object exp, String message) {
		if (exp != null) {
			throw new AssertException(message);
		}
	}

	public static void isNull2(String exp, String message) {
		if (exp.length() > 0) {
			throw new AssertException(message);
		}
	}

	/**
	 * 5.断言List或者Set集合不为空，没有元素也算空
	 */
	public static void CollectionNotNull(Collection<?> col, String message) {
		if (col == null || col.size() == 0) {
			throw new AssertException(message);
		}
	}

	/**
	 * 6.断言Map集合不为空，没有元素也算空
	 */
	public static void MapNotNull(Map<?, ?> col, String message) {
		if (col == null || col.size() == 0) {
			throw new AssertException(message);
		}
	}

	/**
	 * 7.断言字符串必须有值，去掉空格后，长度必须大于0
	 */
	public static void StringNotNull(String exp, String message) {
		if (!(exp.trim().length() > 0)) {
			throw new AssertException(message);
		}
	}

	/**
	 * 8.断言值必须是正数（值大于0）
	 */
	public static void intNotNull(int exp, String message) {
		if (exp <= 0) {
			throw new AssertException(message);
		}
	}
}

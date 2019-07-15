package com.huangwei.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;

import org.junit.Test;

import com.huangwei.common.AssertException;
import com.huangwei.common.AssertUtil;

public class AssertTest {

	//1.断言为真
	@Test
	public void testIsTrue() {
		try {
			AssertUtil.isTrue(true, "这是一个false");
		} catch (AssertException e) {
			e.printStackTrace();
		}
	}

	//2.断言为假
	@Test
	public void testIsFalse() {
		try {
			AssertUtil.isFalse(false, "这是一个true");
		} catch (AssertException e) {
				e.printStackTrace();
		}
	}

	//3.断言对象不为空
	@Test
	public void testNotNull() {
		try {
			AssertUtil assertUtil = new AssertUtil();
			AssertUtil.notNull(null, "这是一个空的对象");
		} catch (AssertException e) {
			e.printStackTrace();
		}
	}

	//4.断言对象必须为空
	@Test
	public void testIsNull() {
		try {
			AssertUtil assertUtil = new AssertUtil();
			AssertUtil.isNull(assertUtil, "这不是一个空的对象");
		} catch (AssertException e) {
			e.printStackTrace();
		}
	}

	//5.断言集合不为空
	@Test
	public void testNotEmptyCollectionOfQString() {
		try {
			ArrayList<Integer> arrayList = new ArrayList<Integer>();
			arrayList.add(1);
			AssertUtil.notEmptyCollection(arrayList, "这是一个空的集合");
		} catch (AssertException e) {
			e.printStackTrace();
		}
	}

	//6.断言map不为空
	@Test
	public void testNotEmptyMapOfQQString() {
		try {
			HashMap<String, Object> hashMap = new HashMap<String, Object>();
			hashMap.put("1",1);
			AssertUtil.notEmptyMap(hashMap, "这是一个空的map集合");
		} catch (AssertException e) {
			e.printStackTrace();
		}
	}

	//7.断言字符串必须有值
	@Test
	public void testHasText() {
		try {
			AssertUtil.hasText(" 11", "这是一个空的字符串");
		} catch (AssertException e) {
			e.printStackTrace();
		}
	}

	//8.断言值必须大于0
	@Test
	public void testGreaterThanZero() {
		try {
			AssertUtil.greaterThanZero(0, "这个值不大于0");
		} catch (AssertException e) {
			e.printStackTrace();
		}
	}

}

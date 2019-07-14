package com.wmc.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.Test;

import com.wmc.hw.AssertException;
import com.wmc.hw.AssertUtil;

public class AssertTests {

	// 断言为真
	@Test
	public void testIsTrue() {
		try {
			AssertUtil.isTrue(true, "这不是true");
		} catch (AssertException e) {
			e.printStackTrace();
		}
	}

	//断言为假
	@Test
	public void testIsFalse() {
		try {
			AssertUtil.isFalse(true, "这不是false");
		} catch (AssertException e) {
			e.printStackTrace();
		}
	}

	//断言不为空
	@Test
	public void testIsNotNull() {
		try {
			AssertUtil assertUtil = new AssertUtil();
			AssertUtil.isNotNull(assertUtil, "这不是一个字符串");
		} catch (AssertException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testIsNotNull2() {
		try {
			AssertUtil.isNotNull2(" ", "这不是一个字符串");
		} catch (AssertException e) {
			e.printStackTrace();
		}
	}

	//判断对象为空
	@Test
	public void testIsNull() {
		try {
			AssertUtil.isNull("111", "这个对象不为空");
		} catch (AssertException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testIsNull2() {
		try {
			AssertUtil.isNull2("111", "这个对象不为空");
		} catch (AssertException e) {
			e.printStackTrace();
		}
	}

	//List或Set集合不为空
	@Test
	public void testCollectionNotNull() {
		try {
			ArrayList<Integer> arrayList = new ArrayList<Integer>();
			arrayList.add(1);
			AssertUtil.CollectionNotNull(arrayList, "这个集合是空的");
		} catch (AssertException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testMapNotNull() {
		try {
			HashMap<String, Object> hashMap = new HashMap<String,Object>();
			hashMap.put("11", 1);
			AssertUtil.MapNotNull(hashMap, "这个Map集合是空的");
		} catch (AssertException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testStringNotNullStringString() {
		try {
			AssertUtil.StringNotNull(" 1", "这个字符串是空的");
		} catch (AssertException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void intNotNull() {
		try {
			AssertUtil.intNotNull(0, "这不是一个正数");
		} catch (AssertException e) {
			e.printStackTrace();
		}
	}

}

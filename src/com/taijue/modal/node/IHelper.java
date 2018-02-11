package com.taijue.modal.node;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import com.taijue.modal.unary.UnaryPredicate;

public class IHelper {
	
	public static <N extends Number> double add(N a, N b) {
		double sum = 0;
		sum = a.doubleValue() + b.doubleValue();
		return sum;
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends Comparable<T>> T[] than(T[] array, T elem) {
		T[] ts = (T[]) Array.newInstance(elem.getClass(), array.length);
		int count = 0;
		for (T e : array) {
			if (e.compareTo(elem) > 0) {
				ts[count++] = e;
			}
		}
		return Arrays.copyOfRange(ts, 0, count);
	}

	public static <T> void swap(T[] a, int i, int j) {
		T temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	public static <T> boolean checkList(List<?> list, T val) {
		if (list.contains(val)) {
			return true;
		} else {
			return false;
		}
	}
	
	// 从list中查询与p中集合元素相匹配的下标
	public static <T> int findFirst(List<T> list, int begin, int end, UnaryPredicate<T> p) {
		for (; begin < end; ++begin)
		{
			if (p.test(list.get(begin)))
			{
				return begin;
			}	
		}
		return -1;
	}
	
	// x > 0 and y > 0, 
	// 当gcb(x, y) = 1时,x, y互为质数(公因数只有1的两个非零自然数),即最大公因数为1;
	public static int gcd(int x, int y) {
		for (int r; (r = x % y) != 0; x = y, y = r) {}
		return y;
	}
	
	public static void main(String[] args) {
		System.out.println(IHelper.add(1.5F, 2.5D));
		System.out.println(IHelper.gcd(8, 5));
	}
}

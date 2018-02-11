package com.taijue.modal.unary;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import com.taijue.modal.node.IHelper;

// 质数比较
public class RelativelyPrimePredicate implements UnaryPredicate<Integer> {
	// 内部集合
	private Collection<Integer> c;

	public RelativelyPrimePredicate(Collection<Integer> c) {
		this.c = c;
	}

	@Override
	public boolean test(Integer x) {
		for (Integer i : c) {
			// 当gcb(x, y) = 1时,x, y互为质数(公因数只有1的两个非零自然数),即最大公因数为1;
			if (IHelper.gcd(x, i) != 1) {
				return false;
			}
		}

		return c.size() > 0;
	}
	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(3, 4, 6, 8, 11, 15, 28, 32);
		Collection<Integer> c = Arrays.asList(7, 18, 19, 25);
		UnaryPredicate<Integer> p = new RelativelyPrimePredicate(c);

		int index = IHelper.findFirst(list, 0, list.size(), p);
		if (index != -1) {
			System.out.print(list.get(index) + " 与 ");
			for (Integer k : c) {
				System.out.print(k + " ");
			}
			System.out.println("互为质数.");
		}
	}
}

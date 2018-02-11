package com.taijue.modal.shape;

public interface IShape<T> {
	// 计算面积
	public double area();
	// 检测
	public boolean test(T t);
}

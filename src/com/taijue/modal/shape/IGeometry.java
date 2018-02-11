package com.taijue.modal.shape;

public interface IGeometry {
	// 计算直线距离
	public <T extends Geometry> double distance(T t);
	
}

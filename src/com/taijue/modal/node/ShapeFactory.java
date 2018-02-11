package com.taijue.modal.node;

import com.taijue.modal.shape.Geometry;
import com.taijue.modal.shape.IShape;
import com.taijue.modal.shape.Point;
import com.taijue.modal.shape.Rect;

public class ShapeFactory{
	
	public static <T extends Geometry> T getGeometry(Class<T> clazz){
		try {
			T t = clazz.newInstance();
			return t;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static <T extends Geometry & IShape<Double>> T getShape(Class<T> clazz){
		try {
			T t = clazz.newInstance();
			return t;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static void main(String[] args) {
		// 创建点
		Point point = ShapeFactory.getGeometry(Point.class);
		point.x = 1.2D;
		point.y = 1.4D;
		System.out.println(point);
		
		// 创建矩形
		Rect rect = ShapeFactory.getShape(Rect.class);
		rect.left = 1.2D;
		rect.top = 1.4D;
		rect.width = 1.2D;
		rect.height = 1.4D;
		System.out.println(rect.area());
	}
}

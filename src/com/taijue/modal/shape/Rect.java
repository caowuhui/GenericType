package com.taijue.modal.shape;

// 矩形
public class Rect extends Geometry implements IShape<Double> {
	// 左上角X
	public double left;
	// 左上角Y
	public double top;
	// 宽
	public double width;
	// 高
	public double height;
	
	@Override
	public double area(){
		return this.width * this.height;
    }
	
	@Override
	public <T extends Geometry> double distance(T t) {
		double distance = 0.0;
		if ( t != null && t instanceof Rect )
		{			
			Point p1 = new Point();
			p1.x = left + width / 2;
			p1.y = top + height / 2;
			
			Rect rect = (Rect) t;
			Point p2 = new Point();
			p2.x = rect.left + rect.width / 2;
			p2.y = rect.top + rect.height / 2;
			
			double dx2 = Math.pow( p1.x - p2.x , 2 ) ;
			double dy2 = Math.pow( p1.y - p2.y , 2 ) ;
			distance = Math.sqrt( dx2 + dy2 );
		}
		return distance;
	}

	@Override
	public boolean test(Double value) {
		
		return false;
	}
}

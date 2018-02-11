package com.taijue.modal.shape;
// 几何点
public class Point extends Geometry {
	public double x;
	public double y;
	
	public String toString(){
		return this.x + "," + this.y;
	}

	@Override
	public <U extends Geometry> double distance(U u) {
		double distance = 0.0;
		if ( u != null && u instanceof Point )
		{
			Point point = (Point) u;
			
			double dx2 = Math.pow( this.x - point.x , 2 ) ;
			double dy2 = Math.pow( this.y - point.y , 2 ) ;
			distance = Math.sqrt( dx2 + dy2 );
		}
		return distance;
	}
	
	public static void main(String[] args) {
		Point p1 = new Point();
		p1.x = 1.5D;
		p1.y = 2.8D;
		
		System.out.println(p1.toString());
		
		Point p2 = new Point();
		p1.x = 1D;
		p1.y = 2D;
		
		System.out.println(p1.distance(p2));
	}
}

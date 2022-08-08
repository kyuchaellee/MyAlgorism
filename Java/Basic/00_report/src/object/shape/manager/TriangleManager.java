package object.shape.manager;

import object.shape.model.vo.ShapeVO;


public class TriangleManager {
	public void calcPerimeter(ShapeVO shape) {
		double w = shape.getWidth();
		double what = w*3.0; // 정삼각형 기준
		System.out.println(what);
	}
	public void calcArea(ShapeVO shape) {
		double w = shape.getWidth();
		double h = shape.getHeight(); // 정삼각형 기준
		System.out.println(w*h/2.0);
	}
	public void printShape(ShapeVO shape) {
		System.out.print("width = " + shape.getWidth() + " h = " + shape.getHeight());
	}
	public void paintColor(ShapeVO shape,String color) {
		shape.setColor(color);
		String collor = shape.getColor();
		System.out.println(collor + " 으로 바꼈습니다.");
	}

}

package com.java.design.pattern.principle;

/*
 * OCP tends here for Open close principle
 */
public class OCPBadMainClass {
	
	public static void main(String[] args) {
		OCPBadGraphicEditor graphicEditor = new OCPBadGraphicEditor();
		OCPBadShapeClass circle = new OCPBadCircle();
		graphicEditor.drawShape(circle);
		OCPBadShapeClass rectangle = new OCPBadRectangle();
		graphicEditor.drawShape(rectangle);
		OCPBadShapeClass triangle = new OCPBadTriangle();
		graphicEditor.drawShape(triangle);
		
	}

}

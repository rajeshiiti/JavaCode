package com.java.design.pattern.principle;

/*
 * OCP stands for Open Close Principle
 */
public class OCPBadGraphicEditor {

	public void drawShape(OCPBadShapeClass shapeClass) {
		if(shapeClass.shape_type ==1) {
			drawCircle();
		} else if(shapeClass.shape_type == 2) {
			drawRectangle();
		} else if(shapeClass.shape_type == 3) {
			drawTriangle();
		} else {
			System.out.println("Sorry, we don't have this feature.");
		}
	}

	private void drawTriangle() {
		System.out.println("Drawing triangle...");
		
	}

	private void drawRectangle() {
		System.out.println("Drawing rectangle....");
	}

	private void drawCircle() {
		System.out.println("Drawing circle....");
	}

}

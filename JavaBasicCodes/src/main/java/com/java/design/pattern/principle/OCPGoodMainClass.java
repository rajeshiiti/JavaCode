package com.java.design.pattern.principle;

public class OCPGoodMainClass {
	public static void main(String[] args) {
		OCPGoodGraphicEditor editor = new OCPGoodGraphicEditor();
		OCPGoodShape circle = new OCPGoodCircle();
		editor.drawShape(circle);
		OCPGoodShape rectangle = new OCPGoodRectangle();
		editor.drawShape(rectangle);
		OCPGoodShape triangle = new OCPGoodTriangle();
		editor.drawShape(triangle);
	}

}

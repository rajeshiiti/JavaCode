package com.java.enumcode;

public class EnumCode {
	public static void main(String[] args) {
		for(Direction dir : Direction.values()) {
			System.out.println(dir+" "+dir.getValue(dir)+" ");
		}
	}
}
enum Direction {
	SOUTH("south"),
	NORTH("north"),
	WEST("west"),
	EAST("east");
	
	private String value;
	private Direction(String value)  {
		this.value = value;
	}
	public String getValue(Direction dir) {
		return dir.value;
	}
	public Direction getDirection(String value) {
		return Direction.valueOf(value);
	}
	
}

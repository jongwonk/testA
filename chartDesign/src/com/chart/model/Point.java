package com.chart.model;

public class Point implements ISeries{
	public float x;
	public float y;

	private Point(){
		x = 0;
		y = 0;
	}
	
	public Point(float x, float y){
		this.x = x;
		this.y = y;
	}
	
	public Point(Point p){
		this.x = p.x;
		this.y = p.y;
	}

	@Override
	public String toString() {
		return "(" + Float.toString(x) + "," + Float.toString(y) + ")";
	}
	
}

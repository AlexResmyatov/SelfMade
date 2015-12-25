package com.sm.helpers;

public class Click {
	private int x;
	private int y;
	private int pointer;
	
	public Click(int pointer) {
		super();
		this.pointer = pointer;
	}
	
	public Click(int x, int y, int pointer) {
		super();
		this.x = x;
		this.y = y;
		this.pointer = pointer;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getPointer() {
		return pointer;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setPointer(int pointer) {
		this.pointer = pointer;
	}
	
	public String toString(){
		return x+" "+y+" "+pointer;
	}
	
	
	
	
}

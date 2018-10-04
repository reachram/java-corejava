package com.corejava;

public class MultiThreadingTest {

	private int count;

	public int getCount() {
		 return this.count;
	}

	public void setCount(int value) {
	 this.count = value;
	}

	public static void main (String args[]) {
		MultiThreadingTest test = new MultiThreadingTest();
		test.setCount(77);
		system.out.println("This is Count value" + test.getCount());
	}
}

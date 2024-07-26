package com.inheritance;

class Shape {
	 void display() {
		 System.out.println("shape");
	 }
}
class Rectangle extends Shape{
	 void out() {
		 System.out.println("rectangle");
	 }
}
class Circle extends Rectangle{
	void print() {
		System.out.println("circle");
	}

}

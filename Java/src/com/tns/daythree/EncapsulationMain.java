package com.tns.daythree;
public class EncapsulationMain {
public static void main(String[] args) {
//object creation 
Encapsulation obj = new Encapsulation();
obj.setSerialNum(11);
obj.setName("Pooja");
obj.setAge(20);
System.out.println(obj);
obj.getAge();
System.out.println(obj);
}
}
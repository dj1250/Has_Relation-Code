package com.relation2;

import com.has.Has2;

public class Relation2 {
 int z;
 public int m3(int s ,int t) {
	 this.z = s*t/2;
	 System.out.println("result of this equation "+ z);
	 return z;
 }
	 public static void main(String []args) {
		 Relation2 r1 = new Relation2();
		 r1.m3(25, 20);
		 
		 Has2 h2 = new Has2(); // Has2 class from another package-->>(HAS a Relation) 
		 h2.med2(20, 20);
		 
		 
		 
	 }
	 
 }
	


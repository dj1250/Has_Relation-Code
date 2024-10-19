package com.has;

import com.relation2.Relation2;

public class hasrelation1 {
	int x;
public void m1(int a) {
	this.x = a;
}
public static void main(String main[]) {
  
   hasrelation1 h1 = new hasrelation1();
    h1.m1(78);
    System.out.println(h1.x);
    
   Has2 h2 = new Has2(); // Object creation of Has2 class in hasrelation1 class of same package ->>>> (HAS a Relation)
   h2.med2(30, 20);
   
}

 }

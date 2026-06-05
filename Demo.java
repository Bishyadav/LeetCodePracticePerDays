package org.example;

import java.text.DateFormat;
import java.time.Instant;
import java.util.Date;

class Parent {
    protected Parent() {
        System.out.println("Parent Class");
    }
}
class Child extends Parent{
 public Child(){
     System.out.println("child class");
 }
}
public class Demo {
    public static void main(String[] args) {
        Parent c=new Child();
    }
}

package org.example;

public class Counter {
  static int x = 0;
  public Counter(){
    x++;
  }
  public void display() {
    System.out.println("class " + this + "\tx=" + x);
  }
}
